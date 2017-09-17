package com.github.tslamic.devicenames;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.github.tslamic.dn.AndroidDeviceNames;
import com.github.tslamic.dn.DeviceNames;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class RxActivity extends AppCompatActivity {
  private TextView text;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_rx);
    text = findViewById(R.id.rx_text);
  }

  @Override
  protected void onStart() {
    super.onStart();
    final Context context = this;
    AndroidDeviceNames.deviceNames(context)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .map(new Function<DeviceNames, String>() {
          @Override
          public String apply(DeviceNames deviceNames) throws Exception {
            return deviceNames.currentDeviceName("unknown");
          }
        })
        .subscribe(new Consumer<String>() {
          @Override
          public void accept(String s) throws Exception {
            text.setText(String.format("This device name is %s", s));
          }
        });
  }
}

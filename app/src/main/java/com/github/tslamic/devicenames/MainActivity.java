package com.github.tslamic.devicenames;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import com.github.tslamic.dn.AndroidDeviceNames;

public class MainActivity extends AppCompatActivity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    final TextView tv = (TextView) findViewById(R.id.text);
    long start = SystemClock.elapsedRealtime();
    final String deviceName = AndroidDeviceNames.deviceNames(null).currentDeviceName();
    tv.setText(deviceName);
    Log.d("MainActivity", "elapsed ms: " + (SystemClock.elapsedRealtime() - start));
  }
}

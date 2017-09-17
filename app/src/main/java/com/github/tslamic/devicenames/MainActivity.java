package com.github.tslamic.devicenames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.tslamic.dn.AndroidDeviceNames;
import com.github.tslamic.dn.DeviceNamesDatabase;

public class MainActivity extends AppCompatActivity {
  private DeviceNamesDatabase database;
  private TextView title;
  private EditText query;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    title = findViewById(R.id.title);
    query = findViewById(R.id.query);
  }

  @Override
  protected void onStart() {
    super.onStart();
    AndroidDeviceNames.deviceNamesDatabase(this,
        new AndroidDeviceNames.Callback<DeviceNamesDatabase>() {
          @Override
          public void onReady(DeviceNamesDatabase instance) {
            database = instance;
          }
        });
  }

  @Override
  protected void onStop() {
    super.onStop();
    if (database != null) {
      database.close();
    }
  }

  @SuppressWarnings("UnusedParameters")
  public void query(View view) {
    if (database != null) {
      final String model = query.getText().toString();
      final String name = database.deviceName(model, "unknown");
      title.setText(name);
    }
  }

  @SuppressWarnings("UnusedParameters")
  public void rxExample(View view) {
    final Intent intent = new Intent(this, RxActivity.class);
    startActivity(intent);
  }
}

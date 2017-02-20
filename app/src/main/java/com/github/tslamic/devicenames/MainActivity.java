package com.github.tslamic.devicenames;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.github.tslamic.dn.AndroidDeviceNames;
import com.github.tslamic.dn.DeviceNames;
import com.github.tslamic.dn.DeviceNamesDatabase;

public class MainActivity extends AppCompatActivity {
  private DeviceNamesDatabase database;
  private EditText query;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.main);
    final TextView title = (TextView) findViewById(R.id.title);
    query = (EditText) findViewById(R.id.query);

    // If you don't need to perform multiple queries, using DeviceNames is sufficient.
    final DeviceNames deviceNames = AndroidDeviceNames.deviceNames(this);
    final String currentDevice = deviceNames.currentDeviceName("current device unknown");
    title.setText(currentDevice);

    // Otherwise, DeviceNamesDatabase might be more appropriate.
    database = AndroidDeviceNames.deviceNamesDatabase(this);
  }

  @Override protected void onStart() {
    super.onStart();
    database.open();
  }

  @Override protected void onStop() {
    super.onStop();
    database.close();
  }

  @SuppressWarnings("UnusedParameters") public void query(View view) {
    final String q = query.getText().toString();
    final String name = database.deviceName(q, "unknown");
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
  }
}

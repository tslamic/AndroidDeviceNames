package tslamic.github.io.adn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import tslamic.github.io.androiddevicenames.DeviceNames;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView deviceName = (TextView) findViewById(R.id.device_name);
        deviceName.setText(DeviceNames.getCurrentDeviceName("Unknown Device"));
    }

}

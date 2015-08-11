package tslamic.github.io.adn;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import tslamic.github.io.androiddevicenames.DeviceNames;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView deviceName = (TextView) findViewById(R.id.device_name);
        deviceName.setText(DeviceNames.getThisDeviceName("Unknown Device"));
        new Thread(new Profile()).start();
    }

    private class Profile implements Runnable {
        @Override
        public void run() {
            long duration = 0L;

            final int count = 10000;
            for (int i = 0; i < count; i++) {
                final String name = "failure" + i;
                long start = System.nanoTime();
                DeviceNames.getDeviceName(name, null);
                duration += (System.nanoTime() - start);
            }

            final double avg = ((duration / count) / 1000000.0);
            final String msg = String.format("Avg duration for %d iterations: %f ms.", count, avg);
            Log.i("DeviceNames", msg);
        }
    }

}

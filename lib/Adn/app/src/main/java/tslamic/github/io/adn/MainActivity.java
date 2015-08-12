package tslamic.github.io.adn;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import tslamic.github.io.androiddevicenames.DeviceNames;

public class MainActivity extends Activity {

    private static final String TAG = "DeviceNames";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final TextView deviceName = (TextView) findViewById(R.id.device_name);
        deviceName.setText(DeviceNames.getThisDeviceName("Unknown Device"));

        new Thread(new Profile()).start();
    }

    private static class Profile implements Runnable {

        private static final double MILLISECOND_IN_NANOS = 1000000.0;
        private static final int COUNT = 10000;

        @Override
        public void run() {
            long duration = 0L;

            // Warm up
            for (int i = 0; i < 1000; i++) {
                final String name = "should_fail" + i;
                DeviceNames.getDeviceName(name, null);
            }

            // Measure
            for (int i = 0; i < COUNT; i++) {
                final String name = "should_fail" + i;
                long start = System.nanoTime();
                DeviceNames.getDeviceName(name, null);
                duration += (System.nanoTime() - start);
            }

            final double avg = duration / (COUNT * MILLISECOND_IN_NANOS);
            final String msg = String.format("Average worst case scenario duration" +
                    " after %d iterations: %.3f ms.", COUNT, avg);
            Log.i(TAG, msg);
        }
    }

}

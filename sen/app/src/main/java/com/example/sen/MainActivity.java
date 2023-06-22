package com.example.sen;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.content.Context;


public class MainActivity extends AppCompatActivity{

    private SensorManager sm;
    private Sensor a;
    private SensorEventListener evento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        a = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        evento = new SensorEventListener() {

            @Override
            public void onSensorChanged(SensorEvent event) {
                // Acción a realizar cuando hay un cambio en los valores del acelerómetro
            System.out.println("x="+event.values[0]);
            System.out.println("y="+event.values[1]);
            System.out.println("z="+event.values[2]);

                // Puedes utilizar los valores del acelerómetro para realizar acciones específicas
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                // Acción a realizar cuando cambia la precisión del sensor
            }
        };
            sm.registerListener(evento, a, sm.SENSOR_DELAY_NORMAL);
        }

        @Override
        protected void onPause() {
            super.onPause();
            sm.unregisterListener(evento);
        }

    }



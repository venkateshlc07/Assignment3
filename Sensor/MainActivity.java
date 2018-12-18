package com.example.sensor;

import java.util.List;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

	SensorManager sm = null;
	TextView tv = null;
	List list;
   
	 SensorEventListener sel = new SensorEventListener(){  
	        public void onAccuracyChanged(Sensor sensor, int accuracy) {}  
	        public void onSensorChanged(SensorEvent event) {  
	            float[] values = event.values;  
	            tv.setText("x: "+values[0]+"\ny: "+values[1]+"\nz: "+values[2]);  
	        }  
	    };  
	  
	    @Override  
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_main);  
	  
	        /* Get a SensorManager instance */  
	        sm = (SensorManager)getSystemService(SENSOR_SERVICE);  
	  
	        tv = (TextView)findViewById(R.id.textView1);  
	  
	        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);  
	        if(list.size()>0){  
	            sm.registerListener(sel, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);  
	        }else{  
	            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();  
	        }  
	    }  
	  
	    @Override  
	    protected void onStop() {  
	        if(list.size()>0){  
	          sm.unregisterListener(sel);  
	        }  
	        super.onStop();  
	    }  
   
    
}

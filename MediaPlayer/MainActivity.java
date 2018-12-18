package com.example.mplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	 MediaPlayer oursong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        
        oursong = MediaPlayer.create(this,R.raw.sample);
        //oursong.start();
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				oursong.start();
			}
		});
        
        
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				oursong.pause();
				
			}
		});
        
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			oursong.stop();
				
			}
		});
    }

    

    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		 oursong.pause();
		 finish();
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

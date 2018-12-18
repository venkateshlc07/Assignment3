package com.example.anim;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

ImageView anm;
AnimationDrawable frameanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anm = (ImageView) findViewById(R.id.imageView1);
        anm.setBackgroundResource(R.drawable.animation);
        
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				frameanim.stop();
			}
		});
    }

    @Override
    	public void onWindowFocusChanged(boolean hasFocus) {
    		// TODO Auto-generated method stub
    		super.onWindowFocusChanged(hasFocus);
    		frameanim = (AnimationDrawable) anm.getBackground();
    		if(hasFocus){
    			frameanim.start();
    		}else{
    			frameanim.stop();
    		}
    	}
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

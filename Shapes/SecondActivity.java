package com.example.shapes;

import java.util.Dictionary;
import java.util.Hashtable;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class SecondActivity extends Activity
{
	DemoView demoview;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) 
	 {
	        super.onCreate(savedInstanceState);
	        //setContentView(R.layout.shape_activity);
	        
	        
	        demoview = new DemoView(this);  
	        setContentView(demoview);  
	        

	 }
	 
	 private class DemoView extends View
	 {
		 
		 public DemoView(Context context)
		 {  
	            super(context);  
	     } 
		 
		 @Override 
		 protected void onDraw(Canvas canvas) 
		 {  
			 	
	            super.onDraw(canvas);  
	            	
	            // custom drawing code here  
	            Paint paint = new Paint();  
	            paint.setStyle(Paint.Style.FILL);  
	  
	            // make the entire canvas white  
	            paint.setColor(Color.WHITE);  
	            canvas.drawPaint(paint);  
	            String color =  getIntent().getStringExtra("color");
			       String  shapes =  getIntent().getStringExtra("shape");
	            // draw blue circle with anti aliasing turned off  
			       
			       if(shapes.equalsIgnoreCase("Rectangle")){
			    	  if(color.equalsIgnoreCase("Red")){
			    		  paint.setAntiAlias(false);  
				            paint.setColor(Color.RED);  
				            canvas.drawRect(150, 10, 600, 160, paint);      
			    	  }else if(color.equalsIgnoreCase("Blue")){
			    		  paint.setAntiAlias(false);  
				            paint.setColor(Color.BLUE);  
				            canvas.drawRect(150, 10, 600, 160, paint);  
			    	  }else if(color.equalsIgnoreCase("Green")){
			    		  paint.setAntiAlias(false);  
				            paint.setColor(Color.GREEN);  
				            canvas.drawRect(150, 10, 600, 160, paint);  
	                           
			    	  }
			    	  
			    	   }
			    	   else if(shapes.equalsIgnoreCase("Circle")){
			    		   
			    		   if(color.equalsIgnoreCase("Red")){
					    		  paint.setAntiAlias(false);  
						            paint.setColor(Color.RED);  
						            canvas.drawCircle(200, 180, 120, paint);  
					    	  }else if(color.equalsIgnoreCase("Blue")){
					    		  paint.setAntiAlias(false);  
						            paint.setColor(Color.BLUE);  
						            canvas.drawCircle(200, 180, 120, paint);  
					    	  }else if(color.equalsIgnoreCase("Green")){
					    		  paint.setAntiAlias(false);  
						            paint.setColor(Color.GREEN);  
						            canvas.drawCircle(200, 180, 120, paint);  
						            
					    	  }
			    		   
			    	   }
			      
	           
	            
		 }
	 }
	 
}



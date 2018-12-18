package com.example.shapes;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {
	String color=null;
	String shapes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        
        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
       
        List<String> shape = new ArrayList<String>();
        shape.add("Rectangle");
        shape.add("Circle");
       
        
        
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colors);
        
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, shape);
        
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter2);
        
        Button b1 = (Button) findViewById(R.id.button1);
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("color", color); 
				intent.putExtra("shape", shapes); 
				startActivity(intent);
				
			}
		});
    }


  


	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,long id) {
		
		
		if(parent.getId() == R.id.spinner1){
			 color = parent.getItemAtPosition(position).toString();
			
		}else if(parent.getId() == R.id.spinner2)
		{	
			shapes = parent.getItemAtPosition(position).toString();
			
		}
		/* String item = parent.getItemAtPosition(position).toString();
	     
		 String item2 = parent.getItemAtPosition(position).toString();
		 
		 TextView t1 = (TextView) findViewById(R.id.textView3);
		 TextView t2 = (TextView) findViewById(R.id.textView4);
		 
		 t1.setText(item);
		 t2.setText(item2);
		 
	      // Showing selected spinner item
	     // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
	      
	     // Toast.makeText(parent.getContext(), "Selected: " + item2, Toast.LENGTH_LONG).show();
	*/
	}
	
	


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
    
}

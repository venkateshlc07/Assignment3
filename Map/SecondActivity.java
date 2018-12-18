package com.example.map;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends Activity{
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.web_activity);
	        WebView webView = (WebView) findViewById(R.id.webview1);
	        
	        webView.setWebViewClient(new WebViewClient());


	        webView.getSettings().setJavaScriptEnabled(true);
	        webView.loadUrl("http://www.google.com/maps");
	 }

}

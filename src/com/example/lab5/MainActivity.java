package com.example.lab5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void BTentang(View v){
		Intent x = new Intent(MainActivity.this, TentangActivity.class);
		startActivity(x);
		
	}

	

}

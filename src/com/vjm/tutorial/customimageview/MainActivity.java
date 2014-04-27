 package com.vjm.tutorial.customimageview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private LinearLayout llayout;
	private Button btnAdd;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		llayout = (LinearLayout) findViewById(R.id.llayout);
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnAdd.setOnClickListener(new OnClickListener() {

			@Override 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				addCustomImageView();
			}
		});
	}

	private void addCustomImageView() {
		//adding customimageview dynamically
		CustomImageView sampleCustomImageView = new CustomImageView(
				getApplicationContext());
		sampleCustomImageView.setImageResource(R.drawable.ic_launcher);

		llayout.addView(sampleCustomImageView);
	}

}

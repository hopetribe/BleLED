package com.jbt.bleled;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements
		android.view.View.OnClickListener {

	TextView wifiTextView, zigbeeTextView, daliTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wifiTextView = (TextView) findViewById(R.id.tv_wifi);
		wifiTextView.setOnClickListener(this);

		zigbeeTextView = (TextView) findViewById(R.id.tv_zigbee);
		zigbeeTextView.setOnClickListener(this);

		daliTextView = (TextView) findViewById(R.id.tv_dali);
		daliTextView.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_wifi:
			Toast.makeText(this, "wifiTextView", Toast.LENGTH_SHORT).show();
			gotoCtrlActivity(GlobalVars.TYPE_WIFI);
			break;
		case R.id.tv_zigbee:
			Toast.makeText(this, "zigbeeTextView", Toast.LENGTH_SHORT).show();
			gotoCtrlActivity(GlobalVars.TYPE_ZIGBEE);
			break;
		case R.id.tv_dali:
			Toast.makeText(this, "daliTextView", Toast.LENGTH_SHORT).show();
			gotoCtrlActivity(GlobalVars.TYPE_DALI);
			break;

		default:
			break;
		}
	}

	private void gotoCtrlActivity(int type) {

		Intent intent = new Intent(this, LedControlActivity.class);
		intent.putExtra(GlobalVars.CTRL_TYPE, type);
		// Bundle bundle = new Bundle();
		// bundle.putInt(CTRL_TYPE, type);
		// intent.putExtras(bundle);
		startActivity(intent);
	}
}

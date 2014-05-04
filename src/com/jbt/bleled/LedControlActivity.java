package com.jbt.bleled;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LedControlActivity extends Activity {

	TextView typeTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_control);

		typeTextView = (TextView) findViewById(R.id.tv_type);

		int type = getIntent().getIntExtra(GlobalVars.CTRL_TYPE,
				GlobalVars.TYPE_WIFI);
		initType(type);
	}

	private void initType(int type) {
		switch (type) {
		case GlobalVars.TYPE_WIFI:
			typeTextView.setText("Wifi");
			break;
		case GlobalVars.TYPE_ZIGBEE:
			typeTextView.setText("Zigbee");
			break;
		case GlobalVars.TYPE_DALI:
			typeTextView.setText("Dali");
			break;
		default:
			break;
		}
	}
}

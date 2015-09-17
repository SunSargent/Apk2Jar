package com.android.apk2jar.demo;


import com.android.apk2jar.ui.UIManager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		setContentView(R.layout.apk2jar_activity_main);
//		ViewGroup view = (ViewGroup) Apk2Jar.getView(this, R2.layout.apk2jar_activity_main);
//		setContentView(view);
		
		UIManager.getInstance().showMain(this);
	}
}
package com.android.allinjar.demo;


import com.android.allinjar.ui.UIManager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		setContentView(R.layout.allinjar_activity_main);
//		ViewGroup view = (ViewGroup) AllInJar.getView(this, R2.layout.allinjar_activity_main);
//		setContentView(view);
		
		UIManager.getInstance().showMain(this);
	}
}
package com.example.framework;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseActivity extends Activity {

	/****************************************************************
	 *
	 * Fragment Life-cycle methods below
	 *
	 ****************************************************************/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(getClass().getSimpleName(), "In onCreate(Bundle savedInstanceState)");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(getClass().getSimpleName(), "In onDestroy()");
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		Log.d(getClass().getSimpleName(), "In onLowMemory()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(getClass().getSimpleName(), "In onPause()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(getClass().getSimpleName(), "In onResume()");
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(getClass().getSimpleName(), "In onSaveInstanceState(Bundle outState)");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(getClass().getSimpleName(), "In onStart()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(getClass().getSimpleName(), "In onStop()");
	}

}

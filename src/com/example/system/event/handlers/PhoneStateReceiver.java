package com.example.system.event.handlers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneStateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		final Bundle extras = intent.getExtras();
		if (extras != null) {
			// If extras isn't null,
			// then there is some data that intent has for us to deal with
			final String state = extras.getString(TelephonyManager.EXTRA_STATE);
			Log.d(getClass().getSimpleName(), state);

			if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
				final String phoneNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
				Log.d(getClass().getSimpleName(), phoneNumber);
			}
		}
	}

}

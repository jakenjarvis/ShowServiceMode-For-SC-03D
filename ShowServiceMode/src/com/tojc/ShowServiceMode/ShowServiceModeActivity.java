package com.tojc.ShowServiceMode;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class ShowServiceModeActivity extends Activity
{
	public static final String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		try
		{
			Intent intent =	new Intent(SECRET_CODE_ACTION, Uri.parse("android_secret_code://2263"));
			sendBroadcast(intent);
		}
		catch(Exception e)
		{
			Log.e("ShowServiceModeActivity", "Dial on failed", e);
		}

		finish();
	}
}
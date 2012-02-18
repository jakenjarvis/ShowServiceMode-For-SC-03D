package com.tojc.ShowServiceMode;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class ShowServiceModeActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		try
		{
			Intent intent =
					new Intent(Intent.ACTION_DIAL, Uri.parse("tel:*"
							+ Uri.encode("#") + "2263" + Uri.encode("#") + ""));
			startActivity(intent);
		}
		catch(Exception e)
		{
			Log.e("ShowServiceModeActivity", "Dial on failed", e);
		}

		finish();
	}
}
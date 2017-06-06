/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.movento.webview;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;


@Kroll.module(name="MoventoWebviewAndroid", id="com.movento.webview")
public class MoventoWebviewAndroidModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "MoventoWebviewAndroidModule";
	private static final boolean DBG = TiConfig.LOGD;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public MoventoWebviewAndroidModule()
	{
		super();
		Log.i(TAG, "MoventoWebviewAndroidModule");
	}
	
	@Override
	public String getApiName()
	{
		return "com.movento.webview";
	}

}


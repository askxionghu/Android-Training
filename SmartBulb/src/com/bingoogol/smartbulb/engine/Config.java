package com.bingoogol.smartbulb.engine;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import android.os.Message;

import com.bingoogol.smartbulb.engine.LightHandler.LightCallback;
import com.bingoogol.smartbulb.util.Constants;
import com.bingoogol.smartbulb.util.Logger;

/**
 * 应用程序配置，认证用户
 * 
 * @author 王浩 bingoogol@sina.com
 */
public class Config {
	private String deviceType = "bingoogol";

	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * 异步认证用户
	 * 
	 * @param lightCallback
	 *            Light操作回调接口
	 */
	public void createUser(LightCallback lightCallback) {
		final LightHandler lightHandler = new LightHandler(lightCallback);
		new Thread() {
			@SuppressWarnings("unchecked")
			public void run() {
				String relativeUrl = "";
				String jsonBody = "{\"devicetype\":" + "\"" + deviceType + "\"}";
				Message msg = lightHandler.obtainMessage(Constants.what.FAILURE);
				try {
					String response = HueRestClient.getInstance().post(relativeUrl, jsonBody);
					Logger.i(Constants.TAG, "response >> " + response);
					JSONObject jsonObject = new JSONArray(response).getJSONObject(0);
					Iterator<String> keys = jsonObject.keys();
					if (keys.hasNext()) {
						String key = keys.next();
						JSONObject jsonValue = jsonObject.getJSONObject(key);
						if ("success".equals(key)) {
							msg.what = Constants.what.SUCCESS;
							msg.obj = jsonValue.getString("username");
						} else if ("error".equals(key)) {
							if ("101".equals(jsonValue.getString("type"))) {
								msg.what = Constants.what.LINKBUTTON;
							}
						}
					}
				} catch (Exception e) {
					msg.what = Constants.what.WIFIERROR;
				} finally {
					lightHandler.sendMessage(msg);
				}
			};
		}.start();
	}
}

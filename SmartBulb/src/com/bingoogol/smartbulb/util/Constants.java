package com.bingoogol.smartbulb.util;

import java.io.File;

/**
 * 系统常量工具类
 * 
 * @author 王浩 bingoogol@sina.com
 */
public final class Constants {
	
	
	private Constants() {
	}
	
	/**
	 * 桥接器ip地址
	 */
	public static String IPADDRESS = "192.168.1.101";
	
	/**
	 * message code常量类
	 * 
	 * @author 王浩 bingoogol@sina.com
	 */
	public static final class what {
		public static final int SUCCESS = 1;
		public static final int FAILURE = 2;
		public static final int UNAUTHORIZED = 3;
		public static final int WIFIERROR = 4;
		public static final int LINKBUTTON = 5;
		public static final int YYY = 6;
		
	}
	
	/**
	 * 系统文件常量类
	 * 
	 * @author 王浩 bingoogol@sina.com
	 */
	public static final class file {
		public static final String DIR_ROOT = "SmartBulb";
		public static final String DIR_IMAGE = DIR_ROOT + File.separator + "images";
	}

	/**
	 * 数据库常量类
	 * 
	 * @author 王浩 bingoogol@sina.com
	 */
	public static final class db {
		public static final String DB_NAME = "SmartBulb.db";
		public static final int DB_VERSION = 1;
		
		/**
		 * 模板属性常量类
		 * 
		 * @author 王浩 bingoogol@sina.com
		 */
		public static final class template {
			public static final String TABLE_NAME = "Template";
			public static final String COLUMN_NAME_ID = "_id";
			public static final String COLUMN_NAME_NAME = "name";
			public static final String COLUMN_NAME_IMG_PATH = "img_path";
		}

		/**
		 * 灯泡属性常量类
		 * 
		 * @author 王浩 bingoogol@sina.com
		 */
		public static final class lightattr {
			public static final String TABLE_NAME = "LightAttr";
			public static final String COLUMN_NAME_ID = "_id";
			public static final String COLUMN_NAME_TID = "tid";
			public static final String COLUMN_NAME_TYPE = "type";
			public static final String COLUMN_NAME_NAME = "name";
			public static final String COLUMN_NAME_MODELID = "modelid";
			public static final String COLUMN_NAME_SWVERSION = "swversion";
			public static final String COLUMN_NAME_STATE = "state";
			public static final String COLUMN_NAME_BRI = "bri";
			public static final String COLUMN_NAME_HUE = "hue";
			public static final String COLUMN_NAME_SAT = "sat";
			public static final String COLUMN_NAME_XY_X = "xy_x";
			public static final String COLUMN_NAME_XY_Y = "xy_y";
			public static final String COLUMN_NAME_CT = "ct";
			public static final String COLUMN_NAME_ALERT = "alert";
			public static final String COLUMN_NAME_EFFECT = "effect";
			public static final String COLUMN_NAME_TRANSITIONTIME = "transitiontime";
			public static final String COLUMN_NAME_COLORMODE = "colormode";
		}
	}

	/**
	 * 系统activity之间跳转的请求码常量类
	 * 
	 * @author 王浩 bingoogol@sina.com
	 */
	public static final class activity {
		public static final int OPEN_WIFI_SETTINGS = 1;
		public static final int GET_FROM_GALLERY = 2;
		public static final int GET_FROM_CAMERA = 3;
		public static final int GET_FROM_CROP = 4;
	}

	/**
	 * 网络访问常量类
	 * 
	 * @author 王浩 bingoogol@sina.com
	 */
	public static final class net {
		public static final int CONNECTTIMEOUT = 5000;
		public static final int READTIMEOUT = 5000;
	}
}

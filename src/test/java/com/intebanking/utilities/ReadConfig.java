package com.intebanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
		    pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
		}
		public String getApplicationUrl() {
			String url = pro.getProperty("baseURL");
			return url;
			
		}
		public String getUserName() {
			String Username = pro.getProperty("username");
		
			return Username;
			}
		public String  getPassword () {
			String Password = pro.getProperty("password");
			return Password;
		}
		public String getChromeDriver() {
			String chromepath = pro.getProperty("chromepath");
			return chromepath;
		}
		public String getFireFoxDriver () {
			String firefoxpath = pro.getProperty("firefoxpath");
			return firefoxpath;
			
		}
	}



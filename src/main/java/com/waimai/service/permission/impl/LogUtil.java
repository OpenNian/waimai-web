package com.waimai.service.permission.impl;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.waimai.service.permission.LogService;
import com.waimai.util.LogType;

public class LogUtil {
	private LogService logService;
	private static LogUtil instance = null;
	private static WebApplicationContext app = ContextLoader.getCurrentWebApplicationContext();
	/**
	 * 确保单例
	 * @return
	 */
	public static synchronized LogUtil getInstance(){
		//影响性能
		/*if(instance==null){
			synchronized(instance){
				if(instance==null){
					instance = new LogUtil();
				}
			}
		}*/
		if(instance==null){
			instance = new LogUtil();
		}
		return instance;
	}
	
	public void log(LogType type,String content){
		logService = (LogService)app.getBean("logService");
		logService.log(type, content);
	}
	
	public LogService getLogService() {
		return logService;
	}
	public void setLogService(LogService logService) {
		this.logService = logService;
	}
}

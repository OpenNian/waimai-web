package com.waimai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.waimai.util.LogType;

@Service
public class LogUtil {
	@Autowired
	private LogService logService;
	private static LogUtil instance = null;
	private LogUtil(){
		WebApplicationContext app = ContextLoader.getCurrentWebApplicationContext();
		logService = (LogService)app.getBean("logService");
	}
	public static synchronized LogUtil getInstance(){
		if(instance==null){
			instance = new LogUtil();
		}
		return instance;
	}
	
	public void log(LogType type,String content){
		logService.log(type, content);
	}
	
	public LogService getLogService() {
		return logService;
	}
	public void setLogService(LogService logService) {
		this.logService = logService;
	}
}

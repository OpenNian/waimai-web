package com.waimai.service;

import java.util.Map;

import com.waimai.model.Log;
import com.waimai.util.LogType;

public interface LogService {
	public int saveLog(Log log);
	public void log(LogType type, String content);
	public void log(LogType type, Map<String, Object> logMap);
}

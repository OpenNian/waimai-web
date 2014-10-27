package com.waimai.service.permission;

import java.util.Map;

import com.waimai.model.permission.Log;
import com.waimai.util.LogType;

public interface LogService {
	public int saveLog(Log log);
	public void log(LogType type, String content);
	public void log(LogType type, Map<String, Object> logMap);
}

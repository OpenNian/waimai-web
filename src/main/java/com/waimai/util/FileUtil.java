package com.waimai.util;

public class FileUtil {
	public synchronized static String getFileExtName(String filename){
		int p = filename.indexOf(".");
		return filename.substring(p+1);
	}
}

package org.testing.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4j {
	
	public static void logFatal(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.fatal(msg);
	
	}
	
	public static void logError(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.error(msg);
	
	}
	
	public static void logWarn(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.warn(msg);
	
	}
	
	public static void logInfo(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.info(msg);
	
	}
	
	public static void logDebug(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.debug(msg);
	
	}
	
	public static void logTrace(String className, String msg)
	{
		Logger logs =LogManager.getLogger(className);
		logs.trace(msg);
	
	}
	
		
	}
		 

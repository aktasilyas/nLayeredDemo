package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void LogToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.Log(message);
	}

}

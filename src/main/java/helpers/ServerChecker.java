package helpers;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ServerChecker {

	public static AppiumDriverLocalService service;

	public static AppiumDriverLocalService serverChecker() {

		boolean flag = checkIfServerIsRunnning(4723);

		if (!flag) {

			service = AppiumDriverLocalService
					.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
							.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
							.withIPAddress("127.0.0.1").usingPort(4723));

		}

		return service;

	}

	public static boolean checkIfServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

}


package edu.gatech.mbsec.adapter.integrity.application;

import java.util.TimerTask;

public class TimerTask4Adapter extends TimerTask {

	public void run() {
		IntegrityManager.serverResourcesReadFlag.setValue(false);
		IntegrityManager.readServerResources();
	}
}

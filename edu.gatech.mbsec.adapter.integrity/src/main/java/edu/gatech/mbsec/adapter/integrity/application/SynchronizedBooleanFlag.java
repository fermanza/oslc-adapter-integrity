package edu.gatech.mbsec.adapter.integrity.application;

public class SynchronizedBooleanFlag {
	private boolean flag = false;

    public synchronized void setValue(boolean value) {
    	flag = value;
    }
    
    public synchronized boolean getValue() {
        return flag;
    }
}

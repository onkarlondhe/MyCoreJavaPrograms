package com.interfacedemoo;

public interface Notification extends EmailNotification,SMSNotification{

	void sendAppNotification();
}

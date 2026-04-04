package javaPrograms.Daily.Day2.NotificationSystem;

public class SMSNotification implements Notification{
@Override
public void sendMessage(String message) {
    System.out.println("Email sent: " + message);
}
}

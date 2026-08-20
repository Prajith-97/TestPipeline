package javaPrograms.Daily.Day2.NotificationSystem;

public class Main {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        n1.sendMessage("Hello Email");
        n1.checkUser("Checking Email User");

        Notification n2 = new SMSNotification();
        n2.sendMessage("Hello SMS");
        n2.checkUser("Checking SMS User");
    }
}

package javaPrograms.Daily.Day2.NotificationSystem;

public interface Notification {
    void sendMessage(String message);

    default void checkUser(String message){
        System.out.println(message);
        response();
    }
    private void response(){
        System.out.println("Notification sent to user");
    }
}

package src.d;

public class SMS implements Message{

    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("SMS was sent!");
    }
}

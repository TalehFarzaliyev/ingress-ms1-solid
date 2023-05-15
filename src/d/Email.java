package src.d;

public class Email implements Message{

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Email was sent!");
    }
}

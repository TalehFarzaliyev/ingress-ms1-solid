package src.d;

import src.l.Azericard;
import src.l.Million;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> list = new ArrayList<>();
        list.add(new SMS());
        Notification notification = new Notification(list);
        notification.sender();
    }
}

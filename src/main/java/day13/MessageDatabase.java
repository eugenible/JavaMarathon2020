package day13;

import java.util.List;
import java.util.ArrayList;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        Message msg = new Message(u1, u2, text);
        messages.add(msg);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message msg : getMessages()) {
            if ((msg.getSender() == u1) && (msg.getReceiver() == u2)
                    || (msg.getSender() == u2) && (msg.getReceiver() == u1)) {
                System.out.println(msg.getSender().getUsername() + ": " + msg.getText());
            }
        }

    }
}

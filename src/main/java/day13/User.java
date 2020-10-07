package day13;

import java.util.List;
import java.util.ArrayList;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return this.username;
    }

    public List<User> getSubscriptions() {
        return this.subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return (this.subscriptions.contains(user));
    }

    public boolean isFriend(User user) {
        return (this.isSubscribed(user) && user.isSubscribed(this));
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return this.username;
    }
}

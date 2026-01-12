package lesson10;

import java.util.Objects;

public class User {
    private String username;
    private String email;
    private int id;

    public User(String username, String email, int id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    @Override
    public String toString(){
        return "User " +
        "Name = " + username +
        " Email = " + email +
        " id = " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, id);
    }
}

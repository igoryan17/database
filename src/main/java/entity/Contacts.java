package entity;

import javax.persistence.*;

/**
 * Created by igoryan on 28.02.16.
 */
@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String login;
    private long token;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserInfo userInfo;

    public Contacts() {
    }

    public Contacts(String login, long token, UserInfo userInfo) {

        this.login = login;
        this.token = token;
        this.userInfo = userInfo;
    }

    public int getId() {
        return id;
    }

    public long getToken() {
        return token;
    }

    public String getLogin() {
        return login;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setToken(long token) {
        this.token = token;
    }

    public UserInfo getUserInfo() {

        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", token=" + token +
                ", userInfo=" + userInfo +
                '}';
    }
}

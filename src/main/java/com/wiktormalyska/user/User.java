package com.wiktormalyska.user;

public abstract class User implements IUser{
    protected String login;
    protected String password;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

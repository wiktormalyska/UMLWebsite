package com.wiktormalyska.user.admin;

import com.wiktormalyska.user.User;

public class Admin extends User implements IAdmin {
    public Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public String getLogin() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void openAdminPanel() {

    }
}

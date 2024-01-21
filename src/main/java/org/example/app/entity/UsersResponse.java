package org.example.app.entity;

import java.util.List;

public class UsersResponse {

    private final List<User> data;

    public UsersResponse(List<User> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }

}

package org.example.app.entity;

public class UserResponse {
    private final User data;


    public UserResponse(User data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}

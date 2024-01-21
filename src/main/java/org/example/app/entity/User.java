package org.example.app.entity;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private final int id;
    @SerializedName("first_name")
    private final String firstName;
    @SerializedName("last_name")
    private final String lastName;
    @SerializedName("email")
    private final String email;

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "{\"id\":" + id + "," +
                "\"first_name\":\"" + firstName + "\"," +
                "\"last_name\":\"" + lastName + "\"," +
                "\"email\":\"" + email + "\"}";
    }

}

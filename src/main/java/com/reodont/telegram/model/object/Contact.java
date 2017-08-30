/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contact implements Serializable {

    private static final long serialVersionUID = 7191801611641193262L;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    @SerializedName("user_id")
    private Integer userId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phoneNumber != null ? !phoneNumber.equals(contact.phoneNumber) : contact.phoneNumber != null) return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        return userId != null ? userId.equals(contact.userId) : contact.userId == null;
    }

    @Override
    public int hashCode() {
        int result = phoneNumber != null ? phoneNumber.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                '}';
    }
}

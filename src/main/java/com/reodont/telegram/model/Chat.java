/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Chat implements Serializable {

    private static final long serialVersionUID = -7440147796849948969L;

    public enum Type {
        @SerializedName("private") Private, group, supergroup, channel
    }

    private Long id;

    private Type type;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String username;

    private String title;

    @SerializedName("all_members_are_administrators")
    private Boolean allMembersAreAdministrators;

    private ChatPhoto photo;

    private String description;

    @SerializedName("invite_link")
    private String inviteLink;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public String getInviteLink() {
        return inviteLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (id != null ? !id.equals(chat.id) : chat.id != null) return false;
        if (type != chat.type) return false;
        if (firstName != null ? !firstName.equals(chat.firstName) : chat.firstName != null) return false;
        if (lastName != null ? !lastName.equals(chat.lastName) : chat.lastName != null) return false;
        if (username != null ? !username.equals(chat.username) : chat.username != null) return false;
        if (title != null ? !title.equals(chat.title) : chat.title != null) return false;
        if (allMembersAreAdministrators != null ? !allMembersAreAdministrators.equals(chat.allMembersAreAdministrators) : chat.allMembersAreAdministrators != null)
            return false;
        if (photo != null ? !photo.equals(chat.photo) : chat.photo != null) return false;
        if (description != null ? !description.equals(chat.description) : chat.description != null) return false;
        return inviteLink != null ? inviteLink.equals(chat.inviteLink) : chat.inviteLink == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (allMembersAreAdministrators != null ? allMembersAreAdministrators.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (inviteLink != null ? inviteLink.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type=" + type +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", allMembersAreAdministrators=" + allMembersAreAdministrators +
                ", photo=" + photo +
                ", description='" + description + '\'' +
                ", inviteLink='" + inviteLink + '\'' +
                '}';
    }
}

/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Chat implements Serializable {
    private final static long serialVersionUID = 0L;

    public enum Type {
        @SerializedName("private") Private, group, supergroup, channel
    }

    private Long id;
    private Type type;

    private String first_name;
    private String last_name;


    private String username;


    private String title;

    private Boolean all_members_are_administrators;

    private ChatPhoto photo;
    private String description;
    private String invite_link;

    public Long id() {
        return id;
    }

    public Type type() {
        return type;
    }

    public String firstName() {
        return first_name;
    }

    public String lastName() {
        return last_name;
    }

    public String username() {
        return username;
    }

    public String title() {
        return title;
    }

    public Boolean allMembersAreAdministrators() {
        return all_members_are_administrators;
    }

    public ChatPhoto photo() {
        return photo;
    }

    public String description() {
        return description;
    }

    public String inviteLink() {
        return invite_link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (id != null ? !id.equals(chat.id) : chat.id != null) return false;
        if (type != chat.type) return false;
        if (first_name != null ? !first_name.equals(chat.first_name) : chat.first_name != null) return false;
        if (last_name != null ? !last_name.equals(chat.last_name) : chat.last_name != null) return false;
        if (username != null ? !username.equals(chat.username) : chat.username != null) return false;
        if (title != null ? !title.equals(chat.title) : chat.title != null) return false;
        if (all_members_are_administrators != null ? !all_members_are_administrators.equals(chat.all_members_are_administrators) : chat.all_members_are_administrators != null)
            return false;
        if (photo != null ? !photo.equals(chat.photo) : chat.photo != null) return false;
        if (description != null ? !description.equals(chat.description) : chat.description != null) return false;
        return invite_link != null ? invite_link.equals(chat.invite_link) : chat.invite_link == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type=" + type +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", all_members_are_administrators=" + all_members_are_administrators +
                ", photo=" + photo +
                ", description='" + description + '\'' +
                ", invite_link='" + invite_link + '\'' +
                '}';
    }
}

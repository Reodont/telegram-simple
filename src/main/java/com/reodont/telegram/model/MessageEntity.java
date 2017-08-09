/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import java.io.Serializable;

public class MessageEntity implements Serializable {

    private static final long serialVersionUID = -8847494493425597858L;

    public enum Type {
        mention, hashtag, botCommand, url, email, bold, italic, code, pre, textLink, textMention
    }

    private Type type;
    private Integer offset;
    private Integer length;
    private String url;
    private User user;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Type getType() {
        return type;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLength() {
        return length;
    }

    public String getUrl() {
        return url;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntity that = (MessageEntity) o;

        if (type != that.type) return false;
        if (offset != null ? !offset.equals(that.offset) : that.offset != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (offset != null ? offset.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "type=" + type +
                ", offset=" + offset +
                ", length=" + length +
                ", url='" + url + '\'' +
                ", user=" + user +
                '}';
    }
}

/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChatPhoto implements Serializable {

    private static final long serialVersionUID = -4933399404600364195L;

    @SerializedName("small_file_id")
    private String smallFileId;

    @SerializedName("big_file_id")
    private String bigFileId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSmallFileId() {
        return smallFileId;
    }

    public String getBigFileId() {
        return bigFileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatPhoto chatPhoto = (ChatPhoto) o;

        if (smallFileId != null ? !smallFileId.equals(chatPhoto.smallFileId) : chatPhoto.smallFileId != null)
            return false;
        return bigFileId != null ? bigFileId.equals(chatPhoto.bigFileId) : chatPhoto.bigFileId == null;
    }

    @Override
    public int hashCode() {
        int result = smallFileId != null ? smallFileId.hashCode() : 0;
        result = 31 * result + (bigFileId != null ? bigFileId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChatPhoto{" +
                "smallFileId='" + smallFileId + '\'' +
                ", bigFileId='" + bigFileId + '\'' +
                '}';
    }
}

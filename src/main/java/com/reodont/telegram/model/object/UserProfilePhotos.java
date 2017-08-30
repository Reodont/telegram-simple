/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;

public class UserProfilePhotos implements Serializable {

    private static final long serialVersionUID = 5055457597827040861L;

    @SerializedName("total_count")
    private Integer totalCount;

    private PhotoSize[][] photos;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public PhotoSize[][] getPhotos() {
        return photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserProfilePhotos that = (UserProfilePhotos) o;

        if (totalCount != null ? !totalCount.equals(that.totalCount) : that.totalCount != null) return false;
        return Arrays.deepEquals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        int result = totalCount != null ? totalCount.hashCode() : 0;
        result = 31 * result + Arrays.deepHashCode(photos);
        return result;
    }

    @Override
    public String toString() {
        return "UserProfilePhotos{" +
                "totalCount=" + totalCount +
                ", photos=" + Arrays.toString(photos) +
                '}';
    }
}

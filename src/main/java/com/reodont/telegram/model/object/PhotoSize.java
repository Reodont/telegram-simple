/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PhotoSize implements Serializable {

    private static final long serialVersionUID = 5907384692976649033L;

    @SerializedName("file_id")
    private String fileId;

    private Integer width;

    private Integer height;

    @SerializedName("file_size")
    private Integer fileSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoSize photoSize = (PhotoSize) o;

        if (fileId != null ? !fileId.equals(photoSize.fileId) : photoSize.fileId != null) return false;
        if (width != null ? !width.equals(photoSize.width) : photoSize.width != null) return false;
        if (height != null ? !height.equals(photoSize.height) : photoSize.height != null) return false;
        return fileSize != null ? fileSize.equals(photoSize.fileSize) : photoSize.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoSize{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", fileSize=" + fileSize +
                '}';
    }
}

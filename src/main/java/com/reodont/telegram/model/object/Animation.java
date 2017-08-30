/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Animation implements Serializable {

    private static final long serialVersionUID = 7362662984394436659L;

    @SerializedName("file_id")
    private String fileId;

    private PhotoSize thumb;

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("file_size")
    private Integer fileSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String fileId() {
        return fileId;
    }

    public PhotoSize thumb() {
        return thumb;
    }

    public String fileName() {
        return fileName;
    }

    public String mimeType() {
        return mimeType;
    }

    public Integer fileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animation animation = (Animation) o;

        if (fileId != null ? !fileId.equals(animation.fileId) : animation.fileId != null) return false;
        if (thumb != null ? !thumb.equals(animation.thumb) : animation.thumb != null) return false;
        if (fileName != null ? !fileName.equals(animation.fileName) : animation.fileName != null) return false;
        if (mimeType != null ? !mimeType.equals(animation.mimeType) : animation.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(animation.fileSize) : animation.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animation{" +
                "fileId='" + fileId + '\'' +
                ", thumb=" + thumb +
                ", fileName='" + fileName + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

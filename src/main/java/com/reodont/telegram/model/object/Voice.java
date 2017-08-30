/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Voice implements Serializable {

    private static final long serialVersionUID = 8150402198580726783L;

    @SerializedName("file_id")
    private String fileId;

    private Integer duration;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("file_size")
    private Integer fileSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voice voice = (Voice) o;

        if (fileId != null ? !fileId.equals(voice.fileId) : voice.fileId != null) return false;
        if (duration != null ? !duration.equals(voice.duration) : voice.duration != null) return false;
        if (mimeType != null ? !mimeType.equals(voice.mimeType) : voice.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(voice.fileSize) : voice.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Voice{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}
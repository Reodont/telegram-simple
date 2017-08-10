/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Audio implements Serializable {

    private static final long serialVersionUID = -5427636082374475056L;

    @SerializedName("file_id")
    private String fileId;

    private Integer duration;

    private String performer;

    private String title;

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

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
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

        Audio audio = (Audio) o;

        if (fileId != null ? !fileId.equals(audio.fileId) : audio.fileId != null) return false;
        if (duration != null ? !duration.equals(audio.duration) : audio.duration != null) return false;
        if (performer != null ? !performer.equals(audio.performer) : audio.performer != null) return false;
        if (title != null ? !title.equals(audio.title) : audio.title != null) return false;
        if (mimeType != null ? !mimeType.equals(audio.mimeType) : audio.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(audio.fileSize) : audio.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", performer='" + performer + '\'' +
                ", title='" + title + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

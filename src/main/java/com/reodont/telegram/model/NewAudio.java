/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;
import com.reodont.telegram.eip.Event;

public class NewAudio extends Event {

    private static final long serialVersionUID = 4602882708272002374L;

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

        NewAudio newAudio = (NewAudio) o;

        if (fileId != null ? !fileId.equals(newAudio.fileId) : newAudio.fileId != null) return false;
        if (duration != null ? !duration.equals(newAudio.duration) : newAudio.duration != null) return false;
        if (performer != null ? !performer.equals(newAudio.performer) : newAudio.performer != null) return false;
        if (title != null ? !title.equals(newAudio.title) : newAudio.title != null) return false;
        if (mimeType != null ? !mimeType.equals(newAudio.mimeType) : newAudio.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(newAudio.fileSize) : newAudio.fileSize == null;
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
        return "NewAudio{" +
                "fileId='" + fileId + '\'' +
                ", duration=" + duration +
                ", performer='" + performer + '\'' +
                ", title='" + title + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

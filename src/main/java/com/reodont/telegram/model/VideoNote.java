/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VideoNote implements Serializable {

    private static final long serialVersionUID = 9001377338511086794L;

    @SerializedName("file_id")
    private String fileId;

    private Integer length;

    private Integer duration;

    private PhotoSize thumb;

    @SerializedName("file_size")
    private Integer fileSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoNote videoNote = (VideoNote) o;

        if (fileId != null ? !fileId.equals(videoNote.fileId) : videoNote.fileId != null) return false;
        if (length != null ? !length.equals(videoNote.length) : videoNote.length != null) return false;
        if (duration != null ? !duration.equals(videoNote.duration) : videoNote.duration != null) return false;
        if (thumb != null ? !thumb.equals(videoNote.thumb) : videoNote.thumb != null) return false;
        return fileSize != null ? fileSize.equals(videoNote.fileSize) : videoNote.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VideoNote{" +
                "fileId='" + fileId + '\'' +
                ", length=" + length +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", fileSize=" + fileSize +
                '}';
    }
}

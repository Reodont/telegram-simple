/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Video implements Serializable {

    private static final long serialVersionUID = 3740690036599889767L;

    @SerializedName("file_id")
    private String fileId;

    private Integer width;

    private Integer height;

    private Integer duration;

    private PhotoSize thumb;

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

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumb() {
        return thumb;
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

        Video video = (Video) o;

        if (fileId != null ? !fileId.equals(video.fileId) : video.fileId != null) return false;
        if (width != null ? !width.equals(video.width) : video.width != null) return false;
        if (height != null ? !height.equals(video.height) : video.height != null) return false;
        if (duration != null ? !duration.equals(video.duration) : video.duration != null) return false;
        if (thumb != null ? !thumb.equals(video.thumb) : video.thumb != null) return false;
        if (mimeType != null ? !mimeType.equals(video.mimeType) : video.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(video.fileSize) : video.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Video{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", duration=" + duration +
                ", thumb=" + thumb +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

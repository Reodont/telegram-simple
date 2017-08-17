/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sticker implements Serializable {

    private static final long serialVersionUID = 916045639007403720L;

    @SerializedName("file_id")
    private String fileId;

    private Integer width;

    private Integer height;

    private PhotoSize thumb;

    private String emoji;

    @SerializedName("set_name")
    private String setName;

    @SerializedName("mask_position")
    private MaskPosition maskPosition;

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

    public PhotoSize getThumb() {
        return thumb;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getSetName() {
        return setName;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sticker sticker = (Sticker) o;

        if (fileId != null ? !fileId.equals(sticker.fileId) : sticker.fileId != null) return false;
        if (width != null ? !width.equals(sticker.width) : sticker.width != null) return false;
        if (height != null ? !height.equals(sticker.height) : sticker.height != null) return false;
        if (thumb != null ? !thumb.equals(sticker.thumb) : sticker.thumb != null) return false;
        if (emoji != null ? !emoji.equals(sticker.emoji) : sticker.emoji != null) return false;
        if (setName != null ? !setName.equals(sticker.setName) : sticker.setName != null) return false;
        if (maskPosition != null ? !maskPosition.equals(sticker.maskPosition) : sticker.maskPosition != null)
            return false;
        return fileSize != null ? fileSize.equals(sticker.fileSize) : sticker.fileSize == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (emoji != null ? emoji.hashCode() : 0);
        result = 31 * result + (setName != null ? setName.hashCode() : 0);
        result = 31 * result + (maskPosition != null ? maskPosition.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "fileId='" + fileId + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", thumb=" + thumb +
                ", emoji='" + emoji + '\'' +
                ", setName='" + setName + '\'' +
                ", maskPosition=" + maskPosition +
                ", fileSize=" + fileSize +
                '}';
    }
}

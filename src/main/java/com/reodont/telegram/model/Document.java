/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import java.io.Serializable;

public class Document implements Serializable {

    private static final long serialVersionUID = -8965588808218758708L;

    private String fileId;

    private PhotoSize thumb;

    private String fileName;

    private String mimeType;

    private Integer fileSize;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public String getFileName() {
        return fileName;
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

        Document document = (Document) o;

        if (fileId != null ? !fileId.equals(document.fileId) : document.fileId != null) return false;
        if (thumb != null ? !thumb.equals(document.thumb) : document.thumb != null) return false;
        if (fileName != null ? !fileName.equals(document.fileName) : document.fileName != null) return false;
        if (mimeType != null ? !mimeType.equals(document.mimeType) : document.mimeType != null) return false;
        return fileSize != null ? fileSize.equals(document.fileSize) : document.fileSize == null;
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
        return "Document{" +
                "fileId='" + fileId + '\'' +
                ", thumb=" + thumb +
                ", fileName='" + fileName + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}

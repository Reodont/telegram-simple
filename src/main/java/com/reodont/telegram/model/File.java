/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class File implements Serializable {

    private static final long serialVersionUID = -812908085134990765L;

    @SerializedName("file_id")
    private String fileId;

    @SerializedName("file_size")
    private Integer fileSize;

    @SerializedName("file_path")
    private String filePath;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (fileId != null ? !fileId.equals(file.fileId) : file.fileId != null) return false;
        if (fileSize != null ? !fileSize.equals(file.fileSize) : file.fileSize != null) return false;
        return filePath != null ? filePath.equals(file.filePath) : file.filePath == null;
    }

    @Override
    public int hashCode() {
        int result = fileId != null ? fileId.hashCode() : 0;
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileId='" + fileId + '\'' +
                ", fileSize=" + fileSize +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}

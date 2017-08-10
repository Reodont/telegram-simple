/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponseParameters implements Serializable {

    private static final long serialVersionUID = -8984864567574867667L;

    @SerializedName("migrate_to_chat_id")
    private Long migrateToChatId;

    @SerializedName("retry_after")
    private Integer retryAfter;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public Integer getRetryAfter() {
        return retryAfter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseParameters that = (ResponseParameters) o;

        if (migrateToChatId != null ? !migrateToChatId.equals(that.migrateToChatId) : that.migrateToChatId != null)
            return false;
        return retryAfter != null ? retryAfter.equals(that.retryAfter) : that.retryAfter == null;
    }

    @Override
    public int hashCode() {
        int result = migrateToChatId != null ? migrateToChatId.hashCode() : 0;
        result = 31 * result + (retryAfter != null ? retryAfter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResponseParameters{" +
                "migrateToChatId=" + migrateToChatId +
                ", retryAfter=" + retryAfter +
                '}';
    }
}

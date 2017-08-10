/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChosenInlineResult implements Serializable {

    private static final long serialVersionUID = 1320768760873415945L;

    @SerializedName("result_id")
    private String resultId;

    private User from;

    private Location location;

    @SerializedName("inline_message_id")
    private String inlineMessageId;

    private String query;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getResultId() {
        return resultId;
    }

    public User getFrom() {
        return from;
    }

    public Location getLocation() {
        return location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChosenInlineResult that = (ChosenInlineResult) o;

        if (resultId != null ? !resultId.equals(that.resultId) : that.resultId != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (inlineMessageId != null ? !inlineMessageId.equals(that.inlineMessageId) : that.inlineMessageId != null)
            return false;
        return query != null ? query.equals(that.query) : that.query == null;
    }

    @Override
    public int hashCode() {
        int result = resultId != null ? resultId.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (inlineMessageId != null ? inlineMessageId.hashCode() : 0);
        result = 31 * result + (query != null ? query.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChosenInlineResult{" +
                "resultId='" + resultId + '\'' +
                ", from=" + from +
                ", location=" + location +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}

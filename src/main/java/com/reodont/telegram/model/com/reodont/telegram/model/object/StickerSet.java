/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;


public class StickerSet implements Serializable {

    private static final long serialVersionUID = -4113331034675690166L;

    private String name;

    private String title;

    @SerializedName("contains_masks")
    private Boolean containsMasks;

    private Sticker[] stickers;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getContainsMasks() {
        return containsMasks;
    }

    public Sticker[] getStickers() {
        return stickers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StickerSet that = (StickerSet) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (containsMasks != null ? !containsMasks.equals(that.containsMasks) : that.containsMasks != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(stickers, that.stickers);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (containsMasks != null ? containsMasks.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(stickers);
        return result;
    }

    @Override
    public String toString() {
        return "StickerSet{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", containsMasks=" + containsMasks +
                ", stickers=" + Arrays.toString(stickers) +
                '}';
    }
}

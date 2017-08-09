/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import java.io.Serializable;
import java.util.Arrays;

public class Game implements Serializable {

    private static final long serialVersionUID = 4746582109582449885L;

    private String title;

    private String description;

    private PhotoSize[] photo;

    private String text;

    private MessageEntity[] textEntities;

    private Animation animation;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public String getText() {
        return text;
    }

    public MessageEntity[] getTextEntities() {
        return textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (title != null ? !title.equals(game.title) : game.title != null) return false;
        if (description != null ? !description.equals(game.description) : game.description != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(photo, game.photo)) return false;
        if (text != null ? !text.equals(game.text) : game.text != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(textEntities, game.textEntities)) return false;
        return animation != null ? animation.equals(game.animation) : game.animation == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(textEntities);
        result = 31 * result + (animation != null ? animation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", text='" + text + '\'' +
                ", textEntities=" + Arrays.toString(textEntities) +
                ", animation=" + animation +
                '}';
    }
}

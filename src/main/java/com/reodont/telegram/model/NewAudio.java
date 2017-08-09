/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.eip.Event;

public class NewAudio extends Event {
    private final static long serialVersionUID = 0L;

    private String file_id;
    private Integer duration;
    private String performer;
    private String title;
    private String mime_type;
    private Integer file_size;


    public static long getSerialVersionUID() {

        return serialVersionUID;
    }

    public String getFile_id() {
        return file_id;
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

    public String getMime_type() {
        return mime_type;
    }

    public Integer getFile_size() {
        return file_size;
    }

    public NewAudio() {
    }

    public NewAudio(Message message) {
        this.duration = message.audio().duration();
        this.file_id = message.audio().fileId();
        this.file_size = message.audio().fileSize();
        this.mime_type = message.audio().mimeType();
        this.performer = message.audio().performer();
        this.title = message.audio().title();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewAudio newAudio = (NewAudio) o;

        if (file_id != null ? !file_id.equals(newAudio.file_id) : newAudio.file_id != null) return false;
        if (duration != null ? !duration.equals(newAudio.duration) : newAudio.duration != null) return false;
        if (performer != null ? !performer.equals(newAudio.performer) : newAudio.performer != null) return false;
        if (title != null ? !title.equals(newAudio.title) : newAudio.title != null) return false;
        if (mime_type != null ? !mime_type.equals(newAudio.mime_type) : newAudio.mime_type != null) return false;
        return file_size != null ? file_size.equals(newAudio.file_size) : newAudio.file_size == null;
    }

    @Override
    public int hashCode() {
        int result = file_id != null ? file_id.hashCode() : 0;
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (performer != null ? performer.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (mime_type != null ? mime_type.hashCode() : 0);
        result = 31 * result + (file_size != null ? file_size.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "NewAudio{" +
                "file_id='" + file_id + '\'' +
                ", duration=" + duration +
                ", performer='" + performer + '\'' +
                ", title='" + title + '\'' +
                ", mime_type='" + mime_type + '\'' +
                ", file_size=" + file_size +
                '}';
    }
}

/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import java.io.Serializable;

public class Venue implements Serializable {

    private static final long serialVersionUID = 3336274487315835922L;

    private Location location;

    private String title;

    private String address;

    private String foursquareId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Location getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Venue venue = (Venue) o;

        if (location != null ? !location.equals(venue.location) : venue.location != null) return false;
        if (title != null ? !title.equals(venue.title) : venue.title != null) return false;
        if (address != null ? !address.equals(venue.address) : venue.address != null) return false;
        return foursquareId != null ? foursquareId.equals(venue.foursquareId) : venue.foursquareId == null;
    }

    @Override
    public int hashCode() {
        int result = location != null ? location.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (foursquareId != null ? foursquareId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "location=" + location +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", foursquareId='" + foursquareId + '\'' +
                '}';
    }
}

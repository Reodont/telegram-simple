/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import java.io.Serializable;

public class Location implements Serializable {

    private static final long serialVersionUID = 1453772810132197854L;

    private Float longitude;

    private Float latitude;

    public Float getLongitude() {
        return longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (longitude != null ? !longitude.equals(location.longitude) : location.longitude != null) return false;
        return latitude != null ? latitude.equals(location.latitude) : location.latitude == null;
    }

    @Override
    public int hashCode() {
        int result = longitude != null ? longitude.hashCode() : 0;
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}

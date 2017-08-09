/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.Gson;

import java.io.Serializable;

public class MaskPosition implements Serializable {

    private static final long serialVersionUID = 4450829618051062081L;

    private final static Gson gson = new Gson();

    public enum Point {
        forehead, eyes, mouth, chin
    }

    private String point;

    private Float xShift;

    private Float yShift;

    private Float scale;

    public MaskPosition() {
    }

    public MaskPosition(Point point, Float x_shift, Float y_shift, Float scale) {
        this(point.name(), x_shift, y_shift, scale);
    }

    public MaskPosition(String point, Float xShift, Float yShift, Float scale) {
        this.point = point;
        this.xShift = xShift;
        this.yShift = yShift;
        this.scale = scale;
    }

    public String getPoint() {
        return point;
    }

    public Float getX_shift() {
        return xShift;
    }

    public Float getY_shift() {
        return yShift;
    }

    public Float getScale() {
        return scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaskPosition that = (MaskPosition) o;

        if (point != null ? !point.equals(that.point) : that.point != null) return false;
        if (xShift != null ? !xShift.equals(that.xShift) : that.xShift != null) return false;
        if (yShift != null ? !yShift.equals(that.yShift) : that.yShift != null) return false;
        return scale != null ? scale.equals(that.scale) : that.scale == null;
    }

    @Override
    public int hashCode() {
        int result = point != null ? point.hashCode() : 0;
        result = 31 * result + (xShift != null ? xShift.hashCode() : 0);
        result = 31 * result + (yShift != null ? yShift.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MaskPosition{" +
                "point='" + point + '\'' +
                ", xShift=" + xShift +
                ", yShift=" + yShift +
                ", scale=" + scale +
                '}';
    }
}

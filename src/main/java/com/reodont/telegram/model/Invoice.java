/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Invoice implements Serializable {

    private static final long serialVersionUID = -5037657613180652391L;

    private String title;

    private String description;

    @SerializedName("start_parameter")
    private String startParameter;

    private String currency;

    @SerializedName("total_amount")
    private Integer totalAmount;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (title != null ? !title.equals(invoice.title) : invoice.title != null) return false;
        if (description != null ? !description.equals(invoice.description) : invoice.description != null) return false;
        if (startParameter != null ? !startParameter.equals(invoice.startParameter) : invoice.startParameter != null)
            return false;
        if (currency != null ? !currency.equals(invoice.currency) : invoice.currency != null) return false;
        return totalAmount != null ? totalAmount.equals(invoice.totalAmount) : invoice.totalAmount == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startParameter != null ? startParameter.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startParameter='" + startParameter + '\'' +
                ", currency='" + currency + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

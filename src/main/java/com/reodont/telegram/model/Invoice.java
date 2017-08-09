/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import java.io.Serializable;

public class Invoice implements Serializable {

    private static final long serialVersionUID = -5037657613180652391L;

    private String title;

    private String description;

    private String start_parameter;

    private String currency;

    private Integer total_amount;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStart_parameter() {
        return start_parameter;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (title != null ? !title.equals(invoice.title) : invoice.title != null) return false;
        if (description != null ? !description.equals(invoice.description) : invoice.description != null) return false;
        if (start_parameter != null ? !start_parameter.equals(invoice.start_parameter) : invoice.start_parameter != null)
            return false;
        if (currency != null ? !currency.equals(invoice.currency) : invoice.currency != null) return false;
        return total_amount != null ? total_amount.equals(invoice.total_amount) : invoice.total_amount == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (start_parameter != null ? start_parameter.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (total_amount != null ? total_amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", start_parameter='" + start_parameter + '\'' +
                ", currency='" + currency + '\'' +
                ", total_amount=" + total_amount +
                '}';
    }
}

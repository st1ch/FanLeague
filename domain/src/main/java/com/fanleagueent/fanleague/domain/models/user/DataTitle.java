package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class DataTitle {
    private String id;
    private String title;
    private String ident;

    public DataTitle(String id, String title, String ident) {
        this.id = id;
        this.title = title;
        this.ident = ident;
    }

    public String getTitle() {
        return title;
    }

    public String getIdent() {
        return ident;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataTitle dataTitle = (DataTitle) o;

        return ident != null ? ident.equals(dataTitle.ident) : dataTitle.ident == null;

    }

    @Override
    public int hashCode() {
        return ident != null ? ident.hashCode() : 0;
    }
}

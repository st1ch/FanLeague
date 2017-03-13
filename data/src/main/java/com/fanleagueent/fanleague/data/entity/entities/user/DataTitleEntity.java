package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class DataTitleEntity {
    @SerializedName("_id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("ident")
    private String ident;

    public DataTitleEntity(String id, String title, String ident) {
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

        DataTitleEntity dataTitleEntity = (DataTitleEntity) o;

        return ident != null ? ident.equals(dataTitleEntity.ident) : dataTitleEntity.ident == null;

    }

    @Override
    public int hashCode() {
        return ident != null ? ident.hashCode() : 0;
    }
}

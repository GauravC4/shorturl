package com.Gaurav.C4.shorturl.entity;

public class UrlEntry {

    private long id;

    private String url;

    private String shorturl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    @Override
    public String toString() {
        return "UrlEntry{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", shortUrl='" + shorturl + '\'' +
                '}';
    }
}

package com.jgybzx.model;

public class Power {
    private String id;

    private String powerName;

    public Power(String id, String powerName) {
        this.id = id;
        this.powerName = powerName;
    }

    public Power() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }
}
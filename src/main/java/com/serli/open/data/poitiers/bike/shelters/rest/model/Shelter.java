package com.serli.open.data.poitiers.bike.shelters.rest.model;

import java.util.Arrays;

/**
 * Created by chris on 04/05/15.
 */
public class Shelter {

    public Shelter(String type, Integer capacity, double[] location, int objectId, String address) {
        this.type = type;
        this.capacity = capacity;
        this.location = location;
        this.objectId = objectId;
        this.address = address;
    }

    public String type;
    public Integer capacity;
    public double[] location;
    public int objectId;
    public String address;

    @Override
    public String toString() {
        return "Shelter{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", location=" + Arrays.toString(location) +
                ", objectId=" + objectId +
                '}';
    }
}

package com.kenzie.statics.shippingboxes;

import java.util.UUID;

public class TrackedBox {

    // PARTICIPANTS: DO NOT CHANGE THE FIELDS boxId or trackingId below. These fields should not be static.
    private String boxId;
    private String trackingId;

    public TrackedBox(String boxId) {
        this.boxId = boxId;
    }

    public String getBoxId() {
        return this.boxId;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public String createTrackingId() {
        //returns trackingID by concatenating boxId with a random id
        String uuid = UUID.randomUUID().toString();
        trackingId = boxId + uuid;
        return trackingId;
    }




}

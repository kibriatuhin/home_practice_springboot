package com.example.home_practice_springboot.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String roadName;
    private int roadNO;
    private int houseNo;

    public Address() {
    }

    public Address(String roadName, int roadNO, int houseNo) {
        this.roadName = roadName;
        this.roadNO = roadNO;
        this.houseNo = houseNo;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public int getRoadNO() {
        return roadNO;
    }

    public void setRoadNO(int roadNO) {
        this.roadNO = roadNO;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }


}

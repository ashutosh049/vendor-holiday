package com.example.holiday.Client;

public enum ClientType {

    TSYS("TSYS"),
    VENDOR("VENDOR");

    private String type;

    ClientType(String type) {
        this.type = type;
    }
}

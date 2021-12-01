package com.hospital.enumerations;

public enum InsuranceType {

    CNSS("CNSS", 70),
    RAMED("RAMED", 80),
    CNOPS("CNOPS", 100);

    private final String value;
    private final int rembourse;

    InsuranceType(String value, int rembourse) {
        this.value = value;
        this.rembourse = rembourse;
    }


    public String getValue() {
        return value;
    }

    public int getRembourse() {
        return rembourse;
    }
}

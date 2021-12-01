package com.hospital.enumerations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public enum OperationType {

    AS312("AS312", 15000, "normal"),
    AO932("AO932", 82000, "urgent"),
    BJ939("BJ939", 26800, "normal");


    private final String operationName;
    private final double cout;
    private final String operationType;




    OperationType(String operationName, double cout, String operationType) {
        this.operationName = operationName;
        this.cout = cout;
        this.operationType = operationType;
    }


    public String getOperationName() {
        return operationName;
    }

    public double getCout() {
        return cout;
    }

    public String getOperationType() {
        return operationType;
    }
}

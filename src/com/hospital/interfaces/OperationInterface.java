package com.hospital.interfaces;

import com.hospital.models.*;
import java.util.*;


public interface OperationInterface {

    public Optional<Operation> getOperationByRef(int ref);

    public void addOperation(List<Operation> operations);


}

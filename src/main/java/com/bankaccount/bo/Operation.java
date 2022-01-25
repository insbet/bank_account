package com.bankaccount.bo;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Operation {

    private List<OperationDetail> operationDetails = new LinkedList<>();

    public void addLine(Transaction transaction, Amount currentBalance) {
    }

    public void printTo(PrintStream printer) {
    }

}

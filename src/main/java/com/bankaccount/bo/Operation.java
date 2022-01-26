package com.bankaccount.bo;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Operation {

    public static final String STATEMENT_HEADER = "operation | date | amount | balance";

    private List<OperationDetail> operationDetails = new LinkedList<>();

    public void addLineContaining(Transaction transaction, Amount currentBalance) {
        operationDetails.add(0, new OperationDetail(transaction, currentBalance));
    }

    public void printTo(PrintStream printer) {
        printer.println(STATEMENT_HEADER);
        printOperationDetails(printer);
    }

    private void printOperationDetails(PrintStream printer) {
        for (OperationDetail statementLine : operationDetails) {
            statementLine.print();
        }
    }

}

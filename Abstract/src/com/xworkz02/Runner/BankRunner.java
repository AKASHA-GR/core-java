package com.xworkz02.Runner;

import com.xworkz02.bank.Bank;
import com.xworkz02.bank.BankInfo;

public class BankRunner {
    public static void main(String[] args) {
        Bank ref = new BankInfo();
        ref.user();
        ref.transaction();
        ref.bankId();
    }
}

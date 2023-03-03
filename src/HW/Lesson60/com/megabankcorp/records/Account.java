package HW.Lesson60.com.megabankcorp.records;

import java.math.BigDecimal;

public class Account {
    /**
     * поле для текущей суммы на счете
     */
   BigDecimal currentAccountBalance;
    /**
     * поле для текущего номера счета
     */
    long currentAccountNumber;
    /**
     * поле для номера клиента банка
     */
    long bankCustomerNumber;

    public static void main(String[] args) {


    }
}






//package com.megabankcorp.records;
//
//import java.math.BigDecimal;
//
//public class Account {
//    private BigDecimal balance;
//    private long accountNumber;
//    private long clientNumber;
//
//    public Account(BigDecimal balance, long accountNumber, long clientNumber) {
//        this.balance = balance;
//        this.accountNumber = accountNumber;
//        this.clientNumber = clientNumber;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public long getAccountNumber() {
//        return accountNumber;
//    }
//
//    public long getClientNumber() {
//        return clientNumber;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//}

//Класс Account содержит поля для текущей суммы на счете, номера счета и номера клиента банка. Также в классе Account есть геттеры и сеттеры для доступа к этим полям.
//
//Класс Database является абстрактным и содержит заготовки методов для сохранения, снятия и получения суммы счета. Метод transfer содержит реализацию по умолчанию для передачи средств между счетами, используя методы deposit и withdraw. Методы deposit, withdraw и getAmount должны быть реализованы в наследниках класса Database.
//
//Обратите внимание, что методы deposit, withdraw и getAmount должны быть доступны только внутри пакета, а метод transfer - только из пакета. Поля класса Account также должны быть закрытыми и иметь геттеры для доступа к ним.
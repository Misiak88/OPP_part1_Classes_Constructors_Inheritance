package com.michal;

public class BankAccount {
    private long accountNumber;
    private long accountBalance;
    private String customerName;
    private String customerEmail;
    private long customerPhoneNumber;

    // Empty Constructor
    public BankAccount(){
        this(0,0,"null","null",0);
        System.out.println("Empty constructor called");
    }
    public BankAccount(String customerName, String customerEmail, long customerPhoneNumber) {
        this(999999,666666,customerName,customerEmail,customerPhoneNumber);

    }
    //
    public BankAccount(long accountNumber, long accountBalance, String customerName, String customerEmail,long customerPhoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }



    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositAmount){
        //System.out.println("Please confirm how much you want to deposit");
        //Scanner scannerUserDeposit = new Scanner(System.in);
        //long userDeposit = scannerUserDeposit.nextLong();
        //if (userDeposit > 0){
        //    setAccountBalance(this.accountBalance + userDeposit);
        //}
        //else{
        //    setAccountBalance(this.accountBalance);
        //}

        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made.");
        System.out.println("New Balance is " + this.accountBalance);
    }

    public  void withdrawFunds(double withdrawalAmount){
        //System.out.println("Please confirm how much you want to withdraw");
        //Scanner scannerUserWithdraw = new Scanner(System.in);
        //long userWithdraw = scannerUserWithdraw.nextLong();
        //if (userWithdraw > 0){
        //    setAccountBalance(this.accountBalance - userWithdraw);
        //}
        //else{
        //    setAccountBalance(this.accountBalance);
        //}

        if (this.accountBalance - withdrawalAmount < 0){
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed.");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.");
            System.out.println("Remaining balance = " + this.accountBalance);
        }

    }
}

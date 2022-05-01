package com.company;

public class Account {
    String owner;
    int balance;
    int accountNumber;
    public Account(String owner, int balance, int accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void transfer(int amount) throws NotEnoughMoneyException{
        if(balance >= amount){
            balance = balance - amount;
        }
        else{
            System.out.println("Not enough money");
        }
    }

    public static void main(int args[]) throws NotEnoughMoneyException {
        Account client = new Account("Jaloliddin Sultonov", 60000, 8333301){
            try{
                client.transfer(1000);
            }
            catch(NotEnoughMoneyException e){
                System.out.println(e);
                e.printStackTrace();
            }
            finally{
                System.out.println(client.getBalance());
            }
        }

    }
}

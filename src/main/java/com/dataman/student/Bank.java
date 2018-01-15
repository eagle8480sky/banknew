package com.dataman.student;

/**
 * @ClassName: Student
 * @Description: 实体
 * @date 2017/12/19
 * @Copyright © 2017北京数人科技有限公司
 */
public class Bank {

    private int income;

    private String oderTime;

    private int expenditure;

    private int balance;

    private int totalMoney;

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getOderTime() {
        return oderTime;
    }

    public void setOderTime(String oderTime) {
        this.oderTime = oderTime;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "income=" + income +
                ", oderTime='" + oderTime + '\'' +
                ", expenditure=" + expenditure +
                ", balance=" + balance +
                ", totalMoney=" + totalMoney +
                '}';
    }
}

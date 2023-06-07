package project1;

import java.util.Scanner;

public class Account {
	
	private int AccountNum;
	private int PinNum;
	private double CurrentBal=0;
	private double SavingsBal=0;
	
	Scanner h=new Scanner(System.in);
	
	public int getAccountNum() {
		return AccountNum;
	}
	public int setAccountNum(int AccountNum) {
		this.AccountNum = AccountNum;
		return AccountNum;
	}
	public int getPinNum() {
		return PinNum;
	}
	public int setPinNum(int PinNum) {
		this.PinNum = PinNum;
		return PinNum;
	}
	public double getCurrentBal() {
		return CurrentBal;
	}
	public double getSavingsBal() {
		return SavingsBal;
	}
	public double CalcCurrentWithdraw(double Amount) {
		CurrentBal=(CurrentBal-Amount);
		return CurrentBal;
	}
	public double CalcSavingsWithdraw(double Amount) {
		SavingsBal=(SavingsBal-Amount);
		return SavingsBal;
	}
	public double CalcCurrentDeposit(double Amount) {
		CurrentBal=(CurrentBal+Amount);
		return CurrentBal;
	}
	public double CalcSavingsDeposit(double Amount) {
		SavingsBal=(SavingsBal+Amount);
		return SavingsBal;
	}
	public void CurretWithdrawInput() {
		System.out.println("Enter the Amount You want to Withdraw : ");
		double Amount=h.nextDouble();
		if((CurrentBal-Amount)>=0) {
			CalcCurrentWithdraw(Amount);
			System.out.println("New Current Account Balance : Rs."+CurrentBal);
		}
		else {
			System.out.println("Please Enter Valid Amount");
		}
	}
	public void SavingsWithdrawInput() {
		System.out.println("Enter the Amount You want to Withdraw : ");
		double Amount=h.nextDouble();
		if((SavingsBal-Amount)>=0) {
			CalcSavingsWithdraw(Amount);
			System.out.println("New Savings Account Balance : Rs."+SavingsBal);
		}
		else {
			System.out.println("Please Enter Valid Amount");
		}
	}
	public void CurretDepositInput() {
		System.out.println("Enter the Amount You want to Deposit : ");
		double Amount=h.nextDouble();
		if((CurrentBal+Amount)>=0) {
			CalcCurrentDeposit(Amount);
			System.out.println("New Current Account Balance : Rs."+CurrentBal);
		}
		else {
			System.out.println("Please Enter Valid Amount");
		}
	}
	public void SavingsDepositInput() {
		System.out.println("Enter the Amount You want to Deposit : ");
		double Amount=h.nextDouble();
		if((SavingsBal+Amount)>=0) {
			CalcSavingsDeposit(Amount);
			System.out.println("New Savings Account Balance : Rs."+SavingsBal);
		}
		else {
			System.out.println("Please Enter Valid Amount");
		}
	}
}

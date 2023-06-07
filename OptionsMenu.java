package project1;

import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;

public class OptionsMenu extends Account{
	Scanner p=new Scanner(System.in);
	HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();
	
	public void getLogin()throws IOException{
		int x=1;
		do {
			try {
				data.put(852001, 8113);
				data.put(2152001, 1619);
				System.out.println("Welcome to the PH ATM");
				System.out.println("Please Enter Your Account Number:");
				setAccountNum(p.nextInt());
				System.out.println("Please Enter Your Pin Number:");
				setPinNum(p.nextInt());
			}
			catch(Exception e) {
				System.out.println("Please Enter Valid Characters.Only Numbers");
				x=2;
			}
			int cn=getAccountNum();
			int pn=getPinNum();
			if(data.containsKey(cn)&&data.get(cn)==pn) {
				getAccountType();
			}
			else {
				System.out.println("Incorrect Account Number or Pin Number.");
				System.out.println("Please Enter Valid Account Details");
			}
		}while(x==1);
	}
	public void getAccountType() {
		System.out.println("Select the Type of Account:");
		System.out.println("1.Current Account");
		System.out.println("2.Savings Account");
		System.out.println("3.Exit");
		int choice=p.nextInt();
		switch(choice) {
		case 1: getCurrentAccountType();
		        break;
		case 2: getSavingsAccountType();
		        break;
		case 3: System.out.println("Thank You For Using The PH ATM \n Please Visit Again");
		        break;
		default:System.out.println("Please Select The Valid Options");
		        getAccountType();
		        break;
		}
	}
	public void getCurrentAccountType() {
		System.out.println("Select The Options Which You Want to Perform");
		System.out.println("1.Check Balance");
		System.out.println("2.WithDraw Amount");
		System.out.println("3.Deposit Amount");
		System.out.println("4.Exit");
		int choice=p.nextInt();
		switch(choice) {
		case 1:System.out.println("Remaining Current Account Balance : "+getCurrentBal());
		       getAccountType();
		       break;
		case 2:System.out.println("Current Account Balance : "+getCurrentBal());
			   CurretWithdrawInput();
		       getAccountType();
		       break;
		case 3:System.out.println("Current Account Balance : "+getCurrentBal());
			   CurretDepositInput();
		       getAccountType();
		       break;
		case 4:System.out.println("Thank You For Using The PH ATM \n Please Visit Again");
               break;
        default:System.out.println("Please Select The Valid Options");
                getCurrentAccountType();
                break;
		}
	}
	public void getSavingsAccountType() {
		System.out.println("Select The Options Which You Want to Perform");
		System.out.println("1.Check Balance");
		System.out.println("2.WithDraw Amount");
		System.out.println("3.Deposit Amount");
		System.out.println("4.Exit");
		int choice=p.nextInt();
		switch(choice) {
		case 1:System.out.println("Remaining Savings Account Balance : "+getSavingsBal());
		       getAccountType();
		       break;
		case 2:System.out.println("Savings Account Balance : "+getSavingsBal());
			   SavingsWithdrawInput();
		       getAccountType();
		       break;
		case 3:System.out.println(" Savings Account Balance : "+getSavingsBal());
			   SavingsDepositInput();
		       getAccountType();
		       break;
		case 4:System.out.println("Thank You For Using The PH ATM \n Please Visit Again");
               break;
        default:System.out.println("Please Select The Valid Options");
                getSavingsAccountType();
                break;
		}
		
	}
}

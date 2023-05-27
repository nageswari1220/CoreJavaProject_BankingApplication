package com.domain.bankingapplication;

import java.util.Scanner;

public class BankAccount
{
	int accountBalance = 1000;
	String name;
	String accountNumber;
	
	BankAccount(String name,String accountNumber)
	{
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public void checkBalance()
	{
		System.out.println("Current Balance is : " + accountBalance);
	}
	public void depositAmount(int amount)
	{
		if(amount != 0)
		{
			accountBalance = accountBalance + amount;
		}
	}
	public void withdrawAmount(int amount)
	{
		if(accountBalance >= amount)
		{
			accountBalance = accountBalance - amount;
		}
		else 
		{
			System.out.println("Insufficent amount please deposit");
		}
	}
	public void display()
	{
		char ch;
		char con;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("------------------------------------------------");
			System.out.println("********** Welcome to ICICI bank of India **********");
			System.out.println("------------------------------------------------");
			System.out.println("Your Name is : " + name);
			System.out.println("Your Account Number is : " + accountNumber);
			System.out.println("------------------------------------------------");
			System.out.println("A.Deposit Amount");
			System.out.println("B.Withdraw Amount");
			System.out.println("C.Check Balance");
			System.out.println("D.Exit");
			System.out.println("------------------------------------------------");
			System.out.println("Enter the choice you want to perform : ");
			ch = sc.next().charAt(0);
			switch(ch)
			{
			case 'A':
				System.out.println("Enter the amount you want to deposit : ");
				int depositAmount =  sc.nextInt();
				depositAmount(depositAmount);
				System.out.println("your money has been successfully deposited");
				System.out.println("------------------------------------------------");
				break;
			case 'B':
				System.out.println("Enter the amount you want to withdraw : ");
				int withdrawAmount = sc.nextInt();
				withdrawAmount(withdrawAmount);
				System.out.println("------------------------------------------------");
				break;
			case 'C':
				checkBalance();
				System.out.println("------------------------------------------------");
				break;
			case 'D':
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Operation!!!!!!. Please enter valid operation");
				System.out.println();
				System.out.println("-------------- Thanks for using our banking services --------------");
				break;
			}
			System.out.println();
			System.out.println("Do you want to contine");
			con = sc.next().charAt(0);
			
		}while(con == 'y' || con == 'Y');
	}
}

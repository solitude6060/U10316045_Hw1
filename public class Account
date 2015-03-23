//U10316045
//2015/3/23

import java.util.Date;
public class Account {
	
	//private variable
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	//constructor with no - args
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//constructor
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	//setter of id
	public void setid(int id){
		this.id = id;
	}
	//getter of id
	public int getid(){
		return id;
	}
	//setter of balance
	public void setBalance(double balance ){
		this.balance = balance;
	}
	//getter of balance
	public double getBalance(){
		return balance;
	}
	//setter of rate
	public void setAnnualInterestRate(double annualInterestRate ){
		this.annualInterestRate = annualInterestRate;
	}
	//getter of rate
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	//getter of dateCreated to get the time now
	public Date getDateCreated(){
		return dateCreated;
	}
	//get monthly rate
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	//get monthly interest
	public double getMonthlyInterest(){
		return (balance*annualInterestRate/1200);
	}
	//method to withdraw money from account
	public void withdraw(double money){
		balance = balance - money;
	} 
	//method to deposit money into account		
	public void deposit(double money){
		balance =  balance + money;
	}
	//overide
	//tostring
	public String tostring(int id,double balance,double annualIntersetRate,Date dateCreated){
		int IdNumber = id;
		double newbalance = balance;
		double newRate = annualIntersetRate;
		Date newDate = dateCreated;
		
		return ( "The account id is "+IdNumber+ ".\nThe balance is "+newbalance+".\nThe annual interest rate is "+newRate+".\nThe date is "+newDate);
	}
	
	
	
	
	
}

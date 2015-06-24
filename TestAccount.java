
import java.util.Date;
import java.util.Scanner;
//main method
public class TestAccount {
	public static void main(String args[]){
	
	//four variable we need
	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;//get time
	double money;
	
	//scanner
	Scanner input = new Scanner(System.in);
	//new an object with Account
	Account acc = new Account();
	//new an object with SavingsAccount
	SavingsAccount save = new SavingsAccount();
	//new an object with CheckingAccount
	CheckingAccount check = new CheckingAccount();
	
	
	System.out.print("Please enter Account id : ");//asking
	id = input.nextInt();//input the id
	System.out.print("Please enter Account balance : ");//asking
	balance = input.nextDouble();//input the balance
	System.out.print("Please enter Account annualInterestRate : ");//asking
	annualInterestRate = input.nextDouble();//input the rate
	
	dateCreated = acc.getDateCreated();//get the current time
	acc.setid(id);//set id
	acc.setBalance(balance);//set balance
	acc.setAnnualInterestRate(annualInterestRate);//set rate
	
	System.out.println(acc.tostring(acc.getid(),acc.getBalance(),acc.getannualInterestRate(),acc.getDateCreated()));//tostring in Account
	System.out.println();//space line
	System.out.println(check.tostring(acc.getid(),acc.getBalance(),acc.getannualInterestRate(),acc.getDateCreated()));//tostring in SavingsAccount
	System.out.println();//space line		
	System.out.println(check.tostring(acc.getid(),acc.getBalance(),acc.getannualInterestRate(),acc.getDateCreated()));//tostring in CheckingAccount
		
	
	}
}

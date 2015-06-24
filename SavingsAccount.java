import java.util.Date;

//a class extends Account
public class SavingsAccount extends Account {
	
	//method to withdraw money
	public void withdraw(double money){
		if(money <= super.getBalance()){
			super.withdraw(money);
		}
		else{
			System.out.println("There is no money in your saving account !");
		}
	}		
	
	//overide
	//tostring
	public String tostring(int id,double balance,double annualIntersetRate,Date dateCreated){
	
		int IdNumber = id;
		double newbalance = balance;
		double newRate = annualIntersetRate;
		Date newDate = dateCreated;
		
		return ("This is the saving account.\n"+super.tostring(IdNumber,newbalance,newRate,newDate));
	
	}
	

}

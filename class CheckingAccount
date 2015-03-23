mport java.util.Date;

//CheckingAccount extends Account
public class CheckingAccount extends Account {

	private double over = 5000;//overdrift limit
	
	
	public void withdraw(double money){
		if(money <= (super.getBalance() + this.over)){
		//limit
			super.withdraw(money);
		}
		else{
		//more than the limit 
			System.out.println("You have got to the limit !");
		}
	}
	

	//overide
	//toString
	public String tostring(int id,double balance,double annualIntersetRate,Date dateCreated){
		int IdNumber = id;
		double newbalance = balance;
		double newRate = annualIntersetRate;
		Date newDate = dateCreated;
		return ("This is the checking account.\n"+super.tostring(IdNumber,newbalance,newRate,newDate));
	}
		
		
	
}

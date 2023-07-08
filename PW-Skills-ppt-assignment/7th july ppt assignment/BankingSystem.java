class BankAccount{
    String accountHolderName;
    int balance;
    BankAccount (String accountHolderName, int balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void deposite(int amount){
        balance+=amount;
        System.out.println("deposite of amount "+amount+" is Succesfull. "+"new balance is:"+balance);
    }
    public void withdraw(int amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("withdrawl of amount "+amount+" succesfull."+"new balane is:"+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getBalance(){
        return balance;
    }
    
}
public class BankingSystem
{
	public static void main(String[] args) {
		BankAccount customer1= new BankAccount("Kiran",500000);
		customer1.deposite(2000);
		customer1.withdraw(5000);
		String name=customer1.getAccountHolderName();
		int balance=customer1.getBalance();
		System.out.println("AccountHolder Name : "+name);
		System.out.println("Balance is : "+balance);
	}
}

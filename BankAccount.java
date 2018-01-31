public class BankAccount{
	private String name;
	private double amount;

	public BankAccount(String name, double amount){
		this.name = name;
		this.amount = amount;
	}
  public BankAccount(String name){
    this(name,0);
  }
  public BankAccount(){
    this("anonymous",0);
  }
  public String getName(String name){
		return this.name;
	}
  public double getAmount(double amount){
		return this.amount;
	}
  public void setName(String name){
		this.name = name;
	}
  public void setAmount(double amount){
		this.amount = amount;
	}
  public String toString(){
    return "("+this.name+", "+this.amount+")";
  }
  public boolean equals(BankAccount x){
		return this.name.equals(x.name) && this.amount == x.amount;
	}
}

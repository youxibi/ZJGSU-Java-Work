package work4;

public class Accont {
	protected String number;
	protected int balance;
	protected float rate;
	protected String date;
	
	public Accont() {
		
	}
	public Accont(String number,int balance,float rate,String date) {
		this.number=number;
		this.balance=balance;
		this.rate=rate;
		this.date=date;
	}
	
	public void putMoney(){
		System.out.println("Put Money.");
	}
	
	public void takeMoney(){
		System.out.println("Take Money;");
	}

	
	public String toString() {
		return "类别:账户  账号:"+number+"  余额:"+balance+"  年利率:"+rate+"  开户日期:"+date;
	}
}

package work4;

public class CheckingAccount extends Accont{
	private boolean isOverdraw=true;
	private float overdrawLimit;
	
	public CheckingAccount() {
		
	}
	public CheckingAccount(String number,int balance,float rate,String date,float overdrawLimit) {
		super(number, balance, rate, date);
		this.overdrawLimit=overdrawLimit;
	}
	public String toString() {
		return "类别:检测支票账户  账号:"+number+"  余额:"+balance+"  年利率:"+rate+"  开户日期:"+date+"  透支限定额:"+overdrawLimit;
	}
}

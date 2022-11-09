package work4;

public class SavingAccount extends Accont{
	private boolean isOverdraw=false;
	
	public SavingAccount() {
		
	}
	public SavingAccount(String number,int balance,float rate,String date) {
		super(number, balance, rate, date);
	}
	
	public String toString() {
		return "类别:储蓄账户  账号:"+number+"  余额:"+balance+"  年利率:"+rate+"  开户日期:"+date+"  是否可透支:"+isOverdraw;
	}
}

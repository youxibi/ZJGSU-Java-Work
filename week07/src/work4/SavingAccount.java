package work4;

public class SavingAccount extends Accont{
	private boolean isOverdraw=false;
	
	public SavingAccount() {
		
	}
	public SavingAccount(String number,int balance,float rate,String date) {
		super(number, balance, rate, date);
	}
	
	public String toString() {
		return "���:�����˻�  �˺�:"+number+"  ���:"+balance+"  ������:"+rate+"  ��������:"+date+"  �Ƿ��͸֧:"+isOverdraw;
	}
}

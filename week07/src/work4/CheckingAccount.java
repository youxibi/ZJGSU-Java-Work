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
		return "���:���֧Ʊ�˻�  �˺�:"+number+"  ���:"+balance+"  ������:"+rate+"  ��������:"+date+"  ͸֧�޶���:"+overdrawLimit;
	}
}

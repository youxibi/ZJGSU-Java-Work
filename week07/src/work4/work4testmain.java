package work4;

public class work4testmain {
	
	public static void main(String[] args) {
		Accont accont=new Accont("0001",100,5,"2022.10.18");
		CheckingAccount checkingAccount=new CheckingAccount("0002",200,5,"2022.10.18",200);
		SavingAccount savingAccount=new SavingAccount("0003",300,6,"2022.10.18");
		System.out.println(accont.toString());
		System.out.println(checkingAccount.toString());
		System.out.println(savingAccount.toString());
		
	}
}
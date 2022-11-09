package work3;

public class Work3TestMain {
	public static void main(String[] args) {
		char[] chr= new char[4];
		hw(chr,0,'a');
		hw(chr,0,'b');
		hw(chr,0,'c');
		hw(chr,0,'d');
	}
	
	public static void hw(char[] chr,int n,char chr2) {
		chr[n]=chr2;
		if(n==3&&chr[0]==chr[3]&&chr[1]==chr[2]) {
			System.out.println(chr);
		}
		else if(n==3) {
			return;
		}
		else {
			hw(chr,n+1,'a');
			hw(chr,n+1,'b');
			hw(chr,n+1,'c');
			hw(chr,n+1,'d');
		}
	}
}

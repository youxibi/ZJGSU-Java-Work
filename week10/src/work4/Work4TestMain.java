package work4;

public class Work4TestMain {
	public static void main(String[] args) {
		BanJi banJi=new BanJi("Èí¼þ2101");
		
		banJi.register("aaa", 20, "m", 57, 88, 90);
		banJi.register("bbb", 20, "f", 34, 58, 89);
		banJi.register("ccc", 20, "m", 85, 97, 74);
		banJi.register("ddd", 20, "f", 26, 86, 64);
		banJi.register("eee", 20, "m", 76, 47, 47);
		
		banJi.sort();
		banJi.print();
	}
}

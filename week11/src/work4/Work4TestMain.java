package work4;

public class Work4TestMain {
	public static void main(String[] args) {
		BanJi banJi=new BanJi("Èí¼ş2101");
		
		Student student=null;
		student=new Student("aaa", 20, "m", 57, 88, 90);
		banJi.append(student);
		student=new Student("bbb", 20, "f", 34, 58, 89);
		banJi.append(student);
		student=new Student("ccc", 20, "m", 85, 97, 74);
		banJi.append(student);
		student=new Student("ddd", 20, "f", 26, 86, 64);
		banJi.append(student);
		student=new Student("eee", 20, "m", 76, 47, 47);
		banJi.append(student);
		
		banJi.sort();
		banJi.print();
	}
}

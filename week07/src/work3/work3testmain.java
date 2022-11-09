package work3;

public class work3testmain {
	public static void main(String[] args) {
		Person person=new Person("people1","钱江湾1幢","15645489851","0001@qq.com");
		Student student=new Student("people2","钱江湾2幢","15645489852","0002@qq.com", "大二");
		Employee employee=new Employee("people3","钱江湾3幢","15645489853","0003@qq.com", "信息楼", 20000, "2022.10.18");
		Faculty faculty=new Faculty("people4","钱江湾4幢","15645489854","0004@qq.com", "信息楼", 10000, "2020.10.17", "2 years","讲师");
		Staff staff=new Staff("people5","钱江湾5幢","15645489855","0005@qq.com", "信息楼", 10000, "2022.10.18", "修理工");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
	
	
	
}

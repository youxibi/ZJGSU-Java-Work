package work3;

public class work3testmain {
	public static void main(String[] args) {
		Person person=new Person("people1","Ǯ����1��","15645489851","0001@qq.com");
		Student student=new Student("people2","Ǯ����2��","15645489852","0002@qq.com", "���");
		Employee employee=new Employee("people3","Ǯ����3��","15645489853","0003@qq.com", "��Ϣ¥", 20000, "2022.10.18");
		Faculty faculty=new Faculty("people4","Ǯ����4��","15645489854","0004@qq.com", "��Ϣ¥", 10000, "2020.10.17", "2 years","��ʦ");
		Staff staff=new Staff("people5","Ǯ����5��","15645489855","0005@qq.com", "��Ϣ¥", 10000, "2022.10.18", "����");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
	
	
	
}

package week06;

public class banji {
	String classname;
	static student[] students=new student[5];
	
	public static void main(String[] args) {
		students[0]=new student("student1",20,"male",86f,95f,68f,55f,67f,82f);
		students[1]=new student("student2",21,"female",91f,66f,98f,68f,57f,77f);
		students[2]=new student("student3",22,"male",51f,59f,68f,86f,78f,79f);
		students[3]=new student("student4",21,"female",31f,75f,68f,65f,86f,45f);
		students[4]=new student("student5",20,"male",58f,53f,75f,63f,97f,87f);
		for(int i=0;i<6;i++) {
			int hao=0,cha=0;
			Float ave=0f;
			for(int j=0;j<5;j++) {
				if(students[hao].scores[i]<students[j].scores[i]) {
					hao=j;
				}
				if(students[cha].scores[i]>students[j].scores[i]) {
					cha=j;
				}
				ave+=students[j].scores[i];
			}
			ave/=5;
			System.out.println("Lesson"+(i+1)+"    平均成绩:"+ave+"    最好学生:"+students[hao].name+"   最差学生:"+students[cha].name);
		}
		System.out.println("降序排列:");
		for(int i=0;i<4;i++) {
			for(int j=4;j>i;j--) {
				if(students[j].sumscore()>students[i].sumscore()) {
					student temp=new student(null, j, null, null, null, null, null, null, null);
					temp=students[j];
					students[j]=students[i];
					students[i]=temp;
				}
			}
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(students[i].name+"  "+students[i].age+"  "+students[i].sex+"  "+students[i].scores[0]+"  "+students[i].scores[1]+"  "+students[i].scores[2]+"  "+students[i].scores[3]+"  "+students[i].scores[4]+"  "+students[i].scores[5]);
		}
	}
}
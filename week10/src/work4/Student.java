package work4;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String sex;
	private int chineseScore;
	private int mathScore;
	private int englishScore;
	public Student(String name, int age, String sex, int chineseScore, int mathScore, int englishScore) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.chineseScore = chineseScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(int chineseScore) {
		this.chineseScore = chineseScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getSumScore() {
		return this.chineseScore+this.mathScore+this.englishScore;
	}
	@Override
	public int compareTo(Student o) {
		if(o.getSumScore()-this.getSumScore()>0) {
			return 1;
		}else if(o.getSumScore()-this.getSumScore()==0) {
			if(o.getChineseScore()>this.getChineseScore()) {
				return 1;
			}else if(o.getChineseScore()==this.getChineseScore()) {
				if(o.getMathScore()>this.getMathScore()) {
					return 1;
				}else if(o.getMathScore()==this.getMathScore()) {
					if(o.getEnglishScore()>this.getEnglishScore()) {
						return 1;
					}else if(o.getEnglishScore()==this.getEnglishScore()) {
						if(o.getName().compareTo(this.getName())>0) {
							return 1;
						}else if(o.getName().compareTo(this.getName())==0) {
							return 0;
						}else {
							return -1;
						}
					}else {
						return -1;
					}
				}else {
					return -1;
				}
			}else {
				return -1;
			}
		}else {
			return -1;
		}
		
	}
	
	@Override
	public String toString() {
		return "姓名:"+this.name+"  年龄:"+this.age+"  性别:"+this.sex+"  语文成绩:"+this.chineseScore+"  数学成绩:"+this.mathScore+"  外语成绩:"+this.englishScore+"  总成绩:"+this.getSumScore();
	}
}

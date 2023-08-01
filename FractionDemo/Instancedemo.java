package FractionDemo;

class Subject
{
	int science;
	int math;
	int gk;
}

public class Instancedemo {
	
	public static void main(String[] args) {
		
		Subject s1 = new Subject();
		s1.science = 88; s1.math = 78; s1.gk = 90;
		
		Subject s2 = new Subject();
		s1.science = 55; s2.math = 87; s2.gk = 40;
		
		System.out.println("Student1 Marks:");
		System.out.println("Science:"+s1.science);
		System.out.println("Math:"+s1.math);
		System.out.println("GK:"+s1.gk);
		
		System.out.println("Student2 Marks:");
		System.out.println("Science:"+s2.science);
		System.out.println("Math:"+s2.math);
		System.out.println("GK:"+s2.gk);

	}

}

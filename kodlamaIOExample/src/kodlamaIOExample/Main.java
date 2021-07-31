package kodlamaIOExample;

public class Main {

	public static void main(String[] args) {
	
		Base base=new Base(1,"Raph","Kose","raph@hotmail.com");
	
		
		Student student=new Student();
		student.course="Java & React";
		


		StudentManager studentManager=new StudentManager();
		studentManager.addTheCourse(student.course);
		System.out.println(student.course);

	}

}

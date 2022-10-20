package kodlamaio;

public class Main {
	
	public static void main(String[] args) {
		
	CourseManager courseManager= new CourseManager();
	StudentManager studentManager=new StudentManager();
	
	Course course1 = new Course(1,"Java-React","Engin Demiroğ","12-12-2020");
	
	Course course2 = new Course(2,"C#","Engin Demiroğ","12-12-2021");
	
	Course course3 = new Course(3,"Python","Engin Demiroğ","12-1-2020");
	
	Course[] course = {course1,course2,course3};
	
	Student student1 = new Student(1,"Ezgi","Dolma","ezgidolma23@mail.com");
	Student student2 = new Student(2,"Kübra","Dolma","kkübradolma23@mail.com");
	
	Student[] student= {student1,student2};
	
	courseManager.addCourse(course1);
	studentManager.showDetails(student1,course2);
	studentManager.showDetails(student2,course2);
	
	
}
}

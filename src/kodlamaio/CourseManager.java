package kodlamaio;

public class CourseManager {
	public void addCourse(Course course){
		System.out.println(course.name+"kursu eklendi.");
	}
	
	public void removeCourse(Course course){
		System.out.println(course.name+"kursu çıkarıldı.");
	}
}

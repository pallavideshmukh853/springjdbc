package springjdbc.dao;

import java.util.List;

import springjdbc.entites.Student;



public interface StudentDao {
	
	public int insert(Student stu);
	public int updatedetails(Student stu);
	public int deletedetails(int stuid);
	public Student selectDetails(int stuid);
	public List<Student> getAllDetails();
	

}

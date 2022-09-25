package springjdbcc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springjdbc.dao.StudentDao;
import springjdbc.entites.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbcc/main/applicationcontext.xml");
        		StudentDao stdao=context.getBean("StudentDao",StudentDao.class);
        	
        		Student s=new Student(); 
				
				/* s.setId(105);s.setName("sangram patil "); */
				 
        		s.setId(110);
        		s.setName("core java");
        		
        		
        		
        	//	int r=stdao.insert(s);//insert the details
        	//	int r1=stdao.updatedetails(s);//update the details 
        	//	System.out.println(r + "Student added Successfully ");
        		//System.out.println(r1 + "Student details updated ");
        		//int r=stdao.deletedetails(110);//delete the details
        		Student s1=stdao.selectDetails(110);
        		System.out.println(s);
        		List<Student> stu=stdao.getAllDetails();
        		for(Student S:stu)
        		{
        			System.out.println(S);
        		}
    }
}

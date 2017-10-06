package com.platzi.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.dao.TeacherDaoimpl;
import com.platzi.hibernate.model.Course;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Teacher teacher = new Teacher("José", "imagen");
        Course course = new Course("JAVA EE", "Tema 1", "REST API");
        session.beginTransaction();
        session.save(course);
        session.save(teacher);
        session.getTransaction().commit();
        */
        Teacher teacher = new Teacher("Joseph", "Avatar2");
        TeacherDaoimpl teacherDaoimpl = new TeacherDaoimpl();
        teacherDaoimpl.saveTeacher(teacher);
        
        List<Teacher> teachers = teacherDaoimpl.findAllTeachers();
        
        for (Teacher t : teachers) {
			System.out.println("Profesor name: " + t.getName());
		}
    }
}

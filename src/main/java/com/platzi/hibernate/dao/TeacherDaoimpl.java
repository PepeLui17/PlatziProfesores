package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoimpl  implements TeacherDao {
	private PlatziSession platziSession;
	
	

	public TeacherDaoimpl() {
		platziSession = new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		platziSession.getSession().save(teacher);
		platziSession.getSession().getTransaction().commit();
	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		//return platziSession.getSession().createQuery("from Teacher").list();
		return platziSession.getSession().createQuery("from Teacher").getResultList();
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

}

package fi.demo.softala.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fi.demo.softala.model.Student;
import fi.demo.softala.rowmapper.StudentRowMapper;

@Repository
public class Dao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> findAllStudent(){
		String sql = "SELECT * FROM Student";
		RowMapper<Student> rm = new StudentRowMapper();
		List<Student> students;
		try {
			students = jdbcTemplate.query(sql, rm);
			return students;
		} catch (DataAccessException e) {
			return null;
		}
		
	}
	
	public Student findStudentByNumber(String number){
		String sql = "SELECT * FROM Student WHERE StudentNumber ="+number;
		RowMapper<Student> rm = new StudentRowMapper();
		Student student = jdbcTemplate.queryForObject(sql, rm);
		try {
			return student;
		} catch (Exception e) {
			return null;
		}
	}

}

package fi.demo.softala.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.demo.softala.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int row) throws SQLException {
		Student student = new Student();
		student.setAddress(rs.getString("StudentAddress"));
		student.setEmail(rs.getString("StudentEmail"));
		student.setName(rs.getString("StudentName"));
		student.setNumber(rs.getString("StudentNumber"));
		student.setYear(rs.getString("StudentYear"));
		return student;
	}

}

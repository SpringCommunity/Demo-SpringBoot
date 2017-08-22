package fi.demo.softala.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.demo.softala.dao.Dao;
import fi.demo.softala.model.Student;

@RestController
@RequestMapping("/rest/")
public class RestAPIController {
	@Autowired
	private Dao dao;
	
	@RequestMapping(value="students", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> jsonListStudent(){
		List<Student> students = dao.findAllStudent();
		if(students.isEmpty())
			return new ResponseEntity<List<Student>>(new ArrayList<Student>(),HttpStatus.NO_CONTENT);
		    return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}
	
	@RequestMapping(value="student/{number}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> jsonStudent(@PathVariable("number") String number){
		Student student = dao.findStudentByNumber(number);
		if(student == null)
			return new ResponseEntity<Student>(new Student(),HttpStatus.NO_CONTENT);
		    return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

}

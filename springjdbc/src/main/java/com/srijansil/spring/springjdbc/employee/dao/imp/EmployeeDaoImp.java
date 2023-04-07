package com.srijansil.spring.springjdbc.employee.dao.imp;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.srijansil.spring.springjdbc.employee.dao.EmployeeDao;
import com.srijansil.spring.springjdbc.employee.dao.imp.rowmapper.EmployeRowMapper;
import com.srijansil.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImp implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values(?,?,?) ";
		int results = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
		return results;
	}

	@Override
	public int update(Employee emp) {

		String sql = "update employee set firstname= ? ,lastname=? where id=?";
		int results = jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
		return results;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int results = jdbcTemplate.update(sql, id);
		return results;
	}
	
	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id = ?";
		EmployeRowMapper rowmapper = new EmployeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);

		return employee;
	}
	
	@Override
	public List<Employee> findAllRecords() {
		String sql = "select * from employee ";
		EmployeRowMapper rowmapper = new EmployeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowmapper);

		
		return result;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}





}

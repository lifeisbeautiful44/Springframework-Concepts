package com.srijansil.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PassengerDaoImpl implements PassengerDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Passenger p) {
		
		String sql = "insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(sql, p.getId(),p.getFirstName(),p.getLastName());
	
		return result;
		
	}

	@Override
	public int update(Passenger p) {
		String sql = "update passenger set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, p.getFirstName(),p.getLastName(),p.getId());
	
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passenger where id = ?";
		int result = jdbcTemplate.update(sql,id);
	
		return result;
	}

	@Override
	public Passenger read(int id) {
		String sql = "select * from passenger where id = ?";
		
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		Passenger passenegr = jdbcTemplate.queryForObject(sql,rowmapper,id);
		
	
		return passenegr;
	}

	@Override
	public List<Passenger> findAllPassenger() {
	String sql = "select * from passenger ";
		
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		List<Passenger> passenger = jdbcTemplate.query(sql,rowmapper);
		
		return passenger;

		
		
	}

}

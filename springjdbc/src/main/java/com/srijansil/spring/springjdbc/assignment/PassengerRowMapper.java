package com.srijansil.spring.springjdbc.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {

		Passenger p = new Passenger();
		p.setId(rs.getInt(1));
		p.setFirstName(rs.getString(2));
		p.setLastName(rs.getString(3));

		return p;

	}

}

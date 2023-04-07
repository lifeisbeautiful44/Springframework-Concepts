package com.srijansil.spring.springorm.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("passengerDaoImpl")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Passenger passenger) {

		Integer result = (Integer) hibernateTemplate.save(passenger);
		return result;
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {

		hibernateTemplate.update(passenger);
	}

	@Override	@Transactional
	public void delete(Passenger passenger) {
		// TODO Auto-generated method stub

		hibernateTemplate.delete(passenger);

	}

	@Override
	@Transactional
	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	@Transactional

	public List<Passenger> findAll() {

		List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;

	}

}

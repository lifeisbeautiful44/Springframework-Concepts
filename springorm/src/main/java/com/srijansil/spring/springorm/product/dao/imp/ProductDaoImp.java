package com.srijansil.spring.springorm.product.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.srijansil.spring.springorm.product.dao.ProductDao;
import com.srijansil.spring.springorm.product.entity.Product;

@Component("productDaoImpl")
public class ProductDaoImp implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {

		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		Product product = hibernateTemplate.get(Product.class, id);
		return product;

	}

	@Override
	@Transactional
	public List<Product> findAll() {
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
	}

}

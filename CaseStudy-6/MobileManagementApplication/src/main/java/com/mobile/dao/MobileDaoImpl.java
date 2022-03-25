package com.mobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;

@Repository
public class MobileDaoImpl implements MobileDao{
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public Mobile addMobile(Mobile m) {
		entity.persist(m);
		return entity.find(Mobile.class, m.getMid());
	}

	@Override
	public Mobile updateMobile(Mobile m) {
		return entity.merge(m);
		 
	}

	@Override
	public String deleteMobile(int mid) {
		Mobile mo = entity.find(Mobile.class,mid);
		if(mo!=null) {
			entity.remove(mo);
			return "mobile deleted";
		}
		else {
			return "mobile not found";
		}
		
	}

	@Override
	public Mobile getMobile(int mid) {
		return entity.find(Mobile.class, mid);
	}

	@Override
	public List<Mobile> getAllMobile() {
		TypedQuery<Mobile> result = entity.createQuery("Select m from Mobile m",Mobile.class);  //this query will get all the mobiles
		return result.getResultList();
	}

}

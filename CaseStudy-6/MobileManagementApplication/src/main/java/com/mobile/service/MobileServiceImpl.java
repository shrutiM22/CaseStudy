package com.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileDao dao;

	@Override
	public Mobile addMobile(Mobile m) {
		return dao.addMobile(m);
	}

	@Override
	public Mobile updateMobile(Mobile e) {
		return dao.updateMobile(e);
	}

	@Override
	public String deleteMobile(int mid) {
		return dao.deleteMobile(mid);
	}

	@Override
	public Mobile getMobile(int mid) {
		return dao.getMobile(mid);
	}

	@Override
	public List<Mobile> getAllMobile() {
		return dao.getAllMobile();
	}
	
	

}

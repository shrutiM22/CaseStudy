package com.mobile.service;

import java.util.List;

import com.mobile.entity.Mobile;

public interface MobileService {
	
	Mobile addMobile(Mobile m);
	
	Mobile updateMobile(Mobile e);
	
	String deleteMobile(int mid);
	
	Mobile getMobile(int mid);
	
	List<Mobile> getAllMobile();

}

package org.bianqi.sm.service;

import java.util.List;

import org.bianqi.sm.dao.DemoMappper;
import org.bianqi.sm.pojo.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {

	@Autowired
	public DemoMappper demoMappper;
	
	public List<Demo> likeName(String name){
		return demoMappper.likeName(name);
	}
	
	@Transactional
	public void save(Demo demo){
		demoMappper.save(demo);
	}
	
}

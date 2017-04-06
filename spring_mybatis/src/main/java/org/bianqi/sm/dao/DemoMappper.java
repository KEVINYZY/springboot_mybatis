package org.bianqi.sm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.bianqi.sm.pojo.Demo;

public interface DemoMappper {

	@Select("SELECT * FROM Demo where name=#{name}")
	public List<Demo> likeName(String name);
	
	@Select("SELECT * FROM Demo WHERE id =#{id}")
	public Demo getById(long id);
	
	@Select("SELECT name FROM Demo WHERE id=#{id}")
	public String getNameById(long id);
	
	@Insert("INSERT INTO Demo(name) VALUES(#{name})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public void save(Demo demo);
	
}

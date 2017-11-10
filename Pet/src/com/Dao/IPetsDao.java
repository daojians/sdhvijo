package com.Dao;

import java.util.List;

import com.entity.pets;

public interface IPetsDao {
	public List<pets> selectall();
	
	public int addpets(pets pt);
	
	public int updatepets(pets pt,int id);
	
	public int delete(int id);
	
}

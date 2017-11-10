package com.text;

import java.util.List;

import com.Dao.IPetsDao;
import com.Dao.Impl.PetsDao;
import com.entity.pets;

public class text {

	public static void main(String[] args) {
		IPetsDao dao = new PetsDao();
		pets pt = new pets(5,"大米", 1,1,"50");
		int count = dao.addpets(pt);
		if(count>0){
			System.out.println("成功");
		}
	}

}

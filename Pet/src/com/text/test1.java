package com.text;

import java.util.List;
import java.util.Scanner;

import com.Dao.IMasterDao;
import com.Dao.Impl.MasterDao;
import com.entity.master;

public class test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----------------»¶Ó­¹âÁÙ³èÎïÀÖÔ°-------------------------");
		
		System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
		String name = input.next();
		System.out.println("ÇëÊäÈëÃÜÂë£º");
		String pwd = input.next();
		
		master mt = new master(name, pwd);
		
		IMasterDao dao = new MasterDao();
		List<master> list = dao.select(mt);
		
			if(list.isEmpty()){
				System.out.println("µÇÂ¼Ê§°Ü£¬Çë¼ì²éÕËºÅÃÜÂëÊÇ·ñÕıÈ·");
			}else{
				System.out.println("µÇÂ¼³É¹¦");
				for(master item:list){
					System.out.println("»¶Ó­Äú£º"+item.getName()+" Master");
				}
			}
	}

}

package com.text;

import java.util.List;
import java.util.Scanner;

import com.Dao.IMasterDao;
import com.Dao.Impl.MasterDao;
import com.entity.master;

public class test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("----------------��ӭ���ٳ�����԰-------------------------");
		
		System.out.println("�������¼����");
		String name = input.next();
		System.out.println("���������룺");
		String pwd = input.next();
		
		master mt = new master(name, pwd);
		
		IMasterDao dao = new MasterDao();
		List<master> list = dao.select(mt);
		
			if(list.isEmpty()){
				System.out.println("��¼ʧ�ܣ������˺������Ƿ���ȷ");
			}else{
				System.out.println("��¼�ɹ�");
				for(master item:list){
					System.out.println("��ӭ����"+item.getName()+" Master");
				}
			}
	}

}

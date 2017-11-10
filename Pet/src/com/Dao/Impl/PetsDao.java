package com.Dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Dao.BaseDao;
import com.Dao.IPetsDao;
import com.entity.pets;

public class PetsDao extends BaseDao implements IPetsDao {

	//ÐÞ¸Ä
	@Override
	public List<pets> selectall() {
		List<pets> list = new ArrayList<>();
		
		try {
			String sql = "select * from pets";
			
			getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int tid = rs.getInt("tid");
				int mid = rs.getInt("mid");
				String love = rs.getString("love");
				
				pets pt = new pets(id, name, tid, mid, love);
				list.add(pt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return list;
	}

	//²åÈë
	@Override
	public int addpets(pets pt) {
		int count = 0;
		
		String sql = "insert into pets(id,name,tid,mid,love) value(?,?,?,?,?)";
		
		Object[] param={pt.getId(),pt.getName(),pt.getTid(),pt.getMid(),pt.getLove()};
		count = this.exceuteUpdate(sql, param);		
		return count;
	}

	//ÐÞ¸Ä
	@Override
	public int updatepets(pets pt,int id) {
		int count = 0;
		
		String sql = "update pets set id=?,name=?,tid=?,mid=?,love=? where id=?";
		
		Object[] param={pt.getId(),pt.getName(),pt.getTid(),pt.getMid(),pt.getLove(),id};
		
		count = this.exceuteUpdate(sql, param);
		
		return count;
	}

	//É¾³ý
	@Override
	public int delete(int id) {
		int count = 0;
		
		String sql = "delete from pets where id=?";
		Object[] param={id};
		count = this.exceuteUpdate(sql, param);
		
		return count;
	}

}

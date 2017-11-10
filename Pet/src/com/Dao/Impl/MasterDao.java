package com.Dao.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Dao.BaseDao;
import com.Dao.IMasterDao;
import com.entity.master;

public class MasterDao extends BaseDao implements IMasterDao {

	@Override
	public List<master> select(master mt) {
		List<master> list = new ArrayList<>();
		try {
			String sql = "select * from master where name=? and pwd=?";
			
			getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,mt.getName());
			pstmt.setString(2, mt.getPwd());
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("pwd");
				
				master mts = new master(id, name, pwd);
				list.add(mts);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}

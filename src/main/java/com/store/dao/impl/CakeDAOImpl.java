package com.store.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.store.dao.CakeDAO;
import com.store.dto.CakeDto;


public class CakeDAOImpl implements CakeDAO{

	@Override
	public List<CakeDto> listCake(int userid) {
		List<CakeDto> lstCake = new ArrayList<CakeDto>();
		try {

			String query = "select * from cake where userid=" + userid;
			Statement stmt = DatabaseConfig.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				CakeDto dto = new CakeDto();
		       dto.setCakeId(rs.getInt("cakeid"));
		       dto.setCakeName(rs.getString("cakename"));
		       dto.setPrice(rs.getInt("price"));
		       dto.setHsd(rs.getString("hsd"));
		       dto.setCakeImage(rs.getString("cakeimage"));
		       lstCake.add(dto);
		      }
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lstCake;
	}

	public void updateCake(CakeDto cake) {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

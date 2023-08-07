package com.store.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.store.dao.UserDAO;
import com.store.dto.UserDto;


public class UserDAOImpl implements UserDAO{

	@Override
	public UserDto listCake(int userid) {
		UserDto lstCake = new UserDto();
		try {

			String query = "select * from user_info where userid=" + userid;
			Statement stmt = DatabaseConfig.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				UserDto dto = new UserDto();
		       dto.setUsername(rs.getString("username"));
		       return dto;
		      }
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lstCake;
	}


}

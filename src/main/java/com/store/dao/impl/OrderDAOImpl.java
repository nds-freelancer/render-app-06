package com.store.dao.impl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.store.dto.CakeDto;
import com.store.dto.OrderDto;

public class OrderDAOImpl {
	public void updateOrder(OrderDto order) {
		// TODO Auto-generated method stub
		try {
			
			Statement stmt = DatabaseConfig.getConnection().createStatement();

			String query = "insert orderCake(cakeId, number, customer, phone, address, dateShip, dateOrder, status)"
					+ "values('"+order.getCakeId()+"',"
							+ "'"+order.getNumber()+"',"
							+ "'"+order.getCustomer()+"',"
							+ "'"+order.getPhone()+"',"
							+ "'"+order.getAddress()+"',"
							+ "'"+order.getDateShip()+"',"
							+ "'"+order.getDateOrder()+"',"
							+ "'"+order.getStatus()+"')";
			
			boolean rs = stmt.execute(query);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<OrderDto> listOrder(String phone) {
		List<OrderDto> lstOrder = new ArrayList<OrderDto>();
		try {

			String query = "SELECT c.cakename,o.* FROM orderCake o left join cake c on o.cakeid = c.cakeid where phone ='" + phone+"'";
			Statement stmt = DatabaseConfig.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				OrderDto dto = new OrderDto();
				dto.setCakeName(rs.getString("cakeName"));
				dto.setCustomer(rs.getString("customer"));
				dto.setNumber(rs.getInt("number"));
				dto.setDateShip(rs.getString("dateShip"));
				dto.setAddress(rs.getString("address"));
				dto.setStatus(rs.getString("status"));
				lstOrder.add(dto);
		      }
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lstOrder;
	}
	
	
}

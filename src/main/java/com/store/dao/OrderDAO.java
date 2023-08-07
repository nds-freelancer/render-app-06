package com.store.dao;

import com.store.dto.OrderDto;

public interface OrderDAO {

	void updateOrder(OrderDto order);

	void listOrder(OrderDto order);
	
}

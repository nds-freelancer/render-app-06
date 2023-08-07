package com.store.dao;

import java.util.List;
import com.store.dto.CakeDto;

public interface CakeDAO {

	List<CakeDto> listCake (int userid);

	void updateCake(CakeDto cake);

	
}

package com.hotel.domain;

import lombok.Data;

@Data
public class SubCategory {
	private int subcategory_id;
	private TopCategory topCategory;
	private Room room;
		
}

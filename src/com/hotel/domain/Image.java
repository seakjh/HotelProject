package com.hotel.domain;
import lombok.Data;

@Data
public class Image {
	private int image_id;
	private Room room;
	private String filename;
	
}

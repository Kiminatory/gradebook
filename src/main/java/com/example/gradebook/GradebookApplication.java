package com.example.gradebook;

import model.Item;
import model.Rating;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradebookApplication.class, args);
		Item item = Item.ENGLISH;
		//System.out.println(item.getDisplayName());
		System.out.println(Rating.fromScore(89));
	}
}

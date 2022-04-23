package com.noah.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			// read json file and pass to pojo
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			// println
			System.out.println(student.getFirstName());
			
			System.out.println("Street: "+student.getAddress().getStreet());
			for(String str:student.getLanguages()) {
				System.out.println("languages: "+str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

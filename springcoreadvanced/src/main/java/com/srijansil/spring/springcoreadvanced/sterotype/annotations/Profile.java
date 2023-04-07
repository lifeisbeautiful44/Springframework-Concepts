package com.srijansil.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
	@Value("Software Engineer.")
	private String title;
	@Value("SSB Learn To LIVE")
	private String company;

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

	
}

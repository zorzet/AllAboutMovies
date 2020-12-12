package org.aueb.restservice;

import java.io.IOException;



public class movies {
	private  long id;
	private  String title;
	
	public movies(long id, String title) {
		this.id=id;
		this.title=title;
	}
	
	public long getId() {
		return this.id;
	}
	public String getTitle() {
		return this.title;
	}
 
}

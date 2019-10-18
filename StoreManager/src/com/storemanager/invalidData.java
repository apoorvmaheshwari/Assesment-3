package com.storemanager;

public class invalidData extends Exception{
	
	String message;
	public invalidData(String message)
	{
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

}

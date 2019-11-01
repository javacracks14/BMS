package com.educba.exception;

public class ExceptionHandler extends Exception
{
	private String msg;
	
	public ExceptionHandler() // prints default Error Message
	{
		msg = "Error Occurred in your application";
	}
	public ExceptionHandler(String msg) // prints message type by programmer
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return "Error : "+msg;
	}
	public String toString()
	{
		return msg;
	}
}

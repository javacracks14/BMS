package com.educba.validation;

import java.util.regex.Pattern;
import com.educba.exception.ExceptionHandler;

public class BookValidator 
{
	public static boolean validateBookId(String id) throws ExceptionHandler
	{
		String idpattern = "\\d{3}";
		if(Pattern.matches(idpattern, id))
		{
			return true;
		}
		else
		{
			throw new ExceptionHandler("Only 3 Digit ID Allowed");
		}
	}
	public static boolean validateBookName(String name) throws ExceptionHandler
	{
		String namepattern = "[A-Za-z]{5,20}";
		if(Pattern.matches(namepattern, name))
		{
			return true;
		}
		else
		{
			throw new ExceptionHandler("First Letter should be Capital and Name of the book should be MIN 5 and MAX 20 Characters");
		}
	}
	public static boolean validateBookAuthor(String authorname) throws ExceptionHandler
	{
		String authorpattern = "[A-Za-z]{5,20}";
		if(Pattern.matches(authorpattern, authorname))
		{
			return true;
		}
		else
		{
			throw new ExceptionHandler("First Letter should be Capital and Name of the Author should be MIN 5 and MAX 20 Characters");
		}
	}
	public static boolean validateBookPrice(String price) throws ExceptionHandler
	{
		String pricepattern = "\\d{2,4}.?[0-9]{2}$";
		if(Pattern.matches(pricepattern, price))
		{
			return true;
		}
		else
		{
			throw new ExceptionHandler("Book Price should be in tens to thousand and decimal should be of two digits");
		}
	}
}

package com.educba.collection;

import com.educba.schema.BookPOJO;
import com.educba.exception.ExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;

public class BookDetails 
{
	static ArrayList<BookPOJO> book;
	BookPOJO b;
	private static int count=0;
	public BookDetails()
	{
		book = new ArrayList<BookPOJO>();
	}
	
	public void addBook(int id, String bn, String ba, double pr)
	{
//		b = new BookPOJO(id,bn,ba,pr);
//		book.add(b);
		book.add(new BookPOJO(id,bn,ba,pr));
		System.out.println("Book Added in our Records...");
	}
	public void dispBook() throws ExceptionHandler
	{
		Iterator<BookPOJO> it = book.iterator();
		if(book.size() == 0)
		{
			throw new ExceptionHandler("Book List is Empty...");
		}
		else
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
	public static int dispBookCount() throws ExceptionHandler
	{
		Iterator<BookPOJO> i = book.iterator();
		while(i.hasNext())
		{
				count++;
		}
		return count;
	}
}

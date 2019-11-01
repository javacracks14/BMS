package com.educba.schema;

public class BookPOJO 
{
	private int bookid;
	private String bookname, bookauthor;
	private double bookprice;
	
	public BookPOJO(int bookid, String bookname, String bookauthor, double bookprice) 
	{
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	public int getBookid() 
	{
		return bookid;
	}
	public void setBookid(int bookid) 
	{
		this.bookid = bookid;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getBookauthor() 
	{
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) 
	{
		this.bookauthor = bookauthor;
	}
	public double getBookprice() 
	{
		return bookprice;
	}
	public void setBookprice(double bookprice) 
	{
		this.bookprice = bookprice;
	}
	
	@Override
	public String toString()
	{
		return bookid+"\t"+bookname+"\t"+bookauthor+"\t"+bookprice;
	}
}

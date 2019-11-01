package com.educba.UI;

import com.educba.collection.BookDetails;
import com.educba.exception.ExceptionHandler;
import com.educba.validation.BookValidator;
import java.util.Scanner;

public class ABCLibrary 
{
	public static void main(String[] args) throws InterruptedException
	{
		BookDetails bk = new BookDetails();
		Scanner sc = new Scanner(System.in);
		int choice;
		String id, bn, ba, pr;
		while(true)
		{
			System.out.println("----------------------------ABC LIBRARY-----------------------------------");
			System.out.println("1. Adding the Book");
			System.out.println("2. Displaying the Book");
			System.out.println("3. Exit Application");
			System.out.print("Enter Your Choice : ");
			choice = sc.nextInt();
			
			try
			{
				switch(choice)
				{
					case 1 :
						System.out.print("Enter Book ID : ");
						id = sc.next();
						if(BookValidator.validateBookId(id))
						{
							System.out.print("Enter Book Name : ");
							bn = sc.next();
							if(BookValidator.validateBookName(bn))
							{
								System.out.print("Enter Book Author : ");
								ba = sc.next();
								if(BookValidator.validateBookAuthor(ba))
								{
									System.out.print("Enter Book Price : ");
									pr = sc.next();
									if(BookValidator.validateBookPrice(pr))
									{
										bk.addBook(Integer.parseInt(id), bn, ba, Double.parseDouble(pr));
									}
								}
							}
						}	
					break;
					case 2 : 
						try
						{
							bk.dispBook();
						}
						catch(ExceptionHandler ex)
						{
							System.err.println(ex);
						}
					break;
					case 3 : 
						System.exit(1);
					break;
					default : 
						System.out.println("Wrong Choice Try Again....");
						Thread.sleep(2000);
				}
			}
			catch(ExceptionHandler e)
			{
				System.err.println(e);
			}
		}
	}
}

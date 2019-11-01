package com.educba.Test;

import com.educba.collection.BookDetails;
import com.educba.exception.ExceptionHandler;
import com.educba.schema.BookPOJO;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BookDetailsTest 
{
	static BookDetails ba;
	static BookDetails ba1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		ba = new BookDetails(); 
		ba.addBook(101,"Junit","Abcxyz",250.00);
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		ba = null;
	}
	@Test
	void test() throws ExceptionHandler 
	{
		Assert.assertEquals(1, BookDetails.dispBookCount());
		Assert.fail("Test Fail");
	}

}

package com.stackroute.activitystream.TestCases;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.activitystream.IntegrationProjectTravis.Travis;

import junit.framework.TestCase;

public class TravisTestCase extends TestCase {
	
	private static Travis object;
	
	@BeforeClass
	public static void testCasecalling()
	{
		object=new Travis();
	}
	@Test
	public void testForSum1()
	{
		
		assertEquals(30,object.sum(10,20));
	}

	@Test
	public void testForSum2()
	{
		
		assertEquals(40,object.sum(20,20));
	}
}

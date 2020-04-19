import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class TestArianaMertz extends TestCase {
	@Test
	public void testGetFullName() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("Ariana Mertz", me.getFullName());
	}
	
	@Test
	public void testGetFirstName() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("Ariana", me.getFirstName());
	}
	
	@Test
	public void testGetLastName() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("Mertz", me.getLastName());
	}
	
	@Test
	public void testGetUCINetID() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("amertz", me.getUCInetID());
	}
	
	@Test
	public void testRotatePos() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("iana MertzAr", me.getRotatedFullName(2));
	}
	
	@Test
	public void testRotateNeg() 
	{
		ArianaMertz me = new ArianaMertz();
		Assert.assertEquals("MertzAriana ", me.getRotatedFullName(-5));
	}
}

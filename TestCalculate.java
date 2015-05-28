package net.calculate;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class TestCalculate {
	Calculate calculate = null;
	private int a;
	private int b;
	private int expected1;
	private int expected2;
	
	@Before
	public void setUp() throws Exception{
		
		System.out.println("开始测试啦！");
		calculate = new Calculate();
		System.out.println("calculate对象被初始化！");
	}
	  @After
	    public void tearDown() throws Exception {
	        System.out.println("calculate对象将被清理！");
	        calculate = null;
	        System.out.println("测试结束！");
	    }
	  @Parameters
	  public static Collection add(){
		  return Arrays.asList(new Object[][]{
				  {"1","2"}
		  });
	  }
	  //参数
	    public void testAdd0(int a,int b,int expected1) {
		  	this.a = a;
		  	this.b = b;
		  	this.expected1 = expected1;
	  }
	 @Test
	 public void testAdd(){
		 	System.out.println("add()方法被测试了！");
		 	Calculate calculate = new Calculate();
		 	int result = calculate.add(a,b);
	        assertEquals(expected1, result);//使用Assert查看add方法的值
	        
	    }
	 @Parameters
	  public static Collection subduction(){
		  return Arrays.asList(new Object[][]{
				  {"1","2"}
		  });
	  }
	  //参数
	    public void testSubduction0(int a,int b,int expected1) {
		  	this.a = a;
		  	this.b = b;
		  	this.expected1 = expected1;
	  }
	 @Test
	 public void testSubduction(){
		 	System.out.println("subduction()方法被测试了！");
		 	Calculate calculate = new Calculate();
		 	int result = calculate.subduction(a,b);
	        assertEquals(expected1, result);//使用Assert查看subduction方法的值
	        
	    }
	 @Parameters
	  public static Collection mul(){
		  return Arrays.asList(new Object[][]{
				  {"1","2"}
		  });
	  }
	  //参数
	    public void testMul0(int a,int b,int expected2) {
		  	this.a = a;
		  	this.b = b;
		  	this.expected2 = expected2;
	  }
	 @Test
	 public void testMul(){
		 	System.out.println("mul()方法被测试了！");
		 	Calculate calculate = new Calculate();
		 	int result = (int) calculate.mul(a,b);
		 	assertEquals(expected2, result);//使用Assert查看mul方法的值
	        
	    }
	 @Parameters
	  public static Collection div(){
		  return Arrays.asList(new Object[][]{
				  {"1","2"}
		  });
	  }
	  //参数
	    public void testDiv0(int a,int b,int expected2) {
		  	this.a = a;
		  	this.b = b;
		  	this.expected2 = expected2;
	  }
	@Test
	 public void testDiv(){
		 	System.out.println("div()方法被测试了！");
		 	Calculate calculate = new Calculate();
		 	int result = (int) calculate.div(a,b);
	        assertEquals(expected2, result);//使用Assert查看div方法的值
	        
	    }
	 
}

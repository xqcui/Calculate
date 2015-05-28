package net.calculate;
public class Calculate {
	private static int sum1= 0;
	//private static double sum2 = 0.0;
	/**
	 * @param args
	 */
	public int add(int a,int b){
		sum1 = (a+b);
		return sum1;
	}
	public int subduction(int a,int b){
		sum1 = (a-b);
		return sum1;
	}
	public double mul(int a,int b){
		sum1 = a * b;
		return sum1;
	}
	public double div(int a,int b){
		while(b!=0){
			sum1 = (int)(a/b);
		}
		return sum1;
	}
	public static int getSum1() {
		return sum1;
	}
	//public static double getSum2() {
		//return sum2;
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calculate = new Calculate();
		System.out.println("加法运算的结果是："+calculate.add(1, 2));
		System.out.println("减法运算的结果是："+calculate.subduction(1, 2));
		System.out.println("乘法运算的结果是："+calculate.mul(1, 2));
		System.out.println("除法运算的结果是："+calculate.div(1, 0));
		
	}
}

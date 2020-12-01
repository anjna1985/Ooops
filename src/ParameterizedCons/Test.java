package ParameterizedCons;

public class Test {

	int appId;
	String appName;
	
	Test(int id, String name){
		this.appId = id;
		this.appName = name;
		
}
	void info ()
	{
		System.out.println("Id: " +appId+ " Name: "+appName);
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test(1101, "Facebook");
		Test obj2 = new Test(2201, "Instragram");
		obj1.info();
		obj2.info();
	}
}

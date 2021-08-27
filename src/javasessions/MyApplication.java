package javasessions;

public class MyApplication {
	String name;
	int age;

	public static void main(String[] args) {  

		MyApplication obj = new MyApplication();
		obj.name = "Tom";
		obj.age = 25;
		
		MyApplication.test(obj);//call by reference(java does not support call by reference but we are not using pointer only transferring the object) 
	}
	
	public static void test(MyApplication p1) {//obj is pointing to p1 object reference
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.app();
		
		MyApplication p2 = p1;
		p2.app();
		System.out.println(p2.name + ":" +p2.age);
	}
	public void app() {
		System.out.println("this is my app....");
	}
}
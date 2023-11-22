import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class assignment1 {
	class Test{
		String s;
		Test(){
			this.s = "Programming languages";
		}
		
		public void method1() {
			System.out.println(s);
		}
		
		public void method2(int n) {
			System.out.println(n);
		}
		
		public void method3() {
			System.out.println("Private method is invoked");
		}
	}
	public static void main(String[] args) {
		Test testObject = new Test();
		
		Class <?> cls = Test.getClass();
		System.out.println("the name of the class is " + cls.getName());
		Constructor<?> constructor = null;
				
		try {
			constructor = cls.getConstructor();
			System.out.println("The name of the constructor is " + constructor.getName());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the name of the class is " + cls.getName());
		
		Constructor constructor = cls.getConstructor();
		System.out.println("The name of the constructor is " + constructor.getName());
		
		Method[] methods = cls.getMethods();
		
	}

}

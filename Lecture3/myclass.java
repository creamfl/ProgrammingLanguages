package Niki Ramanchev 5553;

public class myNumber {
	private int num;
	private int num2;
	
	public myNumber() {
		num = 0;
		num2 = 100;
	}
	
	public myNumber(int num, int num2) {
		this.num = num;
		this.num2 = num2;
	}
	int getNum() {
		return num;
	}
	void setNum(int i) {
		num=i;
		num2=10*i;
	}
	int getNum2() {
		return num2;
	}
	void description() {
		System.out.println("The value of num is" +this.getNum() );
		System.out.println("The value of num2 is" + this.getNum2());
	}
	float getAverage() {
		return (num+num2/2);
	}
	public static void main(String[] args) {
		myNumber A=new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
		
		 myNumber mb=new myNumber(13, 10);
	        System.out.println("mb.getNum(): " + mb.getNum());
	        System.out.println("mb.getNum2(): " + mb.getNum2());
	}

}

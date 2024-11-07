package oops;

public class MethodCall {
	//method is small module,get called via object,it will take arguments,will return value
		//if method is not return(void)
		void modulus(int a,int b)
		{
			System.out.println(a%b);
		}
		//fn return integer value
		int modulus1(int a,int b)
		{
		return a%b;
		}

		public static void main(String[] args) {
			MethodCall obj=new MethodCall();
			obj.modulus(20, 10);
			System.out.println(obj.modulus1(30, 7));

		}


}

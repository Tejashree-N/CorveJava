package variables;

class Subject
{
	//instance var
	int English;
	int Maths;
	int GK;
	public void dispaly()
	{
		//local var
		int avg=60;
		{
			System.out.println("The Average is:"+ avg);
		}
	}

}

public class LocalVariable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mark of Student1
				Subject s1=new Subject();
				//s1.English=80; bcs its visible only in that block only
				s1.Maths=70;
				s1.GK=30;
				s1.English=80;
				s1.dispaly();
				//System.out.println(s1.avg);we cant access local variable
				
				//Mark of Student2
						Subject s2=new Subject();
						s2.Maths=90;
						s2.GK=80;
						s2.English=70;
						s2.dispaly();
						
						
				
				System.out.println("English:"+s1.English+" "+"Maths:"+s1.Maths+" "+"gk:"+s1.GK);
				System.out.println("English:"+s2.English+" "+"Maths:"+s2.Maths+" "+"gk:"+s2.GK);

	}
}

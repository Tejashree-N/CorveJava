package arrays;
import java.util.Scanner;

public class MDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take one variable
				int a,b;
				// write the scanner method
				Scanner sc=new Scanner(System.in);
				// read the element we want to enter. variable=scanner method object nextInt()method ;
				//taking row as input
				a=sc.nextInt();
				System.out.println("Enter the elements in rows:");
				//taking column as input
				b=sc.nextInt();
				System.out.println("Enter the elements in columns:");
				//Declaring the MD Array
				int score[][]=new int[a][b];
				//loop for row
				for(int i=0;i<a;i++)
				{
					for(int j=0;j<b;j++)
					{
						score[i][j]=sc.nextInt();
						System.out.println("enter the array element:");
					
					}
				}
				
		        for(int i=0;i<a;i++)
		        {
		        	for(int j=0;j<b;j++)
		        	{
		        		System.out.println(score[i][j]+"");
		        	}
		        	System.out.println();
		        }
		        //closing the scanner method
		    
			}


}

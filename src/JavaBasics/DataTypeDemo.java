package JavaBasics;

public class DataTypeDemo {

	public static void main(String[] args) 
	{
		String name="John";//creating String literal
//		
//		String myName="John";
		
//		System.out.println(name.equals(myName));
//		
//		System.out.println(name==myName);
//		
		String firstName=new String("John");//creating String object
		
		String secondName=new String("John");
		
        System.out.println(firstName.equals(secondName));
		
		System.out.println(firstName==secondName);
		
		String fullName = name.concat(" Doe");
		
		System.out.println("New Name: "+fullName);
		
		int[] marks = new int[5];
	
		for(int i=0;i<marks.length;i++)
		{
		marks[i] = 2*i+4;
		}
	for(int i=0;i<marks.length;i++)
		{		
		System.out.println(marks[i]);
			
		}
//		int[] marks = new int[6];
//		
//		for(int i=0;i<marks.length;i++)
//			{
//				marks[i] ;
//			}
//			for(int i=0;i<marks.length;i++)
//		{
//				System.out.println(marks[i]);
//				
	
	
	int[][] numbers=new int[3][];
	
	numbers[0] = new int[4];
	numbers[1]= new int[5];
	numbers[2]= new int[4];
	
	for(int i=0;i<numbers.length;i++)
	{
		for(int j=0;j<numbers[i].length;j++)
		{
			numbers[i][j]= i*4+j;
		}
	}
	for(int i=0;i<numbers.length;i++)
	{
		for(int j=0;j<numbers[i].length;j++)
		{
			System.out.print(numbers[i][j]+" ");
		}
		System.out.println();
	
	}
		}
		
	
	
}


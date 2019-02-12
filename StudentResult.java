import java.util.Scanner;

class Student{
		String name,branch;
		int rno,marks,Result=0,avg=0;
		void input()
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter Student Roll Number :");
			rno=s1.nextInt();
			System.out.println("Enter Student Name :");
			name=s1.next();
			System.out.println("Enter Branch :");
			branch=s1.next();
			System.out.println("Enter Marks :");
			int n=s1.nextInt();
			int i;
			for(i=1;i<=n;i++)
			{
				marks=s1.nextInt();
				if(marks>=0)
				{
					Result=(Result+marks);
					avg=Result/n;
				}
				else
				{
					break;
				}
			}
			System.out.println("Total Marks :"+Result);
			System.out.println("Average :"+avg);
		}
		void Result()
		{
			if(avg>=90)
			{
				System.out.print("Grade A");
			}
			else if(avg<=89 && avg>=70)
			{
				System.out.print("Grade B");
			}
			else if(avg<=69 && avg>=39)
			{
				System.out.print("Grade C");
			}
			else
			{
				System.out.print("Fail");
			}
			System.out.println("");
		}
		void print()
		{
			System.out.println("Roll Number Is :"+rno);
			System.out.println("Name Is :"+name);
			System.out.println("Branch Is :"+branch);
			System.out.print("Result Is :");
		}
}

class StudentResult{
	public static void main(String[] args)
	{	
		Student obj1=new Student();
		obj1.input();
		obj1.print();
		obj1.Result();
	}
}
		
		
		
		
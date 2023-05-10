package Controller;

import java.util.Scanner;

import Model.Student;

public class Control {
//array
Student s[];
int n,k=0,i;
Scanner sc=new Scanner(System.in);

public Control() 
{
	s=new Student[20];
	
}
public void Insert()
{
    	System.out.println("Enter the number of student : ");
    	n=Integer.parseInt(sc.nextLine());
    	for( i=k;i<n+k;i++)
    	{
		System.out.println("Student : "+(i+1));
		System.out.println("Enter Your Roll No: ");
		int roll=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Your Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter Your Paper 1: ");
	    double p1=Double.parseDouble(sc.nextLine());
	    System.out.println("Enter Your Paper 2: ");
	    double p2=Double.parseDouble(sc.nextLine());
	    System.out.println("Enter Your Paper 3: ");
	    double p3=Double.parseDouble(sc.nextLine());
		System.out.println("....................|");
        		
	    s[i]=new Student();
	    s[i].setRoll(roll);
	    s[i].setName(name);
	    s[i].setP1(p1);
	    s[i].setP2(p2);
	    s[i].setP3(p3);
	   
	}
	k=n+k;
	System.out.println("....................|");

}

public void Show()
{
	for(i=0;i<k;i++)
	{
		System.out.println("Roll No: "+s[i].getRoll()+",  Name: "+s[i].getName()+ "\n"+ "Paper 1: "+s[i].getP1()+","
	+ "Paper 2: "+s[i].getP2()+",  Paper 3: "+s[i].getP3());
		
	   double Result=(s[i].getP1()+s[i].getP2()+s[i].getP3())/3;
	   s[i].setResult(Result);
       System.out.println("Result : "+s[i].getResult());
	   System.out.println("....................|");

	}
}

public void Update()
{
	int user=0;
	System.out.println("Enter Roll : ");
	int nroll=Integer.parseInt(sc.nextLine());
	for(int i=0;i<k;i++)
	{
	if(nroll==s[i].getRoll())
	{
	System.out.println("1.Name");
	System.out.println("2.Result");
	System.out.println("0.Exit");
	
	System.out.println("Enter Your Choice : ");
	int ch=Integer.parseInt(sc.nextLine());
	
	switch(ch)
	{
	case 1:
		System.out.println("Old Name : "+s[i].getName());
		System.out.println("Enter Update Name : ");
		String name=sc.nextLine();
		s[i].setName(name);
		System.out.println("Update name succesfully...~");
		break;
	case 2:
		System.out.println("1.Paper 1");
		System.out.println("2.Paper 2");
		System.out.println("3.Paper 3");
		
		System.out.println("Enter Your Choice : ");
		int ch1=Integer.parseInt(sc.nextLine());
		switch(ch1)
		{
		case 1:
			System.out.println("old Paper 1 Marks: "+s[i].getP1());
			System.out.println("Enter Update Paper 1 Marks : ");
		    double p1=Double.parseDouble(sc.nextLine());
		    s[i].setP1(p1);
			System.out.println("Update Paper 1 Makes succesfully...~");
			break;
		case 2:
			System.out.println("old Paper 2 Marks: "+s[i].getP2());
			System.out.println("Enter Update Paper 2 Marks : ");
		    double p2=Double.parseDouble(sc.nextLine());
		    s[i].setP2(p2);
			System.out.println("Update Paper 2 Makes succesfully...~");

			break;
		case 3:
			System.out.println("old Paper 3 Marks: "+s[i].getP3());
			System.out.println("Enter Update Paper 3 Marks : ");
		    double p3=Double.parseDouble(sc.nextLine());
		    s[i].setP3(p3);
			System.out.println("Update Paper 3 Makes succesfully...~");

			break;
		}
		break;	
	}
	}
	else{
		user++;
	}
	if(user==k)
	{
		System.out.println("Student Not Found ~");	

	}
  }
}

public void Delete()
{
	System.out.println("Enter Roll : ");
	int roll1=Integer.parseInt(sc.nextLine());
	for(int i=0;i<k;i++)
	{
	if(roll1==s[i].getRoll())
	{
	
	s[i]=s[k-1];
	k--;
	System.out.println("Data Delete succesfully..~ ");
	break;
	}
	}
	if(i==k)
	{
	System.out.println("Student Not Found ~ ");	
	
	}
}

public void Search()
{
	int user1=0;
	System.out.println("Enter Roll : ");
	int roll2=Integer.parseInt(sc.nextLine());
	for(int i=0;i<k;i++)
	{
	if(roll2==s[i].getRoll())
	{	
	System.out.println("Roll No:"+s[i].getRoll()+",Name:"+s[i].getName()+ "\n Paper 1:"+s[i].getP1()+",  Paper 2: "+s[i].getP2()+",  Paper 3:"+s[i].getP3()+
	"  Result:"+s[i].getResult());
	
	System.out.println();
	System.out.println();
    System.out.println();

	System.out.println();

	}
	else
	{
		user1++;
	}
	}
if(user1==k)
{
	System.out.println("Student not found ~");
}
}
}
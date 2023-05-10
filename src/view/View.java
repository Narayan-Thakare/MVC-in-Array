package view;
import java.util.Scanner;

import Controller.Control;


public class View {

	public View()
	{
		menu();
		
	}
	public void menu(){
	 boolean loop=true;
	   Scanner sc=new Scanner(System.in);
	   Control c=new Control();
	   
	
	while(loop)
	{
	System.out.println(" 1.Insert\n 2.Show\n 3.Update\n 4.Delete\n 5.Search\n 0.Exit");
	
	System.out.println("Enter Your Choice  : ");
	int ch=Integer.parseInt(sc.nextLine());
	switch(ch)
	{
	case 1:
		c.Insert();
		break;
	case 2:
		c.Show();
		break;
	case 3:
		c.Update();
		break;
	case 4:
		c.Delete();
		break;
	case 5:
		c.Search();
		break;
	case 0:
		System.out.println("Thank you ~");
		loop=false;
		break;
		default:
	}

	

	
	
	}}}

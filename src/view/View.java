package view;
import java.util.Scanner;

import Controller.Control;


public class View {
	
	
	
	public View()
	{
		 //System.out.println("        *               *  ");
		 System.out.println("      * * *           *  * *");
	      System.out.println("    *       *       *        *");
	      System.out.println("  *           *   *            *");
	      System.out.println(" *              *               *");
	      System.out.println("*                                *");
	      System.out.println("*      WELCOME TO MY PROJECT     *");
	      System.out.println(" *                               *");
	      System.out.println("  *                             *");
	      System.out.println("    *                         *");
	      System.out.println("      *                     *");
	      System.out.println("        *                 *");
	      System.out.println("           *           *");
	      System.out.println("              *     *");
	      System.out.println("                 *");
		menu();
		
	}
	public void menu(){
	 boolean loop=true;
	   Scanner sc=new Scanner(System.in);
	   Control c=new Control();
	   
	
	while(loop)
	{
		try {
			c.LodingBar();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println(":::::::LIST::::::");
	
		System.out.println("1.Add Student:");
		System.out.println("2.Show Student:");
		System.out.println("3.Upadte Student:");
		System.out.println("4.Delete Student:");
		System.out.println("5.Search Student:");
		System.out.println("0.Exit:");

	
	System.out.println("Enter Your Choice  : ");
	int ch=Integer.parseInt(sc.nextLine());
	switch(ch)
	{
	case 1:
		try {
			c.Insert();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	case 2:
		try {
			c.Show();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		break;
	case 3:
		try {
			c.Update();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

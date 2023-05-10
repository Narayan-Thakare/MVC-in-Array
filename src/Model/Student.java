package Model;

public class Student
{
	private int roll;
	private String name;
	private double Result,p1,p2,p3;
	
    public Student(int roll, String name, double result, double p1, double p2, double p3)
    {
		this.roll = roll;
		this.name = name;
		Result = result;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Student() {
	//default constructer	
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getResult() {
		return Result;
	}

	public void setResult(double result) {
		Result = result;
	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	
	
	
}
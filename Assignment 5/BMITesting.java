import java.util.Scanner;

public class BMICalculator {
	private double height;
	private double weight;
	public BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	public BMICalculator(){
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void setWeight(double Weight)
	{
		this.weight=Weight;
	}
 public double calculateBMI()
	{
		double bmi=(this.weight/(this.height*this.height))*10000;
		return bmi;
	}
}
public class BMITesting {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Height : ");
		double height=sc.nextDouble();
		System.out.println("Enter Your Weight : ");
		double weight=sc.nextDouble();
		
		BMICalculator bmi=new BMICalculator();
		bmi.setHeight(height);
		bmi.setWeight(weight);
	double res=bmi.calculateBMI();

		System.out.println("--------------");
		System.out.printf("BMI is : %.4f  ",bmi.calculateBMI());
		
		
	}

}

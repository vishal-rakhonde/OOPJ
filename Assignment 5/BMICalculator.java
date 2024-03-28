package in.cdac.kh;

public class BMICalculator {
	private double height;
	private double weight;
	
	
	public BMICalculator(double height,double weight)
	{
		this.height=height;
		this.weight=weight;
	}
	
	public BMICalculator()
	{
		super();
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

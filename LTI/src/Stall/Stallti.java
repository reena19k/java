package Stall;

public class Stallti {
	private String stallName;
	private String details;
	private double stallArea;
	private String owner;
	private double stallCost;
	
	
	
	public Stallti(String stallName, String details, int stallArea, String owner) {
		
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}
	public String getStallName() {
		return stallName;
	}
	public String getDetails() {
		return details;
	}
	public double getStallArea() {
		return stallArea;
	}
	public String getOwner() {
		return owner;
	}
	public double getStallCost() {
		return stallCost;
	}
	double run(double stall1)
	{
	
		return stallCost = stallArea*150;
		
	}
	
	@Override
	public String toString() {
		return "Stallti [stallName=" + stallName + ", details=" + details + ", stallArea=" + stallArea + ", owner="
				+ owner + ", stallCost=" + stallCost + "]";
	}
	
	
	

}

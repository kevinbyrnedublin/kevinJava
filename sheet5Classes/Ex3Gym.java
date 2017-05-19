package sheet5Classes;

public class Ex3Gym {
	
	
	
	static int memNumCounter = 100;
	private String name;
	private double memCost;
	private int paymentFreq;
	public int memNum;
	
	public String firstName;
	public String lastName;
	public String Street;
	
	public String firstName2;
	public String lastName2;
	public String Street2;

	public Ex3Gym(){
		memNum = memNumCounter;
		memNumCounter++;
	}
	public Ex3Gym(int paymentFreq){
		this();
		this.paymentFreq = paymentFreq;
	}
	//setters.
	//public void setMemNum(int memNum){
		//this.memNum = memNum;
	//}
	public void setName(String Name){
		this.name = Name;
	}
	public void setMemCost(double memCost){
		this.memCost= memCost;
	}
	public void setPaymentFreq(int paymentFreq){
		this.paymentFreq = paymentFreq;
	}

	//Getters.
	public String getName(){
		return name;
	}
	public  int getMemNum(){
		return memNum;
	}
	public double getMemCost(){
		return memCost;
	}
	public int getPaymentFreq(){
		return paymentFreq;
	}
	//toString
	public String toString(){
		return "Name is " + name +
				"Membership No is " + memNum +
				"Membership cost is " + memCost;}
}




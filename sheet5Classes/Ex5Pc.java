package sheet5Classes;

public class Ex5Pc {
	private int ram;
	private int hardDrive;
	private int monitor;
	private String operatingSystem;
	private int cost;
	
	public static final int RAM_4_GB = 4;
	public static final int RAM_8_GB = 8;
	public static final int RAM_16_GB = 16;
	
	public static final int HD_100_GB = 100;
	public static final int HD_200_GB = 200;
	public static final int HD_500_GB = 500;
	
	public static final int MON_23_IN = 23;
	public static final int MON_25_IN = 25;
	public static final int MON_32_IN = 32;
	
	
	public static final String OP_SYS1 = "WIN10";
	public static final String OP_SYS2 = "UNIX";
	public static final String OP_SYS3 = "LINUX";


	
	public Ex5Pc(){
		this.ram = 16;
		this.hardDrive = 500;
		this.monitor = 32;
		this.operatingSystem = "LINUX";		
	}
	
	public Ex5Pc(int Ram, int HardDrive, int Monitor, String opSys){
		this.ram = Ram;
		this.hardDrive = HardDrive;
		this.monitor = Monitor;
		this.operatingSystem = opSys;
	}
	
	//Setters
	public void setRam(int Ram){
		this.ram = Ram;
	}
	public void setHardDrive(int HardDrive){
		this.hardDrive = HardDrive;
	}
	public void setMonitor(int Monitor){
		this.monitor = Monitor;
	}
	public void setOpSys(String OpSys){
		this.operatingSystem = OpSys;
	}
	public  void setCost(int Cost){
		ram = ram * 20;
		hardDrive = hardDrive * 10;
		this.cost = (ram + hardDrive);
	}
	
	//Getters
	public int getRam(){
		return ram;
	}
	public int getHardDrive(){
		return hardDrive;
	}
	public int getMonitor(){
		return monitor;
	}
	public String getOpSys(){
		return operatingSystem;
	}
	public int getCost(){
		return cost;
		
	}
	//toString
	public String toString(){
		return " \nRAM is " + ram +
				"\nHard Drive is " + hardDrive +
				"\nOperating System is " + operatingSystem +
				"\nMonitor size is " + monitor;
				
	}
}

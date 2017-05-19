package sheet5Classes;

public class Ex5MainForPc {

	public static void main(String[] args) {
		Ex5Pc pc = new Ex5Pc(4,100,23,"UNIX");
		System.out.println("PC no1 is \n-----------" +pc);
		Ex5Pc pc1 = new Ex5Pc();
				pc1.setRam(Ex5Pc.RAM_4_GB);
				pc1.setHardDrive(Ex5Pc.HD_100_GB);
				pc1.setOpSys("WIN10");
				pc1.setMonitor(Ex5Pc.MON_23_IN);
				pc1.setCost(1);
		System.out.println("\nPC no2 is ");
		System.out.println("------------");
		System.out.println("Ram is " + Ex5Pc.RAM_16_GB);
		System.out.println("Hard Drive is " + Ex5Pc.HD_500_GB);
		System.out.println("Operating System is " + "LINUX");
		System.out.println("Monitor size is " + Ex5Pc.MON_25_IN);
		System.out.println("Cost is " + pc1.getCost());
		
	}
	
	
}

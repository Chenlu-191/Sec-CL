package Cl.java;
public class Test {
	public static void main(String[] args) {
        CPU cPU = new CPU(2200,"�˴�i7",3.0);
        cPU.setFactory("AMD");
        HardDisk hardDisk =new HardDisk(200,"������");
        PC pc =new PC(cPU);
        pc.sethardDisk(hardDisk);
        pc.show();
    }

}
package Cl.java;
public class PC {
	private CPU cpu;
    private HardDisk hardDisk;
    PC(CPU cpu){
        setcPU(cpu);
    }
    PC(HardDisk hardDisk){
        sethardDisk(hardDisk);
    }
    public void setcPU(CPU cpu) {
        this.cpu = cpu;
    }
    public void sethardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void show(){
        System.out.println("cpu的速度为："+cpu.getSpeed());
        System.out.println("cpu的名字为："+cpu.getName());
        System.out.println("cpu的赫兹为："+cpu.getHertz());
        System.out.println("cpu的厂家为："+cpu.getFactory());
        System.out.println("硬盘的容量为："+hardDisk.getAmount());
        System.out.println("硬盘的形状为："+hardDisk.getShape());
    }
}



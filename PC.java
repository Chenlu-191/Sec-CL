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
        System.out.println("cpu���ٶ�Ϊ��"+cpu.getSpeed());
        System.out.println("cpu������Ϊ��"+cpu.getName());
        System.out.println("cpu�ĺ���Ϊ��"+cpu.getHertz());
        System.out.println("cpu�ĳ���Ϊ��"+cpu.getFactory());
        System.out.println("Ӳ�̵�����Ϊ��"+hardDisk.getAmount());
        System.out.println("Ӳ�̵���״Ϊ��"+hardDisk.getShape());
    }
}



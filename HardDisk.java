package Cl.java;
public class HardDisk {
	private int amount;
    private String shape;
    HardDisk(int amount,String shape){
        setAmount(amount);
        setShape(shape);

    }
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        if (shape.equals("长方体")||shape.contentEquals("正方体") ){
            this.shape=shape;
        }
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount) {
        if(amount > 16 && amount  <2048){
            this.amount = amount;
        }
    }

}


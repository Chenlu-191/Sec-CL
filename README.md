# 计191陈鲁2019310189

## 一.实验目的：
    ### (1) 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。
        
        (2) 掌握构造方法和对象的创建
        
        (3) 了解类与程序的基本结构
        
        (4) 理解类的封装

## 二.实验要求：
      (1) CPU类：要求getSpeed()返回speed的值，用setSpeed(int m)方法将参数m的值赋值给speed
      (2) HardDisk类：要求getAmount()返回amount的值，用setAmount(int m)方法将参数m的值赋值给amount
      (3) PC类：要求setCPU(CPU c)将参数c的值赋值给cpu,用setHardDisk(HardDisk h)方法将参数h的值赋值给HD，用show()方法显示cpu的速度和硬盘的容量
      (4) Test主类：
                  main方法中创建CPU对象cpu，cpu 将自己的 speed 设置为2200
                  main方法中创建HardDisk对象disk，disk将自己的 amount 设置为200
                  main方法中创建PC对象pc
                  pc调用setCPU(CPU c)方法，调用实参是cpu
                  pc调用setHardDisk(HardDisk h)方法，调用实参是disk
                  pc调用show()方法
附加内容：
    (1) 类中定义不少于两个构造方法
    (2) 每个类定义不少于2个属性，且属性的类型应该多样化
    (3) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断
    (4) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法

## 三.实验方法：
       1.创建PC、CPU、HardDisk、Test 4个类按照要求分别再每个类里写入代码
       2.将每个类中定义两个构造方法来给类中变量进行初始化赋值并且每个类定义多个不同属性
       3.利用修饰符private把类中的需要输出的对象封装起来
       4.用关键词this来传递变量的值
       5.通过if判断语句判断输入的变量是否合理
       6.使用set给Test主类中赋值
       7.使用get将赋值过的变量进行输出
       
## 四.核心方法
     此部分代码是跟CPU的速度，
     
     CPU类getSpeed()返回speed的值，
     
     setSpeed方法将参数赋值给speed,
     
     用this关键字传递变量的值，
     
     通过if判断语句设定合理速度范围。
     
     private int speed;
     
     public int getSpeed(){
     
    return speed;
    
    }

    public void setSpeed(int speed) {
    
    if (speed < 3500 && speed > 2000){
    
        this.speed=speed;
    }
     
 ## 五.实验结果
 
 ## 六.实验感想
 此次实验我学到了java中有类，方法和对象的定义。类是对现实中具体事物的描述，类中应该有描述该事物属性的对象，也有描述该事物运行方式的方法。这些一起组成了一个类，类通过封装变得完整且安全，外部的方
 
法想要修改类中的内容，只能通过事先在类中定义好的接口来进行。类包括成员变量和方法，成员变量和方法统称为对象，方法中包括局部变量和其他方法。变量具有私有性，每个类的成员变量对其他类是私有的，方法中

的局部变量对该类中的其他方法是私有的。public修饰的变量或方法可以被其他类和方法访问（变相的全局变量）。private修饰的变量和方法只对自己所在的方法或者类可见（真私有）。此次第一次做java实验，尝试完

成简单程序，通过自己研究并与同学探讨请教解决了问题。还让我意识到需要补充基础知识，多多研究理解读懂代码。


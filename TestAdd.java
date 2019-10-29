/**
 * Author : Zhang Zhe
 */
//1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
//除四种运算.
class Calculator{
    private  int num1;
    private  int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void show1(){
        System.out.println("sum="+(num1+num2));
    }
    public void show2(){
        System.out.println("jianfa="+(num1-num2));
    }
    public void show3(){
        System.out.println("chengfa="+(num1*num2));
    }
    public void show4(){
        System.out.println("chufa="+(num1/num2));
    }
}
public class TestAdd {
    public static void main(String[] args) {
        Calculator sc = new Calculator();
        sc.setNum1(12);
        sc.setNum2(24);
        sc.show1();
        sc.show2();
        sc.show3();
        sc.show4();
    }
}

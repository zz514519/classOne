/**
 * Author : Zhang Zhe
 */
//实现交换两个变量的值。要求：需要交换实参的值。
    class Ccome{
        private  int num1;
        private  int num2;

        public Ccome(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
        }

        public void show(){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
            System.out.println("num1:"+num1+"   num2:"+num2);
        }
}
public class Come {
    public static void main(String[] args) {
        Ccome c=new Ccome(23,56);
        c.show();
    }
}

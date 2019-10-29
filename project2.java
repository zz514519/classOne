/**
 * Author : Zhang Zhe
 */
class Person{
    public  String name = "caocao";//属于对象,存放在堆上
    public  int age = 21;

    public static final  int SIZE2 = 99;//静态的存放在方法区，只有一份
    public   final int SIZE = 88;//存放在堆上
    public static  int count = 100;//静态数据成员

    //构造方法（不只一个，可重载），如果程序没有提供任何构造方法 编译器会默认生成一个不带参数的构造方法
    // 执行完后才产生对象。
    public Person(){
        this("孙悟空");//调用带有一个参数的构造方法
        System.out.println("Person()!");
    }
   public Person(String name){
       this.name=name;
       System.out.println("Person()");
   }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person()!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void eat(){
        //int a = 10;//局部变量存放在栈上
        System.out.println("count:"+count);
        System.out.println("吃饭");
    }
    public void sleep(){
       //this.eat();//也可以eat();
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("name:"+name+" age:"+age);
    }


    public  static void func1(Person person){
        System.out.println("name:"+person.name);//传进来就可以访问了
        System.out.println("static.func1");
    }
}
public class project2 {
    public static void main(String[] args) {
        //Person person = new Person();//会调用不带有参数的构造方法。
        //Person person = new Person("张哲",21);//与构造函数含参个数一样
        new Person().sleep();
    }
}

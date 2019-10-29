/**
 * Author : Zhang Zhe
 */
/*class Person{
    public  String name = "caocao";//属于对象,存放在堆上
    public  int age = 21;

    public static final  int SIZE2 = 99;//静态的存放在方法区，只有一份
    public   final int SIZE = 88;//存放在堆上
    public static  int count = 100;//静态数据成员
    public  void eat(){
        //int a = 10;//局部变量存放在栈上
        System.out.println("count:"+count);
        System.out.println("吃饭");
    }
    public void sleep(){
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
public class Project {
    public static void main(String[] args) {
        //实例化对象  new
       Person person = new Person();
        //person.show();
        System.out.println(person.name);//访问实例化数据成员（方法），必须实例化对象
        System.out.println(person.age);
        //System.out.println(person.count);//可以运行，但有警告
        System.out.println(Person.count);//访问静态数据成员（方法）要通过类名,可以不实例化对象
        Person.func1(person);
        person.eat();
    }
}*/
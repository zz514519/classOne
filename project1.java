/**
 * Author : Zhang Zhe
 */
/*class Person {
    private String name;//属于对象,存放在堆上
    private int age;

    public static final int SIZE2 = 99;//静态的存放在方法区，只有一份
    public final int SIZE = 88;//存放在堆上
    public static int count = 100;//静态数据成员

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
*/
    /* public void setName(String name){
                //name=name;//自己给自己赋值，都是形参的name（和函数外部的name不一样）
                this.name=name;//this.name对象的引用
            }
            public  String getName(){
                return name;
            }*/
  /* public void eat() {//被private修饰时只能在类的内部进行调用
        //int a = 10;//局部变量存放在栈上
        System.out.println("count:" + count);
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void show() {
        System.out.println("name:" + name + " age:" + age);
    }
*/
    /*public static void func1(Person person/不传) {
        System.out.println("name:" +this.name);//静态方法不能使用this，在哪个类中使用就代表哪个生成对象的引用。
        System.out.println("static.func1");
    }*/
        /*public  static void func1(Person person){
        System.out.println("name:"+person.name);//传进来就可以访问了
        System.out.println("static.func1");
    }
}
    public class project1 {
        public static void main(String[] args) {
            //实例化对象  new
            Person person = new Person();
            //person.name="caocao";//不能访问
            person.setName("caocao");
            person.setAge(21);
            System.out.println(person.getName() + "   " + person.getAge());
            person.func1(person);
        }
    }*/

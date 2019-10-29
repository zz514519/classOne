/**
 * Author : Zhang Zhe
 */
//设计一个包含多个构造函数的类，
// 并分别用这些构造函数来进行实例化对象
class Per{
    private String name;
    private int age;

    public Per(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void show(){
        System.out.println(name+" " +age);
    }
}
public class Pop {
    public static void main(String[] args) {
        Per per =new Per("张哲",21);
        per.show();
    }
}

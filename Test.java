/**
 * Author : Zhang Zhe
 */
public class Test {
    private  String name;
    private  int age;
    private String sex;

    public Test(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void show(){
        System.out.println("name:"+name+" age:"+age+" sex:"+sex);
    }
}

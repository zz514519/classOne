import java.util.Arrays;
/**
 * Author : Zhang Zhe
 */
class Test {
    //属性
    private int[] elem;
    private int usedSize;//有效元素个数
    private final int CAPACITR = 5;

    public Test() {
        this.elem = new int[CAPACITR];
        this.usedSize = 0;
    }

    //方法
    //打印顺序链表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    private boolean isflull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos, int date) {
        if (isflull()) {
            //二倍扩容
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法");
            return;
        }
        //挪数据
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = date;
        this.usedSize++;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Test test = new Test();
        test.add(0,21);
        test.add(0,45);
        test.add(0,267);
        test.add(0,2109);
        test.add(0,6521);
        test.display();
        System.out.println(test.getPos(3));
    }
}

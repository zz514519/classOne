import java.util.Arrays;

/**
 * Author : Zhang Zhe
 */
class LinkProject {
    private int[] array;
    private int usedsize;//有效元素个数
    private int NUMBER = 5;

    public LinkProject() {
        this.array = new int[NUMBER];
        this.usedsize = 0;
    }

    //打印链表
    public void display() {
        for (int i = 0; i < usedsize; i++) {
            System.out.println(this.array[i] + " ");
        }
    }

    public boolean isfull() {
        if (this.usedsize == this.array.length) {
            return true;
        }
        return false;
    }

    //在pos位置新增数据
    public void add(int pos, int date) {
        if (isfull()) {
            //二倍扩容
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
        }
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("该位置不合法");
            return;
        }

        //挪数据
        for (int i = usedsize - 1; i >= pos; i--) {
            this.array[i + 1] = this.array[i];
        }
        this.array[pos] = date;
        this.usedsize++;
    }

    //删除pos位置的元素
    public void clear(int pos) {
        for (int i = usedsize - 1; i >= pos; i--) {
            array[i] = array[i + 1];
        }
        this.usedsize--;
    }
    //查找是否含有某元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedsize; i++) {
            if (this.array[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素的位置
    public int search(int toFind){
        for(int i=0;i<usedsize;i++){
            if(this.array[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    //获取某个位置的元素
    public int getPos(int pos){
        if(pos<0||pos>=this.array.length){
            System.out.println("该位置不合法");
            return -1;
        }
        return array[pos];
    }
}
public class Link {
    public static void main(String[] args) {
        LinkProject  link = new LinkProject();
        link.add(0,23);
        link.add(0,45);
        link.add(1,85);
        link.display();
        link.clear(2);
        link.display();
        link.getPos(2);
        link.search(85);
    }
}

/**
 * Author : Zhang Zhe
 */
class LinkedNode{
    public int date = 0;
    public LinkedNode next = null;

    public LinkedNode(int date){
        this.date=date;
    }
}
public class LinkedList {
    //链表的头结点（第一个节点），有了这个头结点之后
    //就可以根据next把所有的剩下的元素都获取到
    private LinkedNode head = null;
    //1.插头法
    public void addFirst(int elem){
        //先创建一个节点，让这个节点的值是elem
        LinkedNode node = new LinkedNode(elem);
        if(this.head==null){
            //空链表的情况
            this.head = node;
            return;
        }
        //链表不为空的情况，需要把新的节点放到开始的位置上
        node.next = head;
        this.head = node;
        return;
    }

    //2.尾插法
    public void addLast(int elem){
        LinkedNode node = new LinkedNode(elem);
        //链表为空的情况
        if(this.head==null){
            this.head=node;
            return;
        }
        //链表不为空的情况
        //先找到最后一个节点cur
        LinkedNode cur = this.head;
        while(cur.next !=null){
            cur = cur.next;
        }
        cur.next = node;
    }

    //普通插入
    public void addIndex(int index,int elem){
        LinkedNode node = new LinkedNode(elem);
        int len = size();
        //1.先对pos进行一个合法的效验，需要知道链表的长度
        if(index<0||index>len){
            return;
        }
        //2.处理头插情况
        if(index==0){
            addFirst(elem);
            return;
        }
        //3.尾插
        if(index==len){
            addLast(elem);
            return;
        }
        //4.处理插入中间位置的情况
        //需要找到插入位置前面一个节点
        LinkedNode prv = getIndexPos(index-1);
        //注意这里已经找到了插入位置的前一个节点
        //但是我们要先进行
        node.next = prv.next;
        //再进行
        prv.next = node;
    }
    private LinkedNode getIndexPos(int index){
        LinkedNode cur = this.head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
    }
    //4.查找是否包含关键字key在链表中存在
    public boolean contains(int toFind){
        //直接遍历链表，依次比较每个元素
        for(LinkedNode cur = this.head;cur != null;cur = cur.next){
            if(cur.date==toFind){
                return true;
            }
        }
        return false;
    }
    //5.删除第一个出现关键字key的节点
    public void remove(int toRemove){
        //1.先单独处理一下空链表的情况
        if(head==null){
            return;
        }
        //先考虑删除的节点是否是头节点
        if(head.date==toRemove){
            this.head=this.head.next;
            return;
        }
        //3.删除中间的节点，找到要删除的元素的前一个元素
        LinkedNode prev = searchPrev(toRemove);
        //prev.next=prev.next.next;
        LinkedNode prevNext = prev.next;
        prev.next=prevNext.next;
    }
    private  LinkedNode searchPrev(int toRemove){
        LinkedNode prev = this.head;
        while(prev.next !=null){
            if(prev.next.date == toRemove){
                return prev;
            }
            prev = prev.next;
        }
        //返回null表示没有找到元素toRemove
        return null;
    }
    //6.得到链表的长度
    public int size(){
        int count = 0;
        for(LinkedNode cur = head;cur !=null;cur =cur.next){
            count++;
        }
        return count;
    }


    public void display(){
        //打印链表中的所有元素
        System.out.println("[");
        for(LinkedNode node=this.head;node != null;node=node.next){
            System.out.println(node.date);
            if(node.next!=null){
                System.out.println(",");
            }
        }
        System.out.println("]");
    }
}

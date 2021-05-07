package pojo;

public class ListNode {
    //默认创建头节点
    static ListNodePojo head=new ListNodePojo(0,"");

    //获取头节点
    public ListNodePojo getHead(){
        return head;
    }

    //在末尾添加节点
    public void add(ListNodePojo listNodePojo){
        ListNodePojo temp=head;
        while (true){
            if (temp.next==null){
                temp.next=listNodePojo;
                break;
            }
            temp=temp.next;
        }
    }

    //修改节点
    public void update(ListNodePojo listNodePojo){
        //如果只有一个头节点，那么直接退出，不能修改头节点，用户不能修改id==0的节点
        if (head.next==null){
            return;
        }
        ListNodePojo temp= head.next;
        while (true){
            if (temp.id==listNodePojo.id){
                temp.name=listNodePojo.name;
            }
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
    }
    //删除节点
    public void deal(int a){
        ListNodePojo temp=head;
        boolean b=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.id==a){
                b=true;
                break;
            }
            temp=temp.next;
        }
        if (b){
            temp.next=temp.next.next;
        }
    }

    //打印
    public void show(){
        System.out.println(head.next);
    }

}


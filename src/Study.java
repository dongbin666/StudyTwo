public class Study {
    public static void main(String[] args) {
        System.out.println(calmat(9));
        calmatprint(20);
        /*ListNode listNode=new ListNode();
        listNode.add(new ListNodePojo(1,"刘备"));
        listNode.add(new ListNodePojo(2,"关羽"));
        listNode.add(new ListNodePojo(3,"张飞"));
        listNode.deal(0);
        listNode.update(new ListNodePojo(2,"吕布"));

        listNode.show();*/
    }

    public static long calmat(int a){
        if (a<1){
            return 0;
        }
        if (a==1){
            return 1l;
        }
        long result=0;
        result=a*calmat(a-1);
        return result;
    }
    public static void calmatprint(int a){
        if (a<1){
            return;
        }
        if (a==1){
            System.out.println(1);
            return;
        }
        System.out.print(a+"*");
        calmatprint(a-1);
    }
}

package LinkedList;
public class InsertUsingRecursion {
    LinkedList list;
    public void getInstance(LinkedList list) {
            this.list= list;
       }
        public void insert(int pos,LinkedList.Node val,LinkedList.Node head){
            LinkedList.Node temp=head;
       Helper(pos,val,temp,0);
       list.setSize();
    }

    private void Helper(int pos, LinkedList.Node val,LinkedList.Node temp,int i) {
            if(i==pos-1){
                val.next=temp.next;
                temp.next=val;
                return;
            }
            Helper(pos,val,temp.next,i+1);
    }
}

public class LL {
    Node head;
    private int size;
    LL()
    {
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void insertAtBegin(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtPos(String data, int pos){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteAtBegin(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAtPos(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(pos==1){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void Traverse(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtBegin("A");
        list.insertAtBegin("B");
        list.insertAtEnd("C");
        list.insertAtEnd("D");
        list.insertAtPos("E", 3);
        list.Traverse();
        list.deleteAtBegin();
        list.deleteAtEnd();
        list.deleteAtPos(2);
        list.Traverse();
        System.out.println("Size of list is: "+list.getSize());

    }
}
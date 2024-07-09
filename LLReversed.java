class LLReversed 
{
    Node reverseList(Node head)
    {
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        LLReversed obj = new LLReversed();
        Node newHead = obj.reverseList(head);
        while(newHead!=null)
        {
            System.out.print(newHead.data+" ");
            newHead = newHead.next;
        }
    }
}
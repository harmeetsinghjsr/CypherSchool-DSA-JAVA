class Intersect
{
    int intersectPoint(Node head1, Node head2)
    {
        int len1 = 0;
        int len2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;
    
        while(temp1!=null)
        {
            temp1=temp1.next;
            len1++;
        }
    
        while(temp2!=null)
        {
            temp2=temp2.next;
            len2++;
        }
    
        int diff = 0;
    
        if(len1>len2)
        {
            temp1 = head1;
            temp2 = head2;
            diff = len1 - len2;
        }
        else
        {
            temp1 = head1;
            temp2 = head2;
            diff = len2 - len1;
        }
    
        for(int i=0;i<diff;i++)
        {
            temp1=temp1.next;
        }
    
        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2) return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return -1; // Add a return statement here
    }
    public static void main(String[] args) {
        Intersect intersect = new Intersect();
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        Node head2 = new Node(6);
        head2.next = new Node(7);
        head2.next.next = new Node(8);
        System.out.println(intersect.intersectPoint(head1, head2));
    }
}
public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null) 
        return new Node(val);
        if(val<root.data) 
        root.left = insert(root.left,val);
        else if(val>root.data) 
        root.right = insert(root.right,val);
        return root;
    }
    public static void traverse(Node root){
        if(root==null) return;
        traverse(root.left);
        System.out.print(root.data+" ");
        traverse(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void search(Node root,int key){
        if(root==null) 
        {
            System.out.println("Not Found");
            return;
        }
        if(root.data==key) 
        {
            System.out.println("Found");
            return;
        }
        if(key<root.data) 
        search(root.left,key);
        else 
        search(root.right,key);
        }
        public static void delete(Node root,int key){
            if(root==null) 
            {
                System.out.println("Not Found");
                return;
            }
            if(root.data==key) 
            {
                System.out.println("Found");
                return;
            }
            if(key<root.data) 
            search(root.left,key);
            else 
            search(root.right,key);
            }
    public static void main(String[] args) {
        Node root = new Node(10);
        insert(root,5);
        insert(root,15);
        insert(root,7);
        insert(root,19);
        insert(root,20);
        insert(root,3);
        insert(root,4);
        insert(root,1);
        traverse(root);
        System.out.println();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        search(root,7);
        search(root,8);
    }
}
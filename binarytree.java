public class binarytree {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    Node root;
    public void inorder(Node node){
        if(node==null){
            //System.out.println("Tree is empty");
            return;
        }
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public void preorder(Node node){
        if(node==null){
           // System.out.println("Tree is empty");
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){
        if(node==null){
            //System.out.println("Tree is empty");
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        binarytree tree=new binarytree();
        tree.root=new Node(5);
        tree.root.left=new Node(4);
        tree.root.right=new Node(6);
        
       // tree.root.left.left=new Node(4);
       // tree.root.left.right=new Node(5);
        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}

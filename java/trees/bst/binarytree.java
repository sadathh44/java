package trees.bst;

import java.util.Scanner;

public class binarytree {
   private static class Node{
    Node left;
    Node right;
    int val;
    public Node(int val)
    {
        this.val=val;
    }
} 
private Node root;

   private void insertion(Scanner scanner)
   {
    System.out.println("Enter the root node");
    int val=scanner.nextInt();
    root=new Node(val);
    insertion( scanner, root);
   }
   private void insertion(Scanner scanner,Node node)
   {
    System.out.println("Do you want to insert to the left of "+node.val);
    boolean ch=scanner.nextBoolean();
    if(ch)
    {
        System.out.println("insert value to left of "+node.val);
        int val=scanner.nextInt();
        node.left=new Node(val);
        insertion(scanner,node.left);
    }
     System.out.println("Do you want to insert to the right of "+node.val);
    boolean ch2=scanner.nextBoolean();
    if(ch2)
    {
        System.out.println("insert value to right of "+node.val);
        int val=scanner.nextInt();
        node.right=new Node(val);
        insertion(scanner,node.right);
    }
  }

   private void display()
   {
    display(root,"");
   }
   private void display(Node node,String indent)
   {
    if(node==null)
    {
        return;
    }
    System.out.println(indent+node.val);
    display(node.left, indent+"\t");
        display(node.right , indent+"\t");

   }
   private void displaypretty()
   {
    displaypretty(root, 0);
   }
      private void displaypretty(Node node,int level)
   {
    if(node==null)
    {
        return;
    }
    displaypretty(node.right, level+1);
    if(level!=0)
    {
            for(int i=0;i<level-1;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->"+node.val);
    }else{
        System.out.println(node.val);
    }
    displaypretty(node.left, level+1);

   }
   public static void main(String[] args) {
    binarytree obj=new binarytree();
    Scanner scanner=new Scanner(System.in);
    obj.insertion(scanner);
    obj.displaypretty();
   }
}

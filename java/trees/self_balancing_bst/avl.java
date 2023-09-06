package trees.self_balancing_bst;
//avl trees, used to solve self balancing BST
//adelson vendi and landis

/*Rules:
 complexity: log(n)->for traversal + O(1) ->for rotation thereofre, total complexity O(logn)
 */

//binary search tree, good for unsorted, but if array is sorted then it will create 
//unbalanced tree
public class avl {

    public  class Node{
    private Node left;
  private  Node right;
   private int val;
   private int height;
    public Node(int val)
    {
        this.val=val;
    }
    public int getValue()
    {
        return val;
    }

} 
private Node root;

public int height(Node node)
{
    if(node==null)
    {
        return -1;
    }
    return node.height;

}

public boolean isEmpty()
{
    return root==null;
}
   public void populate(int[] arr)
   {
    for(int i=0;i<arr.length;i++)
    this.insert(arr[i]);
   }

   public void insert(int value)
   {
    root=insert(value,root);

}


   private Node insert(int val, Node node)
   {
    if(node==null)
    {
        node=new Node(val);
        return node;
    }
    if(val<node.val)
    {
        node.left=insert(val,node.left);
    }
     if(val>node.val)
    {
        node.right=insert(val,node.right);
    }
    node.height=Math.max(height(node.left),height(node.right))+1;
    return rotate(node);
   }
   private Node rotate(Node node) {
    if (height(node.left) - height(node.right) > 1) {
      // left heavy
      if(height(node.left.left) - height(node.left.right) > 0) {
        // left left case
        return rightRotate(node);
      }
      if(height(node.left.left) - height(node.left.right) < 0) {
        // left right case
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }

    if (height(node.left) - height(node.right) < -1) {
      // right heavy
      if(height(node.right.left) - height(node.right.right) < 0) {
        // right right case
        return leftRotate(node);
      }
      if(height(node.right.left) - height(node.right.right) > 0) {
        // left right case
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }

    return node;
  }

  public Node rightRotate(Node p) {
    Node c = p.left;
    Node t = c.right;

    c.right = p;
    p.left = t;
    
    p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return c;
  }

  public Node leftRotate(Node c) {
    Node p = c.right;
    Node t = p.left;

    p.left = c;
    c.right = t;
    
    p.height = Math.max(height(p.left), height(p.right) + 1);
    c.height = Math.max(height(c.left), height(c.right) + 1);

    return p;
  }


   public void display()
   {
    display(root,"Root Node: ");
   }
   private void display(Node node,String details)
   {
    if(node==null)
    {
        return;
    }
    //adjust the place of sysout to up mid and down to view pre order in order post order
    System.out.println(details+node.getValue());
    display(node.left, "Left child of " +node.getValue()+":");
    display(node.right , "Right child of " +node.getValue()+":");

   }
   public void preorder()
   {
    preorder(root);
   }
   private void preorder(Node node)
   {
    if(node==null)
    {
        return;
    }
    System.out.print(node.val+"->");
    preorder(node.left);
    preorder(node.right);

   }

      public void inorder()
   {
    inorder(root);
   }
   private void inorder(Node node)
   {
    if(node==null)
    {
        return;
    }
    inorder(node.left);
    System.out.print(node.val+"->");
    inorder(node.right);

   }

    public void postorder()
   {
    postorder(root);
   }
   private void postorder(Node node)
   {
    if(node==null)
    {
        return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.val+"->");

   }


public boolean balanced()
{
        return balanced(root);
}
private boolean balanced(Node node)
{
    if(node==null ) return true;
    return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    //balanced left and right functions means that for left and right check if its balanced
}
     public static void main(String[] args) {
    avl obj=new avl();
    int[] arr={1,2,3,4,5,6};

    //prolem comes here when the array is sorted one.
    // to solve his proble, consider the middle element of each array and then move ahead
    obj.populate(arr);
    obj.display();
    //complexity logn
    System.out.println(obj.balanced());
  
   }
}

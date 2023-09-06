package trees.bst;

//binary search tree, good for unsorted, but if array is sorted then it will create 
//unbalanced tree
public class bst {

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

public void insertSorted(int[] nums)
{
    insertSorted(nums,0,nums.length);
}
private void insertSorted(int[]  nums,int start,int end)
{
    if(start>=end)
    {
        return;
    }
    int mid=(start+end)/2;
    this.insert(nums[mid]);
    insertSorted(nums,start,mid);
    insertSorted(nums, mid+1, end);
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
    return node;
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
    bst obj=new bst();
    int[] arr={1,2,3,4,5,6};

    //prolem comes here when the array is sorted one.
    // to solve his proble, consider the middle element of each array and then move ahead
    obj.populate(arr);
    obj.display();
    //complexity logn
    System.out.println(obj.balanced());
    System.out.println("\nComparision\n");
        
    bst obj2=new bst();

    obj2.insertSorted(arr);
    //complexity n*logn
    obj2.display();
    //nothing but display preorder

    obj2.preorder();
    System.out.println();
    obj2.inorder();
    System.out.println();
    obj2.postorder();
   }
}

package binarysearchtree;

public class BinarySearchTree

{

     // declare the required variables

     private Node root;

     public BinarySearchTree()

     {

          root = null;

     }

     // method to call s method to insert the value into a tree

     public void insert(String strvalue)

     {

          root = insert(root, strvalue);

     }

     // method to insert the value into a tree

     public Node insert(Node nd, String strvalue)

     {

          if (nd == null) nd = new Node(strvalue);

          else

          {

              if (strvalue.compareTo(nd.NDdata) < 0)

            	  nd.NDleft = insert(nd.NDleft, strvalue);

              else if(strvalue.compareTo(nd.NDdata) > 0)

            	  nd.NDright = insert(nd.NDright,strvalue);

              else if(strvalue.compareTo(nd.NDdata) == 0)

            	  nd.strfrequency++;

          }

          return nd;

     }

     // method to call a method to perform the data search from a tree and print the result

     public void search(String NDdata)

     {

          Node NDr = root;

          boolean found = search(NDr, NDdata);

if(found == true) System.out.println("Element: " + NDdata + " found");

else System.out.println("Element: " + NDdata + " not found");

     }

  

     // method to search the data from a tree

     private boolean search(Node NDr, String NDdata)

     {

          boolean found = false;

          while((NDr != null) && !found)

          {

              String rval = NDr.NDdata;

              if (NDdata.compareTo(rval) < 0) NDr =

NDr.NDleft;

              else if (NDdata.compareTo(rval) > 0)

              NDr = NDr.NDright;

              else

              {

                   found = true;

                   break;

              }

              found = search(NDr, NDdata);

          }

          return found;

     }

  

// method to call a method to print the tree data in preorder format

     public void printPreOrder()

     {

          preOrder(root);

     }

  

     // method to print the tree data in preorder format

     private void preOrder(Node NDr)

     {

          if(NDr != null)

          {

              System.out.print(NDr.NDdata +" ");

              preOrder(NDr.NDleft);

              preOrder(NDr.NDright);

          }

     }

     // method to call a method to print the tree data in postorder format

     public void printPostOrder()

     {

          postOrder(root);      

     }

     // method to print the tree data in postorder format

     private void postOrder(Node NDr)

     {

          if(NDr != null)

          {

              preOrder(NDr.NDleft);

              preOrder(NDr.NDright);

              System.out.print(NDr.NDdata +" ");

          }

     }

     // method to call a method to print the tree data in order format

     public void printInOrder()

     {

          inOrder(root);

     }

     // method to print the tree data in inorder format

     private void inOrder(Node NDr)

     {

          if(NDr != null)

          {

              preOrder(NDr.NDleft);

              System.out.print(NDr.NDdata +" ");

              preOrder(NDr.NDright);

          }

     }

}
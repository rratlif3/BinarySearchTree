package binarysearchtree;
// Driver file for project 3.
// ITCS 2214 -- Professor Jugan

import java.util.Random;

public class TreeDemo {
   public static void main(String[] args){
   
      //Library of words to be added to the tree.
      String[] words = {"Amok", "Nirvana", "Levin", "Minotaur", "Naif", 
    		  			"Brevet", "Dehort", "Costive", "Boffin", "Hoyle", 
    		  			"Scion", "Pissoir", "Looby", "Kvell", "Redact", "Pi" };
                    
      // Initialize Random
      Random rand = new Random();
      
      // Initialize the Tree (make sure your tree class is named BinarySearchTree)
      BinarySearchTree myTree = new BinarySearchTree();  	
      
      // Loop to add items to the Tree
      for (int addLoop = 0; addLoop < 30; addLoop++)
      {    
         int r = rand.nextInt(16);
         System.out.println("Adding: " + words[r]);
         
         // Method call to the tree to insert nodes
         myTree.insert(words[r]);         					
      }
   
      // Start multiple searches
      System.out.println("---Searches---");             	
      myTree.search(words[rand.nextInt(16)]);   
      myTree.search(words[rand.nextInt(16)]);
      myTree.search(words[rand.nextInt(16)]);
      	
      // Print the tree using all
      System.out.println("---Printing---");
      
      // three types of order
      myTree.printPreOrder();                            	
      myTree.printInOrder();
      myTree.printPostOrder();
   }
}
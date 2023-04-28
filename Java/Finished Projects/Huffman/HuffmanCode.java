import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author praga
Algorithm for Huffman Coding :

Create a frequency table for each character in the input.
Create a priority queue and add each character along with its frequency to the queue.
While there is more than one node in the queue:
a. Remove the two nodes with the smallest frequency from the queue.
b. Combine the two nodes into a new node whose frequency is the sum of the frequencies of the two nodes.
c. Add the new node to the queue.
The remaining node in the queue is the root of the Huffman tree.
Traverse the Huffman tree to determine the code for each character:
a. Starting at the root of the tree, assign a "0" to every left branch and a "1" to every right branch.
b. When you reach a leaf node, the path from the root to the leaf represents the code for that character.

Output the codes for each character.
Note that this algorithm assumes that the input is a string of characters and their frequencies are already known. If the frequencies are not known, they must be computed in step 1. Additionally, the priority queue data structure is used to efficiently merge the nodes into the Huffman tree, but other data structures could be used instead.

You can watch the following video to understand (i didnot get more insight though) :https://www.youtube.com/watch?v=21_bJLB7gyU&t=424s
 */
public class HuffmanCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    System.out.print("Enter a text: ");
    String text = input.nextLine();
    
    int[] counts = getCharacterFrequency(text); // Count frequency

    System.out.printf("%-15s%-15s%-15s%-15s\n",
      "ASCII Code", "Character", "Frequency", "Code");  
    
    Tree tree = getHuffmanTree(counts); // Create a Huffman tree
    String[] codes = getCode(tree.root); // Get codes
        
    for (int i = 0; i < codes.length; i++)
      if (counts[i] != 0) // (char)i is not in text if counts[i] is 0
        System.out.printf("%-15d%-15s%-15d%-15s\n", 
          i, (char)i + "", counts[i], codes[i]);
  }
  
  /** Get Huffman codes for the characters 
   * This method is called once after a Huffman tree is built
   */
  public static String[] getCode(Tree.Node root) {
    String[] codes = new String[256]; // 256 ASCII characters
    assignCode(root, codes); // Recursively assign codes to the leaf nodes

    return codes;
  }

    /* Recursively get codes to the leaf node */
    private static void assignCode(Tree.Node root, String[] codes) {
      if (root.left != null) {
        root.left.code = root.code + "0"; // Append "0" to the code
        assignCode(root.left, codes);
        root.right.code = root.code + "1"; // Append "1" to the code
        assignCode(root.right, codes);
      } else {
        codes[(int) root.element] = root.code; // Assign the code to the character
      }
    }


      /** Get a Huffman tree from the codes */
  public static Tree getHuffmanTree(int[] counts) {
    // Create a priority queue to hold trees
    PriorityQueue<Tree> pq = new PriorityQueue<>();

    // Add trees to the priority queue
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 0) {
        pq.offer(new Tree(counts[i], (char)i));
      }
    }

// Merge trees until there is only one tree left in the priority queue
    while (pq.size() > 1) {
      Tree t1 = pq.poll();
      Tree t2 = pq.poll();
      pq.offer(new Tree(t1, t2));
    }

    return pq.remove(); // The final tree

  }
  
  /** Get the frequency of the characters */
  public static int[] getCharacterFrequency(String text) {
    int[] counts = new int[256]; // 256 ASCII characters

    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        counts[ch]++;
    }

    return counts;
}

  

  /** Define a Huffman coding tree */
public static class Tree implements Comparable<Tree> {
  Node root; // The root of the tree

  /** Create a tree with two subtrees */
  public Tree(Tree t1, Tree t2) {
    root = new Node();
    root.weight = t1.root.weight + t2.root.weight;
    root.left = t1.root;
    root.right = t2.root;
  }

  /** Create a tree containing a leaf node */
  public Tree(int weight, char element) {
    root = new Node(weight, element);
  }

  @Override /** Compare trees based on their weights */
  public int compareTo(Tree t) {
    if (root.weight < t.root.weight) // Purposely reverse the order
      return 1;
    else if (root.weight == t.root.weight)
      return 0;
    else
      return -1;
  }

  public class Node {
    char element; // Stores the character for a leaf node
    int weight; // weight of the subtree rooted at this node
    Node left; // Reference to the left subtree
    Node right; // Reference to the right subtree
    String code = ""; // The code of this node from the root

    /** Create an empty node */
    public Node() {
    }

    /** Create a node with the specified weight and character */
    public Node(int weight, char element) {
      this.weight = weight;
      this.element = element;
    }
  }
}  
 
}
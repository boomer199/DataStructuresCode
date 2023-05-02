import java.util.*;

public class Huffman {
    
    // Node class to represent a character and its frequency
    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left, right;
        
        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
        
        public int compareTo(Node node) {
            return this.freq - node.freq;
        }
    }
    
    // Function to calculate frequency of each character in the given string
    public static int[] getCharacterFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        return freq;
    }
    
    // Function to build Huffman tree and return the root node
    public static Node buildHuffmanTree(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        for (char i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                pq.add(new Node(i, freq[i]));
            }
        }
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        return pq.poll();
    }
    
    // Function to generate Huffman codes for each character in the tree
    public static void generateCodes(Node root, String code, String[] huffmanCode) {
        if (root == null) {
            return;
        }
        if (root.ch != '\0') {
            huffmanCode[root.ch] = code;
        }
        generateCodes(root.left, code + "0", huffmanCode);
        generateCodes(root.right, code + "1", huffmanCode);
    }
    
    // Function to compress the given string using Huffman coding
    public static String compress(String str, String[] huffmanCode) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(huffmanCode[str.charAt(i)]);
        }
        return sb.toString();
    }
    
    // Main function to test the implementation
    public static void main(String[] args) {
        String str = "missisipi";
        int[] freq = getCharacterFrequency(str);
        Node root = buildHuffmanTree(freq);
        String[] huffmanCode = new String[256];
        generateCodes(root, "", huffmanCode);
        
        System.out.println("ASCII Code\tCharacter\tFrequency\tCode");
        for (char i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((int) i + "\t\t" + i + "\t\t" + freq[i] + "\t\t" + huffmanCode[i]);
            }
        }
        
        String compressedStr = compress(str, huffmanCode);
        System.out.println("\nCompressed string: " + compressedStr);
    }
}

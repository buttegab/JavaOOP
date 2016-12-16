package net.gabriel.huffman;
import java.util.*;

public class Tree {
	PriorityQueue que = new PriorityQueue();
	private Node root;
//	public PriorityQueue createQueue(HashMap<Character, Integer> hist) {
//		
//	}
	
	
	public void setRoot(Node r) {
		root = r;
	}

	public Node getRoot() {
		return root;
	}
	
	class FreqCompare implements Comparator<Node>{
    	public int compare(Node one, Node two) { 
        	return one.getValue().compareTo(two.getValue());
     	}
   	}

   	public void sortByFreq(List<Node> leaves) {
   		FreqCompare sizeCompare = new FreqCompare();
   		Collections.sort(leaves, sizeCompare);
   	}
	
	
	public List<Node> printMap(Map mp) {
		List<Node> leaves = new ArrayList<Node>();
		Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        Leaf leaf = new Leaf((Integer)pair.getValue(),(char)pair.getKey());
	        leaves.add(leaf);
	        it.remove();
	    }
	    sortByFreq(leaves);
	    return leaves;
	}
	
	public Node createTree(List<Node> leaves) {
		//takes the ordered list of leaves and adds them in pairs from the 0 index as children.
		//take away the two leaves added from the list, add node object instead containing their sum
		while (leaves.size() > 1) {
			Integer size1 = leaves.get(0).getValue();
			Integer size2 = leaves.get(1).getValue();
			Node parent = new Node(size1 + size2);
			
			
			parent.addChildren(leaves.get(0),leaves.get(1));
	
			
			
			leaves.remove(0);
			leaves.remove(0);
			leaves.add(0,parent);
			sortByFreq(leaves);
			System.out.println(parent.getChildren());
			System.out.println(leaves);
		}
		
		
		return leaves.get(0);
	}
	
	public static void main(String[] args) {
		Reader reader = new Reader();
		Histogram h = new Histogram();
		h.count(reader.wordNumber("MyText.txt"));
		HashMap<Character, Integer> histogram = h.getHist();
		Tree tree = new Tree();
//		System.out.println(tree.printMap(histogram));
		List<Node> leaves = tree.printMap(histogram);
		tree.setRoot(tree.createTree(leaves));
		System.out.println(tree.getRoot());
		
	}

}

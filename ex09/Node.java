package net.gabriel.huffman;
import java.util.*;

public class Node implements Comparable<Node>{
	private List<Node> children = new ArrayList<Node>();
	private Integer val;
	
	
	public Node(Integer value) {
		this.val = value;
		System.out.println("creating Node");
	}
	
	public int compareTo(Node l) {
		Integer freq = this.getValue();
		return freq.compareTo((Integer)l.getValue());
	}

	
	public String toString() {
		return val.toString();
	}
	
	public void addChildren(Node child1, Node child2) {
		children.add(0,child1);
		children.add(1, child2);
	}
	
	public List<Node> getChildren() {
		return children;
	}
	
	public void setValue(Integer value) {
		val = value;
	}
	
	public Integer getValue() {
		return val;
	}
	
	
	public static void main(String[] args) {
		Node parent = new Node(10);
		Node child1 = new Node(4);
		Node child2 = new Node(6);
		parent.setValue(10);
		child1.setValue(4);
		child2.setValue(6);
		parent.addChildren(child1,child2);
		List<Node> childs = parent.getChildren();
		System.out.println(childs.get(0).getValue());
		System.out.println("should be: 4");
		System.out.println(childs);
		System.out.println("should be: [4, 6]");
		System.out.println(parent.getValue());
		System.out.println("should be: 10");

	}

}

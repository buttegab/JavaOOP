package net.gabriel.huffman;

public class Leaf extends Node {
	private char character;
	
	public Leaf(Integer value, char c) {
		super(value);
		character = c;
	}
	
	public String toString() {
		return character + ": " + this.getValue().toString();
	}
	
	public int compareTo(Leaf l) {
		Integer freq = this.getValue();
		return freq.compareTo((Integer)l.getValue());
	}
	
	public void addChildren(Node child1, Node child2) {
		System.out.println("Leaf object cannot have children Nodes");
	}
	
	public void getChildren() {
		System.out.println("Leaf object cannot have children Nodes");
	}
	
	public void setChar(char c) {
		character = c;
	}
	
	public char getChar() {
		return character;
	}


	public static void main(String[] args) {
		Leaf leaf = new Leaf(4,'c');
		System.out.println(leaf.getChar());

	}

}

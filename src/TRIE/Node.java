package TRIE;

public class Node {
	public static final int ALPHABETS = 26;
	private Node[] children = new Node[ALPHABETS];
	private char character;
	private boolean isFinal;
	
	Node(char ch) {
		character = ch;
		for(int i = 0; i < ALPHABETS; ++i) {
			children[i] = null;
		}
		isFinal = false;
	}
	
	public boolean isParent(char ch) {
		return children[ch - 'a'] != null;
	}
	
	public char getCharacter() {
		return character;
	}
	
	public void setChild(Node node) {
		int index = node.getCharacter() - 'a';
		children[index] = node;
	}
	
	public Node getChild(char ch) {
		int index = ch - 'a';
		return children[index];
	}
	
	public Node getChild(int i) {
		return children[i];
	}
	
	public void setFinal() {
		isFinal = true;
	}
	
	public boolean isFinal() {
		return isFinal;
	}
	
	public boolean isExternal() {
		boolean flag = true;
		for(int i = 0; i < ALPHABETS; ++i) {
			if(children[i] != null) {
				flag = false;
			}
		}
		return flag;
	}
	
	public Node getNextChild(int it) {
		for(int i = it+1; i < ALPHABETS; ++i) {
			if(children[i] != null) {
				return children[i];
			}
		}
		return null;
	}
	
	public boolean hasThisChild(int i) {
		return children[i] != null;
	}
	
}

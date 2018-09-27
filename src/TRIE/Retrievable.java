package TRIE;

public interface Retrievable {
	int size();
	boolean isEmpty();
	void insertString(String str, int it, Node node);
	boolean searchString(String key,int it, Node node);
	void printStrings(Node node);
}

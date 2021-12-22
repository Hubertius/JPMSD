package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SearchTree searchTree = new SearchTree(null);
        String text = "5 7 3 2 1 0";;
        String [] data = text.split(" ");
        for(String partOfData: data) {
            searchTree.addItem(new Node(partOfData));
        }
        searchTree.traverse(searchTree.getRoot());
        System.out.println();
        searchTree.removeItem(new Node("2"));
        System.out.println();
        searchTree.traverse(searchTree.getRoot());
        searchTree.removeItem(new Node("5"));
        System.out.println();
        searchTree.traverse(searchTree.getRoot());


    }
}

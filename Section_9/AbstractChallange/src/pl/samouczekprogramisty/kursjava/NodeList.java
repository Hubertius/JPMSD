package pl.samouczekprogramisty.kursjava;

public interface NodeList {
    // write code here
    ListItem getRoot();
    boolean addItem(ListItem itemToAdd);
    boolean removeItem(ListItem itemToRemove);
    void traverse(ListItem startRoot);
}
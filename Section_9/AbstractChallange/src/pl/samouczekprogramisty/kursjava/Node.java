package pl.samouczekprogramisty.kursjava;

public class Node extends ListItem {
    // write code here
    public Node(Object valueToInit) {
        super(valueToInit);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem newRightLink) {
        if (newRightLink == null) {
            return this.rightLink;
        }
        this.rightLink = newRightLink;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem newLeftLink) {
        if (newLeftLink == null) {
            return this.leftLink;
        }
        this.leftLink = newLeftLink;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem itemToCompare) {
        if(itemToCompare == null) {
            return -1;
        }
        return ((String) this.value).compareTo((String) itemToCompare.value);
    }
}
package pl.samouczekprogramisty.kursjava;

public abstract class ListItem {
    // write code here
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object valueToInit) {
        this.value = valueToInit;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem newRightLink);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem newLeftLink);
    abstract int compareTo(ListItem itemToCompare);

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object newValue) {
        if(newValue == null) {
            return;
        }
        this.value = newValue;
    }


}
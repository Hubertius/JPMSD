package pl.samouczekprogramisty.kursjava;

public class MyLinkedList implements NodeList {
    // write code here
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem itemToAdd) {

        if(this.root == null) {
            this.root = itemToAdd;
            return true;
        }
        ListItem tempItem = this.root;
        while(tempItem != null) {
            int compare = tempItem.compareTo(itemToAdd);
            if(compare < 0) {
                if(tempItem.next() != null) {
                    tempItem = tempItem.next();
                } else {
                    tempItem.setNext(itemToAdd);
                    itemToAdd.setPrevious(tempItem);
                    return true;
                }
            } else if(compare > 0) {
                if(tempItem.previous() != null) {
                    tempItem.previous().setNext(itemToAdd).setPrevious(tempItem.previous());
                    itemToAdd.setNext(tempItem).setPrevious(itemToAdd);
                } else {
                    itemToAdd.setNext(this.root).setPrevious(itemToAdd);
                    this.root = itemToAdd;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        ListItem tempItem = this.root;
        while(tempItem != null) {
            int compare = tempItem.compareTo(itemToRemove);
            if(compare == 0) {
                if(tempItem == this.root) {
                    this.root = tempItem.next();
                } else {
                    tempItem.previous().setNext(tempItem.next());
                    if (tempItem.next() != null) {
                        tempItem.next().setPrevious(tempItem.previous());
                    }
                }
                return true;
            } else if(compare < 0) {
                tempItem = tempItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem startRoot) {
        ListItem itrItem = startRoot;
        if(itrItem == null) {
            System.out.println("The list is empty");
            return;
        }
        while(itrItem != null) {
            System.out.println(itrItem.getValue());
            itrItem = itrItem.next();
        }
    }
}
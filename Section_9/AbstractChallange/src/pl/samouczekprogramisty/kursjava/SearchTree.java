package pl.samouczekprogramisty.kursjava;

public class SearchTree implements NodeList {
    // write code here

    private ListItem root = null;

    public SearchTree(ListItem root) {
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
                    return true;
                }
            } else if(compare > 0) {
                if(tempItem.previous() != null) {
                    tempItem = tempItem.previous();
                } else {
                    tempItem.setPrevious(itemToAdd);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if(itemToRemove == null) {
            return false;
        }
        if(this.root == null) {
            return false;
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;
        while(currentItem != null) {
            int compare = currentItem.compareTo(itemToRemove);
            if(compare < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if(compare > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;

    }

    @Override
    public void traverse(ListItem startRoot) {
        if(startRoot == null) {
            System.out.println("The list is empty!");
            return;
        }
        if(startRoot.previous() != null) {
            traverse(startRoot.previous());
        }
        System.out.println(startRoot.getValue());
        if(startRoot.next() != null)  {
            traverse(startRoot.next());
        }
    }


    private void performRemoval(ListItem item, ListItem parentItem) {
        if(item.next() == null) {
            if(parentItem.previous() == item) {
                parentItem.setNext(item.previous());
            } else if(parentItem.next() == item) {
                parentItem.setPrevious(item.next());
            } else {
                this.root = item.previous();
            }
        } else if(item.previous() == null) {
            if(parentItem.next() == item) {
                parentItem.setNext(item.next());
            } else if(parentItem.previous() == item) {
                parentItem.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while(current != null) {
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());

            if(leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }



}

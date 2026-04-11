public class Main {
    public static void main(String[] args) {

        /* Data Structures with Abstract Classes: Linked Lists & Binary Search Trees
        Implement the following:
            1.  ListItem (abstract class)
                -  It has three protected fields. Two ListItems called rightLink and leftLink, and an Object called value.
                -  A constructor that takes an Object and initialises the field value with the parameter that was passed in.
                -  And seven methods:
                    -  next(), setNext(), previous(), setPrevious() and compareTo() which are package-private and abstract (see child class for declaration).
                    -  getValue(), takes no parameters and returns its value.
                    -  setValue(), takes an Object and assigns it to value.

            2.  Node (concrete class)
                -  It extends ListItem.
                -  It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
                -  And five methods which are package-private:
                    -  next(), takes no parameters and returns the ListItem to its right.
                    -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
                    -  previous(), takes no parameters and returns the ListItem to its left.
                    -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
                    -  compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison. If this value
                    is greater than the value that was passed in, then it should return a number greater than zero. If vice versa, then it should return a number
                    less than zero, and zero if equal.

            3.  MyLinkedList (concrete class)
                -  It implements NodeList.
                -  It has one field of type ListItem called root.
                -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
                -  And four methods:
                    -  getRoot(), getter for root.
                    -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise. If the item is already present, it doesn't get added.
                    Use compareTo() to place the item in its proper order.
                    -  removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
                    -  traverse(), takes the root as an argument and does not return anything. If the root is null it prints out: The list is empty, otherwise print each
                    value on a separate line.

             4.  NodeList (interface)
                -  It has four methods:
                -  getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).

             5.  SearchTree (concrete class)
                -  It implements NodeList.
                -  It has one field of type ListItem called root.
                -  A constructor that takes a ListItem and initialises the field root with the newly passed in parameter.
                -  And five methods:
                    -  getRoot(), getter for root.
                    -  addItem(), similar to MyLinkedList. See second TIP below.
                    -  removeItem(), same as MyLinkedList
                    -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't return anything and is declared as private. Call this method
                    from removeItem() when the item is found.
                    -  traverse(), takes the root as an argument and does not return anything. It uses recursion to visit all the branches in the tree (Inorder). Print each
                    value on a separate line.

        */

        // Test with MyLinkedList
        System.out.println("=== Testing MyLinkedList ===");
        NodeList list = new MyLinkedList(null);
        list.addItem(new Node("Banana"));
        list.addItem(new Node("Apple"));
        list.addItem(new Node("Pear"));
        list.addItem(new Node("Grape"));
        list.addItem(new Node("Orange"));
        list.addItem(new Node("Apple")); // duplicated, won't be added

        System.out.println("List after adding:");
        list.traverse(list.getRoot());

        // Removing an item
        list.removeItem(new Node("Pear"));
        System.out.println("\nList after removing 'Pear':");
        list.traverse(list.getRoot());

        // Removing an item that doesn't exist
        list.removeItem(new Node("Watermelon"));

        // Test with SearchTree
        System.out.println("\n=== Testing SearchTree ===");
        NodeList tree = new SearchTree(null);
        tree.addItem(new Node("Banana"));
        tree.addItem(new Node("Apple"));
        tree.addItem(new Node("Pear"));
        tree.addItem(new Node("Grape"));
        tree.addItem(new Node("Orange"));
        tree.addItem(new Node("Apple")); // duplicated, won't be added

        System.out.println("Tree after adding:");
        tree.traverse(tree.getRoot());

        // Removing an item
        tree.removeItem(new Node("Pear"));
        System.out.println("\nTree after removing 'Pear':");
        tree.traverse(tree.getRoot());

        // Removing root
        tree.removeItem(new Node("Banana"));
        System.out.println("\nTree after removing root ('Banana'):");
        tree.traverse(tree.getRoot());
    }

    /* OUTPUT:
    === Testing MyLinkedList ===
    List after adding:
    Apple
    Banana
    Grape
    Orange
    Pear
    Deleting item Pear

    List after removing 'Pear':
    Apple
    Banana
    Grape
    Orange
    Deleting item Watermelon

    === Testing SearchTree ===
    Apple is already present
    Tree after adding:
    Apple
    Banana
    Grape
    Orange
    Pear
    Deleting item Pear

    Tree after removing 'Pear':
    Apple
    Banana
    Grape
    Orange
    Deleting item Banana

    Tree after removing root ('Banana'):
    Apple
    Grape
    Orange
    */
}
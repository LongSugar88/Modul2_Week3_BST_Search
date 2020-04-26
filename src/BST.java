public class BST<T extends Comparable> {
    private Node<T> root;
    private int size;

    BST(){

    }

    public boolean insert(T element){
        Node<T> parrent = null;
        Node<T> current = root;

        if(root == null){
            root = new Node<>(element);
            size++;
            return true;
        } else {
            while (current != null){
                if(current.data.compareTo(element) > 0){
                    parrent = current;
                    current = current.left;
                } else if(current.data.compareTo(element) < 0){
                    parrent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if(parrent.data.compareTo(element) > 0){
                parrent.left = new Node<>(element);
            } else {
                parrent.right = new Node<>(element);
            }
            size++;
            return true;
        }
    }
    public boolean search(T element){
        return search(root, element);
    }
    private boolean search(Node<T> root, T element) {
        Node<T> current = root;
        if (root.data == null) {
            System.out.println("false");
            return false;
        }
        if (root.data == element) {
            System.out.println("true");
            return true;
        } else if (current.data.compareTo(element) > 0) {
            return search(current.left, element);
        } else if (current.data.compareTo(element) < 0) {
            return search(current.right, element);
        }
        return false;
    }

}

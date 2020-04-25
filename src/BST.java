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
        Node<T> current = root;
        if(root.data == element){
            return true;
        } else {
            while (current != null){
                if(current.data.compareTo(element) == 0 ){
                    return true;
                } else if(current.data.compareTo(element) < 0 ){
                    current = current.right;
                } else if(current.data.compareTo(element) > 0){
                    current = current.left;
                }
            }
            return false;
        }

    }
}

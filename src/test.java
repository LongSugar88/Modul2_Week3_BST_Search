public class test {
    public static void main(String[] args) {
        BST<Integer> myTree = new BST<>();
        myTree.insert(60);
        myTree.insert(55);
        myTree.insert(100);
        myTree.insert(45);
        myTree.insert(57);
        myTree.insert(67);
        myTree.insert(107);
        myTree.insert(59);
        myTree.insert(101);

        System.out.println("-----------------------");
        System.out.println(myTree.search(101));
        System.out.println("-----------------------");
    }
}

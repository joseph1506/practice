package practice.datastructure;

public class TestBinaryTree {


    public static void main(String[] args) {
        BinaryTree tree= new BinaryTree();

        tree.insert(100);
        tree.insert(50);
        tree.insert(120);
        tree.insert(20);
        tree.insert(60);
        tree.insert(110);
        tree.insert(130);
        tree.insert(10);
        tree.insert(30);
        tree.insert(55);
        tree.insert(70);
        /*tree.traverse(TraverseOrder.IN_ORDER);
        System.out.println("=========================================");
        tree.traverse(TraverseOrder.PRE_ORDER);
        System.out.println("=========================================");
        tree.traverse(TraverseOrder.POST_ORDER);*/
        /*System.out.println("Minimum------>"+tree.getMinimumValue());
        System.out.println("Maximum------>"+tree.getMaximumValue());*/
        Node nodeFound=tree.find(130);
        System.out.println("Node found--->"+nodeFound.value);
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        Node<Integer> node = new Node(80);
        Node<Integer> node1 = new Node(95);
        Node<Integer> node2 = new Node(110);
        Node<Integer> node3 = new Node(90, node, node1);
        Node<Integer> node4 = new Node(120, node2, null);
        Node<Integer> root = new Node(100, node3, node4);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Pre Order Result ");
        System.out.println(binaryTree.preOrder(root));
        System.out.println("\n In Order Result");
        System.out.println(binaryTree.inOrder(root));
        System.out.println("\n Post Order Result");
        System.out.println(binaryTree.postOrder(root));
        System.out.println("\n Binary Search Tree");
        System.out.println("\n Add method");
        Integer addValue=140;
        BinarySearchTree binarySearchTreeAdd = new BinarySearchTree(root);
        binarySearchTreeAdd.add(addValue);
        System.out.println(binarySearchTreeAdd.inOrder(root));
        System.out.println("\n Contains method");
        Integer searchValue = 100;
        BinarySearchTree binarySearchTreeContains = new BinarySearchTree(root);
        System.out.println("Is the tree contains " + searchValue + " ? the result is : "
                + binarySearchTreeContains.contains(searchValue));
        System.out.println("\n Tree max");
//        System.out.println(binaryTree.treeMax(root));

        System.out.println("breadth first");
        System.out.println(binaryTree.breadthFirst(root));

        KTree ktree = new KTree();
        NodeK root0 = new NodeK("24");
        NodeK node10 = new NodeK("15");
        NodeK node20 = new NodeK("20");
        NodeK node30 = new NodeK("65");
        NodeK node40 = new NodeK("30");
        NodeK node50 = new NodeK("555");
        NodeK node60 = new NodeK("18");

        ktree.root = root0;
        root0.children.add(node10);
        root0.children.add(node20);
        node10.children.add(node30);
        node20.children.add(node40);
        node20.children.add(node50);
        node20.children.add(node60);

        System.out.println("fizzBuzz");
        System.out.println(ktree.fizzBuzz(root0));

    }
}

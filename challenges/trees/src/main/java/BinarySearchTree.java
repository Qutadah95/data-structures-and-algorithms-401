public class BinarySearchTree<T> extends BinaryTree {
    private Node<Integer> root;
    private boolean exist=false;

    public BinarySearchTree(Node root) {
        this.root = root;
    }


    public void add(T value){
        Node newNode=new Node(value);

    }
//    if( value <  root.getValue()){
//            if(root.getLeftChild()!=null){
//                root=root.getLeftChild();
//                add(value);
//            }
//            else {
//                root.setLeftChild(newNode);
//            }
//        }
//        else if( value >  root.getValue()){
//            if(root.getRightChild()!=null){
//                root=root.getRightChild();
//                add(value);
//            }
//            else {
//                root.setRightChild(newNode);
//            }
//        }

    public boolean contains(T value) {
        containsMethod(value);
        return this.exist;
    }
    public void containsMethod(T value){
        if (root == null) {
            this.exist=false;
            return;
        }else if (root.getValue()==value){
            this.exist=true;
            return;
        }
    }
    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", isItExist=" + exist +
                ", preOrderArray=" + preOrder +
                ", inOrderArray=" + inOrder +
                ", postOrderArray=" + postOrder +
                '}';
    }
}
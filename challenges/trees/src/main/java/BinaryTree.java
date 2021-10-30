import java.util.ArrayList;

public class BinaryTree {
    ArrayList<Object> preOrder=new ArrayList<>();
    public ArrayList<Object> preOrder(Node root){
        if(root!=null){
            preOrder.add(root.getValue());
            preOrder(root.getLeftChild());
            preOrder(root.getRightChild());

        }
        return preOrder;
    }
    ArrayList <Object> inOrder=new ArrayList<>();
    public ArrayList<Object> inOrder(Node root){
        if(root!=null){
            inOrder(root.getLeftChild());
            inOrder.add(root.getValue());
            inOrder(root.getRightChild());
        }
        return inOrder;
    }
    ArrayList <Object> postOrder=new ArrayList<>();
    public ArrayList<Object> postOrder(Node root){
        if(root!=null){
            postOrder(root.getLeftChild());
            postOrder(root.getRightChild());
            postOrder.add(root.getValue());
        }
        return postOrder;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "preOrder=" + preOrder +
                ", inOrder=" + inOrder +
                ", postOrder=" + postOrder +
                '}';
    }
}

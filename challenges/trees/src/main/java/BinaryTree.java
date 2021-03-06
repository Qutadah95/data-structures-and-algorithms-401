import java.util.ArrayList;

public class BinaryTree {
    ArrayList <Object> preOrder=new ArrayList<>();
    public ArrayList<Object> preOrder(Node root){
        if(root!=null){
            preOrder.add(root.getValue());
            if (root.getLeftChild()!=null){
                preOrder(root.getLeftChild());
            }
            if (root.getRightChild()!=null){
                preOrder(root.getRightChild());
            }
        }
        return preOrder;
    }
    ArrayList <Object> inOrder=new ArrayList<>();
    public ArrayList<Object> inOrder(Node root){
        if(root!=null){
            if (root.getLeftChild()!=null){
                inOrder(root.getLeftChild());
            }
            inOrder.add(root.getValue());

            if (root.getRightChild()!=null){
                inOrder(root.getRightChild());
            }
        }
        return inOrder;
    }
    ArrayList <Object> postOrder=new ArrayList<>();
    public ArrayList<Object> postOrder(Node root){
        if(root!=null){
            if (root.getLeftChild()!=null){
                postOrder(root.getLeftChild());
            }
            if (root.getRightChild()!=null){
                postOrder(root.getRightChild());
            }
            postOrder.add(root.getValue());
        }
        return postOrder;
    }
    int max=0;
    public int treeMax(Node root){
        if(root!=null){
            if ((int)root.getValue()>max){
                max=(int)root.getValue();
            }
            if (root.getLeftChild()!=null){
                treeMax(root.getLeftChild());
            }
            if (root.getRightChild()!=null){
                treeMax(root.getRightChild());
            }
        }
        return max;
    }

    ArrayList <Object> breadthFirstArr=new ArrayList<>();

    public ArrayList breadthFirst(Node root){
        if (root!=null){

            Queue<Node> breath=new Queue();
            breath.enqueue(root);
            while (breath.peek()!=null){
                Node front=  breath.dequeue();
                breadthFirstArr.add(front.getValue());
                if (front.getLeftChild() !=null)
                    breath.enqueue(front.getLeftChild());
                if (front.getRightChild() !=null)
                    breath.enqueue(front.getRightChild());

            }
            return breadthFirstArr;
        }
        else return null;
    }
    @Override
    public String toString() {
        return "BinaryTree{" +
                "preOrderArray=" + preOrder +
                ", inOrderArray=" + inOrder +
                ", postOrderArray=" + postOrder +
                '}';
    }
}

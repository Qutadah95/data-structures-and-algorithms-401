package TreeIntersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());




        BinaryTree<Integer> treeOne = new BinaryTree<>();
        treeOne.setRoot(new Node<>(150));
        treeOne.getRoot().setRight(new Node<>(250)) ;
        treeOne.getRoot().setLeft(new Node<>(100));
        treeOne.getRoot().getRight().setRight(new Node<>(350));
        treeOne.getRoot().getRight().getRight().setRight(new Node<>(500));
        treeOne.getRoot().getRight().getRight().setLeft(new Node<>(300));
        treeOne.getRoot().getRight().setLeft(new Node<>(200)) ;
        treeOne.getRoot().getLeft().setLeft(new Node<>(75))  ;
        treeOne.getRoot().getLeft().setRight(new Node<>(160));
        treeOne.getRoot().getLeft().getRight().setLeft(new Node<>(125)) ;
        treeOne.getRoot().getLeft().getRight().setRight(new Node<>(175));




        BinaryTree<Integer> treeTwo = new BinaryTree<>();
        treeTwo.setRoot(new Node<>(42));
        treeTwo.getRoot().setRight(new Node<>(600)) ;
        treeTwo.getRoot().setLeft(new Node<>(100));
        treeTwo.getRoot().getRight().setRight(new Node<>(350));
        treeTwo.getRoot().getRight().getRight().setRight(new Node<>(500));
        treeTwo.getRoot().getRight().getRight().setLeft(new Node<>(4));
        treeTwo.getRoot().getRight().setLeft(new Node<>(200)) ;
        treeTwo.getRoot().getLeft().setLeft(new Node<>(15))  ;
        treeTwo.getRoot().getLeft().setRight(new Node<>(160));
        treeTwo.getRoot().getLeft().getRight().setLeft(new Node<>(125)) ;
        treeTwo.getRoot().getLeft().getRight().setRight(new Node<>(175));


        System.out.println(treeIntersection(treeOne, treeTwo).toString());



    }





    public static HashSet treeIntersection(BinaryTree treeOne, BinaryTree treeTwo){

        List listOne=treeOne.inOrder(treeOne.getRoot());
        List listTwo=treeTwo.inOrder(treeTwo.getRoot());
        HashSet finalResult=new HashSet();
        for (Object value:listOne){
            if (listTwo.contains(value)){
                finalResult.add(value);
            }
        }
        return finalResult;
    }


}

public class binaryTreeMain16 {
public static void main(String[] args) {
    binaryTree16 bt = new binaryTree16();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("PreOrder Transversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("InOrder Transversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder Transversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : "+ bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder Transversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}


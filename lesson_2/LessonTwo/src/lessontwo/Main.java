package lessontwo;

public class Main {

    public static void main(String[] args) {
	    BinaryTree myTree = new BinaryTree();

//        for (int i = 0 ; i < 10; i ++) {
//            int val = (int) (Math.random() * 10) + 1;
//            myTree.add(val);
//        }

        myTree.add(7);
        myTree.add(5);
        myTree.add(4);
        myTree.add(3);
        myTree.add(10);
        myTree.add(13);
        myTree.add(6);
        myTree.add(11);
        myTree.add(9);



        //myTree.DFSPreorder(myTree.root);
        System.out.println();
        myTree.DFSInorder(myTree.root);
        System.out.println();
        System.out.println(myTree.getHeight(myTree.root));



    }
}

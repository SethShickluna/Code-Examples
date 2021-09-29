package lessontwo;

public class BinaryTree {

    BinaryTreeNode root;

    public BinaryTree() {

    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private BinaryTreeNode addRecursive(BinaryTreeNode cur, int val) {
        if (cur == null) {
            return new BinaryTreeNode(val);
        }

        if (val < cur.value) {
            cur.left = addRecursive(cur.left, val);
        } else if (val > cur.value) {
            cur.right = addRecursive(cur.right, val);
        } else {
            // value already exists
            return cur;
        }

        return cur;
    }

    public void delete(int n) {
        deleteRecursive(root, n);
    }

    //Implement this for homework (hint look at the methods below)
    private void deleteRecursive(BinaryTreeNode t, int n) {

    }

    public int getHeight(BinaryTreeNode t) {
        if(t == null){
            return -1;
        }else {
            return 1 + Math.max(getHeight(t.left), getHeight(t.right));
        }
    }

    //implement this -  find leftmost
    public int getMinValue() {
        return 0;
    }

    //implement this - rightmost node
    public int getLargestValue() {
        return 0;
    }

    public void DFSPreorder(BinaryTreeNode t) {
        if(t == null) {
            return;
        } else {
            System.out.print(t.value + ", ");
            DFSPreorder(t.left);
            DFSPreorder(t.right);
        }
    }


    public void DFSPostorder(BinaryTreeNode t) {
        if(t == null) {
            return;
        } else {
            DFSPostorder(t.left);
            DFSPostorder(t.right);
            System.out.print(t.value + ", ");
        }
    }

    public void DFSInorder(BinaryTreeNode t) {
        if(t == null) {
            return;
        } else {
            DFSInorder(t.left);
            System.out.print(t.value + ", ");
            DFSInorder(t.right);
        }
    }


    //implement this for homework (hint: queues might help)
    public void BreadthFirstSearch() {

    }


}




package TreePractice;


/**
 * @author sethshickluna
 * @param <E> generic data type of the node
 */
public class TreeNode<E> {

    private E data;
    private TreeNode<E> child;
    private TreeNode<E> sibling;

    /**
     *
     * @param child child node in the tree
     * @param sibling next node at the same level of the tree
     * @param data value stored in this node of the data structure
     */
    public TreeNode(TreeNode child, TreeNode sibling, E data){
        this.child = child;
        this.sibling = sibling;
        this.data = data;
    }

    public void setData(E newData){
        this.data = newData;
    }

    public TreeNode<E> getChild(){
        return this.child;
    }

    public TreeNode<E> getSibling(){
        return this.sibling;
    }

    public E getData(){
        return this.data;
    }

    @Override
    public String toString(){
        return "My value is: " + this.data;
    }
}

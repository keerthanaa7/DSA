public class Tree {
    private Treenode root;
    public void insert(int value){
        if(root == null){
            root = new Treenode(value);
        } else {
            root.insert(value);
        }
    }

    public void inOrderTraversal () {
        if(root != null){
            root.inOrderTraversal();
        }
    }

    public int getNodeValue(int value) {
        if(root == null)
            return 0;
        return root.get(value);
    }
    public int getMin() {
        if(root == null)
            return -1;
        return  root.findMin();
    }

    public int getMax() {
        if(root == null)
            return -1;
        return  root.findMax();
    }

    public void delete(int value){
        root = deleteNode(root, value);

    }
    private Treenode deleteNode(Treenode node, int value){
        if(node == null)
            return null;
        if(value < node.getData())
            node.setLeftChild(deleteNode(node.getLeftChild(), value));
        else if(value > node.getData())
            node.setRightChild(deleteNode(node.getRightChild(), value));
        else{
            // when the node that we want to delete has 0 or 1 children
            if(node.getLeftChild() == null){
                return node.getRightChild();
            } else if(node.getRightChild() == null){
                return node.getLeftChild();
            }
            else {
                // when the node (desired) that we want to delete has 2 children
                // go down the right subtree and find the min value node and replace the desired node value
                // with the min value
                node.setData(node.getRightChild().findMin());

                // replace the node(min value) with its right child. This min value node will be a leaf node
                // or it will be a ndoe with only a right child. It will not  have a left child

                node.setRightChild(deleteNode(node.getRightChild(), node.getData()));
            }
        }
        return node;
    }
}

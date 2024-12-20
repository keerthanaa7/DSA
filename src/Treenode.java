public class Treenode {
    private int data;
    private Treenode leftChild;
    private Treenode rightChild;

    public Treenode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Treenode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Treenode leftChild) {
        this.leftChild = leftChild;
    }

    public Treenode getRightChild() {
        return rightChild;
    }

    public void setRightChild(Treenode rightChild) {
        this.rightChild = rightChild;
    }

    public void insert(int value){
        if(value == data){
            return;
        } else if(value < data){
            if(leftChild == null){
                leftChild = new Treenode(value);
            } else{
                leftChild.insert(value);
            }
        } else {
            if(rightChild == null){
                rightChild = new Treenode(value);
            }
          else {
                rightChild.insert(value);
            }
        }
    }

    public void inOrderTraversal() {
        if(leftChild != null)
            leftChild.inOrderTraversal();
        System.out.println(data +", ");
        if(rightChild != null)
            rightChild.inOrderTraversal();
    }

    public int get(int value) {
        if(value == data)
            return value;
        else if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        } else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
            return 0;
    }

    public int findMin() {
        // left most leaf node has the min value in binary search tree
        if (leftChild != null)
            return leftChild.findMin();
        else
            return data;
    }

    public int findMax() {
        // right most node has the max value in a binary search tree
        if(rightChild != null){
            return rightChild.findMax();
        } else{
            return data;
        }
    }
}

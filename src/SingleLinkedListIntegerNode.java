import java.util.Objects;

public class SingleLinkedListIntegerNode {
    private int itemValue;
    private SingleLinkedListIntegerNode next;

    public SingleLinkedListIntegerNode(int itemValue) {
        this.itemValue = itemValue;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    public void setNext(SingleLinkedListIntegerNode next) {
        this.next = next;
    }

    public SingleLinkedListIntegerNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "SingleLinkedListIntegerNode{" +
                "itemValue=" + itemValue +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingleLinkedListIntegerNode that = (SingleLinkedListIntegerNode) o;
        return itemValue == that.itemValue && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemValue, next);
    }
}

public class SingleNode {
    public static int info;
    public static SingleNode next;

    public SingleNode(int i) {
        info = i;
        next = null;
    }

    public SingleNode copy() {
        SingleNode cpy = new SingleNode(info);
        cpy.next = next;
        return cpy;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode n) {
        next = n;
    }
}

public class SingleLinkedList {
    private SingleNode startNode = null;
    private SingleNode finalNode = null;

    public SingleLinkedList (SingleNode n) {
        startNode = n;
        finalNode = n;
    }

    public void add (SingleNode n) {
        finalNode.next = n;
        finalNode = n;
    }

    public int size () {
        int s = 0;
        if (startNode != null) {
            s = 1;
            SingleNode current = startNode;
            while (current != null) {
                current = SingleNode.next;
                s++;
            }
            return s;
        } else {
            return 0;
        }
    }

    public SingleNode pop () {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != finalNode || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.next;
        };
        if(currentNode == finalNode) {
            SingleNode tempNode = currentNode.copy();
            finalNode = penultimateNode;
            finalNode.next = null;
            return tempNode;
        } else {
            return null;
        }
    }

    public SingleNode shift () {
        SingleNode temp = startNode;
        startNode = startNode.next;
        return temp;
    }

    public void unshift (SingleNode n) {
        n.next = startNode;
        startNode = n;
    }

    public SingleNode remove (SingleNode n) {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != n || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.next;
        };
        if(currentNode == n) {
            penultimateNode.next = currentNode;
            currentNode.next = null;
            return currentNode;
        } else {
            return null;
        }
    }

    public SingleNode get (SingleNode n) {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != n || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.next;
        };
        if(currentNode == n) {
            return currentNode;
        } else {
            return null;
        }
    }
}

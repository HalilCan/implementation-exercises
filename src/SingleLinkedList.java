public class SingleLinkedList {
    private SingleNode startNode = null;
    private SingleNode finalNode = null;

    public SingleLinkedList (SingleNode n) {
        startNode = n;
        finalNode = n;
    }

    public void add (SingleNode n) {
        finalNode.setNext(n);
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
            currentNode = currentNode.getNext();
        };
        if(currentNode == finalNode) {
            SingleNode tempNode = currentNode.copy();
            finalNode = penultimateNode;
            finalNode.setNext(null);
            return tempNode;
        } else {
            return null;
        }
    }

    public SingleNode shift () {
        SingleNode temp = startNode;
        startNode = startNode.getNext();
        return temp;
    }

    public void unshift (SingleNode n) {
        n.setNext(startNode);
        startNode = n;
    }

    public void addAfter (SingleNode reference, SingleNode n) {
        SingleNode temp = startNode;
        while (temp != reference || temp != null) {
            temp = temp.getNext();
        }
        if (temp != null) {
            n.setNext(temp.getNext());
            temp.setNext(n);
        }

    }

    public SingleNode remove (SingleNode n) {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != n || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.getNext();
        };
        if(currentNode == n) {
            penultimateNode.setNext(currentNode);
            currentNode.setNext(null);
            return currentNode;
        } else {
            return null;
        }
    }

    public SingleNode get (SingleNode n) {
        SingleNode currentNode = startNode;

        while (currentNode != n || currentNode != null) {
            currentNode = currentNode.getNext();
        };
        if(currentNode == n) {
            return currentNode;
        } else {
            return null;
        }
    }
}

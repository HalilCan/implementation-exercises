public class SingleLinkedList {
    private SingleNode startNode = null;
    private SingleNode finalNode = null;

    public SingleLinkedList(SingleNode n) {
        startNode = n;
        finalNode = n;
    }

    public void add(SingleNode n) {
        finalNode.setNext(n);
        finalNode = n;
    }

    public int size() {
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

    public void insertAtIndex(SingleNode n, int index) {
        if (index == 0) {
            n.setNext(startNode);
            startNode = n;
            // passed by ref or value?
        } else {
            int i = 1;
            SingleNode temp = startNode;
            while (i < index && temp != null) {
                temp = temp.getNext();
                i++;
            }
            if (temp == null) {

            } else {
                n.setNext(temp.getNext());
                temp.setNext(n);
            }
        }
    }

    public SingleNode pop() {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != finalNode || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.getNext();
        }
        ;
        if (currentNode == finalNode) {
            SingleNode tempNode = currentNode.copy();
            finalNode = penultimateNode;
            finalNode.setNext(null);
            return tempNode;
        } else {
            return null;
        }
    }

    public SingleNode shift() {
        SingleNode temp = startNode;
        startNode = startNode.getNext();
        return temp;
    }

    public void unshift(SingleNode n) {
        n.setNext(startNode);
        startNode = n;
    }

    public void addAfter(SingleNode reference, SingleNode n) {
        SingleNode temp = startNode;
        while (temp != reference || temp != null) {
            temp = temp.getNext();
        }
        if (temp != null) {
            n.setNext(temp.getNext());
            temp.setNext(n);
        }

    }

    public SingleNode remove(SingleNode n) {
        SingleNode currentNode = startNode;
        SingleNode penultimateNode = null;

        while (currentNode != n || currentNode != null) {
            penultimateNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode == n) {
            if (penultimateNode != null && currentNode.getNext() != null) {
                penultimateNode.setNext(currentNode.getNext());
                currentNode.setNext(null);
                return currentNode;
            } else if (penultimateNode == null && currentNode.getNext() != null) {
                startNode = currentNode.getNext();
                return currentNode;
            } else if (penultimateNode != null && currentNode.getNext() == null) {
                finalNode = penultimateNode;
                penultimateNode.setNext(null);
                return currentNode;
            } else if (penultimateNode == null && currentNode.getNext() == null) {
                startNode = null;
                finalNode = null;
                return currentNode;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public SingleNode get(SingleNode n) {
        SingleNode currentNode = startNode;

        while (currentNode != n || currentNode != null) {
            currentNode = currentNode.getNext();
        }
        if (currentNode == n) {
            return currentNode;
        } else {
            return null;
        }
    }

    public void reverse () {
        if (this.size() > 1) {
            SingleNode currentNode = startNode.getNext();
            SingleNode penultimateNode = startNode;
            while (currentNode != null) {
                SingleNode tempNode = currentNode.getNext();
                currentNode.setNext(penultimateNode);
                currentNode = tempNode;
            }
            SingleNode tempNode = finalNode;
            finalNode = startNode;
            startNode = tempNode;
        }
    }

}

// 41243243 AnkeHuang
class node {
    int data;
    node link;

    node(int d) {
        data = d;
        link = null;
    }

    node(int d, node lk) {
        data = d;
        link = lk;
    }
}

class nodeList {
    node head, last;

    nodeList() {
        head = null;
        last = null;
    }

    void addNode(int addData) {
        node newNode = new node(addData, null);

        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.link = newNode;
            last = newNode;
        }
    }

    void printList() {
        node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.link;
            if (currentNode != null) {
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }

    void deleteNode(int index) {
        node lastNode = head;

        if (index == 0) {
            head = head.link;
        }

        for (int i = 0; i < index - 1; i++) {
            lastNode = lastNode.link;
        }
        node nextNode = lastNode.link;
        lastNode.link = nextNode.link;

        if (lastNode.link == null) {
            last = lastNode;
        }
    }

    void questionSolve() {
        node currentNode = head;
        node lastNode = null;

        while (currentNode != null) {
            if ((currentNode.data % 2 == 0
                    || currentNode.data % 3 == 0)
                    && currentNode.data % 6 != 0) {
                lastNode.link = currentNode.link;

                if (currentNode == last) {
                    last = lastNode;
                }
            }

            lastNode = currentNode;
            currentNode = currentNode.link;
        }
    }

}

class hw12_27 {

    public static void main(String[] argc) {
        nodeList myList = new nodeList();

        // add 1 to 100
        for (int i = 1; i <= 100; i++) {
            myList.addNode(i);
        }

        // delete (%2 or %3) == 0 and %6 != 0
        System.out.println("\ndelete (%2 or %3) == 0 and %6 != 0 :");
        myList.questionSolve();
        myList.printList();

        // // test add Node
        // myList.addNode(3);
        // myList.printList();

        // // test delete by index
        // myList.deleteNode(66);
        // myList.printList();
    }
}
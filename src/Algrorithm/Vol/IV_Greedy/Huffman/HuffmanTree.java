package Algrorithm.Vol.IV_Greedy.Huffman;

/**
 * 哈夫曼树
 */
class HuffmanNode {
    private Node head;
    private Node left;
    private Node right;

    public HuffmanNode(Node head) {
        this.head=head;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

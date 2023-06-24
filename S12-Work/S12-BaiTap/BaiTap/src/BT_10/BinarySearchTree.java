package BT_10;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null || root.data == key)
            return root != null;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }
    public static void main(String[] args) {
        BinarySearchTree treeNode = new BinarySearchTree();

        treeNode.insert(27);
        treeNode.insert(14);
        treeNode.insert(10);
        treeNode.insert(19);
        treeNode.insert(35);
        treeNode.insert(31);
        treeNode.insert(42);

        int searchKey = 19;
        if (treeNode.search(searchKey)) {
            System.out.println("Phần tử " + searchKey + " được tìm thấy trong cây.");
        } else {
            System.out.println("Phần tử " + searchKey + " không được tìm thấy trong cây.");
        }
    }
}

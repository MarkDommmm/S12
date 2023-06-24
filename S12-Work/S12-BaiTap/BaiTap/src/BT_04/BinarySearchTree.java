package BT_04;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = Rec(root, key);
    }

    Node Rec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = Rec(root.left, key);
        } else if (key > root.data) {
            root.right = Rec(root.right, key);
        }
        return root;
    }

    void Tree(Node node) {
        if (node == null) {
            return;
        }
        Tree(node.left);
        Tree(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
        System.out.println("Duyệt cây theo thứ tự post-order (postorder traversal):");
        tree.Tree(tree.root);
    }
}

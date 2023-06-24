package BT_08;

public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root=null;
    }
    void insert(int key){
        root = rec (root,key);
    }
    Node rec (Node root, int key){
        if (root == null){
            root  = new Node(key);
            return root;
        }
        if (key < root.data){
            root.left = rec(root.left,key);

        }else  if (key > root.data){
            root.right = rec(root.right,key);
        }
        return root;
    }
    void tree(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.data + " ");
        tree(node.left);
        tree(node.right);

    }

    public static void main(String[] args) {
        BinarySearchTree treeList = new BinarySearchTree();
        treeList.insert(27);
        treeList.insert(14);
        treeList.insert(10);
        treeList.insert(19);
        treeList.insert(35);
        treeList.insert(31);
        treeList.insert(42);

        System.out.println("Duyệt cây theo thứ tự preorder (preorder traversal):");
        treeList.tree(treeList.root);
    }
}

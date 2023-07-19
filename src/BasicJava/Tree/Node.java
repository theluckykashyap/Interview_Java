package BasicJava.Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node == null)
            return;

        // Left subtree
        inorder(node.left);

        // Node
        System.out.print(node.data + " ");

        // Right subtree
        inorder(node.right);
    }

    // Preorder traversal
    void preorder(Node node) {
        if (node == null)
            return;

        // Node
        System.out.print(node.data + " ");

        // Left subtree
        preorder(node.left);

        // Right subtree
        preorder(node.right);
    }

    // Postorder traversal
    void postorder(Node node) {
        if (node == null)
            return;

        // Left subtree
        postorder(node.left);

        // Right subtree
        postorder(node.right);

        // Node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Create the following binary tree:
                  1
                /   \
               2     3
              / \
             4   5
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

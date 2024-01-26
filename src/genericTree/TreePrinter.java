package genericTree;

// Concrete implementation of TreeComponent for displaying the tree
public class TreePrinter<T> implements TreeComponent<T> {
    private TreeNode<T> root;

    public TreePrinter(TreeNode<T> root) {
        this.root = root;
    }

    public void display() {
        display(root, 0);
    }

    private void display(TreeNode<T> node, int level) {
        // Implement display logic
    }

    public int findHeight() {
        return findHeight(root);
    }

    private int findHeight(TreeNode<T> node) {
        // Implement findHeight logic
        return 0;
    }

    public int findDiameter() {
        return findDiameter(root);
    }

    private int findDiameter(TreeNode<T> node) {
        // Implement findDiameter logic
        return 0;
    }
}

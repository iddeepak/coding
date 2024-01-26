package genericTree;

public class TreeAnalyzer<T> implements TreeComponent<T> {
    private TreeNode<T> root;

    public TreeAnalyzer(TreeNode<T> root) {
        this.root = root;
    }

    public void display() {
        // Not applicable for TreeAnalyzer
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

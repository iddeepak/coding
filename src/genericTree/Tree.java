package genericTree;

class Tree<T> implements TreeComponent<T> {
    private TreeNode<T> root;

    public Tree(T rootData) {
        this.root = new TreeNodeImpl<>(rootData);
    }

    public TreeNode<T> getRoot() {
        return root;
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

    public static class Main {
        public static void main(String[] args) {
            // Example usage
            Tree<Integer> tree = new Tree<>(1);
            TreeNode<Integer> root = tree.getRoot();
            // Construct the tree
            // ...
            // Display the tree
            TreePrinter<Integer> printer = new TreePrinter<>(root);
            printer.display();
            // Analyze the tree
            TreeAnalyzer<Integer> analyzer = new TreeAnalyzer<>(root);
            System.out.println("Height of tree: " + analyzer.findHeight());
            System.out.println("Diameter of tree: " + analyzer.findDiameter());
        }
    }
}

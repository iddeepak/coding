import com.sun.source.tree.Tree;
import genericTree.TreeAnalyzer;
import genericTree.TreePrinter;

import javax.swing.tree.TreeNode;
import java.util.List;

public class Main {
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

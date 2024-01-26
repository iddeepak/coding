package genericTree;

import java.util.List;

interface TreeNode<T> {
    T getData();

    List<TreeNode<T>> getChildren();

    void addChild(TreeNode<T> child);
}

package genericTree;

import java.util.List;

class TreeNodeImpl<T> implements TreeNode<T> {
    private T data;
    private List<TreeNode<T>> children;

    public TreeNodeImpl(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void addChild(TreeNode<T> child) {
        children.add(child);
    }
}

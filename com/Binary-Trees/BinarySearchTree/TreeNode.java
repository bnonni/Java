class TreeNode<T> {
 T item;
 TreeNode<T> leftchild;
 TreeNode<T> rightchild;

 // root node, default constructor
 public TreeNode(T newItem) {
  item = newItem;
  leftchild = null;
  rightchild = null;
 }

 // ancestor nodes constructor
 public TreeNode(T newItem, TreeNode<T> left, TreeNode<T> right) {
  item = newItem;
  leftchild = left;
  rightchild = right;
 }
}
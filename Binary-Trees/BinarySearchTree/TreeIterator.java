import java.util.LinkedList;

public class TreeIterator<T> implements java.util.Iterator<T> {
 private BinaryTreeBase<T> binary_tree;
 private TreeNode<T> currentNode;
 private LinkedList<TreeNode<T>> queue;

 public TreeIterator(BinaryTreeBase<T> b_tree) {
  binary_tree = b_tree;
  currentNode = null;
  queue = new LinkedList<TreeNode<T>>();
 }

 public boolean hasNext() {
  return !queue.isEmpty();
 }

 public T next() throws java.util.NoSuchElementException {
  currentNode = queue.remove();
  return currentNode.item;
 }

 public void remove() throws UnsupportedOperationException {
  throw new UnsupportedOperationException();
 }

 public void setPreorder() {
  queue.clear();
  preorder(binary_tree.root);
 }

 public void setInorder() {
  queue.clear();
  inorder(binary_tree.root);
 }

 public void setPostorder() {
  queue.clear();
  postorder(binary_tree.root);
 }

 private void preorder(TreeNode<T> treeNode) {
  if (treeNode != null) {
   queue.add(treeNode);
   preorder(treeNode.leftchild);
   preorder(treeNode.rightchild);
  }
 }

 private void inorder(TreeNode<T> treeNode) {
  if (treeNode != null) {
   inorder(treeNode.leftchild);
   queue.add(treeNode);
   inorder(treeNode.leftchild);
  }
 }

 private void postorder(TreeNode<T> treeNode) {
  if (treeNode != null) {
   postorder(treeNode.leftchild);
   postorder(treeNode.leftchild);
   queue.add(treeNode);
  }
 }
}
public class BinaryTree<T> extends BinaryTreeBase<T> {
 public BinaryTree() {

 }

 public BinaryTree(T rootItem) {
  super(rootItem);
 }

 public BinaryTree(T rootItem, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
  root = new TreeNode<T>(rootItem, null, null);
  attachLeftSubtree(leftTree);
  attachRightSubtree(rightTree);
 }

 public void setRootItem(T newItem) {
  if (root != null) {
   root.item = newItem;
  } else {
   root = new TreeNode<T>(newItem, null, null);
  }
 }

 public void attachLeft(T newItem) {
  if (!isEmpty() && root.leftchild == null) {
   root.leftchild = new TreeNode<T>(newItem, null, null);
  }
 }

 public void attachRight(T newItem) {
  if (!isEmpty() && root.rightchild == null) {
   root.rightchild = new TreeNode<T>(newItem, null, null);
  }
 }

 public void attachLeftSubtree(BinaryTree<T> leftTree) throws TreeException {
  if (isEmpty()) {
   throw new TreeException("Tree exception: Empty tree.");
  } else if (root.leftchild != null) {
   throw new TreeException("Tree Exception: Cannot overwrite left subtree");
  } else {
   root.leftchild = leftTree.root;
   leftTree.makeEmpty();
  }
 }

 public void attachRightSubtree(BinaryTree<T> rightTree) throws TreeException {
  if (isEmpty()) {
   throw new TreeException("Tree exception: Empty tree.");
  } else if (root.rightchild != null) {
   throw new TreeException("Tree Exception: Cannot overwrite left subtree");
  } else {
   root.rightchild = rightTree.root;
   rightTree.makeEmpty();
  }
 }

 protected BinaryTree(TreeNode<T> rootNode) {
  root = rootNode;
 }

 public BinaryTree<T> detachLeftSubtree() throws TreeException {
  if (isEmpty()) {
   throw new TreeException("Tree exception: Empty tree.");
  } else {
   BinaryTree<T> leftTree;
   leftTree = new BinaryTree<T>(root.leftchild);
   root.leftchild = null;
   return leftTree;
  }
 }

 public BinaryTree<T> detachRightSubtree() throws TreeException {
  if (isEmpty()) {
   throw new TreeException("Tree exception: Empty tree.");
  } else {
   BinaryTree<T> rightTree;
   rightTree = new BinaryTree<T>(root.rightchild);
   root.rightchild = null;
   return rightTree;
  }
 }
}
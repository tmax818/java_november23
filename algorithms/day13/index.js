/**
 * Class to represent a Node in a Binary Search Tree (BST).
 */
class BSTNode {
    /**
     * Constructs a new instance of a BST node.
     * @param {number} data The integer to store in the node.
     */
    constructor(data) {
      this.data = data;
      /**
       * These properties are how this node is connected to other nodes to form
       * the tree. Similar to .next in a SinglyLinkedList except a BST node can
       * be connected to two other nodes. To start, new nodes will not be
       * connected to any other nodes, these properties will be set after
       * the new node is instantiated.
       *
       * @type {BSTNode|null}
       */
      this.left = null;
      /** @type {BSTNode|null} */
      this.right = null;
    }
  }
  
  /**
   * Represents an ordered tree of nodes where the data of left nodes are <= to
   * their parent and the data of nodes to the right are > their parent's data.
   */
  class BinarySearchTree {
    constructor() {
      /**
       * Just like the head of a linked list, this is the start of our tree which
       * branches downward from here.
       *
       * * @type {BSTNode|null}
       */
      this.root = null;
    }
  
    /**
     * Determines if this tree is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean} Indicates if this tree is empty.
     */
    isEmpty() {
      return this.root === null;
    }
  
    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(h) linear, h = height of left sub tree starting from current node.
     * - Space: O(1) constant.
     * @param {BSTNode} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    min(current = this.root) {
      if (current === null) {
        return null;
      }
  
      while (current.left) {
        current = current.left;
      }
      return current.data;
    }
  
    /**
     * Retrieves the smallest integer data from this tree.
     * - Time: O(h) linear, h = height of left sub tree starting from current node.
     * - Space: O(h) linear due to the call stack.
     * @param {BSTNode} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The smallest integer from this tree.
     */
    minRecursive(current = this.root) {
      if (current === null) {
        return null;
      }
  
      if (current.left === null) {
        return current.data;
      }
      return this.minRecursive(current.left);
    }
  
    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(h) linear, h = height of right sub tree starting from current node.
     * - Space: O(1) constant.
     * @param {BSTNode} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    max(current = this.root) {
      if (current === null) {
        return null;
      }
  
      while (current.right) {
        current = current.right;
      }
      return current.data;
    }
  
    /**
     * Retrieves the largest integer data from this tree.
     * - Time: O(h) linear, h = height of right sub tree starting from current node.
     * - Space: O(h) linear due to the call stack.
     * @param {BSTNode} current The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {number} The largest integer from this tree.
     */
    maxRecursive(current = this.root) {
      if (current === null) {
        return null;
      }
  
      if (current.right === null) {
        return current.data;
      }
      return this.maxRecursive(current.right);
    }
  
    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(h) linear, h = height of tree.
     * - Space: O(1) constant.
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    contains(searchVal) {
      let current = this.root;
  
      while (current) {
        if (current.data === searchVal) {
          return true;
        }
  
        if (searchVal < current.data) {
          current = current.left;
        } else {
          current = current.right;
        }
      }
      return false;
    }
  
    /**
     * Determines if this tree contains the given searchVal.
     * - Time: O(h) linear, h = height of tree.
     * - Space: O(h) linear due to the call stack.
     * @param {number} searchVal The number to search for in the node's data.
     * @returns {boolean} Indicates if the searchVal was found.
     */
    containsRecursive(searchVal, current = this.root) {
      if (current === null) {
        return false;
      }
  
      if (current.data === searchVal) {
        return true;
      }
  
      if (searchVal < current.data) {
        return this.containsRecursive(searchVal, current.left);
      }
  
      if (searchVal > current.data) {
        return this.containsRecursive(searchVal, current.right);
      }
    }
  
    /**
     * Calculates the range (max - min) from the given startNode.
     * - Time: O(rightHeight + leftHeight) -> still linear so simplify to O(h).
     * - Space: O(h) linear due to the call stack. The max side finishes before
     *    the right min side is added to the stack.
     * @param {BSTNode} startNode The node to start from to calculate the range.
     * @returns {number|null} The range of this tree or a sub tree depending on if the
     *    startNode is the root or not.
     */
    range(startNode = this.root) {      
      if (!startNode) {
      return null;
    }
    return this.max(startNode) - this.min(startNode);}

    
    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(h) linear, h = height of tree because the new node may have to
     *    be added at the bottom.
     * - Space: O(1) constant.
     * @param {number} newVal The data to be added to a new node.
     * @returns {BinarySearchTree} This tree.
     */
    insert(newVal) {

    }
  
    /**
     * Inserts a new node with the given newVal in the right place to preserver
     * the order of this tree.
     * - Time: O(h) linear, h = height of tree because the new node may have to
     *    be added at the bottom.
     * - Space: O(h) linear due to the call stack.
     * @param {number} newVal The data to be added to a new node.
     * @param {BSTNode} curr The node that is currently accessed from the tree as
     *    the tree is being traversed.
     * @returns {BinarySearchTree} This tree.
     */
    insertRecursive(newVal, curr = this.root) {

    }

    print(node = this.root, spaceCnt = 0, spaceIncr = 10) {
        if (!node) {
          return;
        }
    
        spaceCnt += spaceIncr;
        this.print(node.right, spaceCnt);
    
        console.log(
          " ".repeat(spaceCnt < spaceIncr ? 0 : spaceCnt - spaceIncr) +
            `${node.data}`
        );
    
        this.print(node.left, spaceCnt);
      }
    
  }
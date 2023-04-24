class Node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    constructor() {
        this.root = null;
    }

// helper method that calls the removeNode with a given data
remove(data)
{
	this.root = this.removeNode(this.root, data);
}

// Method to remove node with given data it recur over the tree to find the data and removes it
removeNode(node, key)
{

	// if the root is null then tree is empty
	if(node === null)
		return null;

	// if data to be delete is less than roots data then move to left subtree
	else if(key < node.data)
	{
		node.left = this.removeNode(node.left, key);
		return node;
	}

	// if data to be delete is greater than roots data then move to right subtree
	else if(key > node.data)
	{
		node.right = this.removeNode(node.right, key);
		return node;
	}

	// if data is similar to the root's data then delete this node
	else
	{
		// deleting node with no children
		if(node.left === null && node.right === null)
		{
			node = null;
			return node;
		}

		// deleting node with one children
		if(node.left === null)
		{
			node = node.right;
			return node;
		}
		
		else if(node.right === null)
		{
			node = node.left;
			return node;
		}

		// Deleting node with two children minimum node of the right subtree is stored in aux
		let aux = this.findMinNode(node.right);
		node.data = aux.data;

		node.right = this.removeNode(node.right, aux.data);
		return node;
	}
}

    /**
     * Creates new node to be inserted into tree
     * @param {int} data int to be added as a node to the tree
     */
    insert(data) {
        let newNode = new Node(data);
        // if the root is null node will be added as root
        if (this.root === null)
            this.root = newNode;
        else
            this.nodeRec(this.root, newNode);
    }

    /**
     * Goes through tree to find where node should be placed
     * @param {Node} node current node in interation
     * @param {Node} newNode node that wants to be added to the tree
     */
    nodeRec(node, newNode) {
        // if the data is less than the node data move left of the tree
        if (newNode.data < node.data) {
            if (node.left === null) { // check for leftmost in sub-tree
                node.left = newNode;
            } else {
                // recursion until leftmost is found
                this.nodeRec(node.left, newNode);
            }
        }

        // if the data is more than the node data to the move right of the tree
        else {
            if (node.right === null) { // check for rightmost in sub-tree
                node.right = newNode;
            }
            else {
                this.nodeRec(node.right, newNode); // recursion for right side
            }

        }
    }

    /**
     * Gives inorder sequence of tree given starting node
     * @param {*} node node to start at
     */
    inorder(node) {
        if (node !== null) {
            this.inorder(node.left);
            console.log(node.data);
            this.inorder(node.right);
        }
    }

    /**
     * Gives preorder sequence of tree starting at given node
     * @param {*} node node to start at
     */
    preorder(node) {
        if (node !== null) {
            console.log(node.data);
            this.preorder(node.left);
            this.preorder(node.right);
        }
    }

    /**
     * Gives postorder sequence starting at given node
     * @param {*} node node to start at
     */
    postorder(node) {
        if (node !== null) {
            this.postorder(node.left);
            this.postorder(node.right);
            console.log(node.data);
        }
    }
    
    getRootNode() {
        return this.root;
    }

    /**
     * Search for node with given data
     * @param {*} node Node for recursion
     * @param {*} data Given data
     * @returns node
     */
    search(node, data) {
        // if empty return null
        if (node === null) {
            console.log(data + " does not exist!")
            return null;
        }
        // move left if less
        else if (data < node.data) {
            return this.search(node.left, data);
        }
        // more right if more
        else if (data > node.data) {
            return this.search(node.right, data);
        }
        // if data is equal to the node data return node
        else {
            console.log(data + " exists!")
            return node;
        }
    }

    /**
     * finds min node
     * @param {*} node recursion node
     * @returns min node
     */
    findMinNode(node) {
        if (node.left === null) {
            console.log("Min Node = " + node.data)
            return node;
        }
        else {
            return this.findMinNode(node.left);
        }
    }

    getNumberOfLeaves() {
        let count = 0;

        function countLeaves(node) {
            if (node === null) {
                return;
            }
            if (node.left === null && node.right === null) {
                count++;
            }
            countLeaves(node.left);
            countLeaves(node.right);
        }
        countLeaves(this.root);
        return count;
    }


    getNumberofNonLeaves(){
        let count = 0;

        function countNonLeaves(node) {
            if (node === null) {
                return;
            }
            if (node.left !== null || node.right !== null) {
                count++;
            }
            countNonLeaves(node.left);
            countNonLeaves(node.right);
        }
        countNonLeaves(this.root);
        return count;
    }

    getParentOfNode(node, data) {
        if(node == null){
            return; 
        }
        if ((node.left != null && node.left.data == data) || (node.right != null && node.right.data == data)) {
            return node.data;
        }
        if (node.left) {
            return this.getParentOfNode(node.left, data);
        }
        if (node.right) {
            return this.getParentOfNode(node.right, data);
        }

    }

    getSize(){
        let count = 0;

        function countSize(node) {
            if (node === null) {
                return;
            }
            count++;
            countSize(node.left);
            countSize(node.right);
        }
        countSize(this.root);
        return count;
        }

    isEmpty() {
        if (this.root == null) {
            return true;
        }
        return false;
    }

    clear() {
        this.root = null;
    }
    
}  

    
    


    




// create an object for the BinarySearchTree
let BST = new BinarySearchTree();
// Inserting nodes to the BinarySearchTree
BST.insert("B");
BST.insert("R");
BST.insert("A");
BST.insert("N");
BST.insert("C");
BST.insert("H");
BST.insert("E");
BST.insert("S");


let root = BST.getRootNode()

console.log("Inorder traversal:")
BST.inorder(root)
console.log("Postorder traversal:")
BST.postorder(root)
console.log("Preorder traversal:")
BST.preorder(root)

//BST.findMinNode(root)
// Search for a num in tree
//BST.search(root, "B")

//console.log(BST.getParentOfNode(root, "C"))


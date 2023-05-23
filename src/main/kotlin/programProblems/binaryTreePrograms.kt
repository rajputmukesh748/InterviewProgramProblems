package programProblems

import java.util.*

/**
 * How Do You Implement a Binary Search Tree?
 * */
class BinarySearchTreeImpl {

    private var rootNode: Node? = null

    /**
     * Node Class
     * */
    inner class Node(val value: Int) {
        var leftNode: Node? = null
        var rightNode: Node? = null
    }


    /**
     * How Do You Implement a Binary Search Tree?
     * */
    fun insert(value: Int) {
        rootNode = insertNode(rootNode, value)
    }

    private fun insertNode(node: Node?, value: Int): Node {
        if (node == null) {
            return Node(value)
        }
        if (value < node.value) {
            node.leftNode = insertNode(node.leftNode, value)
        } else {
            node.rightNode = insertNode(node.rightNode, value)
        }
        return node
    }


    /**
     * Search Node
     * */
    fun search(value: Int): Boolean = checkExistOrNot(rootNode, value)
    private fun checkExistOrNot(currentNode: Node?, value: Int): Boolean {
        if (currentNode == null) return false

        if (currentNode.value == value) return true

        return if (value < currentNode.value) checkExistOrNot(currentNode.leftNode, value)
        else checkExistOrNot(currentNode.rightNode, value)
    }


    /**
     * How Do You Traverse a Given Binary Tree in Preorder Without Recursion?
     * */
    fun preOrderTraverse() {
        val stack = Stack<Node>()
        if (rootNode == null) print("No value exist in node.")
        stack.push(rootNode)

        while (stack.isNotEmpty()) {
            val current = stack.pop()
            println("Node Value:- ${current.value}")

            if (current.rightNode != null) stack.push(current.rightNode)
            if (current.leftNode != null) stack.push(current.leftNode)
        }
    }


    /**
     * Can You Count How Many Leaf Nodes Are in a Given Binary Tree?
     * */
    fun countLeafNode(node: Node? = rootNode): Int {
        if (node == null) return 0
        if ((node.leftNode == null) && (node.rightNode == null)) return 1
        val leftNodeCount = countLeafNode(node.leftNode)
        val rightNodeCount = countLeafNode(node.rightNode)
        return leftNodeCount.plus(rightNodeCount)
    }


    /**
     * Write a Code To Find the Maximum Depth of a Binary Tree
     * */
    fun maxDepthBinaryTree(){

    }

}
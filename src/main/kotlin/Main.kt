import programProblems.BinarySearchTreeImpl

fun main() {
    val binaryTree = BinarySearchTreeImpl()
    binaryTree.insert(41)
    binaryTree.insert(74)
    binaryTree.insert(25)
    binaryTree.insert(4)
    binaryTree.insert(36)
    binaryTree.insert(14)
    binaryTree.insert(75)
    binaryTree.insert(88)

    println("Value Exist In Tree:- ${binaryTree.search(36)}")

    binaryTree.preOrderTraverse()
    println("Count Leaf Node :- ${binaryTree.countLeafNode()}")
}
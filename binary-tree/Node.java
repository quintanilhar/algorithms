
/* 
class Node 
int data;
Node left;
Node right;
*/

int height(Node node) {
    if (node == null) {
        return 0;
    }
    
    int rightHeight = height(node.right);
    int leftHeight = height(node.left);
    
    if (leftHeight > rightHeight) {
        return leftHeight + 1;
    }
    
    return rightHeight + 1; 
}

void printLevelOf(Node node, int level) {
    if (node == null) {
        return;
    }
    
    if (level == 1) {
        System.out.print(node.data + " ");
        return;
    }    
    
    printLevelOf(node.left, level - 1);
    printLevelOf(node.right, level - 1);
}

void levelOrder(Node node) {    
    for (int level = 1; level <= height(node); level++) {
        printLevelOf(node, level);
    }
}


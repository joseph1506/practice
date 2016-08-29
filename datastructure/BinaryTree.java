package practice.datastructure;

public class BinaryTree {
    private Node root;


    public void insert(int value){
        Node nodeToAdd= new Node(value);
        if(root==null){
            root=nodeToAdd;
            return;
        }
        insertNode(root,nodeToAdd);
    }

    private void insertNode(Node latestNode, Node nodeToAdd) {
        if(latestNode.value>nodeToAdd.value){
            if(latestNode.left==null){
                latestNode.left=nodeToAdd;
                return;
            }else{
                insertNode(latestNode.left,nodeToAdd);
            }
        }else{
            if(latestNode.right==null){
                latestNode.right=nodeToAdd;
                return;
            }else{
                insertNode(latestNode.right,nodeToAdd);
            }
        }
    }

    public void traverse(TraverseOrder order){
         if(root!=null){
             Node nodeToTraverse=root;
             if(nodeToTraverse.left!=null || nodeToTraverse.right!=null){
                 if(TraverseOrder.IN_ORDER==order){
                     inOrderTraversal(nodeToTraverse);
                 }
                 if(TraverseOrder.PRE_ORDER==order){
                     preOrderTraversal(nodeToTraverse);
                 }
                 if(TraverseOrder.POST_ORDER==order){
                      postOrderTraversal(nodeToTraverse);
                 }
             }else{
                 System.out.println(nodeToTraverse.value);
             }
         }
    }

    private void inOrderTraversal(Node nodeToTraverse) {
        //left traversal
        if(nodeToTraverse.left!=null){
            inOrderTraversal(nodeToTraverse.left);
        }
        ///sop node
        System.out.println(nodeToTraverse.value);
        //right traversal
        if(nodeToTraverse.right!=null){
            inOrderTraversal(nodeToTraverse.right);
        }
    }

    private void preOrderTraversal(Node nodeToTraverse){
        ///sop node
        System.out.println(nodeToTraverse.value);

        //left traversal
        if(nodeToTraverse.left!=null){
            preOrderTraversal(nodeToTraverse.left);
        }
        //right traversal
        if(nodeToTraverse.right!=null){
            preOrderTraversal(nodeToTraverse.right);
        }
    }

    private void postOrderTraversal(Node nodeToTraverse){
        //left traversal
        if(nodeToTraverse.left!=null){
            postOrderTraversal(nodeToTraverse.left);
        }
        //right traversal
        if(nodeToTraverse.right!=null){
            postOrderTraversal(nodeToTraverse.right);
        }

        ///sop node
        System.out.println(nodeToTraverse.value);
    }

    public int getMinimumValue() {
        int value=0;
        if(root==null){
            return value;
        }
        Node nodeToTraverse=root;
        while(nodeToTraverse.left!=null){
            value=nodeToTraverse.left.value;
            nodeToTraverse=nodeToTraverse.left;
        }
        return value;
    }

    public int getMaximumValue() {
        int value=0;
        if(root==null){
            return value;
        }
        Node nodeToTraverse=root;
        while(nodeToTraverse.right!=null){
            value=nodeToTraverse.right.value;
            nodeToTraverse=nodeToTraverse.right;
        }
        return value;
    }

    public boolean delete(int value){
        Node nodeFound=find(value);
        if(nodeFound==null){
            return false;
        }

        // if node has no children
        if(nodeFound.left==null && nodeFound.right==null){
            nodeFound=null;
            return true;
        }

        //if node has 2 child
        if(nodeFound.left!=null && nodeFound.right!=null){

        }



        // get the parent node of the nodeFound
        Node parent=getParentNode(nodeFound);





        // if node has 1 child
        if(nodeFound.left!=null){
              //parent.right
        }

        if(nodeFound.right!=null){

        }








       return false;
    }

    private Node getParentNode(Node nodeToCheck) {
        if(root==null){
            return null;
        }
        return findParentNode(root,nodeToCheck);
    }

    private Node findParentNode(Node nodeToTraverse, Node nodeToCheck) {
        Node parentNode=null;
        if(nodeToTraverse==null){
            return null;
        }
        if(nodeToTraverse.left==nodeToCheck || nodeToTraverse.right==nodeToCheck){
            return nodeToTraverse;
        }
        parentNode=findParentNode(nodeToTraverse.left,nodeToCheck);
        if(parentNode==null){
            parentNode=findParentNode(nodeToTraverse.right,nodeToCheck);
        }
        return parentNode;
    }


    public Node find(int value){
        if(root==null){
            return null;
        }
        Node nodeForValue=findNode(value,root);
        return nodeForValue;
    }

    private Node findNode(int value, Node nodeToTraverse) {
        Node nodeFound=null;
        if(nodeToTraverse==null){
            return null;
        }
        if(nodeToTraverse.value==value){
            return nodeToTraverse;
        }
        if(nodeToTraverse.left!=null){
            nodeFound=findNode(value,nodeToTraverse.left);
        }
        if(nodeFound==null && nodeToTraverse.right!=null){
            nodeFound=findNode(value,nodeToTraverse.right);
        }
        return nodeFound;
    }


}

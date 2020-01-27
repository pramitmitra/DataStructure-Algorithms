//Program to constuct a Binary Search Tree

/*                       50
                      /     \
                     30     70
                    /  \    /  \
                  20   40  60   80 */

public class BinarySearchTree {

    class Node{
        Node left,right;
        int key;

        public Node(int item){
            key=item;
            left=right=null;
        }
    }

    Node root;
    BinarySearchTree()
    {
        root=null;
    }


    //Method to insert into the tree
    void  insert(int key)
    {
        root=insertRec(root, key);
    }

    /*A recursive function to insert a new key in BST*/
    Node insertRec(Node root, int key){
        /*If root is null then create a new node for root*/
        if (root==null){
            root=new Node(key);
            return root;
        }

        /*if key <root then insert into the right of the root*/
        if(key < root.key)
            root.left=insertRec(root.left,key);
        else if (key > root.key)
            root.right=insertRec(root.right,key);

        /*return the unchanged node pointer*/
        return root;
    }

    //This medthod calls inorderRec recursice function
    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if (root !=null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    //Driver method
    public static void main(String args[])
    {
        BinarySearchTree tree =new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        //print the tree in inorder
        tree.inorder();
    }
}

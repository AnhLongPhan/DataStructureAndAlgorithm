package live.code;

public class Main {


    public static void main(String[] args) {

        Node leftNode = new Node(5);
        leftNode.left = new Node(1);
        leftNode.right = new Node(3);

        Node leftRight = new Node(11);
        leftRight.left = new Node(4);
        leftRight.right = new Node(7);

        Node node = new Node(10);
        node.left = leftNode;
        node.right = leftRight;
        
        System.out.println(isValid(node));
    }


    public static boolean isValid(Node node) {

        
        if(node.left != null && node.right != null) { 
            if(node.left.value < node.right.value 
                && node.getValue() < node.right.value 
                && node.getValue() < node.right.value
            ) {
                if (isValid(node.right) && isValid(node.left)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        if(node.left == null && node.right != null) {
            if (node.getValue() < node.right.value) {
                if(isValid(node.right) == true) {
                    return true;
                }
                return false;
            }
            
        }

        if(node.right == null && node.left != null) {
            if (node.getValue() > node.left.value) {
                if(isValid(node.left) == true) {
                    return true;
                }
                return false;
            }
        }


        if(hasNext(node)) {
            return isValid(node.left) && isValid(node.right);
        } else {
            return true;
        }

    }

    public boolean checkLeftNode(Node node) {
        if(node.left != null && hasNext(node.left)) {
            
        }
        return false;
    }

    public static boolean hasNext(Node node) {
        if (node.left != null || node.right !=  null) {
            return true;
        }
        return false;
    }



}
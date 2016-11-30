import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {
    	BST<Integer> ourTree = new BST<Integer>();
    	
    	Scanner scanner = new Scanner(System.in);
    	int numProblems = scanner.nextInt();
    	for(int i = 0; i <= numProblems; ++i){
    		String input = scanner.nextLine();
    		String[] operations = input.split("\\s+");
    		
            if (operations[0].equals("preorder")){
            	ourTree.traverse(operations[0], ourTree.getRoot());
            }
            if (operations[0].equals("postorder")){
            	ourTree.traverse(operations[0], ourTree.getRoot());
            }
            if (operations[0].equals("inorder")){
            	ourTree.traverse(operations[0], ourTree.getRoot());
            }
            if (operations[0].equals("insert")){
            	ourTree.insert(Integer.parseInt(operations[1]));
            }
            if (operations[0].equals("delete")){
            	ourTree.delete(Integer.parseInt(operations[1]));
            }
            if (operations[0].equals("find")){
            	ourTree.find(Integer.parseInt(operations[1]));
            }
    	}
    	scanner.close();
    }
}
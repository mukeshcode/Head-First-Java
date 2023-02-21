import java.util.*;

class Node{
    char ch;
    int count;

    Node(char ch, int count){this.ch = ch; this.count = count;}
}

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<Node> list = new LinkedList<Node>();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i<str.length(); i++){
            boolean visited = false;
            for(int j = 0; j<i; j++){
                if(str.charAt(i) == str.charAt(j)){
                    visited = true;
                    break;
                }
            }
            if(!visited){
                int count = 1;
                for(int j = i+1; j<str.length(); j++){
                    if(str.charAt(i) == str.charAt(j))
                        count++;
                }
                Node node = new Node(str.charAt(i), count);
                list.add(node);
            }
        }

        for(Node node : list){
            System.out.println(node.ch + " :: " + node.count);
        }
    }
}

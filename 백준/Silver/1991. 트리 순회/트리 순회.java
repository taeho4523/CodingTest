import java.io.*;
import java.util.*;


public class Main {
    static class Node{
        char value;
        Node left;
        Node right;

        Node(char value, Node left, Node right){
            this.value=value;
            this.left=left;
            this.right=right;
        }
    }
    static Node head=new Node('A',null,null);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent=st.nextToken().charAt(0);
            char left=st.nextToken().charAt(0);
            char right=st.nextToken().charAt(0);

            insertNode(head,parent,left,right);
        }
        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
    }

    public static void insertNode(Node temp, char parent, char left, char right){
        if(temp.value==parent){
            if(left=='.'){
                temp.left=null;
            } else if(left!='.'){
                temp.left=new Node(left,null,null);
            }
            if(right=='.'){
                temp.right=null;
            } else if(right!='.'){
                temp.right=new Node(right,null,null);
            }
        } else{
            if(temp.left!=null){
                insertNode(temp.left, parent, left, right);
            }
            if(temp.right!=null){
                insertNode(temp.right, parent, left, right);
            }
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value);
        inOrder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value);
    }
}
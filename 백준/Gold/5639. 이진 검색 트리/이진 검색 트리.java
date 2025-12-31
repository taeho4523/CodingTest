import java.io.*;
import java.util.*;


public class Main {
    static class Node{
        int num;
        Node left,right;

        Node(int num){
            this.num = num;
        }
        Node(int num,Node left,Node right){
            this.num = num;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Node root=new Node(Integer.parseInt(br.readLine()));

        String s;
        while(true){
            s=br.readLine();
            if(s==null||s.equals("")) break;
            insertNode(Integer.parseInt(s),root);
        }

        postOrder(root);
    }

    static void insertNode(int n,Node root){
        if(n<root.num){
            if(root.left==null) root.left=new Node(n);
            else insertNode(n,root.left);
        } else {
            if (root.right==null) root.right=new Node(n);
            else insertNode(n,root.right);
        }

    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.num);
    }
}
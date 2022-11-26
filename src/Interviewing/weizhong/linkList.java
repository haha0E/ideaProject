package Interviewing.weizhong;

import Interviewing.weizhong.linkList.Node;

import java.util.HashMap;

public class linkList {
    public static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        Node() {
        }
    }

    public static void main(String[] args) {
        Node x = new Node();
        x.value = 1;
        x.next = new Node();
        x.next.value = 2;
        x.next.next=new Node (3,null);
        reverse(x);
        while (x != null) {
            System.out.println(x.value);
            x = x.next;
        }
    }

    //倒转有向链接方法
    static void reverse(Node head){
        Node n2=head.next;
        Node n1=head;
        Node i=n2.next;
        while(i!=null){
            head=n2;
            i=i.next;
        }
    }
    static void unique(Node head){
        HashMap<Node,Integer> x=new HashMap<>();
        Node t=head;
        x.put(head,1);
        while(t.next!=null){
            if(x.containsKey(t.next)){
                Node temp=t.next.next;
                t.next=temp;
            }else{
                x.put(t.next,1);
            }
        }
    }
}

package com.tuannm2008110220.thicuoiki2;

public class Node {
    HangHoa data;
    Node next;
    
    public Node(){
        data = null;
        next = null;
    }
    public Node(HangHoa hanghoa){
        data = hanghoa;
        next = null;
    }
    public Node(HangHoa hanghoa, Node node){
        data = hanghoa;
        next = node;
    }
}

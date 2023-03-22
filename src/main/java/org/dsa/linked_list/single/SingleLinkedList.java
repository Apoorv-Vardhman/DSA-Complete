package org.dsa.linked_list.single;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class SingleLinkedList {
    Node head;
    int size;

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize(){
        return size;
    }

    public void viewList(){
        System.out.println("----------View List------------");
        Node node;
        if(isEmpty()){
            System.out.println("Data is empty");
        }else{
            node = head;
            for(int i=1;i<=size;i++){
                System.out.println(node.getData());
                node = node.getNext();
            }
        }
    }

    public void addAtPosition(int data,int position){
        Node node = new Node(data);
        if(position==1){
            head = node;
            size++;
        }else if(position==size+1){
            addLast(data);
        }else if(position>1 && position<=size){
            Node traverseNode = head;
            for(int i=1;i<position;i++){
                traverseNode = traverseNode.getNext();
            }
            node.setNext(traverseNode.getNext());
            traverseNode.setNext(node);
        }
    }

    public void addStart(int data){
        Node node = new Node(data);
        if (this.head != null) {
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if (this.head==null){
            head = node;
        }else{
            Node traverseNode = head;
            while (traverseNode.getNext()!=null){
                traverseNode = traverseNode.getNext();
            }
            traverseNode.setNext(node);
        }
        size++;
    }


}

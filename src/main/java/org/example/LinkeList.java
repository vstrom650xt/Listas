package org.example;

public class LinkeList {

    private Node head;
    private Node tail;
    private int size;

    public LinkeList(){
        this.head=null;
        this.tail=null;
        this.size =0;
    }


    public int size(){
        return size;

    }

    public  Node getHead(){
        return head;

    }

    public Node getTail(){
        return tail;
    }

    public boolean isEmpty(){

        return  size==0;
    }


    public  void addHead(int element){
        Node node= new Node(element);


        if (isEmpty()){
            head= node ;
            tail= node;
        }else{

                node.setNext(head);
                head=node;
        }
        size++;

    }
    public  void addTail(int element){
        Node node= new Node(element);


        if (isEmpty()){
            head= node ;
            tail= node;
        }else{
            tail.setNext(node);
            head=node;

        }

    }

    // se ponen wrapper para evitar los nulls

    public int search(int element){
        int result = -1;
         if(isEmpty())
             return result;
         Node node = head;

        for (int j = 0; j < size; j++) {
            if (node.getElement()==element)
                return j;
            node = node.getNext();
        }

        return result;
    }

    public int [] toArray(){
        int[]vector = new int[size];
        Node node =head;


        for (int i = 0; i < size; i++) {
            vector[i] = node.getElement();
            node = node.getNext();

        }
        return  vector;


    }

    public Integer remove(int index){
        Integer result= null;
        if (isEmpty()|| index<0 || index >= size) {
            return null;
        }
        Node node =null;
        if (index==0){
            result= head.getElement();
            head= head.getNext();
        }else {
            Node aux = head;
            Node aux2 = head.getNext();

            while (index>1){
                aux= aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElement();
            aux.setNext(aux2.getNext());
        }
        size--;



return result;
    }
}

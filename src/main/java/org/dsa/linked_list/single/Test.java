package org.dsa.linked_list.single;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        while (true){
            System.out.println("-----------------Linked List------------------");
            System.out.println("1. Show list ");
            System.out.println("2. Insert at start ");
            System.out.println("3. Insert at Position ");
            System.out.println("4. Insert at end ");
            System.out.println("5. Check size ");
            System.out.println("6. Delete start element ");
            System.out.println("7. Delete at position ");
            System.out.println("8. Delete last element ");
            System.out.println("9. Exit ");
            System.out.println("Input your choice ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1-> singleLinkedList.viewList();
                case 2->{
                    System.out.println("Enter element ");
                    int element = scanner.nextInt();
                    singleLinkedList.addStart(element);
                }
                case 3->{
                    System.out.println("Enter position ");
                    int position = scanner.nextInt();
                    System.out.println("Enter element ");
                    int element = scanner.nextInt();
                    singleLinkedList.addAtPosition(element,position);
                }
                case 4->{
                    System.out.println("Enter element ");
                    int element = scanner.nextInt();
                    singleLinkedList.addLast(element);
                }
                case 5->System.out.println("Size is "+singleLinkedList.getSize());
                case 9-> System.exit(0);
                default -> System.out.println("Invalid input");
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        for (int i=0;i<5;i++){
//            System.out.println("Enter data at "+(singleLinkedList.getSize()+1));
//            int data = scanner.nextInt();
//            /*Random random = new Random();
//            int data = random.nextInt(1000);*/
//            //singleLinkedList.addLast(data);
//            //singleLinkedList.addStart(data);
//            singleLinkedList.addAtPosition(data,i+1);
//        }
//        singleLinkedList.viewList();
    }
}

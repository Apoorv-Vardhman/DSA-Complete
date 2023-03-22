package org.dsa.core.collection.list;

import java.util.*;

/**
 * @author : Apoorva Raj
 * @mailto : apoorva.raj@embedtechsolutions.com
 * @LinkedIn : apoorv-vardhman
 **/
public class ListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            System.out.println("1. Add element ");
            System.out.println("2. Add element at position ");
            System.out.println("3. Add multiple elements ");
            System.out.println("4. is Empty ");
            System.out.println("5. Total size ");
            System.out.println("6. Remove object ");
            System.out.println("7. Remove at position ");
            System.out.println("8. Get element at position ");
            System.out.println("9. Check element is present or not ");
            System.out.println("10. Clear list ");
            System.out.println("11. Replace element ");
            System.out.println("12. Find first occurrence ");
            System.out.println("13. Find last occurrence ");
            System.out.println("14. Iterator ");
            System.out.println("15. List iterator ");
            System.out.println("16. Exit ");
            System.out.print("Enter choice ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1->{
                    System.out.print("Enter element ");
                    if(list.add(scanner.nextInt())){
                        System.out.println("element added ");
                    }
                }
                case 2->{
                    System.out.println("Enter position ");
                    int position = scanner.nextInt();
                    System.out.print("Enter element ");
                    list.add(position,scanner.nextInt());
                }
                case 3->{
                    System.out.println("Enter number of size ");
                    int size = scanner.nextInt();
                    List<Integer> temp = new ArrayList<>(size);
                    for(int i=0;i<size;i++){
                        System.out.print("enter element ");
                        temp.add(scanner.nextInt());
                    }
                    list.addAll(temp);
                }
                case 4->{
                    if(list.isEmpty()){
                        System.out.println("Empty ");
                    }else{
                        System.out.println("Not empty ");
                    }
                }
                case 5->{
                    System.out.println("Size is "+list.size());
                }
                case 6->{
                    System.out.print("Enter element that you want to remove ");
                    int element = scanner.nextInt();
                    list.remove(element);
                    System.out.println(list);
                }
                case 7->{
                    System.out.print("Enter position where you want to remove element ");
                    int pos = scanner.nextInt();
                    list.remove(pos);
                    System.out.println(list);
                }
                case 8->{
                    System.out.println("Enter position ");
                    int pos = scanner.nextInt();
                    System.out.println("Element at "+pos+" position is "+list.get(pos));
                }
                case 9->{
                    System.out.println("Enter element ");
                    int ele = scanner.nextInt();
                    if(list.contains(ele)){
                        System.out.println("Available");
                    }else{
                        System.out.println("Not available");
                    }
                }
                case 10->{
                    System.out.println("------Remove multiple element except these element ------- ");
                    System.out.print("Enter size ");
                    int size = scanner.nextInt();
                    ArrayList<Integer> temp = new ArrayList<>(size);
                    for(int i=0;i<size;i++){
                        System.out.print("Enter element ");
                        temp.add(scanner.nextInt());
                    }
                    list.retainAll(temp);
                    System.out.println(list);
                }
                case 11->{
                    System.out.print("Enter element ");
                    int ele = scanner.nextInt();
                    System.out.println("Element index where you want to replace ");
                    int index = scanner.nextInt();
                    list.set(index,ele);
                    System.out.println(list);
                }
                case 12->{
                    System.out.println("---------- Find first occurrence ----------");
                    System.out.println("Enter element ");
                    int ele = scanner.nextInt();
                    System.out.println("First occurrence is "+list.indexOf(ele));
                }
                case 13->{
                    System.out.println("----------- Last occurrence ---------------");
                    System.out.print("Enter element ");
                    int ele = scanner.nextInt();
                    System.out.println("Last occurrence is "+list.lastIndexOf(ele));
                }
                case 14->{
                    System.out.println("--------- Iterator ----------");
                    Iterator<Integer> iterator = list.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                }
                case 15->{
                    System.out.println("---------- List Iterator ----------");
                    ListIterator<Integer> listIterator = list.listIterator();
                    while (listIterator.hasNext()){
                        System.out.println(listIterator.next());
                    }
                    System.out.println("===========================");
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                }
                case 16->{
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid input ");
                }
            }
        }
    }
}

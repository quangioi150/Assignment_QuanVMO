package fa.training.dsa.unit02;

import java.util.*;
import java.io.*;

public class LinkedList {
    int data;
    LinkedList next;

    LinkedList(int num) {
        data = num;
        next = null;
    }

    static LinkedList insert(LinkedList head, int data) {
        if (head == null)
            head = new LinkedList(data);
        else {
            LinkedList temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = new LinkedList(data);
        }
        return head;
    }

    static void print(LinkedList head) {
        if (head != null) {
            System.out.print(head.data + " ");
            print(head.next);
        }
    }

    public static void Ex1(LinkedList l1, LinkedList l2) {
        DSASA0206 service = new DSASA0206();
        l1 = insert(l1, 1);
        l1 = insert(l1, 3);
        l1 = insert(l1, 5);
        l1 = insert(l1, 7);
        l1 = insert(l1, 9);
        System.out.print("L1: ");
        print(l1);
        System.out.println();
        l2 = insert(l2, 2);
        l2 = insert(l2, 4);
        l2 = insert(l2, 6);
        l2 = insert(l2, 8);
        System.out.print("L2: ");
        print(l2);
        System.out.println();
        System.out.print("Output: ");
        LinkedList result = service.merge(l1, l2);
        print(result);
    }

    public static void Ex2(LinkedList l1, LinkedList l2) {
        DSASA0206 service = new DSASA0206();
        l1 = insert(l1, 1);
        l1 = insert(l1, 2);
        l1 = insert(l1, 3);
        System.out.print("L1: ");
        print(l1);
        System.out.println();
        l2 = insert(l2, 4);
        l2 = insert(l2, 6);
        l2 = insert(l2, 8);
        System.out.print("L2: ");
        print(l2);
        System.out.println();
        System.out.print("Output: ");
        LinkedList result = service.merge(l1, l2);
        print(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        LinkedList l1 = null, l2 = null;
        do {
            System.out.println("-----Choice Function------");
            System.out.println("1.Ex1");
            System.out.println("2.Ex2");
            System.out.println("Chon bai: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Ex1(l1, l2);
                    System.out.println("\nSuccessful");
                    break;
                case 2:
                    Ex2(l1, l2);
                    System.out.println("\nSuccessful");
                    break;
            }
        } while (choose != 2);
    }
}


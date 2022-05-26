package fa.training.dsa.unit02;

import java.util.*;
import java.io.*;

public class DSASA0206 {
    public static LinkedList utility(LinkedList l1, LinkedList l2) {
        LinkedList head = new LinkedList(-1);
        LinkedList tail = head;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 == null)
            tail.next = l2;

        if (l2 == null)
            tail.next = l1;

        return head.next;
    }

    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.data < l2.data)
            return utility(l1, l2);
        else
            return utility(l2, l1);
    }
}


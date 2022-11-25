package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstIterator = l1;
        ListNode secondIterator = l2;

        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();

        long first = 0;
        long second = 0;

        while (firstIterator != null) {
            firstArray.add(firstIterator.val);
            first = first * 10 + firstIterator.val;
            firstIterator = firstIterator.next;
        }

        while (secondIterator != null) {
            secondArray.add(secondIterator.val);
            second = second * 10 + secondIterator.val;
            secondIterator = secondIterator.next;
        }

        Collections.reverse(firstArray);
        Collections.reverse(secondArray);
        System.out.println(first);
        System.out.println(second);

        first = reverseDigits(first);
        second = reverseDigits(second);
        long sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);

        ListNode ans = new ListNode((int) (sum % 10));
        sum = sum / 10;

        ListNode iterator = ans;
        while (sum > 0) {
            System.out.println(sum + " MOD " + (sum%10));
            iterator.next = new ListNode((int) (sum % 10));
            iterator = iterator.next;
            sum = sum / 10;
        }
        System.out.println(iterator.val);
        logNumber(ans);
        return ans;
    }

    static long reverseDigits(long num) {
        long rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    static void logNumber(ListNode list) {
        ListNode iterator = list;
        StringBuilder log = new StringBuilder();
        while (iterator.next != null) {
            log.append(iterator.val);
            iterator = iterator.next;
        }
        log.append(iterator.val);
        System.out.println(log.toString());
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ListNode l1 = new ListNode(0, new ListNode(8, new ListNode(6,  new ListNode(5, new ListNode(6,  new ListNode(8, new ListNode(3,  new ListNode(5, new ListNode(7)))))))));
        ListNode l2 = new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(0, new ListNode(8, new ListNode(5, new ListNode(8, new ListNode(9, new ListNode(7)))))))));
        Main.addTwoNumbers(l1, l2);

        ListNode l11 = new ListNode(9);
        ListNode l22 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        Main.addTwoNumbers(l11, l22);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
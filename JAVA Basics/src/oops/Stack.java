package oops;

public class Stack {
    int s[] = new int[10];
    int tos;

    public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        }
        s[++tos] = item;
    }

    public int pop() {
        if (tos >=0) {
            return s[tos--];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }

    }
}
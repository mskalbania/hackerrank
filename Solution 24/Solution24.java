import java.util.Scanner;
/*

Linked list removing duplicates algorithm

 */
public class Solution24 {

    public static Node removeDuplicates(Node head) {
        Node temphd = head;

        while (head.next != null) {
            if (head.data == head.next.data) {
                if (head.next.next != null) {

                    head.next = head.next.next;
                    // head.next = head;
                    // System.out.println("deleted");
                } else {
                    head.next = null;
                }
            }
            if ((head.next != null)&&(head.data != head.next.data)) {
                head = head.next;
            }
        }


        return temphd;


    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}

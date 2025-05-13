public class Queue {
    int size=5;
    int[] q=new int[5];
    int front=-1;
    int rear=-1;
    void enque(int x)
    {
        if(rear==size-1)
        {
            System.out.println("queue is full");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            q[rear]=x;
            System.out.println(x+" "+"inserted into the queue");
        }
    }
    void deque()
    {
        if(front==-1||front>rear)
        {
            front=-1;
            rear=-1;
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println(q[front]+" "+"deleted");
            front++;
        }
    }
    public static void main(String[] args)
    {
        Queue q =new Queue();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.enque(60);
        q.enque(70);
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
    }
    
}

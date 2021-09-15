public class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        for(int i = 0; i<10; i++){
            s.push(i*i);
        }
        // System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.print(s.st[s.top--] + " - ");
        }
        
    }
}

class Stack{
    int st[] = new int[10];
    int top = -1;

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(top == st.length){
            return true;
        }
        return false;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            st[++top] = data;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        // int val = stack[top--];
        return st[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return st[top];
    }

}
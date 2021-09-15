#include <iostream>
using namespace std;

int stack[10];
int size = 10;
int top = -1;

bool isEmpty(){
    if(top == -1){
        return true;
    }
    return false;
}
bool isFull(){
    if(top == size){
        return true;
    }
    return false;
}
void push(int data){
    if(isFull()){
        cout <<"Stack Overflow"<<endl;
    }else{
        top++;
        stack[top] = data;
    }
}
int pop(){
    if(isEmpty()){
        cout <<"Stack Underflow"<<endl;
        return -1;
    }        
    return stack[top--];
}
void topView(){
    if(isEmpty()){
        cout <<"Stack Underflow"<<endl;
    }else{
        cout << stack[top];
    }
    
}

void printStack(){
    if(isEmpty()){
        cout <<"Stack Underflow"<<endl;
    }else{
        while(!isEmpty()){
            cout <<pop()<<" - ";
        }
    }
}

int main() {
    
    push(10);
    push(25);
    push(3);
    pop();
    push(5);
    push(56);
    push(55);
    push(10);
    push(8);
    push(96);
    push(81);
    push(02);
    // cout<<pop();
    printStack();
     

}

#include <iostream>
using namespace std;

class node{

public:
    int data;
    node * next;
    node(int d){
        data = d;
        next = NULL;
    }
};

int deleteFromPosition(node *&head,int position){
    if(head == NULL){
        cout << "Underflow"<<endl;
        return 0;
    }else if(position == 0){
        node * del = head;
        head = head->next;
        return del->data;
    }else{
        int i = 0;
        node * del = head;
        node * delpre = head;
        while(i<position){
            delpre = del;
            del = del->next;
            i++;
        }
        delpre->next = del->next;
        return del->data;
    }
}

int deleteFromTail(node *&head){
    if(head == NULL){
        cout << "Underflow"<<endl;
        return 0;
    }else if(head->next == NULL){
        node * ele = head;
        head = NULL;
        return ele->data;
    }else{
        node * tail = head;
        node * pre = head;
        while(tail->next != NULL){
            pre = tail;
            tail = tail->next;
        }
        pre->next = NULL;
        return tail->data;

    }
}

int deleteFromHead(node *&head){
    
    if(head == NULL){
        cout <<"Underflow"<<endl;
        return 0;
    }else{
        node * temp = head;
        head = head->next;
        return temp->data;
    }
}

void insertAtMiddle(node *&head, int data, int p){

    if(head == NULL && p == 0){
        node * newNode = new node(data);
        newNode->next = head;
        head = newNode;
    }else{
        node * pos = head;
        int i = 0;
        while(i<p){
            pos = pos->next;
            i++;
        }
        node * newNode = new node(data);
        newNode->next = pos->next;
        pos->next = newNode;
    }
}

void insertAtTail(node *&head, int data){

    if(head == NULL){
        node * newNode = new node(data);
        newNode->next = head;
        head = newNode;
    }else{
        node * tail = head;
        while(tail->next != NULL){
            tail = tail->next;
        }
        node * newNode = new node(data);
        tail->next = newNode;
    }
}

void insertAtHead(node *&head, int data){
    node * newNode = new node(data);
    newNode->next = head;
    head = newNode;
}
void printList(node * head){
    node * print = head;
    while(print != NULL){
        cout <<print->data <<" -->";
        print = print->next;
    }
}

int main() {

    node * head = NULL;
    insertAtHead(head,56);
    insertAtTail(head,96);
    insertAtHead(head,5);
    insertAtMiddle(head,50,1);
    insertAtMiddle(head,24,2);
    insertAtTail(head,66);
    insertAtTail(head,90);
    // deleteFromHead(head);
    

    cout <<endl;
    printList(head);
    cout <<endl;
    // cout <<"tail is : "<<deleteFromTail(head);
     cout <<endl;
     deleteFromPosition(head,5);
    printList(head);
    
}

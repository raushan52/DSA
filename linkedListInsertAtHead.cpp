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

void insertAtTail(node * head,int data){
    if(head == NULL){
        node * n = new node(data);
        n->next = head;
        head = n;
    }else{
        node * tmp = head;
        while(tmp->next != NULL){
            tmp = tmp->next;
        }
        node * newNode = new node(data);
        tmp->next = newNode;
    }
}

void insertInMiddle(node * &head,int data, int position){

    if(head == NULL && position == 0){
        node * newnode = new node(data);
        newnode->next = head;
        head = newnode;
    }else{
        int i = 1;
        node * temp = head;
        while(i < position){
            temp = temp->next;
            i++;
        }
        node * newNode = new node(data);
        newNode->next = temp->next;
        temp->next = newNode;

    }
}

void insertAtHead(node * &head,int data){

    node * newNode = new node(data);
    newNode->next = head;
    head = newNode;
}

void print(node * head){
    node * temp = head;
    while(temp != NULL){
        cout <<temp->data<<"---> ";
        temp = temp->next;
    }
}


int main() {
    node * head = NULL;

    insertAtHead(head,8);
    insertAtHead(head,4);
    insertAtHead(head,3);
    insertInMiddle(head,50,2);
    insertAtTail(head,500);
    print(head);
}

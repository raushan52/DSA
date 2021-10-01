#include <iostream>
using namespace std;

class node{

public:

    int data;
    node * right;
    node * left;

    node(int d){
        data = d;
        left = NULL;
        right = NULL;
    }
};

node * buildTree(){
    int data;
    cin >>data;

    if(data == -1){
        return NULL;
    }
    node * root = new node(data);
    root->left = buildTree();
    root->right = buildTree();
    return root;
}

void print(node * root){
    if(root == NULL){
        return;
    }
    cout<<root->data<<" ";
    print(root->left);
    print(root->right);
}

void printInOrder(node * root){
    if(root == NULL){
        return;
    }
    printInOrder(root->left);
    cout<<root->data<<" ";
    printInOrder(root->right);
}

void printPostOrder(node * root){
    if(root == NULL){
        return;
    }
    printPostOrder(root->left);
    printPostOrder(root->right);
    cout<<root->data<<" ";
}

int main() {
    node * root = buildTree();
    cout<<"Preorder"<<endl;
    print(root);
    cout<<endl;
    cout<<"Inorder"<<endl;
    printInOrder(root);
    cout<<endl;
    cout<<"PostOrder"<<endl;
    printPostOrder(root);

}

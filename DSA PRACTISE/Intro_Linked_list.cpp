/*
In linked list there are two fields in a node first field stores the value at that node 
and the second field stores the address of the value at next node so the second field of the last node will be null

And the first node is called the head and there is a head var which stores the address of first node
*/

#include <iostream>
using namespace std;

class node{
    int data;
    node* next;
    node(int value){
        data = value;
        next = NULL;
        
    }
    friend void insertAtHead(node* &, int);
    friend void insertAtTail(node* &, int);
    friend void display(node*);
    friend bool search(node*, int);
};

void insertAtHead(node* &head, int value){
    node*n = new node(value);
    if (head == NULL){
        head = n;
    }
    n->next = head;
    head = n;

}

void insertAtTail(node* &head, int value){
    node* n = new node(value);

    if(head ==NULL){
        head = n;
    }

    node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }

    temp->next = n;
}

void display(node* head){
    node* temp = head;
    while(temp!=NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
  cout<<"NULL";
}

bool search(node* head, int key){
    while(head->next!=NULL){
        if(head->data==key){
            return true;
        }
        head=head->next;
    }
    return false;
}

int main(){
    node* heads = NULL;
    insertAtTail(heads, 1);
    insertAtTail(heads, 2);
    insertAtTail(heads, 3);
    display(heads);


    return 0;
}
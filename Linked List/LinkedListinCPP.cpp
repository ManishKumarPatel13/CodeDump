#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int d){
        this->data = d;
    }
};

void insert_at_head(node** head, int key){
    node* new_node = new node(key);
    if(head == NULL){
        *head = new_node;
        return;
    }
    new_node->next = *head;
    *head = new_node;
}
 
void insert_at_end(node** head, int key){
    node* new_node = new node(key);
    node *temp = *head;
    while(temp->next != NULL){
            temp = temp->next;
        }  
        temp->next = new_node;
}

int main(){
    
    return 0;
}
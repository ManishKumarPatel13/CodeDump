#include <iostream>
using namespace std;

class node
{
public:
    int data;
    node *next = NULL;

    node(int value)
    {
        data = value;
    }

    node(){
        
    }

    // void add_at_head(int element){
    //     if (data == NULL){
    //         data = element;
    //     }
    // }
};

void traverse(node *h)
{
    do
    {
        cout << h->data << " --> ";
        h = h->next;
    } while (h != NULL);
}

void insert_at_head(node** h, int element){
    node* new_node = new node();
    new_node->data = element;
    new_node->next = *h;
    *h = new_node;

}

int main()
{
    node *head;
    node *n1;
    node *n2;
    node *n3;

    // dynamically allocating the memory
    head = new node(4);
    n1 = new node(3);
    n2 = new node(2);
    n3 = new node();

    // Linking nodes to eachother
    head->next = n1;
    n1->next = n2;

    // traversing before adding
    traverse(head);

    insert_at_head(&head, 6);

    // traversing after adding
    traverse(head);
    return 0;
}
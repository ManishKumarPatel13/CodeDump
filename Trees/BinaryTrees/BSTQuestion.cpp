#include<iostream>
using namespace std;

// node* root;
class node{
    public:
    int data;
    node* right;
    node* left;

    node(int d){
        this->data = d;
    }
};

// void initialize(int key){
//     node* new_node = new node(key);
//     if (root == NULL){
//         root = new_node;
//     }
// }

int smallestK(node* r, int k){
    if (r == NULL){
        return -1;
    }

    smallestK(r->left, k);
    k--;
    if(k == 0){
        return r->data;
    }
    return smallestK(r->right, k);
}
      
int main(){
    node* root = new node(5);
    node* s = new node(3);
    node* t = new node(7);
    node* sl = new node(2);
    node* sr = new node(4);
    node* tr = new node(8);
    node* tl = new node(6);

    root->left = s;
    root->right = t;
    s->left = sl;
    s->right = sr;
    t->left = tl;
    t->right = tr;


    cout<<smallestK(root, 3);
    return 0;
}
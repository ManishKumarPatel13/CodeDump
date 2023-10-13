// #include <iostream>
// #include <list>
// using namespace std;


// class node{
//     int data;
//     node* next;
//     node(int value){
//         data = value;
//         next = NULL;
        
//     }
//     friend void insertAtHead(node* &, int);
//     friend void insertAtTail(node* &, int);
//     friend void display(node*);
//     friend bool search(node*, int);
//     friend void deleted(node* &, int);
// };

// void insertAtHead(node* &head, int value){
//     node*n = new node(value);
//     if (head == NULL){
//         head = n;
//     }
//     n->next = head;
//     head = n;
//     head->next->next = NULL;

// }

// void insertAtTail(node* &head, int value){
//     // cout<<"Starting insert at tail"<<endl;
//     // cout<<head;
//     node* n = new node(value);

//     if(head == NULL){
//         head = n;
//     }

//     node* temp = head;
//     // cout<<temp;
//     while(temp->next != NULL){
//         // cout<<"Running loop;"<<endl;
//         temp = temp->next;
//     }

//     temp->next = n;

// }

// void display(node* head){
//     node* temp = head;
//     while(temp!=NULL){
//         cout<<temp->data<<"->";
//         temp = temp->next;
//     }
//   cout<<"NULL"<<endl;
// }

// bool search(node* head, int key){
//     while(head->next!=NULL){
//         if(head->data==key){
//             return true;
//         }
//         head=head->next;
//     }
//     return false;
// }

// void deleted(node* &head, int key){
  
//     if (search(head, key))
//     {
//         if (head==NULL)
//     {
//          cout<<"link is Null nothing to delete"<<endl;
//     }
//     while (head->next->data!=key)
//     {
//         head=head->next;
//     }
//     head->next = head->next->next;
//     }

//     else{
//         cout<<"Key not in linked list"<<endl;
//     }
 
// }

// int main(){
//     // node* heads = NULL;
//     // // insertAtTail(heads, 1);
//     // // insertAtTail(heads, 3); // this is not working have to check
//     // insertAtHead(heads, 4);  
//     // insertAtHead(heads, 3);
//     // insertAtTail(heads, 2);
//     // insertAtTail(heads, 3);
 
//     // display(heads);
//     // // cout<<search(heads, 2);
//     // // deleted(heads, 3);
//     // deleted(heads, 2);
//     // display(heads);
//     // delete heads;


//     return 0;
// }


// int main(){
//     // int t;
// 	// cin>>t;
// 	// while(t){
// 	    int n, x, element;
// 	    cin>>n>>x;
// 	    list <int> ar;
// 	    for (int i = 0; i < n; i++)
//     {
//         cout<<"Enter list element:"<<endl;
//         cin>>element;
//         ar.push_back(element);
//     }
	    
// 	    int i=0;
	    
// 	    list<int>arl;
	    
// 	    while(i<=n and arl.size()<=x){
//             if(ar[i]){
//             }
//             i++;
// 	    }
//     return 0;
// }


#include <iostream>
using namespace std;

int main(){
    int a,b,c,d,e;
    float an, total;
    cin>>a>>b>>c>>d>>e;
    // a += cin>>a;
    // a+=cin>>a;
    // a+=cin>>a;
    // a+=cin>>a;
    // total = a / 500;
    total = a+b+c+d+e;
    total = total/500;
    cout<<total<<endl; 


    return 0;
}
#include <iostream>
using namespace std;

int main(){
    // what is a pointer?
    // pointer is a datatype == which holds the address of other datatypes

    int* b = nullptr; // This is how we declare a pointer variable and assign it to a null value to use it later   
    int a = 3;
    b = &a; 
    // this is a pointer variable which points to the address of a
    // & --> address of operator
    // When a program is runned it get's saved in the ram and it has a address
    //  and a pointer variable points to that storage position
    cout<<"The address of a is "<<b<<endl;
    cout<<"The address of a is "<<&a<<endl;

    // * ---> (value at) Dereference operator
    cout<<"The value at address b is "<<*b<<endl;

    int** c = &b; // This is a pointer to pointer variable this points to a address of pointer
    cout<<"The address of b is "<<c<<endl;
    cout<<"The value at address c is "<<*c<<endl;
    cout<<"The value stored in c is "<<**c;
    return 0;
}

/*
When & is used in a declaration, it is a reference operator. like int a = &d;
When & is not used in a declaration, it is an address operator. like cout<<&d;

pointer is a datatype which stores memory address

When * is used in a declaration, it is creating a pointer. like int* a = &d;
When * is not used in a declaration, it is a dereference operator. like cout<<*a;
*/
#include <iostream>
using namespace std;

int main()
{
    // basic example
    int a = 4;
    int *ptr = &a; // * is the reference and dereference operator;
    cout << ptr << endl;
    cout << &a << endl;   // & gives the address of the data type; here it is giving the address of a
    int **i = &ptr;       // This will give the address of the ptr variable
    cout << *ptr << endl; // This will give the value at the adress of ptr;
    cout << **i << endl;  // This will also give the value stored at ptr because it is pointing towards the value of a;

    // new keyword
    int *p = new int(40); // This will assign a new value to the referenced variable
    cout << "The value at p is " << *p << endl;

    // dynamically making an array using pointers
    int *arr = new int[3]; // This will allocate memory in heap not in stack and it will point to the arr in heap and can be accessible anywhere
    arr[0] = 4;
    arr[1] = 43;
    arr[2] = 54;

    cout << arr[0] << endl;
    // delete operator
    delete[] arr; // This will free the array;
    arr=nullptr;
    cout << arr[2] << endl; // This will print nothing coz memory is freed;
    cout << arr[0] << endl;


    return 0;
}
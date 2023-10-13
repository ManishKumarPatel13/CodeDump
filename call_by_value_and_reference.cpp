#include <iostream>
using namespace std;

int sum(int a, int b)
{
    int c = a + b;
    return c;
}

// This will not swap a and b
// void swap (int x, int y){
//     int temp = x;
//     x = y;
//     y = temp;
// }

// This is call by reference using pointers
// void actual_swap(int  *a, int *b){
//     int temp = *a;
//     *a = *b;
//     *b = temp;
// }

// This is call by reference using c++ reference variables
// in this function The address it is referring to gets changed
// void swap_by_refernce_var(int  & a, int & b){
//     int temp = a;
//     a = b;
//     b = temp;
// }

// By using this we can directly check for the return value of a function
int &swap_by_refernce_var(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
    return a; // This will return the address of a
}

int main()
{
    int a = 4, b = 3;
    cout << "The value of a and b is " << a << " and " << b << endl;
    // swap(a, b); // This value will get copied and become an var of swap function which will not effect the actual var

    // This will swap a and b by pointer reference
    // pointer_swap(&a, &b); // This will work bcz the address does not change and it gets address of var as input and and changes them to their respective values

    swap_by_refernce_var(a, b) = 322; // By this the value at a will change to 322
    cout << "The value of a and b is " << a << " and " << b << endl;
    return 0;
}
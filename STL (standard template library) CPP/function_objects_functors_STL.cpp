#include <iostream>
#include<functional> // All function objects are in this header file
#include<algorithm>
using namespace std;

int main(){
    // Function Objects (Functor) :- Function wrapped in a class so that it is available like an object
    int arr[] = {1, 3, 4, 89, 43, 22, 98, 54};
    // sort(arr, arr+5); // This will sort the array upto element at 5th index
    // sort(arr, arr+sizeof(arr)/sizeof(int)); // This will sort the whole array
    sort(arr, arr+sizeof(arr)/sizeof(int), greater<int>()); // greater is a function object and it will sort in the desending order
    for (int i = 0; i < sizeof(arr)/sizeof(int); i++)
    {
        cout<<arr[i]<<" ";
    }
    


    return 0;
}
#include<iostream>
using namespace std;
      
int binarySearch(int* arr, int n, int key){
    int mid = n/2;
    int first, last=n;
    cout<<mid;
        while(true){
            if (arr[mid] == key){
                cout<<mid<<endl;
                return mid;
            }
            else if (arr[mid] < key){
                last = mid;
                mid = (first + last)/2;
                cout<<mid<<endl;
            }
            else if(arr[mid] > key){
                first = mid;
                mid = (first + last)/2;
                cout<<arr<<endl;
            } 
        }
        // return -1;
}

int main(){
    int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // ar[0] = 1;
    // ar[1] = 2;
    int c;
    int d = sizeof(ar)/sizeof(int);

    // int *ptr;
    // ptr = ar;
    // ptr++;
    // ptr++;
    // cout<<*ptr;
    // cout<<d;
    c = binarySearch(ar, d, 3);
    cout<<c<<endl;
    return 0;
}



// binary search
// 1. find the element
//2. if the middle elementis the element we are looking for, return the index
// 3. if the middleelement is greaterthan the element we are looking for,search in the left half
// 4. if the middleelement is less than the element we are looking for, search in the right half
// 5. if the middle elementis equal to element we are looking for, return the index


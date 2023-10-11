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
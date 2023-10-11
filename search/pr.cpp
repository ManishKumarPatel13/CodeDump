#include<iostream>
using namespace std;

void printArray(int* ar, int n, int key){
    int mid = n/2;
    int s = 0;
    int e = n;
    while(true){
        if(ar[mid] == key){
            cout<<mid<<endl;
            break;
        } 
        else if(ar[mid] < key){
            s = mid + 1;
            mid = (s+e)/2;
        }
        else{
            e = mid -1;
            mid = (s+e)/2;
        }
    }

}
      
int main(){
    int arr[] = {2, 3, 4, 5, 6};
    // cout<<sizeof(arr)/sizeof(int);
    printArray(arr, 5, 3);
    return 0;
}
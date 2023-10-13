#include <iostream>
#include <algorithm>
using namespace std;

// Declaring function

// int linearSearch(int arr[], int n, int nn);
// int count = 0;

// int main(){

//     // Taking array inputs
//     int n;
//     cin>>n;
//     int arr[n];
//     for(int i = 0; i<n; i++){
//         cin>>arr[i];
//     }

// Taking the item which we have to find
// int nn;
// cin>>nn;

// if (linearSearch(arr, n, nn) == -1){
//     cout<<"Given value is not in the array"<<endl;
// }
// else{

//     cout<<"The value u are searching for is at the index no "<< linearSearch(arr, n, nn) << endl;
// }

//     return 0;

// }

// Linear search

// int linearSearch(int arr[], int n, int nn){
//     for(int j=0; j< n; j++){
//         if (arr[j]==nn){
//              return count;
//         }
//    else{
//     count++;
//    }
//
//     }
//     return -1;
// }

// ------------------------------ Binary Search ------------------------------

int binarySearch(int arr[], int n, int key);

int main()
{

    // Taking array inputs
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int key;
    cin >> key;

    if (binarySearch(arr, n, key) == -1)
    {
        cout << "Given key not in array" << endl;
    }
    else
    {
        cout << "The index of given key in array is " << binarySearch(arr, n, key) << endl;
    }

    return 0;
}

int binarySearch(int arr[], int n, int key)
{
    //     int mid, end, start;
    //     mid = n/2;
    //     sort(arr, arr+n);
    //     if (key == arr[n-1]){
    //         return n-1;
    //     }
    //     else if (key == arr[0]){
    //         return 0;
    //     }
    //     else if (key > arr[mid]){
    //     end = n - 1;
    //     for(int i = mid; i < n; i++){
    //         start = mid;
    //         mid = (start + end)/2;
    //         if (arr[mid] == key){
    //             return mid;
    //         }
    //     }
    //     }
    //     else if(key < arr[mid]){
    //         start = 1;
    //         for(int i = mid; i < n; i++){
    //             end = mid;
    //             mid = (start+end)/2;
    //             if (arr[mid] == key){
    //                 return mid;
    //             }
    //         }
    //     }
    //     else if (key == arr[mid]){
    //         return mid;
    //     }
    //     return -1;

    // ---------- second method ------------------

    int s = 0, e = n;

    while (s <= e)
    {
        int mid = (s + e) / 2;

        if (arr[mid] == key)
        {
            return mid;
        }

        else if (arr[mid] > key)
        {
            e = mid - 1;
        }
        else
        {
            s = mid + 1;
        }
    }
    return -1;
}
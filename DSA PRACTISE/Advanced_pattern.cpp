#include <iostream>
using namespace std;

int main(){

    // Inverted pattern // In this rows are 1 to n and column  used is (n+1) - row no. and elements is equal to column no.
    
    // int n;
    // cin>>n;
    // for(int i = 1; i<=n; i++){
    //     for(int j = 1; j <= (n-i)+1; j++){
    //         cout<<j<<" ";
    //     }
    //     cout<<endl;
    // }


    // 0-1 Pattern - In this rows is ranging from 1 to n and column is ranging from 1 to n and if row N0 + col no is even element is one else element is 0 

//     int n;
//     cin>>n;
//     int nn = 0;
//     for(int i = 1; i<=n; i++){
//         for(int j= 1; j <= i; j++){
            
//             if ((i+j)%2==0){
//                 cout<<1<< " ";
                
//             }
//             else {
//                 cout<<0<<" ";
//             }
//             }
//             cout<<endl;
//         }
        

    // Rhombus Pattern - In this rows are ranging from 1 to n and column are going from (n+(n-1)) to n and 
    // int n;
    // cin>>n;
    // for(int i = 1; i<=n; i++){
    //     for(int j= 1; j<= n+(n-i); j++){
    //         if (j<=(n-i)){
    //             cout<<" ";
    //         }
    //         else{
    //             cout<<"*"<< " ";
    //         }
    //     }
    //     cout<<endl;
    // }


    // Triangle number pattern - In this rows are n and column are also n but in column the space before an element is n-i

    // int n;
    // cin>>n;
    // for (int i = 1; i<=n; i++){
    //     int count = 1;
    //     for(int j = 1; j <= (n); j++){
    //         if (j<=(n-i)){
    //             cout<<" ";
    //         }
    //         else{
    //             cout<<count<<" ";
    //             count++;
    //         }
    //     }
    //     cout<<endl;
    // }


    // Palindromic pattern - Important

    // int n;
    // cin>>n;
    // for(int i =1; i<=n; i++){
    //     int k = 1;
    //      for(int j = 1; j<=n+i-1; j++){
            
    //         int s=1;
    //         if (j<=n-i){
    //             cout<<"  ";
    //         }
    //         else if (j==n){
    //             cout<<1<<" ";
    //         }
    //         else if (j>n-i and j < n){
    //             cout<<n-j+1<<" ";
    //         }
    //         else{
    //             cout<<j-n+1<<" ";
    //         }
    //      }

        
    //     cout<<endl;
    // } 


    // Upward-downward star patern

    // int n;
    // cin>>n;
    // for (int i = 1; i<=n; i++){
    //     for (int j = 1; j<=n+i-1;j++){
    //         if(j<=n-i){
    //             cout<<"  ";
    //         }
    //         else if (j==n){
    //             cout<<"* ";
    //         }
    //         // else if(j>n-i and j!=n){
    //         //     cout<<"* ";
    //         // }
    //         else{
    //             cout<<"* ";
    //         }
    //     }
    //     cout<<endl;
    // }

    // down - have to complete

    // for (int i = 1; i<=n; i++){
    //     for (int j = n+i-1; j>=1;j--){
    //         if(j>i-j){
    //             cout<<"* ";
    //         }
    //         else if (j==n){
    //             cout<<"* ";
    //         }
    //         // else if(j>n-i and j!=n){
    //         //     cout<<"* ";
    //         // }
    //         else{
    //             cout<<"  ";
    //         }
    //     }
    //     cout<<endl;
    // }


    // Zig-zag pattern

    int n;
    cin>>n;
    for(int i = 1; i<= (n/3); i++){
        for(int j=1;)
    }


    return 0;
}

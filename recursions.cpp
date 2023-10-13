#include <iostream>
using namespace std;

// int factorial(int n){
//     if (n <= 1){
//         return 1;
//     }
//     return n*factorial(n-1);
// }

int fibonacci(int a){
    if (a<2){
        return 1;
    }
    return fibonacci(a-2) + fibonacci(a-1);
}



int main(){
    int nn;
    cin>>nn;
    // cout<<factorial(nn)<<endl; 
    return 0;
}
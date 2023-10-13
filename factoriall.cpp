#include <iostream>
using namespace std;


// int main(){
//     int num1;
//     long num2 = 1.0;
//     cin>>num1;
//     for (int i = 1; i<=num1; ++i){
//         num2 *= i;
//     }
//     cout<<num2<<endl;


//     return 0;
// }


// Recursive factorial

int factorial(int n){
    if (n==0){
        return 1;
    }
    else {
        return n*factorial(n-1);
    }
}

int main(){
    cout<<"Enter Number:\n";
    long num;
    cin>>num;
    cout<<"The factorial of "<< num << " is " << factorial(num)<<endl;

}




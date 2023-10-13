#include <iostream>
#include <math.h>
using namespace std;

int main()
{

    // check prime number
    // int n;
    // cin>>n;
    // bool f = 0;
    // for(int i=2; i<n/2;i++){
    //     if (n%i==0){
    //         cout<<"This is not a prime number"<<endl;
    //         f = 1;
    //         break;
    //     }

    // }
    // if (not f){
    //     cout<<"This is a prime number"<<endl;
    // }

    // reverse a number
    // int n, rem, r=0, i=1;
    // cin>>n;
    // while (n!=0){
    //     rem = n%10;
    //     n /= 10;
    //     r = rem + r*10;
    //     i*=10;
    // }
    // cout<<r<<endl;

    // Armstrong number
    int n, rem, d = 0, last;
    cin >> n;
    last = n;
    while (last != 0)
    {
        rem = last % 10;
        last /= 10;
        d += pow(rem, 3);
        // cout<<d<<endl;
    }
    cout << d << endl;
    if (d == n)
    {
        cout << "This is a armstrong number" << endl;
    }
    else
    {
        cout << "This is not a armstrong number" << endl;
    }

    return 0;
}
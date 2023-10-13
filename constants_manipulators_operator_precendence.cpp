#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    // int a = 34;
    // char c = 'c';
    // cout<< "The value of a was "<<a<<endl;
    // a = 45;
    // c = '4';
    // cout<<"The value of a is "<<a;

    // Constant var

    // const int a = 4;
    // cout<<"The value of a was "<<a<<endl;
    // a = 34;
    // cout<<"The value of a is  "<<a;

    // return 0;

    // Manipulators

    // They help in data display formatting

    // const int a = 4;
    // cout<<"The value of a is  "<<a<<endl; // Here endl is a manipulator

    // Use of iomanip
    // int a = 3, b = 66, c=1233;
    // cout<<"The value of a without setw is "<<a<<endl;
    // cout<<"The value of b without setw is "<<b<<endl;
    // cout<<"The value of c without setw is "<<c<<endl;

    // cout<<"The value of a is "<<setw(4)<<a<<endl; // It sets character size of 4 digits
    // cout<<"The value of b is "<<setw(4)<<b<<endl;
    // cout<<"The value of c is "<<setw(4)<<c<<endl;


    // Operator precedence // In a Program which operator will work first is known as operator precedence
    int a=4, b= 3;
    int c = ((((a*5)+b)-45)+87); // if they have same precedence then associtivity comes into play

    cout<<c;





}

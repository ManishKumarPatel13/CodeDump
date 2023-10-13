#include <iostream>
using namespace std;

class complex{
    int a, b;
    public:
        complex(int x, int y){
            a = x;
            b = y;
        }

        complex(int x){
            a = x;
            b = 0;
        }

        complex(){
            a = 0;
            b = 0;
        }

        void printNumber(){
            cout<<"your number is "<<a<< " + "<< b<<"i"<<endl;
        }
};

int main(){
    complex c1(3, 5), c2(3), c3;
    c1.printNumber();
    c2.printNumber();
    c3.printNumber();
    return 0;
}

// it is same as function overloading you can make constuctor with different arguments which we will perform differently   
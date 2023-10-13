#include <iostream>
using namespace std;

class A{
    int a;
    public:
     A& setData(int a){
        // a = a; // This will give a garbage value and to solve this we use this operator
        this->a = a; // in c++ local variables are given most importance
        return *this; // This returns a object in which i can use other class functions;
     }

     void getData(){
        cout<<"The value of a is "<<a<<endl;
     }
         
};

int main(){
    // (This) is a keyword which is a pointer which points to the object which invokes the member function It's like the self used in python classes
    A a;
    a.setData(3).getData();
    a.getData();
    return 0;
}
#include <iostream>
using namespace std;

class complex{
    int a, b;
    public:
    // Creating a constructor

    /* constructor is a special member function with the same name as of the class
    it is automatically invoked
    it isused to initialize the objects of its class
    */

   complex(void); // constructor declaration if it's name is differnet from class it will return garbage value

   void prinData(){
    cout<<"your number is "<<a<< " + "<< b<<"i"<<endl;
   }
};

complex ::complex(void){ // it is a default constructor because it not take any arguments
    a = 10;
    b = 3;
}

int main(){
    complex c1, c2, c3;
    c1.prinData();
    c2.prinData();
    c3.prinData();
    return 0;
}

// Constructor doesn't have any return value or return type
// we cannot to their address
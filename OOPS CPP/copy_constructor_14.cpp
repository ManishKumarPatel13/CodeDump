#include <iostream>
using namespace std;

class number{
    int a;
    public:
        number(int num){
            a = num;
        }


        // when there is no copy constructor in the class compiler gives a class one copy constructor by default
        number(number &obj){ // This is a copy constructor and this 
            cout<<"Copy constructor called"<<endl;
            a = obj.a;
        }

        number(){}

        void display(){
            cout<<"The number for this object is "<<a<<endl;
        }
};

int main(){
    number x, y,z(45); // This will show an error because it not matches with any constructor 
    x.display();
    z.display();
    y = number(34);
    y.display();
    number z1(y); // Copy constructor invoked;
    z1.display();

    // z2 = z; // This will not run coz it's already made if we make a new object then it's possible

    number z2(z1); // It will run and copy constuctor will invoked
    z2.display();

    number z3 = z; // copy constuctor invoked


    // x1 should exactly resemble y or x;


    return 0;
}
/*
How constructor wil execute 

1. In multiple inheritence the constructor of the base class which is defined first will run first

2. In multilevel inheritence the constructor of the first base class will run first

3. The constructor of a virtual base class will execute first then after non virtual class constructor will execute

4. if there are multiple virtual base classes then it will come to their declaration

*/


// ----------------- CODE EXAMPLE ------------------

#include <iostream>
using namespace std;

class base1{
    int data1;
    public:     
        base1(int i){
            data1 = i;
            cout<<"Base1 class constructor called"<<endl;
        }
        void print_data1(){
            cout<<"The value of data1 is "<<endl;
        }

};

class base2{
    int data2;
    public:     
        base2(int i){
            data2 = i;
            cout<<"Base2 class constructor called"<<endl;
        }
        void print_data2(){
            cout<<"The value of data2 is "<<endl;
        }

};

class derived: public base2, public base1{ // Here if we declare base2 first then it's constructor will run first
    int derived1, derived2;
    public: 
        derived(int a, int b, int c, int d): base1(a), base2(b){  // This will give the value of a and b to the constuctor of base1 and base2
            derived1 = c;
            derived2 = d;
            cout<<"Derived class constructor called"<<endl;
        }
        void print_data(){
            cout<<"The value of derived1 and derived2 is"<< derived1<< " and "<<derived2<<endl;
        }
};



int main(){
    derived harry(1, 2, 4, 5);
    harry.print_data2();

    return 0;
}

// Order of constructor inheritence in the derived class base1 then base 2 then derived 
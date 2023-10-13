#include <iostream>
using namespace std;

class Base
{
public:
    int var1;
    void display()
    {
        cout << "Displaying base class variable var1 " << var1 << endl;
    }
};

class derived : public Base
{
public:
    int var_derived;
    void display()
    {
        cout << "Displaying derived class variable var_derived " << var_derived << endl;
    }
};

int main()
{
    Base *base_pointer;
    Base obj1;
    derived derobj1;
    //  base_pointer = &derobj1;
    // //  cout<<base_pointer<<endl; // This will give the address of derobj1
    //  base_pointer->display(); // This will display the base class member display
    // //  base_pointer->var_derived = 33; // This will show an error because you can't access derived class methods from base pointer

    derived *derived_pointer;
    derived_pointer = &derobj1;
    derived_pointer->var_derived = 45;
    derived_pointer->display(); // This will run derived class function
    return 0;
}

/*
if a base class pointer is pointing to a derived class it still calls the functions of a base class and this is called late binding
and you can also access the functions or variables that are inherited from the base class and u can't use derived class methods

but a derived class pointer pointing to the derived class will run derived class funcitons and base class public functions


and to change abouve situations virtual functions are used. if a base class pointer is pointing to a derived class and a virtual function is called
then the function of the derived class will run and same happens to a derived class pointer pointing to the base class .

virtual functions changes the default functionality and u can use both class functions
*/

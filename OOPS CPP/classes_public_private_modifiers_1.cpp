#include <iostream>
using namespace std;

class Employee
{
private: // private specifier only functions inside the class can access this and we can't access it outside of the class scope
    int a, b, c;

public: // Public specifier
    int d, e;
    void setData(int a1, int b1, int c1); // Declaration
    void getData()
    {
        cout << "The value of a is " << a << endl;
        cout << "The value of b is " << b << endl;
        cout << "The value of c is " << c << endl;
        cout << "The value of d is " << d << endl;
        cout << "The value of e is " << e << endl;
    }
};

void Employee::setData(int a1, int b1, int c1)
{ // :: is a scope resulator
    a = a1;
    b = b1;
    c = c1;
}

int main()
{
    Employee harry;
    // harry.a = 322; // a is a private variable so we can't access it here we have to change the value in the above func
    harry.setData(1, 2, 3);
    harry.d = 33;
    harry.e = 32;
    harry.getData();

    return 0;
}

/*
class members = attributes in class
class methods = functions of class
*/
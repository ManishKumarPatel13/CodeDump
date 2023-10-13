#include <iostream>
using namespace std;

// BASE Class
class Employee
{
    float salary;

public:
    int id;
    Employee() {}
    Employee(int inpid)
    {
        id = inpid;
        salary = 1222;
    }
    void printsal()
    {
        cout << "The salary of the given object is " << salary << endl;
    }
};

// Derived class syntax
/* class {{derived-class-name}} : {{visibility - mode}}  {{base-class-name}} // {{}} means it will be replaced
{
    class members and all
}

default visibility mode will be private and private members of the base class can't be inherited
*/

/* visibility mode means public or private / if we choose public then the public members of the base class will
become public members of the derived class/ but if we choose private then the public members of the base class
private members of the derived class; */

// deriving a programmer class from Employee base class
class programmer : Employee
{
public:
    int languagecode = 9;
    programmer(int inpid)
    {
        id = inpid;
    }

    void getData()
    {
        cout << "The id is " << id;
    }
};

int main()
{
    Employee harry(3), rohan;

    harry.printsal();

    programmer skillf(4);
    // skillf.printsal();
    skillf.getData();
    return 0;
}
#include <iostream>
using namespace std;

// class Employee
// {
//     int id;
//     int salary;

// public:
//     void setId()
//     {
//         salary = 122;
//         cout << "Enter the id of the employee" << endl;
//         cin >> id;
//     }

//     void getId()
//     {
//         cout << "The id of this employee is " << id << endl;
//     }
// };

// int main()
// {
//     // Employee harry, rohan, lavish;
//     // harry.setId();
//     // harry.getId();
//     Employee WA[4]; // If there is large number of objects we can use array as method to store all those objects
//     for (int i = 0; i < 4; i++)
//     {
//         WA[i].setId();
//         WA[i].getId();
//     }

//     return 0;
// }

// passing objects as functions arguments

class complex
{
    int a, b;

public:
    void setData(int a1, int b1)
    {
        a = a1;
        b = b1;
    }
    void setDataBySum(complex y1, complex y2)
    {
        a = y1.a + y2.a;
        b = y1.b + y2.b;
    }

    void printNumber()
    {
        cout << "Your complex number is " << a << " + " << b << "i" << endl;
    }
};

int main()
{
    complex c1, c2, c3;
    c1.setData(1, 3);
    c1.printNumber();

    c2.setData(2, 4);
    c2.printNumber();

    c3.setDataBySum(c1, c2);
    c3.printNumber();
    return 0;
}
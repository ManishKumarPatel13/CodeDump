#include <iostream>
using namespace std;

class base
{
    int data1; // it is not inheritable;
public:
    int data2;
    void setData();
    int getData1();
    int getData2();
    void check()
    {
        cout << "just checking this function is private or public" << endl;
    }
};

void base ::setData()
{
    data1 = 10;
    data2 = 22;
}

int base ::getData1()
{
    return data1;
}

int base ::getData2()
{
    return data2;
}

// class derived : public base{ // publicaly deriving class
//     int data3;
//     public:
//         void process();
//         void display();
// };

class derived : base
{ // privately deriving class
    int data3;

public:
    void process();
    void display();
};

void derived ::process()
{ 
    setData();
    check(); // here it will show no error
    data3 = data2 * getData1();
}
 
void derived ::display()
{
    cout << "The value of data1 is " << getData1() << endl;
    cout << "The value of data2 is " << data2 << endl;
    cout << "The value of data 3 is " << data3 << endl;
}

int main()
{
    derived der;
    // der.setData();
    der.process();
    der.display();
    // der.check(); here it will show error because it is derived privately
    return 0;
}
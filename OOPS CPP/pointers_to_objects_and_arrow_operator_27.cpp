#include <iostream>
using namespace std;

class complex
{
    int real, imaginary;

public:
    void setData(int a, int b)
    {
        real = a;
        imaginary = b;
    }

    void getData()
    {
        cout << "The value is " << real << " i" << imaginary << endl;
    }
};

int main()
{
    complex c;
    // c.setData(4, 5);
    // c.getData();
    // complex *ptr = &c;
    complex *ptr = new complex; // This will create a new object of complex class;

    cout << ptr << endl; // This will give the address of c;
    ptr->setData(3, 5);  // this will run the function setdata ( -> ) is the function pointer it deferences and the runs the function
    ptr->getData();

    // ARRAY of objects
    complex *ptr1 = new complex[4];
    ptr1->setData(5, 67);
    ptr->getData();
    return 0;
}
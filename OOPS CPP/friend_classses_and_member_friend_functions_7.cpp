#include <iostream>
using namespace std;

// Forward declaration
class complex;

class calculator
{
public:
    int add(int a, int b)
    {
        return a + b;
    }
    int sumRealComplex(complex o1, complex o2);
    int sumComComplex(complex, complex);
};

class complex
{
    int a, b;

public:
    void setNumber(int a1, int b1)
    {
        a = a1;
        b = b1;
    }

    // individually declaring functions as friends but it is good only if u have to make small number of functions as friends

    // friend int calculator ::sumRealComplex(complex o1, complex o2);
    // friend int calculator ::sumComComplex(complex o1, complex o2);

    // Alternate method: Declaring an entire class as friend
    friend class calculator;

    void printNumber() 
    {
        cout << "Your number is " << a << " + " << b << "i" << endl;
    }
};

int calculator ::sumRealComplex(complex o1, complex o2)
{
    return o1.a + o2.a;
}

int calculator ::sumComComplex(complex o1, complex o2)
{
    return o1.b + o2.b;
}

int main()
{
    complex o1, o2;
    o1.setNumber(1, 4);
    o2.setNumber(3, 5);
    calculator calc;
    int res = calc.sumRealComplex(o1, o2);
    cout << "The sum of real numbers of o1 and o2 is " << res << endl;
    int resCom = calc.sumComComplex(o1, o2);
    cout << "The sum of complex numbers of o1 and o2 is " << resCom << endl;
    return 0;
}
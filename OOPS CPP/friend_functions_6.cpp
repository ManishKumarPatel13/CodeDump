#include <iostream>
using namespace std;

class complex
{
    int a, b;
public:
    void setNumber(int a1, int b1)
    {
        a = a1;
        b = b1; 
    }

    // just declaring subcomplex as a friend function of complex class
    friend complex sumComplex(complex o1, complex o2); // By this we are allowing to be subcomplex a friend of complex so it can access private vars of complex class

    void printNumber()
    {
        cout << "Your number is " << a << " + " << b << "i" << endl;
    }
};

complex sumComplex(complex o1, complex o2)
{
    complex o3;
    o3.setNumber(o1.a + o2.a, o1.b + o2.b); // error because a and b are private var of complex class before becoming friend
    return o3;
}
      
int main()
{
    complex c1, c2, sum;
    c1.setNumber(1, 4);
    c2.setNumber(3, 6);
    c1.printNumber();
    c2.printNumber();

    sum = sumComplex(c1, c2);
    sum.printNumber();


    return 0;
}



/* properties of friend functions
1. Not in the scope of class

2. since it is not in the scope of the class it cannot by called by a class object c1.sumcomplex() == error;

3. can be called without any object;

4. it takes a class object as arguments usually

*/
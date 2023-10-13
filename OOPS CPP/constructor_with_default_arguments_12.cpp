#include <iostream>
using namespace std;

class Simple
{
    int a, b;

public:
    Simple(int x, int y = 0)
    { // if we don't provide argument y it will automatically set it as 0
        a = x;
        b = y;
    }

    void printData()
    {
        cout << "The value of a and b is " << a << " and " << b << endl;
    }
};

int main()
{
    Simple s1(4, 5);
    s1.printData();
    return 0;
}
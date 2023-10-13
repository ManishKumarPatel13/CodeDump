#include <iostream>
using namespace std;

/*
 syntax for initialization  list in constructor:

 constructor (arguments list) : initialization section
 {
    code
 }

 ex;
 class test{
    int a, b;
    public:
        Test(int d, int e) : a(d), b(e){
            cout<<"constructor called:"<<endl;
        }
 };
*/

class test
{
    int a, b;

public:
    // test(int d, int e) : a(d), b(e)
    // {
    //     cout << "constructor called:" << endl;
    //     cout << "The value of a and b is " << a << " and " << b;
    // }
    
//     test(int d, int e) : a(d), b(e + d)
//     {
//         cout << "constructor called:" << endl;
//         cout << "The value of a and b is " << a << " and " << b;
//     }
// };
    test(int d, int e) : b(e), a(d+b) // This will show  an garbage value coz b is not assigned till  now
    {
        cout << "constructor called:" << endl;
        cout << "The value of a and b is " << a << " and " << b;
    }
};

int main()
{

    test t(3, 2);

    return 0;
}
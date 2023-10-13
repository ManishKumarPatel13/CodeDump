#include <iostream>
using namespace std;

class num
{
    static int count;

public:
    num()
    {
        count++;
        cout << "This is the time when constructor is called for object number " << count << endl;
    }

    ~num()
    { // This is how you make a destructor
        cout << "This is time when destructor is called for object " << count << endl;
        count--;
    }
};

int num ::count = 0;

int main()
{
    cout << "we are inside our main function" << endl;
    cout << "Creating first object" << endl;
    num n1;
    { // Block means after running the code inside the block gets destroyed and run till all constructors gets destroyed
        cout << "Entering this block" << endl;
        cout << "Creating two more objects" << endl;
        num n2, n3;
        cout << "Exiting this block" << endl;
    } // that's why n2 n3 destroyed before n1
    cout << "Back to main" << endl;
    return 0;
}

// Destructor deletes all the dynamic memory allocated by the constructor; and it neither takes any argument nor
// returns anything
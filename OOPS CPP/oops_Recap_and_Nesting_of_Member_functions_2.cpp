#include <iostream>
#include <string>

using namespace std;

// Have to get the source code

class binary
{
    string s; // This is a private var because in class every function is private and it is pre-defined
    void chk_bin();

public:
    void read();
    void ones_compliment();
    void display();
};

void binary ::read()
{
    cout << "Enter a binary number " << endl;
    cin >> s;
}

void binary ::chk_bin()
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' and s.at(i) != '1')
        {
            cout << "The given number is not a binary number";
            exit(0);
        }
    }
}

void binary ::ones_compliment()
{
    chk_bin(); // By doing this we don't have to write a driver code for this function and this is called nesting of member functions
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) == '1')
        {
            s.at(i) = '0';
        }
        else
        {
            s.at(i) = '1';
        }
    }
}

void binary ::display()
{
    for (int i = 0; i < s.length(); i++)
    {
        cout << s.at(i);
    }
    cout << endl;
}

int main()
{

    // class --> Extension of struct

    binary b;
    b.read();
    // b.chk_bin(); // this will show error because it is a private function
    b.ones_compliment();
    b.display();

    return 0;
}
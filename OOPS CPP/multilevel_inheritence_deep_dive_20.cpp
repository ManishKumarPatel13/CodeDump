#include <iostream>
using namespace std;

class student
{
protected:
    int roll_number;

public:
    void set_number(int);
    void get_number();
};

void student ::set_number(int a)
{
    roll_number = a;
}

void student ::get_number()
{
    cout << "The roll no is " << roll_number << endl;
}

class exam : public student
{
protected:
    float maths, physics;

public:
    void set_marks(float m, float p)
    {
        maths = m;
        physics = p;
    }

    void get_marks()
    {
        cout << "The marks of maths and physics are " << maths << " and " << physics << endl;
    }
};

class result : public exam
{
    float percentage;

public:
    void display()
    {
        get_number();
        get_marks();
        cout << "Your percentage is " << (maths + physics) / 2 << endl;
    }
};

int main()
{
    /*
    notes:
    1. a --> b --> c
    2. student is the base class for exam and exam is the base class for result;
    3. ABC is called inheritence path
    */

    result harry;
    harry.set_number(1213);
    harry.set_marks(85.6, 78.8);
    harry.display();
    return 0;
}
/*
when hybrid inheritence is used the last derived function will getthe frist base base class two times from the two classes der
ived from the first base class which will create ambiguity

like  A --> B in this B and C are made form A and D is made from B and C so D will get Base class A from both B and C and it will confuse it.
      |     |
      C --> D
so to solve this problem we use virtual base classes it will say that there will be no copy of me everytime you see A takes only one time
*/

// Syntax to make virtual base class:

/*
class B : virtual public A{ // Like this a virtual keyword is used before or after  visibility mode

}
*/

// ---------------- CODE EXAMPLE --------------------

/*
Inheritence:


student --> test
student --> sports
test + sports --> result
*/

#include <iostream>
using namespace std;

class student
{
protected:
    int roll_no;

public:
    void set_number(int a)
    {
        roll_no = a;
    }
    void print_number()
    {
        cout << "Your roll no is " << roll_no << endl;
    }
};

class Test : virtual public student // if we don't use virtual it will give us ambiguity error
{ 
protected:
    float maths, physics;

public:
    void set_marks(float m1, float m2)
    {
        maths = m1;
        physics = m2;
    }

    void print_marks(void)
    {
        cout << "your result is here: " << endl
             << "Maths: " << maths << endl
             << "Physics: " << physics << endl;
    }
};

class sports : public virtual student // we can use it after visibility mode also
{ 
protected:
    float score;

public:
    void set_score(float sc)
    {
        score = sc;
    }

    void print_score()
    {
        cout << "Your PT score is " << score << endl;
    }
};

class result : public Test, public sports
{
private:
    float total;

public:
    void display()
    {
        total = maths + physics + score;
        print_number();
        print_marks();
        print_score();
        cout << "your Total score is: " << total << endl;
    }
};

int main()
{
    result harry;
    harry.set_marks(78, 23);
    harry.set_number(4200);
    harry.set_score(9);
    harry.display();
    return 0;
}
#include <iostream>
using namespace std;

class Employee
{

    int id;
    static int count; // This var is shared with all the objects it means it is a class prop. not object prop

public:
    void setData()
    {
        cout << "Enter the id" << endl;
        cin >> id;
        count++;
    }

    void getData()
    {
        cout << id << endl;
        cout << "Employee count " << count << endl;
    }

    static void getCount()
    { // This fun. will be class function and only static data members can be used in it
        // cout<<id<<endl; // This will show an error because id is not a static data member
        cout << "the value of count is " << count << endl;
    }
};

int Employee ::count = 1000; // Have to declare it outside of class because every will have the same value and have to be updated outside of class

int main()
{
    Employee harry, rohan;
    // count is the static data member of employee
    harry.setData();
    harry.getData();

    rohan.setData();
    rohan.getData();

    Employee::getCount(); // Like this you can access a static func. without any object

    return 0;
}
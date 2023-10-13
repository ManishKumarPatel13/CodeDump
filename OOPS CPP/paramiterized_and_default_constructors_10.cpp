#include <iostream>
#include <cmath>
using namespace std;

// class complex
// {
//     int a, b;

// public:
//     complex(int, int); // This is a parameterized constructor because it takes parameter's

//     void prinData()
//     {
//         cout << "your number is " << a << " + " << b << "i" << endl;
//     }
// };

// complex ::complex(int x, int y)
// {
//     a = x;
//     b = y;
// }

// int main()
// {

//     // methods to call a parameterized constructor;

//     // implicit call
//     complex ac(5, 7);

//     // Explicit call
//     complex bc = complex(5, 7);

//     ac.prinData();
//     bc.prinData();

//     return 0;
// }

// ------------- Second Example ------------------------

class point
{
    int x, y;
    friend float distance(point, point);

public:
    point(int a, int b)
    {
        x = a;
        y = b;
    }

    void displayPoints()
    {
        cout << "The co-ordinate of the given point is (" << x << "," << y << ")" << endl;
    }
};

// Function to calculate distance between two points

float distance(point a, point b)
{
    return sqrt(pow((b.x - a.x), 2) + pow((b.y - a.y), 2));
}

int main()
{
    point P(1, 1);
    point Q(1, 1);

    P.displayPoints();
    Q.displayPoints();

    float d = distance(P, Q);
    cout << "The distance between the two points is " << d << endl;

    return 0;
}
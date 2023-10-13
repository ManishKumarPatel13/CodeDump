#include <iostream>
using namespace std;

class shop
{
    int id;
    float price;

public:
    void setData(int a, float b)
    {
        id = a;
        price = b;
    }

    void getData()
    {
        cout << "The price of id " << id << " is " << price << endl;
    }
};

int main()
{

    // ARRAY of objects
    //  complex *ptr1 = new complex[4];
    //  ptr1->setData(5, 67);
    //  ptr->getData();

    int size = 3;

    shop *ptr = new shop[size]; // This creates a pointer variable which points to  3 shop objects
    shop *ptrtemp = ptr;        // this creates a pointer variable which points to the ptr var;
    int p, i = 0;
    float q;
    for (i = 0; i < size; i++)
    {
        cout << "Enter Id and price of item " << i + 1 << endl;
        cin >> p >> q;
        ptr->setData(p, q);
        ptr++;
    }

    for (i = 0; i < size; i++)
    {
        cout << "Item number: " << i + 1 << endl;
        ptrtemp->getData();
        ptrtemp++;
    }

    return 0;
}
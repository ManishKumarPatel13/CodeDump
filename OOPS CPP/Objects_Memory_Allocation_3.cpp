#include <iostream>
using namespace std;

class shop
{
    int itemId[50];
    int price[50];
    int counter;

public:
    void initCounter()
    {
        counter = 0;
    }
    void setPrice();
    void displayPrice();
};

void shop ::setPrice()
{
    cout << "Enter Id of your item no " << counter + 1 << endl;
    cin >> itemId[counter];
    cout << "Enter price of your item " << endl;
    cin >> price[counter];
    counter++;
}

void shop ::displayPrice()
{
    for (int i = 0; i < counter; i++)
    {
        cout << "The price for your itemId " << itemId[i] << " is " << price[i] << endl;
    }
}

int main()
{
    shop dukaan;
    dukaan.initCounter();
    dukaan.setPrice();
    dukaan.setPrice();
    dukaan.setPrice();
    dukaan.displayPrice();
    return 0;
}

/*in classes if a var is common to all the objects then its stored only one time in memory and the var specific
for a given function will get stored one time each*/

#include <iostream>
#include <cmath>
using namespace std;

// dynamically means the value made at runtime

class BankDeposit
{
    int principal, years;
    float interest_rate, returnValue;

public:
    BankDeposit() {}                     // If this will not be made error will be there because if no arguments will given the compiler can't decide what to call
    BankDeposit(int p, int t, int ir);   // if interest rate value is like 10 %
    BankDeposit(int p, int t, float ir); // if interest rate value is like 0.05 and all
    void print_amount()
    {
        cout << "you will get a amount of " << returnValue << " after " << years << " years "
             << "on your investment of " << principal << " with a interest rate of " << interest_rate << endl;
    }
};

BankDeposit ::BankDeposit(int p, int t, float ir)
{
    principal = p;
    years = t;
    interest_rate = ir;
    // returnValue = p;
    // for (int i = 0; i < years; i++){
    //     returnValue = returnValue * (1+ir);
    // }

    returnValue = principal * pow(1 + interest_rate, years);
}

BankDeposit ::BankDeposit(int p, int t, int ir)
{
    principal = p;
    years = t;
    interest_rate = float(ir) / 100;
    returnValue = principal;
    for (int i = 0; i < years; i++)
    {
        returnValue = returnValue * (1 + interest_rate);
    }
}

int main()
{
    BankDeposit c;
    int p, y;
    float ir, r;
    cin >> p >> y >> ir;
    c = BankDeposit(p, y, ir);
    c.print_amount();
    return 0;
}
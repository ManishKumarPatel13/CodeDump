#include <iostream>
#include <math.h>
using namespace std;

int main()
{

    // Binary to Decimal
    // int bin_n, rem;
    // int dec=0;
    // cin>>bin_n;
    // int po = 0;
    // while(bin_n!=0){
    //     rem = bin_n%10;
    //     bin_n /= 10;
    //     dec += rem*pow(2, po);
    //     ++po;
    // // dec--;
    // }
    // cout<<dec<<endl;

    // decimal to binary

    int dec, rem, i = 1, bin = 0;
    cin >> dec;
    while (dec != 0)
    {
        rem = dec % 2;
        dec /= 2;
        bin += rem * i;
        i *= 10;
    }
    cout << bin << endl;

    return 0;
}
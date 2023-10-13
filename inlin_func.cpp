#include <iostream>

using namespace std;

// inline float product(float a, float b){
//     // it is not recommended to use below lines in inline func.
//     // static int c = 0;  // This executes only one time 
//     // c += 1;    // The value of c will be saved everytime u call the func.
//     return a*b + c;
// }

float moneyrecieved(float money, const float factor = 1.04){
        return money * factor;
}

int main() {
    // int a, b;
    // cout<<"Enter the value of a and b:\n";
    // cin>>a>>b;
    // cout<<"The Product of a and b is: "<< product(a, b)<<endl;
    float money;
    cout<<"Enter the the money you have:\n";
    cin>>money;
    cout<<"If You have "<<money<<"you will receive: "<<moneyrecieved(money);
    cout<<"If You have "<<money<<"you will receive: "<<moneyrecieved(money, 10.2);

}
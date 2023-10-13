#include <iostream>
using namespace std;

int main(){
    // Example of an array 

    int marks[] = {23, 33, 22, 55};
    int mathmarks[4];
    mathmarks[1] = 32;
    mathmarks[0] = 22;
    // cout<<marks[2];
    // cout<<mathmarks[1];

    // You can change value of an array

    marks[2] = 12;
    // cout<<marks[2];

    // Printing array elements with loop
    // for (int i = 0; i < sizeof(marks)/sizeof(int); i++){
    //     cout<<marks[i]<<endl;
    // }

    for (int i : marks){
        cout<<i<<endl;
    }
    return 0;
}
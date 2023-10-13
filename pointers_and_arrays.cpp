#include <iostream>
using namespace std;

int main(){
    // pointers in arrays don't need a reference operator it directly points to the address of its variable 
    int marks[4] = {23, 22, 54, 34};
    cout<<marks<<endl;  // This is giving me the address of marks
    cout<<*marks<<endl; // This will give me the  value at first block of the array
    cout<<*(marks + 1)<<endl; //This will give me the value at second block of the array
    cout<<*(marks + 2)<<endl; //This will give me the value at third block of the array
    cout<<*(marks + 3)<<endl; //This will give me the value at fourth block of the array

    // To print the whole array values
    for(int i = 0; i < sizeof(marks)/sizeof(int); i++){
        cout<<marks[i]<<" ";
    }

    return 0;
}
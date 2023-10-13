#include <iostream>
using namespace std;

int main(){
    int age;
    cout<<"Enter Your age: ";
    cin>>age;

    if (age < 18){
        cout<<"You can't drive";

    }

    else if (age==18){
        cout<<"You can drive but not alone";
    }

    else {
        cout<<"You can drive";
    }


    return 0;
}
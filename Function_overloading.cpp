#include <iostream>
using namespace std;

int add(int a, int b){
    cout<<"using functions with two arguments"<<endl;
    return a+b;
}

int add(int a, int b, int c){
        cout<<"using functions with three arguments"<<endl;

    return a+b+c;
}

int main(){
    cout<<add(3,6)<<endl;
    cout<<add(3, 5, 6)<<endl;
    return 0;
}
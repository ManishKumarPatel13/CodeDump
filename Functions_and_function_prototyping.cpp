#include <iostream>
using namespace std;

// functions are a top down concept so u have to define a function before using it And to solve this issue we use function prototyping


// Function prototype - To use function we will define it above the main function
// int summ(int a, int b); // This is the way to define a function It says that after main there will be a function name as summ
int summ(int, int); // If we only write the type it will run the same
void g();

int main(){
    cout<<"Enter numbers by space"<<endl;
    int num1,num2;
    cin>>num1>>num2;
    // The parameters we give to a function when calling it are called actual parameters
    cout<<summ(num1, num2);
    return 0;
}

int summ(int a, int b){ // The parameters we define in a function are called formal parameters and formal parameters are used only inside function
    int c;
    c = a + b;
    return c;
}

void g(){
    cout<<"Hello"<<endl;
}
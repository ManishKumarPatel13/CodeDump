#include <iostream>
using namespace std;

// structure is a user defined datatype which is a combination of different data types

// typedef struct employee // This is a data type in which three different datatype variables are stored (It's like an object used in python)
// {
//     int eId; // It allocates the sum of memory of all datatypes in this it will be 4+1+4 = 9
//     char favChar;
//     float salary;
// }ep;  // By using typedef we are saying that we are calling the struct employee as ep

// union money // In this if you have set the value of one variable then u can not use other varibles  

// {
//     int rice; // It allocates the memory of highest datatype in the union in this it will be 4
//     char car;
//     float pounds;
// };

int main(){

    // structure

    // struct employee harry; 
    // ep harry;
    // harry.eId = 1;
    // harry.favChar = 'm';
    // harry.salary = 12000;
    // cout<<harry.salary<<endl;
    // cout<<harry.favChar<<endl;
    // cout<<harry.eId<<endl;

    // union 

    // union money m1;
    // m1.rice = 34;
    // m1.car = 'c'; // If I use two datatypes it will return an garbage value of rice variable but give correct value of car
    //               // so the variable initalized first will get overwritten
    // // cout<<m1.rice;
    // cout<<m1.car;


    // Enum
    enum meal{Breakfast, lunch, dinner}; // It gives index to the values like bf has value 0 lunch has 1 and dinner has 2
    meal m1 = Breakfast;
    meal m2 = lunch;
    cout<<m1<<endl;
    cout<<m2<<endl;
    return 0;
}       
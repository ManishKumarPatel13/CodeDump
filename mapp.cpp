#include <iostream>
#include<map> // You have to include map to use it
using namespace std;

int main(){
    // syntax of map
    // map< datatype of key, datatype of value> map name;
    map<int, string> Employee;
    Employee[1] = "error";
    Employee[2] = "multi-error";
    for(int i = 1; i <=Employee.size(); i++){
        cout<<Employee[i]<<endl;
    }
    return 0;
}
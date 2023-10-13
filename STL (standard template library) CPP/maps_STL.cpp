#include <iostream>
#include<map>
#include<string>

using namespace std;

void display(map<string, int> &m){
    map<string, int> ::iterator itr;
    for(itr = m.begin(); itr != m.end(); itr++){
        cout<<(*itr).first<< " "<<(*itr).second<<endl; // .first will give the key and .second will give the value of a map
    }
}

int main(){
    map<string, int> marks;
    marks["manish"] = 69;
    marks["Rohan"] = 98;
    marks.insert({{"harry", 89}, {"rahul", 87}}); // it is how you insert values in map  
    display(marks);
    return 0;
}


// It is like the dictionary in python
#include <iostream>
#include <list>

using namespace std;

void display(list<int> &lst){
    list<int> ::iterator it;
    for (it=lst.begin(); it != lst.end(); it++)
    {
        cout<<*it<<" ";
    }
    cout<<endl;
    
}


int main(){
    list<int> list1; // list of 0 length
    list<int> list2(3); // empty list of size 7
    int size,element;
    cout<<"Enter the length of list:"<<endl;
    cin>>size;
    for (int i = 0; i < size; i++)
    {
        cout<<"Enter list element:"<<endl;
        cin>>element;
        list1.push_back(element);
    }

    list<int> ::iterator iter = list2.begin();
    *iter = 45;
    iter++;
    *iter = 23;
    iter++;
    *iter= 11;

    // cout<<*iter<<" "; // This will give the first element in list
    // iter++; // This will increase the iter value by one and now it points to the second element of the list
    // cout<<*iter<<" "; // This will give the second element of the list 

    // display(list1);
    // list1.remove(4); // this will remove all occurence of an element from the list
    // list1.sort(); // This will sort the list
    display(list1);
    // list1.merge(list2); // This will merge list2 in list1
    // cout<<"After merging "<<endl;
    // list1.sort(); // This will sort the list
    // list1.reverse(); // This will reverse the list
    list1.swap(list2); // This will interchange the elements of list1 with list2
    display(list1);

    

    return 0;
}
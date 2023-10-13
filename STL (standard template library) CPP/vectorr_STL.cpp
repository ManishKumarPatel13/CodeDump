#include <iostream>
#include <vector>

using namespace std;

void display(vector<int> &v)
{
    for (int i = 0; i < v.size(); i++)
    { // size is like len used in python list
        cout << v[i] << " ";
        // cout<<v.at(i)<<" "; This will do same job as above
    }
}

int main()
{

    vector<int> vec1;
    vector<int> vec2(3);    // This will create a three element vector
    vector<int> vec3(3, 4); // This will create a vector having 4 three times
    int element, size;
    cout << "Enter size of your vector " << endl;
    cin >> size;
    for (int i = 0; i < size; i++)
    {
        cout << "Enter an element to add to this vector" << endl;
        cin >> element;
        vec1.push_back(element); // This is like append used in python list
    }
    // vec1.pop_back(); // it is like pop used in python list it removes the last element of vector
    cout << endl;
    // display(vec1);
    vector<int>::iterator iter = vec1.begin(); // This is how you make interator in cpp vector begin will point it to the first element

    vec1.insert(iter + 2, 5, 566); // first parameter is position second parameter is how many times u want to insert, third parameter is what you want to insert
    display(vec1);
    return 0;
}
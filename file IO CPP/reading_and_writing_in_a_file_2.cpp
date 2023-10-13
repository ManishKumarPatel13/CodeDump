#include <iostream>
#include <fstream> // This is the header file you have to include to work with files in c++

/*
Useful classes for working with files in c++ are:
1. fstreambase class
2. ifstream -> derived from fstreambase
3. ofstream -> derived from fstreambase
*/

// In cpp to work with files u have to open them first and the two ways of opening a file are:
// 1. Using the constructor
// 2. Using the member function Open() of the class

using namespace std;

int main()
{
    string st = "new written command";
    string st2;
    // opening file using constructor and writting in it | ofstream is used for writing
    // ofstream out("samplefile_2.txt"); // we got ofstream class from the fstream header file and this is a write operation
    // out<<st; // This will write the string st in the file and remove the all text in file

    // Opening file using constructor and reading it | ifstream is used for reading
    ifstream in("st2.txt"); // You can choose whatever object name you wanna choose
    // in>>st2; // this will give the text input form the file to the string; and only one word we get as input
    getline(in, st2); // by using this we will get a whole line as input

    cout << st2;

    return 0;
}
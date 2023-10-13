#include <iostream>
#include <fstream>

using namespace std;

int main(){
    // ofstream out;
    // out.open("samplefile_2.txt");
    // out<<"This is me";
    // out.close(); // This is to close the file

    ifstream in;
    string st, st2;
    in.open("samplefile_2.txt"); 
    // in>>st>>st2; // st will get the first word of file and st2 will get the second word of the file;
    // cout<<st<<st2;

    while(in.eof()==0){ // eof means end of file so if it is not at end loop will continue to run
        cout<<in.eof()<<endl;
        getline(in, st);
        cout<<st<<endl;
    }
    in.close();
    return 0;
}


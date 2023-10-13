#include<iostream>
using namespace std;

int c = 45;

int main(){
    // int a, b, c;
    // cin>>a>>b;
    // c = a+b;
    // cout<<::c; //global reference operator
    
    float d = 34.4;
    long double e = 34.4;
    // 34.4 is by default a double
    // 34.4f is considered as float
    // 34.4l is considered as a long double

    // cout<<"The size of 34.4 is "<<sizeof(34.4)<<endl;
    // cout<<"The size of 34.4 is "<<sizeof(34.4f)<<endl;
    // cout<<"The size of 34.4 is "<<sizeof(34.4F)<<endl;
    // cout<<"The size of 34.4 is "<<sizeof(34.4l)<<endl;
    // cout<<"The size of 34.4 is "<<sizeof(34.4L)<<endl;

    // cout<<"value of d"<<d<<endl<<"value of e"<<e;


    //********************Reference variables***************************
    // float x = 455;
    // float & y = x; // & is a reference operator in this y is also referring to x if we change y x will automatically change
    // cout<<x<<endl<<y<<endl;

    // *************************** TypeCasting ***********************
    int a = 45;
    float b = 45.46;
    // cout<<"The value of a is "<< (float)a;
    // cout<<"The value of b is "<< (int)b;

    int c = int(b);
    cout<<c;


}
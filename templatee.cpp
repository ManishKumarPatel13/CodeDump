#include<iostream>
using namespace std;


/*
syntax
                
template <class T> // by this you can make many classes using different datatypes
class vector{
    T* arr; // You can replace T with any data type
    public:
        vector(t* arr){
            // code
        }
}

and to call write in main function 
vector <datatype> objname(pointer name);
*/


// template first example using function

// template <typename T> // you can use any data type and it is also called paramiterized classes 
// T summ(T num1, T num2){
//     return num1 + num2;
// }


// Template second example with class
template <class T>
class vector{
    public:
        T*arr;
        int size;
        vector(int m){
            size = m;
            arr = new T[size];
        }

        T dotprod(vector &v){
            T d = 0;
            for (int i = 0; i < size; i++){
                d += this->arr[i] * v.arr[i]; // this means which vector type u have used ti call this method 
            }
            return d;
        }
};

int main(){

// cout<<summ(2, 4)<<" "<<summ(2.4, 2.4); code for first example

// for datatype int
// vector v1(3);
// v1.arr[0] = 5;
// v1.arr[1] = 4;
// v1.arr[2] = 3;

// vector v2(3);
// v2.arr[0] = 4;
// v2.arr[1] = 1;
// v2.arr[2] = 4;


// for datatype float this will give wrong value bcz we have made class for integer
vector <float>v1(3); // This is how u will assign the data type
v1.arr[0] = 0.5;
v1.arr[1] = 4;
v1.arr[2] = 3.5;

vector <float>v2(3);
v2.arr[0] = 4.3;
v2.arr[1] = 1;
v2.arr[2] = 4;

float a = v1.dotprod(v2);
cout<<a;

} 


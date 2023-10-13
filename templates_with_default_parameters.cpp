#include <iostream>
using namespace std;

template<class t1=int, class t2=float> // we are making default datatypes for class
class manish{
    public:
        t1 a;
        t2 b;
        manish(t1 x, t2 y){
            a = x;
            b = y;
        }
        void display(){
            cout<<"The value of a and b is "<<a<< " and "<<b<<endl;
        }
};

int main(){
    manish<> m(4, 6.2);
    m.display();
    return 0;
}
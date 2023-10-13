#include <iostream>
using namespace std;

template<class T1>
class sumtwoclass{
    public:
    T1 a;
    sumtwoclass(T1 x){
        a = x;
    }
    T1 summ(sumtwoclass &v){
        T1 su = this->a + v.a;
        return su;
    }
};


int main(){
    sumtwoclass one(4);
    sumtwoclass two(5);
    int s = one.summ(two);
    // cout<<s;
    int *ptr = &s; // ptr is pointing towards the address of s
    int **pr = &ptr; // pr is pointing towards the address of ptr
    int ***p = &pr;
    cout<<***p<<endl;
    return 0;
}
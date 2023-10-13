#include <iostream>
using namespace std;


// template <typename T> // if you use typename you don't have to further tell the compiler about datatype when executing
// class manish{
//     public:
//         T data;
//         manish(T a){
//             data = a;
//         }
// };

void func(int a){
    cout<<"This is normal function "<<a<<endl;
}

template<class T>
void func(T a){
    cout<<"This is template function "<<a<<endl;
}

int main(){
    // manish h('j');
    // cout<<h.data; 
    func(4); // This will run the normal function because compiler gives more priority to the exact function   
    return 0;
}
#include <iostream>
using namespace std;

// Syntax for multiple inheritence or to make a derived class with more than one base class

/* class {{derived}} : {{Visibility-mode}} {{base1}}, {{visibility-mode}} {{base2}} 
{

body of derived class

};

*/


class base1{
    protected:
        int base1int;
    public:
        void set_base1int(int n){
            base1int = n;
        }
        

};

class base2{
    protected:
        int base2int;
    public:
        void set_base2int(int n){
            base2int = n;
        }


};

class derived : public base1, public base2{
    public:
        void show(){
            cout<<"The value of base 1 and base 2 is "<< base1int<< " and "<<base2int<<endl;
        }
};

int main(){
    derived harry;
    harry.set_base1int(32);
    harry.set_base2int(22);
    harry.show();
    return 0;
}
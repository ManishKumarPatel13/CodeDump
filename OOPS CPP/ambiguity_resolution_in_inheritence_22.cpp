#include <iostream>
using namespace std;

class base1{
    public:
        void greet(){
            cout<<"How are you?"<<endl;
        }
};

class base2{
    public:
        void greet(){
            cout<<"Are you fine?"<<endl;
        }
};

class derived : public base1, public base2{
    public:
        void greet(){
            // base1::greet(); // This will now use the greet func of base 1 and this is called ambiguity resolution
            base2::greet(); // Now this will use the greet function of base 2
        }
};

class B{
    public:
        void say(){
            cout<<"hello world"<<endl; 
        }
};

class D: public B{
    int a;
    public:
        void say(){ // if there is a defined method in derived class then that func wil overwrite base class method
            cout<<"hello everyone"<<endl;
        }

};

int main(){
    // ambiguity 1 code
    /*base1 base1obj;
    base2 base2obj;
    base1obj.greet();
    base2obj.greet();
    derived d;
    d.greet();*/  // This will show error brcause it will not know which greet func to take before using ambiguity resolution operator

    // ambiguity 2 code
    D d;
    d.say();

    return 0;
}


/*
when a class is derived from more then one base class having functions with same name then the ambiguity 
resolution is used:  
*/


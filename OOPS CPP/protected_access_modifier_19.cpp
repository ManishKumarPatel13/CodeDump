#include <iostream>
using namespace std;

class base{
    protected: // this will be inheritable in public mode 
    int a; // if we want to inherit a  but keep b as private and not make a as public we use protected
    private:
    int b; // this will be not inheritabe in any mode

};

class derived : protected base{ //visibility modecan be protected 
    // if we inherit as protected so we can further inherit it 
};


int main(){
    
base b;
derived d;
// cout<<b.a; // will not work since a is protected

    return 0;
}


/*

                            Public Derivation      	Private Derivation    	Protected Derivation
Private members           	Not Inherited              	Not Inherited              	Not Inherited              
Protected members           	Protected                Private                    Protected                    
Public members           	    Public	                 Private                    Protected 

*/
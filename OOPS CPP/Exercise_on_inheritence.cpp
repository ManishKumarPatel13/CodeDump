#include <iostream>
#include <cmath>

using namespace std;


class simpleCalculator
{
protected:
    float num1, num2;
    // string uf;

public:
    void set_values()
    {
        cin>>num1>>num2;
    }
    void get_values()
    {

            cout << "The value of your given calculation is " << num1 + num2 << endl;
        
            cout << "The value of your given calculation is " << num1 - num2 << endl;
        
        
            cout << "The value of your given calculation is " << num1 * num2 << endl;
        
        
            cout << "The value of your given calculation is " << num1 / num2 << endl;
        }
};


class scientific_Calculator : public simpleCalculator
{
protected:
    // float num1, num2;
    // string uff;

public:
    // void set_value()
    // {
    //     cin>>num1>>num2;
    // }
    void get_value()
    {

            cout << "The power is " << pow(num1, num2) << endl;
            cout << "The root is " << pow(num1, 1 / num2) << endl;
            cout <<"The sin(a) and sin(b) is "<< sin(num1)<<" and "<< sin(num2)<<endl;
            cout <<"The cos(a) and cos(b) is "<< cos(num1)<<" and "<< cos(num2)<<endl;
        }
};

    class hybrid_calculator : public scientific_Calculator{

    };

    int main()
    {
        hybrid_calculator cc;
        cc.set_values();
        cc.get_values();
        // cc.set_value();
        cc.get_value();
        return 0;
    }

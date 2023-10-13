#include <iostream>
using namespace std;

// class y;
// // class x;
// // void add(x, y);

// class x
// {
//     int data;

// public:
//     void setValue(int value)
//     {
//         data = value;
//     }
//     friend void add(x, y);
// };

// class y
// {
//     int num;

// public:
//     void setValue(int value)
//     {
//         num = value;
//     }
//     friend void add(x, y);
// };

// void add(x o1, y o2)
// {
//     cout << "By adding data's of x and y objects gives " << o1.data + o2.num << endl;
// }

// int main()
// {

//     x a;
//     a.setValue(3);

//     y b;
//     b.setValue(4);

//     add(a, b);

//     return 0;
// }


// Second example

class c2;

class c1{
    int a;
    friend void exchange(c1 &, c2 &);
    public:
        void ininput(int a1){
            a = a1;
        }
        void display(){
            cout<<"The value of c1 is "<< a<<endl;
        }
};

void exchange(c1 &, c2 &);
 
class c2{
    int b;
    friend  void exchange(c1 &, c2 &);
    public:
        void ininput(int a1){
            b = a1;
        }

        void display(){
            cout<<"The value of c2 is "<<b<<endl;
        }
};

void exchange(c1 &x, c2&y){
    int temp = x.a;
    x.a = y.b;
    y.b = temp;
}

int main(){
    c1 oc1;
    c2 oc2;

    oc1.ininput(43);
    oc2.ininput(53);
    oc1.display();
    oc2.display();

    exchange(oc1, oc2);
    oc1.display();
    oc2.display();
}


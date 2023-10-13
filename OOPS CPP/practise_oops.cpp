#include <iostream>
using namespace std;

class Pet
{
    private:
        int teeth;
        string health;
    public:
        int age;
        string name, place, knew;
    void setData(int t, string hel){
        teeth = t;
        health = hel;
    }
    void getData(){
        cout<<"The name of pet is "<< name <<endl;
        cout<<"The age of " <<name << " is "<< age<< " years"<<endl;
        cout<<"The first day we knew about " << name << " was " << knew << endl;
        cout<<name<<" has "<<teeth<<" no. of teeths"<<endl;
        cout<<name<<"'s health is "<<health<<endl;
        cout<<name<<" was brought from "<<place<<endl;
    }
};

int main(){
    Pet dog;
    dog.setData(42, "excellent");
    dog.age = 3;
    dog.knew = "22/08/2019";
    dog.name = "Lucy";
    dog.place = "Raipur";
    dog.getData();
    return 0;
}
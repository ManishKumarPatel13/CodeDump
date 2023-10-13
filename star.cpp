#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number of rows you want to print:\n";
    cin>>n;
    for (int i = 1; i<=n; i++){
        for(int j = i; j>0;j--){
            cout<<"*";
        }
        cout<<endl;


    }

    return 0;
}
#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

int main(){
    srand(time(0));
    int r_n = rand() % 15;
    int guess;
    // cout<<r_n<<endl;
    for(int i = 0; i < 5; i ++){
        cout<<"Enter the number:"<<endl;
        cin>>guess;
        if(guess < r_n){
            cout<<"The number is greater then the guess"<<endl;
        }
        else if(guess > r_n){
            cout<<"The number is smaller then the guess"<<endl;
        }
        else{
            cout<<"You got the number"<<endl;
            break;
        }
        cout<<"You have "<< 4 - i << " chances left"<<endl;
        if (4-i == 0){
            cout<<"GAME OVER!!"<<endl;
        }
    }
    return 0;
}
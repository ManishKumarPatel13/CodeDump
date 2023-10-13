#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;


int main(){
    // srand(12); // it have different series of numbers so right now we are getting series 12 as output
    srand(time(0)); // now the time changes so the series number also change and give different output at every runtime
    for(int i=0; i < 6; i++){
    cout<<rand()%6+1<<endl; // if we use rand before srand it will give the same series of numbers; it will give random numbes from 0 to 6
    }

    return 0;
}
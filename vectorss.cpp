#include <iostream>
#include <vector>
using namespace std;

int main(){

  vector <int> vec = {2, 4, 3, 6, 1, 9};
  int sum=0;
  int product = 1;
  for (int i = 0; i < vec.size(); i++) {
    if (vec[i] % 2 == 0) {
      sum += vec[i];
      // cout << sum << "\n";
    }
    else {
      product *= vec[i];
    }
  }
  cout<<sum<<"\n";
  cout<<product;

    return 0;
}
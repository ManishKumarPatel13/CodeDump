#include <iostream>
#include <math.h>

using namespace std;
/*
int main() {
  // Add your code below  
  double weight;
  std::cout<<"Enter your weight on kg\n";
  std::cin>>weight;
  weight = weight*0.38;
  std::cout<<"Your weight on mars:"<<weight<<"\n"; 
}

int main(){
  double distance;
  cout<<"Enter distance in miles:\n";
  cin>>distance;
  distance = distance*1.6;
  cout<< "Your distance in Kilometer's is: " << distance;
  if (distance < 3) {
    cout<<"you can walk";
  }

  else if (distance == 8) {
    cout<<"Use Your bike";
  }
  
  else {
    cout<<"Use your car";
  }
}
*/
int main() {
  double weight;
  int planet;
  cout<< "Enter your weight in KG:\n";
  cin>> weight;
  cout<< "Enter in which planet you want to fight:\n";
  cin>> planet;
  switch(planet) {
    case 1: {
      weight *= 0.38;
      cout<< weight;
      break;
    }

    case 2: {
      weight *= 0.91;
      cout << weight;
      break;
    }

    case 3: {
      weight *= 0.38;
      cout<< weight;
      break;
    }

    case 4: {
      weight *= 2.34;
      cout<<weight;
      break;
    }

    case 5: {
      weight *= 1.06;
      cout<< weight;
      break;
    }

    case 6: {
      weight *= 0.92;
      cout<< weight;
      break;
    }

    case 7: {
      weight *= 1.19;
      cout<<weight;
      break;
    }

    default: {
      cout<<"invalid input";
    }
  }
}
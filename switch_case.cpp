#include <iostream>
using namespace std;

int main()
{
  double weight;
  int planet;
  cout << "Enter your weight in KG:\n";
  cin >> weight;
  cout << "Enter in which planet you want to fight:\n";
  cin >> planet;
  switch (planet)
  {
  case 1:
  {
    weight *= 0.38;
    cout << weight;
    break;
  }

  case 2:
  {
    weight *= 0.91;
    cout << weight;
    break;
  }

  case 3:
  {
    weight *= 0.38;
    cout << weight;
    break;
  }

  case 4:
  {
    weight *= 2.34;
    cout << "Your weight will be " << weight << " KG";
    break;
  }

  case 5:
  {
    weight *= 1.06;
    cout << "Your weight will be " << weight << " KG";
    break;
  }

  case 6:
  {
    weight *= 0.92;
    cout << "Your weight will be " << weight << " KG";
    break;
  }

  case 7:
  {
    weight *= 1.19;
    cout << "Your weight will be " << weight << " KG";
    break;
  }

  default:
  {
    cout << "invalid input";
  }
  }
}
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit;
  float amt;
  std::cin>>unit;
  if(unit<=200)
  {amt=unit*0.5;}
  else if(unit<=400)
  {amt=unit*0.65+100;}
  else if(unit<=600)
  {amt=unit*0.80+200;}
  else
  {amt=unit*1.25+425;}
  std::cout<<"Rs."<<(int)amt;
}
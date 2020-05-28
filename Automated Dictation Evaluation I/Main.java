#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  std::string s1,s2;
  getline(std::cin,s1);
  getline(std::cin,s2);
  int r=s1.compare(s2);
  if(r==0)
  {std::cout<<"It is correct";}
  else
  {std::cout<<"It is wrong";}
}
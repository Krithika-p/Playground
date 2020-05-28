#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  std::string s1;
  getline(std::cin,s1);
  int s=s1.length();
  std::cout<<"The number of letters in the name is "<<s;
}
#include<iostream>
#include<string>
int main() 
{ 
	std::string fnum;
	//Type your code here
    std::cin>>fnum;
  int p=fnum.find(".");
  if(p>=0)
  {std::string dec=fnum.substr(p+1);
  std::cout<<"Floating part is : "<<dec;}
  else
  {std::cout<<"Floating part is : ";}
}
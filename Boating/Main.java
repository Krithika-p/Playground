#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c,fw;
  std::cin>>w>>a>>c;
  fw=(a*75)+(c*30);
  if(fw<=w)
  {std::cout<<"Boat is stable";}
  else
  {std::cout<<"Boat will drow";}
}
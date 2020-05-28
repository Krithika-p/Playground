#include<iostream>
int main()
{
 int max,w;
  std::cin>>max>>w;
  if(w<max)
  {std::cout<<"Yes, you can enter.";}
  else if(w==max)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}
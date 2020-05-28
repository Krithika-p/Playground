#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char s[800];
  std::cin.getline(s,800);
  int w=0,i=0;
  while(s[i]!='\0')
  {if(s[i]==' ')
   {w++;}
   i++;
  }
  if(w<=10)
  {std::cout<<"Caption eligible for the contest";}
  else
  {std::cout<<"Caption not eligible for the contest";}
   
}
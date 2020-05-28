#include<iostream>
int main()
{
 int x,y,c,r;
  std::cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  std::cin>>x>>y>>c;
  switch(c)
  {
    case 1:r=x+y;
      std::cout<<"\n"<<r;
           break;
    case 2:r=x-y;
      std::cout<<"\n"<<r;
           break;
    case 3:r=x*y;
      std::cout<<"\n"<<r;
           break;
    case 4:r=x/y;
      std::cout<<"\n"<<r;
           break;
    case 5:r=x%y;
      std::cout<<"\n"<<r;
           break;
    default: std::cout<<"\nInvalid operation";
      break;
  }
}
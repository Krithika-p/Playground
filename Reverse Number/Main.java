#include <iostream>
int main() 
{
	// Type your code here
  int x,r=0,rem;
  std::cin>>x;
  while(x!=0)
  {
    rem=x%10;
    r=r*10+rem;
    x=x/10;
  }
  std::cout<<r;
	return 0;
}
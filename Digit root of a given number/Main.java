#include<iostream>
int sum(int n)
{
 int rem,s=0;
  if(n<=9)
    return n;
  else
  {
   while(n!=0)
   {
   rem=n%10;
   s=s+rem;
   n=n/10;
   }
    sum(s);
  
  }
  
} 
int main()
{
int n;
  std::cin>>n;
  std::cout<<sum(n);

}
#include<iostream>
int main(){
  // Type your code here
  int fact=1,n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
   fact=fact*i; 
  }
  std::cout<<fact;
}
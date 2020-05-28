#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int count=0,n;
  float score=0.0;
  while(count<3)
  {
   std::cin>>n;
   if((n%2 != 0) && n>0)
   {count++;
   score+=1.0;}
   else if((n%2 == 0) && n>0)
   {score-=0.5;}
   else
   { score-=1.0;
     break;}
  }
  std::cout<<score;
      
  }

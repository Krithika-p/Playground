#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  std::cin>>r;
  int a[r][r],sum=0,sumb=0;
  for(int i=0;i<r;i++)
  {  for(int j=0;j<r;j++)
       {std::cin>>a[i][j];}
  }
 for(int i=0;i<r;i++)
       {sum+=a[i][i];
       sumb+=a[i][r-i-1];
       }
 if(sum==sumb)
 {std::cout<<"Yes";}
  else
  {std::cout<<"No";}

   
}
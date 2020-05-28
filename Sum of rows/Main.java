#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
 std::cin>>r>>c;
 int a[r][c];
 for(int i=0;i<r;i++)
 {for(int j=0;j<c;j++)
 {std::cin>>a[i][j];
 }
 }
 int sumr[r],sumc[c];
 for(int i=0;i<r;i++)
 { sumr[i]=0;
   for(int j=0;j<c;j++)
 {sumr[i]+=a[i][j];
 }
 }
 for(int i=0;i<r;i++)
 {std::cout<<sumr[i]<<"\n";
 }
 
}
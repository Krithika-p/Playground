#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c],re[r][c];
  for(int i=0;i<r;i++)
  { for(int j=0;j<c;j++)
    {std::cin>>a[i][j];}}
 for(int i=0;i<r;i++)
 {  for(int j=0;j<c;j++)
    {std::cin>>b[i][j];
     re[i][j]=a[i][j]+b[i][j];
     std::cout<<re[i][j]<<" ";
    }
  std::cout<<"\n";
 }
}
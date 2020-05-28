#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,c;
  std::cin>>n>>m;
  int ar=0,ma=0;
  if(n>m)
  {c=m;}
  else
  {c=n;}
  int **a=(int**)malloc(n*m*sizeof(int));
  for(int i=2;i<=c+1;i++)
  {a=(int**)realloc(a,n-1*m-1*sizeof(int));
   if(i%2==0)
   {ar++;}
   else
   {ma++;}
   }
  free(a);
  if(ar>ma)
  {std::cout<<"Arun Gupta";}
  else
  {std::cout<<"Mani Iyer";}
}
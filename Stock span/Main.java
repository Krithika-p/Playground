#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,c1=1;
  cin>>n;
  int a[n],b[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<c1<<"\n";
  for(int i=1;i<n;i++)
  {
    if(a[i-1]<=a[i])
    {
      sum+=2;
      cout<<sum<<"\n";
    }
    else
    {
      cout<<c1<<"\n";
    }
  }
}
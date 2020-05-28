#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fs,fd,fsh,ss,sd,ssh,as,ad,ash,fp,sp,ap;
  cin>>fs>>fd>>fsh;
  int df=(fs*fd)/100;
  fp=fs-df+fsh;
  cout<<"In Flipkart Rs."<<fp;
  cin>>ss>>sd>>ssh;
  int ds=(ss*sd)/100;
  sp=ss-ds+ssh;
  cout<<"\nIn Snapdeal Rs."<<sp;
  cin>>as>>ad>>ash;
  int da=(as*ad)/100;
  ap=as-da+ash;
  cout<<"\nIn Amazon Rs."<<ap;
  if(fp<=sp && fp<=ap)
  {cout<<"\nHe will prefer Flipkart";}
  else if(sp<=ap && sp<=fp)
  {cout<<"\nHe will prefer Snapdeal";}
  else
  {cout<<"\nHe will prefer Amazon";}
}
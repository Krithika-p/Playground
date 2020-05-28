#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{int rem,c=0;
    //Your code goes here
 int k=n,x=n;
    while(k!=0)
    {
    rem=k%10;
    c++;
    k=k/10;
    }
 int sum=0;
    while(x!=0)
    {
     int r=x%10;
      sum=sum+power(r,c);
      x=x/10;
    }
 if(sum==n)
 {return 1;}
 else
 {return 0;}
   
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
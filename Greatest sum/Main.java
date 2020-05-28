#include<iostream>
using namespace std;
int main()
{int r,c;
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
 int maxr=0,pos;
 std::cout<<"Sum of rows is ";
 for(int i=0;i<r;i++)
 {std::cout<<sumr[i]<<" ";
 if(sumr[i]>maxr)
 {maxr=sumr[i];
  pos=i;}
 }
 std::cout<<"\nRow "<<pos+1<<" has maximum sum";
 for(int i=0;i<c;i++)
 { sumc[i]=0;
   for(int j=0;j<r;j++)
 {sumc[i]+=a[j][i];
 }
 }
 int maxc=0,posc;
 std::cout<<"\nSum of columns is ";
 for(int i=0;i<c;i++)
 {std::cout<<sumc[i]<<" ";
 if(sumc[i]>maxc)
 {maxc=sumc[i];
  posc=i;}
 }
 std::cout<<"\nColumn "<<posc+1<<" has maximum sum";
}
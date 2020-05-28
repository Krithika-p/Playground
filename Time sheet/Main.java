  #include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun,mon,tue,wed,thr,fri,sat;
  float r1,r2,r3,r4,r5,r6,r7,sum;
  cin>>sun>>mon>>tue>>wed>>thr>>fri>>sat;
  int hr=sun+mon+tue+wed+thr+fri+sat;
  if(sun>0 || sat>0)
  {if(sun>0)
  {r1=(sun*100);
  r1+=(r1*50)/100;
  }
   if(sat>0)
  {r7=(sat*100);
  r7+=(r7*25)/100;
  }
  }
  if(mon<=8)
  {r2=(mon*100);
  }
  else
  { int ex=(mon-8)*115;
    r2=800+ex;
  }
  if(tue<=8)
  {r3=(tue*100);
  }
  else
  { int ex=(tue-8)*115;
    r3=800+ex;
  } 
  if(wed<=8)
  {r4=(wed*100);
  }
  else
  { int ex=(wed-8)*115;
    r4=800+ex;
  } 
  if(thr<=8)
  {r5=(thr*100);
  }
  else
  { int ex=(thr-8)*115;
    r5=800+ex;
  } 
  if(fri<=8)
  {r6=(fri*100);
  }
  else
  { int ex=(fri-8)*115;
    r6=800+ex;
  }
  sum= r1+r2+r3+r4+r5+r6+r7;
  cout<<sum;
}
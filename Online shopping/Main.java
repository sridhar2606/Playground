#include<iostream>
using namespace std;
int main()
{
int fp,fd,fs,sp,sd,ss,ap,ad,as,f,s,a;
  cin>>fp >>fd >>fs >>sp >>sd >>ss >>ap >>ad >>as;
  f=(fp-(fp*fd/100))+fs;
  s=(sp-(sp*sd/100))+ss;
  a=(ap-(ap*ad/100))+as;
  cout<<"In Flipkart Rs." <<f <<"\n" <<"In Snapdeal Rs." <<s <<"\n" <<"In Amazon Rs." <<a <<"\n";
  if(f<=s && f<=a)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(s<a)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }

    
}
#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  float s,d;
  cin>>p>>t>>r;
  s=p*t*r/100;
  cout<<s<<endl;
  cout<<p+s<<endl;
  d=s*2/100;
  cout<<d<<endl;
  cout<<p+s-d<<endl;
}
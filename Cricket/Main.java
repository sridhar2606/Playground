#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int b,r,tr,bb;
  cin>>b >>r >>tr >>bb;
  float a=b/6;
  int c=bb/6;
  int d=bb%6;
  float of=((float)c+(float)d/10);
  float e=tr/of;
  float f=r/a;
  cout <<a <<"\n" ;
  cout<<std::fixed<<std::setprecision(1)<<of<<"\n";
  cout <<e <<"\n" <<f <<"\n";
  if(e>f)
  {
   cout<<"Eligible to Win";
  }
 else
 {
   std::cout<<"Not Eligible to Win";
 }
}
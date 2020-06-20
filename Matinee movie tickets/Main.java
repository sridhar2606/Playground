#include<iostream>
using namespace std;
int main()
{
  int a;
  double t;
  cin>>a;
  cin>>t;
  if(a>13 && t==13.30)
    {
    cout<<"$5.00";
    }
    else if(a<=13 && t==13.30)
    {
    cout<<"$2.00";
    }
   else if(a>13)
    {
    cout<<"$8.00";
    }
    else
    {
      cout<<"$4.00";
    }
}
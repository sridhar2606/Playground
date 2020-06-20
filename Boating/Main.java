#include<iostream>
using namespace std;
int main()
{
int w,a,c,t;
  cin>>w >>a >>c;
  t=(a*75+c*35);
  if(t<=w)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}
  
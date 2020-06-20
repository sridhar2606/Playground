#include<iostream>
using namespace std;
int main()
{
  int u;
  cin>>u;
  if(u<=200)
  {
    cout<<"Rs."<<int(u*0.5);
  }
  else if(200>u && u<=400)
  {
    cout<<"Rs."<<u*0.65+100;
  }
  else if(400>u && u<=600)
  {
    cout<<"Rs."<<u*0.80+200;
  }
  else
  {
    cout<<"Rs."<<u*1.25+425;
  }
  //Type your code here.
}
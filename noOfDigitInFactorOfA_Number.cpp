#include <iostream>
using namespace std;
int digit_count(long long int x)
{
    int count=0;
    while (x)
    {
       x=x/10;
       count++;
    }
    return count;
}
int fn(long long int n)
{
   long long int a,b;

   int res= digit_count(n);
   for(long long int i=2;i*i<=n;i++)
   {
      if(n%i==0)
      {
         a=n/i;
         b=i;
         int temp=digit_count(max(a,b));
         res = min(res,temp);
      }


   }
   return res;


}
int main() {
   long long  int n;
    cin>>n;
    int res = fn(n);
    cout<<res;

}

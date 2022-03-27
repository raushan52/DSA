#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;

    int arr[n];
    int color = 0;

    for(int i =0; i<n;i++){
        cin>>arr[n];
    }

    for(int j=0;j<=n;j++){
        if(arr[j] < arr[j+1]){
            color++;
        }
    }

    cout<<color;

}

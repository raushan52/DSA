#include <iostream>
using namespace std;
int main() {
    int n,m;

    cin>>n;
    cin>>m;

    char arr[n][m];

    for(int i =0; i<n;i++){
        for(int j = 0; j<m;j++){
            cin>>arr[i][j];
        }
    }

     for(int i =0; i<n;i++){
        for(int j = 0; j<m;j++){
            if(arr[i][j] == '.'){
                arr[i][j] = '0';
            }
        }
    }

    int row= 0;
    int col = 0;
     for(row =0; row<n;row++){
        for(col = 0; col<m;col++){
           if(arr[row][col] == '#'){
               cout<<arr[row][col];
           }
        }
        if(arr[row][col] == '#'){
            cout<<endl;
        }
        
    }

}

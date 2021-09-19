#include <iostream>
#include <string.h>
using namespace std;
int main() {
    string fruit[5];
    
    for(int i = 0;i<5;i++){
        cin>>fruit[i];
        
    }
  // string temp;
    // for (int i = 0; i < 5; ++i) {
    //     for (int j = 0; j < 5 -i-1; ++j) {
    //         if (fruit[j][0] > fruit[j + 1][0]) {
    //             temp = fruit[j];
    //             fruit[j] = fruit[j + 1];
    //             fruit[j + 1] = temp;
    //         }
    //     }
    // }
    string res[26];
     for(int i=0;i<26;i++)
        res[i]="1";

    for(int i=0;i<5;i++)
    {
         res[fruit[i][0]-'a']=fruit[i];
    }
    /* for(int i = 0; i<5;i++){
       
        cout << fruit[i]<<endl;
      
    }*/
    for(int i=0;i<26;i++)
    {
        if(res[i]!="1")
           cout<<res[i]<<endl;
    }

}

#include <iostream>
using namespace std;

int isprimeNumber(long long int);
int main() {
    long long int x,y;
    int firstPrime = 0;
    int secondPrime = 0;
    int finalPrime = 0;
    cin>>x;
    cin>>y;

    bool isPrime;
    
    for(long long int i =2; i<=x;i++){

        isPrime = isprimeNumber(i);

        if(isPrime == true){
            firstPrime = i;
           
        }
    }

    for(long long int i =2; i<=y;i++){

        isPrime = isprimeNumber(i);

        if(isPrime == true){
            secondPrime = i;
           
        }
    }

    finalPrime = firstPrime - secondPrime;

    cout<<finalPrime;  

}
int isprimeNumber(long long int n){
    bool isPrime = true;

    for(long long int i =2; i<= n/2; i++){
        if(n%i == 0){
            isPrime = false;
            break;
        }
    }
    return isPrime;
}
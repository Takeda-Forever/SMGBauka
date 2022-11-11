#include <iostream>
using namespace std;

int max(int num1, int num2) {
    //complete the function
    for(int i = 1; i < 2; i++){
        if(num1 <= num2){
            num1 = num2;
            return num1;
        }else{
            continue;
        }
    }
    cout << "Are you stupid!";
}

int main() {
    //getting inputs
    int first;
    cout << "First value:";
    cin >> first;
    cout << "Second value:";
    int second;
    cin >> second;
    cout << endl;
    
    //call the function and print result
    cout << "Max value:" <<max(first, second);
    
    return 0;
}
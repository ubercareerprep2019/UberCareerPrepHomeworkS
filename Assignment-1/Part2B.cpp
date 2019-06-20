#include <iostream>
using namespace std;
#include <string>

bool isStringPermutation(string s1, string s2){
    int j = 0;
    while(j < s2.length()){
        for(int i= 0; i<s1.length(); i++){
            if(s1.at(i)!=s2.at(j)){
                return false;
            }
            else if (s1.at(i)==s2.at(j)){
                j++;
            }
        }
    }
    return true;
}

int main(){
    string s1 = "abcd";
    string s2 = "bcda";
    cout<<isStringPermutation(s1, s2)<<endl;
    return 0;
}
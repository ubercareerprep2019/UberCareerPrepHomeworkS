#include <iostream>
using namespace std;
#include <vector>
#include <array>
#include<stdio.h> 
#include<stdlib.h> 
// using::cout;
// using::cin;


vector<int>pairsThatEqualSum(vector<int>inputArray, int targetSum){
    vector<int> pairs;
    int i, j;
    for(i = 0; i<inputArray.size(); i++){
        j = i+1;
        while(j<inputArray.size()){
            if(inputArray[i]+inputArray[j]!=targetSum){
                j++;
            }
            if (inputArray[i]+inputArray[j]==targetSum){
                pairs.push_back(inputArray[i]);
                pairs.push_back(inputArray[j]);
            }
        }
    }
    return pairs;
    //return inputArray[i];
    //return inputArray[j];
}



int main(){
    vector<int>input;
   string word;
    int sum;
    cout<<"please enter the sum:"<<endl;
    cin>>sum;
    int numbers;
    cout<<"please enter the array's elements:"<<endl;
    while(cin>>numbers){
        input.push_back(numbers);
        if (word=="stop"){
            break;
        }
    }
    
    cout<<pairsThatEqualSum(input, sum)<<endl;

    return 0;

}
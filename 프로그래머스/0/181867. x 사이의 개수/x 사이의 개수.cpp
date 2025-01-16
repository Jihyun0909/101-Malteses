#include <string>
#include <vector>

using namespace std;

vector<int> solution(string myString) {
    vector<int> answer;
    int idx = 0;
    for(int i = 0; i < myString.length(); i++){
        if(myString[i] == 'x'){
            answer.push_back(i - idx);
            idx = i+1;
        }
    }
    answer.push_back(myString.length() - idx);
    return answer;
}
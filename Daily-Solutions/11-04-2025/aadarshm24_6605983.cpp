/*
Problem: SpOoKy~CaSe
Date: 11-02-2025
Author: Aadarsh Mishra
GitHub: aadarshm24
ERP ID: 6605983

Approach:


Time Complexity: O(?)
Space Complexity: O(?)
*/

#include <iostream>
#include <string>
#include <vector>
using namespace std;

// Function to convert input string into spoky format
string solution(const string &spoky) {
    string result;
    bool upper = true; 

    for (int i = 0; i < spoky.length(); i++) {
        char c = spoky[i]; 
        
        if (c == '-' || c == '_') {
            result += '~';
        }

        if (c == '~') {
            result += '~';
        }

        if (upper)
            result += toupper(c); // Convert to uppercase
        else
            result += tolower(c); // Convert to lowercase

        upper = !upper; // Flip the flag
    }

    return result;
}
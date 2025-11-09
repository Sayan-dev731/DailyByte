# 💾 Daily Solutions Archive - Nth Fibonacci Term

<div align="center">

![DailyByte](https://img.shields.io/badge/DailyByte-Solutions-green?style=for-the-badge)
![Date](https://img.shields.io/badge/Date-Nov_8_2025-blue?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)

</div>

---

## 📋 Problem: Nth Fibonacci Term

**Date:** November 8, 2025  
**Difficulty:** 🟢 Easy  
**Topics:** Math & Recursion

### Problem Description

The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones. Given an integer `n`, return the nth term of the Fibonacci sequence (0-indexed).

[📖 View Full Problem Statement](../../Daily-Questions/11-08-2025.md)

---

## 📂 Solution Submissions

This folder contains all submitted solutions for the Nth Fibonacci Term problem.

### File Naming Convention

```
githubusername_ERPID.extension
```

**Example:** `sayandev731_2024001.py`

---

## ✅ Submission Checklist

Before submitting, ensure your solution includes:

- [ ] **Header Comment Block** with:
  - Problem name: Nth Fibonacci Term
  - Date: 11-08-2025
  - Your name and GitHub username
  - ERP ID
  - Approach explanation
  - Time and space complexity analysis

- [ ] **Clean, Well-Documented Code**:
  - Meaningful variable names
  - Proper indentation and formatting
  - Inline comments for complex logic
  - No commented-out code

- [ ] **Correctness**:
  - Handles all test cases correctly
  - Edge cases handled (n=0, n=1, large n, etc.)
  - No runtime errors

- [ ] **Testing**:
  - Tested with provided examples
  - Additional edge cases verified

---

## 🎯 Expected Approach

### Key Concepts
- Fibonacci sequence formula: F(n) = F(n-1) + F(n-2)
- Iteration vs. Recursion
- Dynamic Programming / Memoization
- Space optimization techniques

### Sample Test Cases
```
Input: 0 → Output: 0
Input: 1 → Output: 1
Input: 5 → Output: 5
Input: 10 → Output: 55
Input: 2 → Output: 1
```

---

## 📊 Complexity Requirements

### Optimal Solution
- **Time Complexity:** O(n) - iterative approach
- **Space Complexity:** O(1) - using only two variables

### Alternative Approaches
- Recursive (naive): O(2^n) time, O(n) space
- Recursive with memoization: O(n) time, O(n) space
- Matrix exponentiation: O(log n) time, O(1) space

---

## 🚀 Submission Instructions

1. **Create Your Solution File**
   - Name it: `your-github-username_your-ERPID.ext`
   - Place it in this folder: `Daily-Solutions/11-08-2025/`

2. **Add Required Header**
   ```python
   """
   Problem: Nth Fibonacci Term
   Date: 11-08-2025
   Author: Your Name
   GitHub: @yourusername
   ERP ID: your_erp_id
   
   Approach:
   [Explain your approach here]
   
   Time Complexity: O(?)
   Space Complexity: O(?)
   """
   ```

3. **Create Pull Request**
   - Follow the guidelines in [CONTRIBUTING.md](../../CONTRIBUTING.md)
   - Ensure all checks pass
   - Wait for review

---

## ⚠️ Important Rules

### ✅ DO
- Write your own original solution
- Test thoroughly before submitting
- Document your code well
- Ask for clarification if needed

### ❌ DON'T
- Copy solutions from others or the internet
- Use AI tools to generate solutions
- Submit code you don't understand
- Share your solution before the deadline

---

## 🏆 Evaluation Criteria

Your solution will be evaluated on:

| Criteria | Weight | Description |
|----------|--------|-------------|
| **Correctness** | 40% | Does it work? Handles edge cases? |
| **Code Quality** | 25% | Readable, well-structured, follows conventions |
| **Efficiency** | 20% | Optimal time and space complexity |
| **Documentation** | 10% | Clear comments and explanations |
| **Timeliness** | 5% | Submitted before deadline |

---

## 💡 Tips

- The iterative approach is most efficient for this problem
- Avoid naive recursion without memoization (exponential time)
- Remember the base cases: F(0) = 0, F(1) = 1
- For optimal space, you only need to track the last two values
- Test with edge cases: n=0, n=1, and larger values

---

## 🔗 Quick Links

- [📖 Problem Statement](../../Daily-Questions/11-08-2025.md)
- [📝 Contributing Guidelines](../../CONTRIBUTING.md)
- [🏠 Main README](../../README.md)
- [📚 All Problems](../../Daily-Questions/DailyQuestions.md)

---

## 📞 Need Help?

- **Problem clarification?** Open an issue or comment on the problem
- **Technical issues?** Check the CONTRIBUTING guide
- **General questions?** Ask in discussions

---

<div align="center">

### Happy Coding! 💻

**Deadline:** 24 hours from problem release

---

*Good luck and may your code be bug-free!*

</div>

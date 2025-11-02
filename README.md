# DailyByte 🚀

Welcome to **DailyByte** - A daily coding challenge repository for the MSA RIU community! This platform is designed to help students enhance their problem-solving skills through consistent practice and collaborative learning.

## 📚 About

DailyByte is a community-driven initiative where students solve daily coding challenges and submit their solutions via pull requests. Each day, a new problem is posted, and students are encouraged to solve it independently, fostering a culture of continuous learning and improvement.

## 📋 Rules and Guidelines

1. **Independent Work**: All solutions must be your own work. No copying from others or online sources.
2. **No AI Tools**: Do not use AI-powered coding assistants (like ChatGPT, GitHub Copilot, etc.) to generate solutions. The goal is to develop YOUR problem-solving skills.
3. **Fair Learning**: Collaboration in understanding concepts is encouraged, but the final code must be written by you.
4. **One Solution Per Day**: Submit one solution per problem. You can update your solution before the deadline.
5. **Clean Code**: Write readable, well-commented code following best practices.
6. **Respect Deadlines**: Submit your solutions before the specified deadline for each problem.
7. **Learning First**: Focus on understanding the problem and learning from the process, not just getting the "right" answer.

## 🚀 How to Submit Your Solution

Follow these steps to submit your solution:

### 1. Fork the Repository
Click the "Fork" button at the top right of this repository to create your own copy.

### 2. Clone Your Fork
```bash
git clone https://github.com/YOUR_USERNAME/DailyByte.git
cd DailyByte
```

### 3. Create a New Branch
```bash
git checkout -b day<number>-<your-name>
# Example: git checkout -b day1-john-doe
```

### 4. Add Your Solution
- Navigate to the `answers/` directory
- Create a folder with your name if it doesn't exist: `answers/your-name/`
- Add your solution file: `answers/your-name/day<number>-solution.<ext>`
  - Example: `answers/john-doe/day1-solution.py`

### 5. Commit and Push
```bash
git add .
git commit -m "Add Day<number> solution - Your Name"
git push origin day<number>-<your-name>
```

### 6. Create a Pull Request
- Go to your fork on GitHub
- Click "New Pull Request"
- Set the base repository to `Sayan-dev731/DailyByte` and base branch to `main`
- Add a clear title: `Day<number> Solution - Your Name`
- Describe your approach in the PR description
- Submit the pull request

## 📁 Folder Structure

```
DailyByte/
│
├── daily-questions/          # Contains daily problem statements
│   ├── day1-problem.md
│   ├── day2-problem.md
│   └── ...
│
├── answers/                  # Student solutions organized by name
│   ├── student-name-1/
│   │   ├── day1-solution.py
│   │   ├── day2-solution.js
│   │   └── ...
│   ├── student-name-2/
│   │   └── ...
│   └── ...
│
├── README.md                 # This file
└── LICENSE                   # Repository license
```

## ✅ Evaluation Criteria

Your solutions will be evaluated based on:

1. **Correctness** (40%): Does the solution solve the problem correctly?
2. **Code Quality** (25%): Is the code clean, readable, and well-structured?
3. **Efficiency** (20%): Is the solution optimized in terms of time and space complexity?
4. **Documentation** (10%): Are there comments explaining the logic?
5. **Timeliness** (5%): Was the solution submitted before the deadline?

### Scoring Guidelines:
- **Excellent (90-100%)**: Optimal solution with clean code and good documentation
- **Good (75-89%)**: Correct solution with minor improvements possible
- **Satisfactory (60-74%)**: Working solution but needs optimization or better code quality
- **Needs Improvement (<60%)**: Incorrect solution or significant issues

## 🗓️ Meeting Details

- **Platform**: [Specify your meeting platform - e.g., Google Meet, Zoom, Discord]
- **Schedule**: [Specify your schedule - e.g., Every Monday, Wednesday, Friday at 6:00 PM]
- **Duration**: [Specify duration - e.g., 30-45 minutes]

### Meeting Agenda:
1. Review of previous day's solutions
2. Discussion of different approaches
3. Introduction to the new problem
4. Q&A session

### Important Dates:
- **Problem Release**: Daily at [Time]
- **Submission Deadline**: 24 hours from problem release
- **Review Sessions**: [Schedule]

## 🤝 Community Guidelines

- Be respectful and supportive of fellow learners
- Share knowledge and help others understand concepts
- Provide constructive feedback on solutions
- Celebrate progress and milestones
- Ask questions when you're stuck

## 📞 Contact & Support

If you have questions or need help:
- Open an issue in this repository
- Contact the community moderators
- Join our discussion forum/channel

## 🌟 Getting Started

1. Read the rules carefully
2. Check the `daily-questions/` folder for today's problem
3. Solve the problem independently
4. Submit your solution following the submission steps
5. Attend the review session to learn from others

## 📝 License

This project is licensed under the terms specified in the LICENSE file.

---

**Happy Coding! 💻**

Remember: The goal is not just to solve problems, but to become a better problem solver. Focus on learning and improvement!
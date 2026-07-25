# Git Hands-On Exercises

This document contains the walkthroughs for the Git exercises.

## Exercise 3: Git Branching Workflow
Demonstrating how to create a branch, switch, commit, merge, and delete.

```bash
# 1. Create a new branch and switch to it
git checkout -b feature/new-login

# 2. Make some changes (e.g., create login.html)
echo "<h1>Login</h1>" > login.html
git add login.html

# 3. Commit the changes
git commit -m "feat: added basic login page"

# 4. Switch back to the main branch
git checkout main

# 5. Merge the feature branch into main
git merge feature/new-login

# 6. Delete the feature branch locally
git branch -d feature/new-login
```

## Exercise 4: Merge Conflicts
Creating a merge conflict scenario and resolving it.

```bash
# 1. Ensure you are on main and create a base file
echo "Line 1: Base" > conflict_test.txt
git add conflict_test.txt
git commit -m "chore: base file for conflict test"

# 2. Create and switch to a new branch
git checkout -b feature/conflict-branch
echo "Line 1: Changed in branch" > conflict_test.txt
git commit -am "feat: modified line 1 in branch"

# 3. Switch back to main and modify the same line differently
git checkout main
echo "Line 1: Changed in main" > conflict_test.txt
git commit -am "chore: modified line 1 in main"

# 4. Attempt to merge (this will cause a conflict)
git merge feature/conflict-branch
# Git will output: CONFLICT (content): Merge conflict in conflict_test.txt

# 5. Resolve using a tool or manually. Open the file and fix it:
# (Inside conflict_test.txt, remove the <<<< ==== >>>> markers and keep desired code)
echo "Line 1: Resolved change" > conflict_test.txt

# 6. Add and commit the resolved file
git add conflict_test.txt
git commit -m "fix: resolved merge conflict in conflict_test.txt"
```

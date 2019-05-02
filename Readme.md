Tutorial: how to use Visual Studio Code with Github
========================================

1. Setup with VSCode

git config --global user.name "Rare, Case Scenario"
git config --global user.email "rare.case.scenario@gmail.com"
git clone https://github.com/rarecasescenario/ConsultantTaxes.git


## How to work with Git in VS Code
```
1. Create a directory on the local file system
2. Create a repo on Github or use existing one
3. Get a link from Github repository project
4. In VS Code, select File -> Add Folder to Workspace -> Select the newly created directory
5. In VS Code Ctrl + ~ to create a Terminal 
6.  Config your local repository
7.    git config --global user.name "Rare, Case.Scenario"
8.    git config -- global user.email "rare.case.scenario@gmail.com"
9. Clone Git repository into your local repository
    git clone https://github.com/rarecasescenario/ConsultantTaxes.git

10. After a project was cloned you can make changes.
11. After changes you will see how many changes done on the left side of VS Code
12. Click + to stage changes for each file on the left file pane
13. Click on the git icon on top of left pane and than commit with commit message
14. From ... menu select Push and push your commits to remote repository

Done!
```

Gotcha's
=============
If you have a several repositories with different users than use
Windows -> Control Panel -> User Accounts -> Manage Windows Creadentials and delete all git creadentials that causes Permission access denied error.

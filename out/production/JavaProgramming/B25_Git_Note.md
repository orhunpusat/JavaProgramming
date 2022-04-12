
# Task 1 : 

1. Open your IntelliJ and create new Java Project 
2. Name your `git_practice1` 
3. Create a class called `HelloWorld` under source
4. Now instruct git to keep track of this project folder by enabling version control to create new local repository
   1. You can do this by going to top menue `VCS` -> `Enable Version Control` and hit `Ok` 
   2. `VCS` option will turn into `Git` from this point on
   3. From the `Git` option click `commit`
   4. It will open up tab on the left 
      1. Select all the files you want to keep tract of 
      2. Enter commit message into the box right on top of commit button
      3. andn Hit commit
   5. If it's the first time , it will ask you to enter `name and email`
      1. enter the name you desired 
      2. enter the same email you used for Github.com account
   6. You will see success message on bottom left corner saying created git repository in xxx location.
   7. If you see version not supported on bottom left corner
      1. click on configure link and click on next screen. 

5. Now do some more work (add some text anywhere)
   1. `git` will see what has changed from last commit till now
   2. IntelliJ will also inidicate with green bar on the left for indication
   3. Now when we are ready to save this change into git repository , we can make our second commit same way we did previously
   4. Go to top menu `Git` -> `Commit`
      1. from the left tab select the file change you wanna commit
      2. provide commit messages 
      3. hit commit 

##  Sharing local git repository to GitHub 

1. Go to `preference` on `mac` and `File`->`Setting` on windows
2. Search for `GitHub` from the preference searchbox 
3. Click on `GitHub` from the left tab search result 
4. Click on `Add Account` -> `Login via Github` 
   1. It will open up browser window
   2. Authorize Jetbrain 
   3. Enter your credential if it's asked
   4. Authorize `Cybertek-B25` organization 
   5. Enter Okta credentials if asked 
   6. Now you will see success message saying its connected
   7. Now you can directly interact with GitHub from your IntelliJ 
5. Back to intelliJ and click `Ok` to save your progress
6. Make sure you committed all your changes 
7. From top menu `Git` ->`GitHub` -> `Share Project On GitHub` 
   1. Optionally provide description 
   2. Hit `Share` button 
   3. After a while it will give you success message with direct link
8. Here is what exactly happened from previous process Once you click on share button 
   1. It created new Remote Repository Under your GitHub Account 
   2. It created connection between your local repository on your computer and remote repository on GitHub.com 
   3. It pushed all the local commits to remote repository
   4. All these steps are happening in one shot behind the scenes
   5. So we just need to do it once `Share Project on GitHub` 
9. What if I have more work and i have more commits 
   1. Make your changes and commit your changes 
   2. DO NOT USE SHARE PROJECT ON GITHUB because it already established the connection between local and remote.
   3. All you need to do is from the top menu 
      1. `Git` -> `Push` 
      2. It will push your local commits to remote repository
      3. `Push` is a git term for pushing local commits to remote repository
      4. Now your local repo is in sync with remote repo 

10. Create one more class called `Practice1`
11. Observe the pop-up saying : 
    -  `Do you want to add following file to git`
    -  Click on `Do not Ask` checkbox and click `Add`
    -  This will ensure git will always keep track of new files added
    -  So you do not have to manually add.
 12. Create 3 commits by making 3 individual changes 
 13. Now you can push your local commits that remote repository does not have yet , so they can be in sync 
 14. SIDEBAR : 
     1.   `Commit` is saving changes into local repository
         - so we commit if change exists locally since previous commit
     2.  `Push` is pushing local commits that you do not have in the remote yet so it can be in sync 
 15. Now you can push those 3 commist to remote repo
 16. SIDEBAR : 
     1.  Your local timeline is called : Local `master` branch 
     2.  Your remote timeline is called :    `origin/master` branch      

## Ignoring Files or folders that we do not want to keep track of

 Git uses a very special file called `.gitignore` to exclude files and folders from being tracked and avoid it to be even staged. 

`.gitignore` file itself is like a blacklist and will be tracked like other files in your project. 

Git will ignore list of files and folders name that provided 
inside `.gitignore` file



1. Create a file called `.gitignore` directly under project location 
2. add below 3 lines , first 2 for 2 text file and 3rd one for folder 
```
file1.txt
file2.txt
power
```
3. Now try to create `file1.txt` , `file2.txt` and observe git will completely ignore and you will not see it under change tab 
4. Create a folder called `power` 
5. Add 2 more file `file3.txt` , `file4.txt` and observe git completely ignore this 

6. SideBar : `.gitIgnore` will only work for the files or folder that not already tracked, anything that added after it's been already tracked will not be ignored. That's also the reason `.gitignore` is the first thing should be created in the project and lots of project already have knownn file or folders to be ignored. 
7. In IntelliJ regular java project we will always ignore 2 folders and one file
   1. `.idea` : IntelliJ related settings  
   2. `out`   : this is where bytecodes stored from the src code and we do not keep track of them
   3. `yourProjectName.iml` Intellij thing 
   
```
.idea
out
git_practice1.iml
```



## Quick Task 

1. Delete all the text files on your project 
2. make a commit (but how? was there a change?)
3. Question : What if I want to ignore any file that end with `.txt`? Do I need to add all of them one by one 
4. No : We can use wild card to match all the file with `.txtx` as below 
   1. Just like you learned in java package something`.*`, you can add * to match pattern in `.gitignore` file 
   2. for example `*.txt` means all text file with any names
   3. Now create 3 text file with name `file10.txt`,`file11.txt.txt` and `file12.txt` 



## Recap Project 

1. create a java project called `git_practice2` 
2. create a `.gitignore` file with below content 
   ```
   .idea
   out
   *.iml
   ```
3. create a package under `src` folder called `us100` and create a class called `TestCase001`
4. Enable version control to **create git repository** for this project 
5. Make a initial commit 
6. create a main method and add some print 
7. Make another commit with proper commit message 
8. Share project on Github (ONE TIME!!!!)
9. Create a new class called `TestCase002` and make a commit with proper commit message 
10. Add 3 more changes and make 3 more individual commits 
11. and push your changes to remote repository



`git rm --cached git_practice2.iml`


## How to Remove version control from The project you did not intented to keep track of. 

1. Create a new project called `DoNotTrack`
2. Create `.gitignore` file at root directory
3. Create a java class under `src` called `WoodenSpoon`
4. Enable version control to create new repo
5. Make 4 commits 
6. Oops did not actually want to track this project 
7. All you have to do is 
   1. remove `.git` folder to remove the local repo
   2. let intelliJ know this is not a git repo anymore 




## Git Day 3 : 

1. create a java project called `git_practice3`
2. add `.gitigore` file with below content 
```
.idea
out
*.iml
```
3. enable version control to create new repo for this project 
4. make your initial commit 
5. create a new class called `Practice1`
6. make few changes and few commits 
7. undo your last commit

## Github 
1. Create new repository in Github.com
2. learn to make it public or private 
3. copy your remote repo address
4. Make sure do not add anything into your newly created github repo to avoid furthur issues 
5. now back to your IntelliJ , create connection between your local repo and remote repo 
   1. go to `Git` menu -- `Manage Remote` and paste in your remote repo url 
6. now you have connection and you can push



## Cloning remote repo to local 
What if I have my repository in Github.com account and I want to get that repo to my new computer (location)
The process of getting remote repository to local is known as **`clone`** . 

This happen only one time , just like sharing project on github happen only one time. 

When you clone this is what happen : 
1. It will download the remote repo into your computer
2. It will have connection between the remote repo and local repo 
3. If you are the owner of this repository(or you have push access) , you can keep adding more commits and push 

In order to simulate the "different computer" , lets ddelete the project folder so we can clone the repo to our local computer. 



## Moving betweeb commits to see the project at certain commit 
1. `HEAD` is the term in git to illustrate where we are at in the commit history 
2. Usually it's pointing to latest commit 
3. We have option to move the `HEAD` yp certain commit using `checkout` to take a look at the project state at certain point in time or at certain commit. 
4. MAKE SURE YOU DO NOT HAVE ANYTHING UNCOMMITTED BEFORE USING `CHECKOUT` 
5. MAKE SURE YOU DO NOT MAKE ANY CHANGES WHILE YOU ARE CHECKING OUT CERTAIN COMMMIT
6. After you are done taking a look , GO BACK TO MASTER BRANCH LATEST COMMIT using `checkout master` and continue your work, 



## Resetting the history to some point in time

1. create a new package called `day3`
2. create a new class called `TimeMachine` 
3. commit your changes 
4. make 4 more commits (do not push) with proper commit messages 
5. Now we want to go back to certian commit completely and remove any commit after that point 
   1.  if your commit history is like this `1-2-3-4-5` you want to go back to `3` and remove `4-5` 
   2.  you have option to completely delete the changes that happen in `4-5` by doing hard reset 
   3.  you have option to delete the history but the keep the changes happened in `4-5`
6.  Right Click on the commit you want to reset to , select option `Reset current branch to here` , it will give you 4 options 



## Branching in Git 

1. creare a new branch called `feature-a` 
2. create a new class called `Mando`
3. make a commit (observe the head)
4. make some more commits and (observe the head)
5. now you are happy with your work get ready to merge it 
   1. **move your HEAD to master (CHECKOUT)**
   2. `Git`-> `Merge` 
   3. Optionally , from `modify options` link select the first option `--no--ff` (this will make your history slightly more visual by creating new commit for merging)
   4. you will see all the changes in your master branch now
6. What do you do with the branch that already merged? 
   1. keep it for reference
   2. delete it since we already got everything in feature branch to master 



## Git Project 4

1. create a java project called `git_practice4` 
2. create a `.gitignore` file with below content 
   ```
   .idea
   out
   *.iml
   ```
3. create a package under `src` folder called `hello` and create a class called `Hello`
4. Enable version control to **create git repository** for this project 
5. Make a initial commit 
6. create a main method and add some print 
7. Make another commit with proper commit message 
8. Share project on Github (ONE TIME!!!!)
9. Make some more changes and commit and push 
10. Create a new branch called `tc001`
11. Create a new class called `TestCase001` and make a commit with proper commit message 
12. Add 3 more changes and make 3 more individual commits
13. MAKE SURE TO COMMIT ALL YOUR CHANGES CHECKOUT MASTER 
14. And now merge your commits into master branch
15. Create a new branch called `tc002`
16. Create a new class called `TestCase002` and make a commit with proper commit message 
17. Add 3 more changes and make 3 more individual commits 
18. And now merge your commits into master branch
19. **MAKE SURE TO COMMIT ALL YOUR CHANGES CHECKOUT MASTER**

20. Create a new branch called `tc003`
21. Create a new class called `TestCase003` and make a commit with proper commit message 
22. Add 2 more changes and make 2 more commits
23. Check out master and Create a class with same name `TestCase003` and add different content and commit (to simulate conflicting situation)
24. And now merge your commits into master branch
25. BOOM! CONFLICT !  4 OPTIONS 
    1.  keep the version in master
    2.  keep the version in tc003
    3.  keep some part of master and some part of tc003
    4.  abort the merge and start over

## Generating Conflict between Local Repo and Remote Repo
1. make sure your HEAD is on master and push everytihng on local `master` to `origin/master`
2. from your Github.com remote repository edit `TestCase003` and add `This is the changes from GitHub.com` in last line and commit 
3. from your IntelliJ , (stay in master) edit `TestCase003` and add `This is the changes from Local IntelliJ` in last line and commit 
4. Now both local and remote has a commit that not known to each other and both of them editing same fine same line with different content --> CONFLICT!!!
5. When you try to push your changes -> IntelliJ will give you warning saying there is remote changes you did not pull yet, now try to merge the remote commits to your local and see CONFLICT!!!!
6. Use those 4 options we saw previously to resolve conflicts
7. This is the simulation of your wo-worker added different content to the file you are working on


# GitHub Flow for Team collaboration 

1. create a local branch called `tc004`
2. create a java class `TestCase004` 
3. make a commit 
4. add one more change and make another commit 
5. **DO NOT MERGE LOCALLY, DO NOT MOVE YOUR HEAD**
6. Push your local `tc004` branch to remote 
   1. This will create `origin/tc004`
   2. Create connection between `tc004` and `origin/tc004`
   3. Push all the commits from `tc004` to `origin/tc004`
7. Now From GitHub.com repository main page We Open a request to merge our `origin/tc004` branch to `origin/master`
8. Such Request is known as `Pull Request` (really wished they called it `Merge Request` because it is)
9. Steps to open `Pull Request` 
   1.  Go to your homepage of repository
   2.  If you have pushed your branch a moment ago , you should see **`Comapare and Pull Request`** 
   3.  Click on it , it will take you to pull request page
   4.  Give a proper name for example : `Requesting to merge TC004 code`
   5.  Give some detail on the work been done 
       1.  cool code here 
       2.  cool code there
       3.  cool code everywhere
   6.  Click Create and now you have a open request.
   7.  This is where team can review your code and comment on your code or approve the changes and eventually merge this code to `origin/master` if all is well 
   8.  One merge is complete , go back to your IntelliJ, checkout master and pull down all the changes happened in `origin/master` 



## Team activity for next 2 hours
Share your GitHub username with your group leader or whoever stepped up to create your group project. 

### Team Lead Action: 
1. Create a new project with your group name included for example `group_x_project`
2. Add `.gitignore` with below content 
```
.idea
out
*.iml
```

3. Create a package `us100` and class under `Practice` 
4. Commit your changes 
5. Share project on GitHub 
6. Share your URL With your team member
7. Invite your team members using their github username (NOT EMAIL!!)
8. In your Github.com repo , 
   1. Go to `Setting`->`Collaborators`->`Manage Access section` -> `Add People` Button
   2. Enter your teammate username and click invite  


### Group memebers action 
1. Navigate to the URL your team lead shared , observe you have write access
2. Copy the clone link under `Code` Button
3. Clone this project to your IntelliJ 

### Everybody (DO NOT COMMIT ANYTHING TO MASTER)
1. In a well collaborated work environment , nobody should commit to master directly without going through `GitHub Flow` 
2. Assuming you are all working on your own test case , open a branch with test case followed by your name 
   1. for example : `tc006_akbar`
3. Create a package with your name for example in my case `akbar` (do this so we can avoid conflicts for now)
   1. Create your java class under, for example `LoginTestCase` you can call it anything 
4. make few commits 
5. push your local feature branch commits to remote (always pull before pushing)
6. Open a pull request with proper name and description and click create 
7. ask your team member to review or comment and merge your pull request 
   1. IDEALLY NOBODY SHOULD BE MERGING THEIR OWN PULL REQUEST EVEN THOUGH THERE IS NO RESTRICTION RIGHT NOW
8. Now from your IntelliJ , checkout master and update project to pull down all the changes from remote 
9. Observe your Git history and be amazed! 
Git Tutorial
============

This is a full walkthrough on Git for Windows, and most operating systems that end with -nix (also known as Unix based operating systems).

Using Git From Terminal/Command Line
------------------------------------
Jake highly encourages using git from terminal/command line. You can use it from Eclipse, but in Jakes opinion it offers less functionality if something goes wrong.

###Installation & Setup
Follow these links for instructions on how to install git and setup Github  
[Setup](https://help.github.com/articles/set-up-git/)  
[Generating SSH Keys](https://help.github.com/articles/generating-ssh-keys/)  

###Getting Source Code from an existing repository
To get the code down from Github run this command  
```
git clone <CLONE URL>
```
Change the URL depending on what repository you want. For instance to the Wall Bounce Project code you would use `https://github.com/Team4761/Wall-Bounce-Project.git`  

The clone URL is on the right side of the home page for every repository.

###"Uploading" Your Code  
To upload your own code open Terminal/Git Shell and navigate into your code directory using `cd`, `ls`, and `pwd` (look those up if you don't know them).  
**Before** writing new code run the command  
```
git checkout -b CHANGE_NAME
```
Replace CHANGE_NAME with the name of what your are changing (No spaces).  
After you write code, run the command  
```
git status
```
This command will tell you what files you have modified.  
To prepare to "upload" your code, you must tell git what you changed by running the command  
```
git add PATH
```
Change path to the path of a modified file. Do this for all modified files. If you are using a good and fully featured shell such as bash or zsh then you can press tab to autocomplete the missing files in.
After you have added all of the modified files, run the command  
```
git commit -m "WHAT I JUST DID"
```
Replace WHAT I JUST DID with what you just did. Make sure that your commit message is in the imperative present tense or else it does not follow convention. For example, if you just added a function that fires a laser cannon your commit message would be "Add a function for firing the laser cannon." You are commanding someone else to do what you just did, right now. 
This command will make the commit on the local repository you have on your hard drive. Remember that no one else can see it yet!
Finally to upload your code run  
```
git push
```
Your code is now on a branch that you named. Look for the branch on Github (under the repository you were in) and click the button that says submit a pull request.  
After this get someone to check your code over and then hit the purple button that says merge with master.  
**You just committed your changes!**
###Extra Stuff  
You will want to frequently get the newest code, so run
```
git pull
```
This will download all of the latest code
  
*If you find any errors feel free to fix them or tell me (Jake Kinsella)*

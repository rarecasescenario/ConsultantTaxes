


https://login.microsoftonline.com/9ed55846-8a81-4246-acd8-b1a01abfc0d1/reprocess?ctx=rQQIARAAnVJNaBNBFM42aUxqq6UnQQTBNAdhkp3Z2b_Agv2xxNq0EbXiKczOzCZrsz_sThLs0VP1ID3rQfHgIXixJ-nJU8GeetaraC0I0lPx5ERU8CbC8L55bx7fvPe9dzkLK7BWwrbtWphQADUEAUamBwiBJkCGSYlhm7ppW8t5XYVYx8nMxPTHC692Xr6-u_To--f-pefO4VDBHSHitFatpnEaJxGjlMBKP5Vepe-nPdJNRY_5UYVGQbWV-u2QMz98oygHinKoKMOxkosIhYxj4EJiAGzoNrCIRwA3TQNpRNUYt96PnV2b64kOGpko8Tf58VjRi5KgFUepeJI9VhJOuoHDeL9CNnsJH31XTnjcvd8SkfOzxFltbhYtyfNXkvTXm2B-UeL8YgM0k6idkCDgoLHelLHWwN_wJY4gleiyAMR_coJ-_Otd1wxpbzXBnSjZSAURfhSCm1z04nJHOKjc8ZlDNc-wVAYBwq4K8EhwlzATcJWbiHuuRjVaDqOQcudfNBlmS7-lD0hI2jzgoZAtyb4GfsiiQVoJuajuZEs2Z7puYUNyWKMhyxuhzBqRq5C4HpVF7WZLktbzDA8DRDwEMIEcuDaxgO1yYmtM12xPPcgpR7lJNVsrFCamM-cyFzMnOeXFuNyM4ekrT0u7bv3hJ7O_Yu1l9ser162Ne2kDXV2Cy6sLAYbVeme9vWLcsDdFINY0Ix0skGt6QtXV245ag9t5ZTuf_5bPbZ1Sdov_tVcPJqcKmZliceLZ8eO18x_qb6cyJ2eO3u1vnXzZ-1r_AQ2&sessionid=a03ff6f4-2af2-4a1e-b9a8-9bea93d539f0&sso_nonce=AwABAAEAAAACAOz_BQD0__ef-bzldTxqoZR_hFOJ3-SmKu4uULCYGa1XcyLSbCbgYwLOnMmBakg_aQnfwrSRJFoFLARH6WPonpXOrtjYnE0gAA&client-request-id=b2ac1de4-b1a6-4659-8afa-e77623a03de8&mscrid=b2ac1de4-b1a6-4659-8afa-e77623a03de8

 


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


#Plain Spring Tutorial from koushik

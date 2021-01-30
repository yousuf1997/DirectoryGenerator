# DirectoryGenerator
Directory generator based on structure defined in JSON.

DirGen allows developers create nested directories based on structure provided in the JSON model. At the moment DirGen 
can create directories only at local computer. 

# An Example Definition follows :
```
  {
    "basePath": "C:\\Users\\USER\\Desktop",
    "baseDirectoryName": "MonthlyExpense",
    "subDirs": [
        {
            "directoryName": "Jan Expense",
            "subDirs": [
                {
                    "directoryName": "Jan First week Expense",
                    "subDirs": []
                }
            ]
        }
    ]
}
```

The above code creates two files, the MonthlyExpense being the root folder, and Jan Expense being the sub folder.
If you notice the structure of the JSON object is almost same in the root folder and sub folder definiton. The only 
difference is that the root folder defintion has the base path, which sub folders do not have the attribute.
You can have any number of subfolders you can have, even the sub folder can have its own sub folders. You just have to 
define the sub folder object inside the "subDirs" array. Only the base folder definition is required to have the base path.

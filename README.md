# LearningJava

Small Java practice programs organized by topic.

## Folder Guide

- `src/apps` - mini applications such as calculators and the bank system
- `src/arrays` - array examples and search/input practice
- `src/basics` - basic syntax, methods, random numbers, formatting, and conversions
- `src/conditionals` - if/else and switch examples
- `src/loops` - loop practice programs
- `src/oop` - classes, inheritance, constructors, and object examples

## Compile

From this folder:

```powershell
javac -d out\production\LearningJava (Get-ChildItem src -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

## Run Example

Use the full package name:

```powershell
java -cp out\production\LearningJava learningjava.apps.SimpleCalc
```

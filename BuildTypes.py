import os
print("Generating Files With QuickType. If it is not isntalled go https://github.com/quicktype/quicktype");
os.system("quicktype -s schema schema.json -o rust/Title.rs");
os.system("quicktype -s schema schema.json -o typescript/Title.ts");
os.system("quicktype -s schema schema.json -o java/Title.java");
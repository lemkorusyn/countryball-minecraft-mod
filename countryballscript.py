import os
import shutil
import time
import sys

# We ask the user what countryball they want to make, then we get important paths/locations for files, and begin executing

countryname = input("What is the name of your country? (One word only supported at this time) ")
print("Just a moment...")
time.sleep(2)

scriptpath = os.getcwd()
custompath = "src/main/java/lemko/countryballmod/entity/custom"
clientpath = "client"

# Custom Path files (Entity)

os.chdir(custompath)
shutil.copyfile('LemkoballEntity.java', countryname.capitalize() + 'Entity.java')

with open (countryname.capitalize() + 'Entity.java') as file:
    customfiledata = file.read()

customfiledata = customfiledata.replace('LemkoballEntity', countryname.capitalize() + 'ballEntity')

with open(countryname.capitalize() + 'Entity.java', 'w') as file:
  file.write(customfiledata)

# Client Path files (Model and Renderer)

# Model

os.chdir("..")
os.chdir(clientpath)
shutil.copyfile('LemkoballModel.java', countryname.capitalize() + 'Model.java')

with open (countryname.capitalize() + 'Model.java') as file:
    customfiledata = file.read()

customfiledata = customfiledata.replace('LemkoballEntity', countryname.capitalize() + 'ballEntity')

with open(countryname.capitalize() + 'Model.java', 'w') as file:
  file.write(customfiledata)

# Renderer

shutil.copyfile('LemkoballRenderer.java', countryname.capitalize() + 'Renderer.java')

with open (countryname.capitalize() + 'Renderer.java') as file:
    customfiledata = file.read()

customfiledata = customfiledata.replace('LemkoballEntity', countryname.capitalize() + 'ballEntity')

with open(countryname.capitalize() + 'Renderer.java', 'w') as file:
  file.write(customfiledata)

# Since we're done we ask if the user wants to make another country

print("Done! Note that you still need to make some changes to the entity \nmodel and renderer files, as well as add a texture for the ball and \nadd the entry to the main, client and modentity files for the mod.")
time.sleep(5)

restart = input("Would you like to add another country (Y/N)? ")

if restart.capitalize() == 'Y':
    print("Restarting...")
    time.sleep(1)
    os.chdir("..")
    os.chdir("..")
    os.chdir("..")
    os.chdir("..")
    os.chdir("..")
    os.chdir("..")
    os.chdir("..")
    os.execv(sys.executable, ['python'] + sys.argv)
else:
    time.sleep(1)
    print("You either said no or said an incorrect character. Either way, goodbye!")
    time.sleep(1)
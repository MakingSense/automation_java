# Basic Web Automation framework
This framework is useful for web testing. The tools required to use are:
* [Maven](https://maven.apache.org/install.html)
* [Java](https://www.java.com/es/download/)
* [Selenium](https://www.selenium.dev/documentation/en/)
* [TestNG](https://testng.org/doc/)

# Setp up and installation
Once the tools mentioned above are installed and ready to use, clone this repo by executing the following command
```
git clone git@github.com:MakingSense/automation_java.git
```

# Setup environment variables
For this project, you will have to set some environments variables in your IDE so that you can successfully run the tests.
Those variables are (and the exact names should be used):
* URL_ENV
* CHROME_DRIVER_PATH
* FIREFOX_DRIVER_PATH
* CHROME_DRIVER_PATH_WIN
* FIREFOX_DRIVER_PATH_WIN

To set up those variables you need to: 
1. Open the project's configuration where says "Edit Configurations..." (in the Main toolbar). 
2. Once the configuration panel is displayed, tap on the "Browse" icon in the "Environment variables"
3. Add the above mentined variables as name and the full path to the resources folder (including the name of the file, i.e. geckodriver.exe) as value
4. Tap on ok and close the panel
5. Now the variables will be replaced with you environments values and the tests can be executed


# Install the maven dependencies
The dependencies are listed in the pom.xml file. However, run this command to make sure that everything is installed correctly and compile
the maven project without any errors. For that, you should use the following command (once the project has been cloned in your machine):
```
mvn clean install
```

# Enjoy it and start coding
If everything is ok, you should be good to go and start creating the tests for you project. However, keep in mind that this repository is *ONLY*
a bolierplate (let's say) for anyone that needs to start automating web tests.

PLEASE, fork this repository or commit your changes to a different repository so this framework remains unchanged for everyone.
Yo can do that after cloning this repo with this command:
```
git remote -set-url origin NEW_REPOSITORY_ADDRESS
```
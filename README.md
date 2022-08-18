### Software QA Automation Testing-NASA Site

* In This Project, We Created an Automation Suite using Java With Selenium (TestNG Framework) for <a href='https://www.nasa.gov/'>NASA</a> Site, In order to search and navigate the site.

### This project was done in collaboration between the team members:
* Seham Asiri
* Rifah Alrasheed
* Mai Alshamsi
* RAZAN BIN OMAYRAH
* Ridha Alruwaili
* Shoroq Safran
* Wardah AlMalki

### project files
* Test Documents, for the Testing Procedure.
    * <a href="https://docs.google.com/document/d/1NBQsFalrNiCoIwep6ZyGMYG7ioshMAd3/edit">Test Plan.</a>
    * <a href="https://docs.google.com/spreadsheets/d/1Ws7x9Vo8BKUdJh7vOqPoKeRdB8z59cx5/edit#gid=1300471945">Test Case.</a>
    * <a href="https://docs.google.com/document/d/1Zsew_zJoeMWhTIScAuDaVyobE7phhtEh/edit">Test Result Report.</a>
* <a href="https://youtu.be/D-3gLGrk3Sg">Recorded video, while Automated testing running</a>
* <a href="src/lookOverNasa/">Source code.</a>

### The `Source code` contains 4 files:
* The `BaseClass.Java` file: The class contains TestNG Annotations `@BeforeSuite`, `@AfterSuite`, `@BeforeTest`, `@AfterTest`, `@BeforeClass`, `@AfterClass`, `@BeforeMethod`, `@AfterMethod `.
* The `LookOverNasa.Java` file: The class contains One Test case/ One Method, contains the `@Test` Annotation,  and Extends BaseClass.
* The `ListenerTest.Java` file: Implementing Listeners Interface, the calss has the following methods: `OnStart`, `onTestSuccess`, `onTestFailure`, `onTestSkipped`, `onTestFailedButWithinSuccessPercentage`, `onFinish`.
* The `testng.xml` file: a configuration file to help in organizing our Test Cases.
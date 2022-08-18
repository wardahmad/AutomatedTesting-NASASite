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
    * <a href="https://docs.google.com/document/d/1NBQsFalrNiCoIwep6ZyGMYG7ioshMAd3/edit?usp=sharing&ouid=113234837739401438291&rtpof=true&sd=true">Test Plan.</a>
    * <a href="https://docs.google.com/spreadsheets/d/1Ws7x9Vo8BKUdJh7vOqPoKeRdB8z59cx5/edit?usp=sharing&ouid=113234837739401438291&rtpof=true&sd=true">Test Case.</a>
    * <a href="https://docs.google.com/document/d/1Zsew_zJoeMWhTIScAuDaVyobE7phhtEh/edit?usp=sharing&ouid=113234837739401438291&rtpof=true&sd=true">Test Result Report.</a>
* <a href="https://youtu.be/D-3gLGrk3Sg">Recorded video, while Automated testing running</a>
* <a href="src/lookOverNasa/">Source code.</a>

### The `Source code` contains 4 files:
* The `BaseClass.Java` file: The class contains TestNG Annotations `@BeforeSuite`, `@AfterSuite`, `@BeforeTest`, `@AfterTest`, `@BeforeClass`, `@AfterClass`, `@BeforeMethod`, `@AfterMethod `.
* The `LookOverNasa.Java` file: The class contains One Test case/ One Method, contains the `@Test` Annotation,  and Extends BaseClass.
* The `ListenerTest.Java` file: Implementing Listeners Interface, the calss has the following methods: `OnStart`, `onTestSuccess`, `onTestFailure`, `onTestSkipped`, `onTestFailedButWithinSuccessPercentage`, `onFinish`.
* The `testng.xml` file: a configuration file to help in organizing our Test Cases.

### Automated Testing Workflow:
- Type "Stars" in the search bar.
- Click on the search logo.
- Click on the "Stars" word.
- Click on "The Sun"
- Scroll into the image.
- Switch to a new tab.
- Switching back to the old tab.
- Navigation Bar: 
    - "Downloads" > click on "E-book"
    - "Galleries" > click on "image of the day"
    - "Downloads" > click on "AudioandRingtones" > scroll down and open the sound in a new tab. 
    - Switching back to the old tab.
    - "Audiences" > click on "For Media" > click on "NASA Live"

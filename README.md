# javaAPITest
Test module for node-java API

I have used following packages in this test module:

* java : Bridge API to connect with existing Java APIs
* xml2json: Converts XML to JSON
* xml-formatter: To format XML output
* format-json: To format JSON output

There are two files in this module:
1. Testing.js: This is the parent file. It will communicate with Java code by sending a hard-coded XML data and will get XML data in response from Java code, which is output-ed to webpage both in XML format as well as in JSON format.

2. package_one/ClassOne.java: This is the Java code which has a Class 'ClassOne' having method 'reqResp' which will respond with hard-coded XML data to the parent file.

How to run:
1. Download the module.
2. cd to the directory.
3. npm install
4. Compile the Java code:
  * go to directory package_one
  * javac ClassOne.java
5. Run the module:
  * comeback to parent directory where we have Testing.js file
  * node Testing.js
6. Open the browser to the following url:
  * http://127.0.0.1:3000
  
You will be able to see XML output on top, scroll down to see JSON conversion for the same.
 

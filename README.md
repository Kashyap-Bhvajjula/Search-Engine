# Search Engine using DFS
The **Search Engine** is a Java-based Desktop web application with basic search engine functions.
The web application has the following primary features:
  ### 1. Search:
  For a searched query, the most relevant webpages will be displayed in a ranked manner. The top 30 most relevant results will be displayed by default.
  The search results would be obtained from a given SQL database to which a connection should be established first.
  The Java-based WebCrawler is made use of to obtain webpages from the _Worlwide Web_ using Depth Limited Search, a variation of Depth First Search (DFS). These webpages would be stored in the database and can be accessed for search queries.
  ### 2.  Search History:
  The search queries will be stored in the database and can be obtained using the **history** feature whenever required.

## Instructions to run the Project locally
### Web Scarping to your MySQL database using _WEB CRAWLER_
1. Create a MySQL database and table to store the _page title_, _page link_, and _page text_ obtained from web pages through web scraping. The SQL commands used for creating the MySQL database for this project are provided in the  file [```SQL-Commands```](https://github.com/Kashyap-Bhvajjula/Search-Engine/blob/main/SQL-Commands). Using different attributes, names etc in the database, than those in the ```SQL-Commands``` text file, would require making corresponding changes in the project code.  
2.  Open the ```Web Crawler``` project folder in any IDE or code editor such as IntelliJ IDEA, VS Code, Eclipse etc.  
3. Install the ```jsoup``` library from Maven repository in the project from the IDE.  
4. Download the ```MySQL Connector``` archive file from [here](https://dev.mysql.com/downloads/connector/j/) and extract the file. Install  the ```mysql-connector``` library as a java library in the project; select the jar file from the extracted folder as source for the library.  
5. In the java file at ```/WebCrawler/src/main/java/org/accio/DatabaseConnection.java```, add the username and password of your MySQL database to establish a connection to the database ({} and comments have been added to where the changes have to be made).  
6. Open the java file at the location ```/WebCrawler/src/main/java/org/accio/Crawler.java```. In the main function of this java program, add the required URLs so that web data can be scraped from the respective webpages, in this manner: ```crawler.getTextsAndLinks("url", 1);``` (replace ```url``` with the desired URL). For example: ```crawler.getTextsAndLinks("https://javatpoint.com", 1);```. A deeper web scraping can be performed by icreasing the ```MAX_DEPTH``` parameter in the ```Crawler.java``` program file (initially set to ```2```.). Multiiple webpages can be added to the WebCrawler, IIi have added 2 websites in the code, and can be incresed based on the preference. 
7.  Run the java file at ```/WebCrawler/src/main/java/org/accio/Crawler.java```; this java program file contains the _main_ function and therefore the project can be thus run by running the java file.  
8.  On successfully urunning the ```Web Crawler``` project, the required webpage data will be scraped from the given webpages and added to your MySQL database. Which will further be extracted to the webpage.

### Running the _Search Engine_ project
1. Open the ```SearchEngine``` project folder in your IDE or code editor.  
2. Install the ```Smart Tomcat``` plugin on your IDE. Then download the ```Apache Tomcat``` archive file from [here](https://tomcat.apache.org/download-90.cgi) and extract it. Add a _run/debug configuration_ of ```Smart Tomcat``` type and select the extracted ```Apache Tomcat``` folder as the _Tomcat server_; choose the location ```/SearchEngine/src/main/webapp``` as _Deployment directory_; and select ```SearchEngine``` as the _classpath of module_.  
3. Install the ```javax.servlet``` library from Maven repository in your project
4. Install  the ```mysql-connector``` library as a java library in the project; select the jar file from the earlier extracted ```MySQL Connector``` folder as source for the library.  
5. In the java file at ```/WebCrawler/src/main/java/org/accio/DatabaseConnection.java```, add the username and password of your MySQL database to establish a connection to the database (as indicated in the comments of the program).  
6. Run the _Search Engine_ project with the ```Tomcat``` configuration. A _localhost_ URL will be generated; the URL will load the _Search Engine_ web application.

Detailed Setup Guide

Clone this repository https://github.com/DaNinocka/event_managment2

Setup guide

*System Requirements

- Hardware Requirements 
   - (Minimum)	Core i5, 1.8 GHz, 4 gig RAM, 1 gig disk space.
   - (Recommended)	Core i5, 2.5 GHz GHz, 8 gig RAM, 1 gig disk space.
- Operating System
   - Microsoft Windows 10/8/7/Vista/2003/XP (32 or 64 bit)
   - macOS 10.8 or later(only 64-bit systems are supported)
   - OS Linux (note that a 32-bit JDK is not bundled, so a 64-bit system is recommended)
   
*Technologies used

* Spring 4.3.13 RELEASE
* Hibernate 5.2.12 Final
* MySQL
* Java 8
* IntelliJ IDEA 2017.1.5 Ultimate
* Tomcat 8.0.47

After you clone this repository to your computer in order to run this application, you will first have to install Apache Tomcat 8.0.47 and
IntelliJ IDEA Ultimate edition (because of Spring and Tomcat support).
Links for downloading:
https://www.jetbrains.com/idea/download/#section=windows
https://tomcat.apache.org/download-80.cgi
Also,you will need to have JDK 8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
When you install all neccessary above, you can run IntelliJ IDEA and select open project. When project is opened, first go to Build/Build Project and then look at the upper right corner, there is a green arrow and when you click on it the project should be opened in web browser, but before that you sholud set up configuration for server connection (button on the left side of the green run arrow. About configuration for Tomcat - first go to the Edit Configuration, go to Configure button and there you sholud see where to upload suitable tomcat jar files form the folder where you already downloaded Tomcat and when you finish that choose application server (in this case Tomcat 8.0.47) on a drop down list. After that select suitable JDK and check your ports (HTTP port should be 8080 and JMX port should be 1099).
Regarding the database, there is exported .sql file for creating the database and other settings for database you can see in hibernate.cfg.xml file in project repository. You shold have MySQL instaled. Particulary, I am using HeidiSQL and you can dowload it here https://www.heidisql.com/. 







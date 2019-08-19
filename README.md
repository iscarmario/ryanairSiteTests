CUMBER TESTS WITH SELENIUM WEB DRIVER AT RYANAIR SITE
=============================

Aim
-----------------

This repository contains all the needed material run the test requested at "FR_AUTO_TESTS_2017.rev02.pdf"

How to
----------------

#### Launch one test:

This project is a maven project so you need:
* Java 8
* Maven 3

#### Launch one test:

To launch the all tests
* mvn test

Some project structure details to be highlighted
--------------------

ryanairSite
    |
    configs/Configuration.properties: This file can be modified to set choose the wished:
                              * environment
                              * browser
                              * browser size
                              * default wait time
                              * base url
    |
    src/test
        |
        java
            |
            pageObjects: following a POD approach, this folder contains all page object
                classes needed within this exercise
            |
            stepDefinitions: this folder has a step definition file per page object,
                containing the definition of the steps performed at its page
            |
            <any_folder_else> look at each file for further comments
        |
        resources
            |
            functionalTests: will contain all the feature definition files
    |
    target
        |
        cucumber-reports: contains all reports generated after each run.
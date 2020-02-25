# Understanding Spark #

## Videos ##
* A brief introduction to Distributed Computing with PySpark : https://www.youtube.com/watch?v=bJouNc1REno&list=PLRLebp9QyZtaoIpE2iaF3Q8itJOcdgYoX&feature=share&index=2

Reading Notes:
 - General Purpose distributes system - with a really nice API
 - Apache project (one of the most active one)
 - Much faster than Hadoop Map/Reduce
 - API stability buit evolving rapidly 
 - Following ship with Spark core:
    - SQL & Data Fram
    - Streaming
    - Language APIs
    - Graph Tools
    - MLLib
    - Community Packages
    - Spark ML
    - Scala, Java, Python & R
    - ML Lib
   ** Traditionally these were all seperate projects now all glued together.
   
   
 ## Launch PySpark Locally
 ```
 pramitmitra: /Users/pramitmitra/opt/anaconda3/bin
(base) ->./pyspark
Python 3.7.4 (default, Aug 13 2019, 15:17:50)

      ____              __
     / __/__  ___ _____/ /__
    _\ \/ _ \/ _ `/ __/  '_/
   /__ / .__/\_,_/_/ /_/\_\   version 2.4.5
      /_/

Using Python version 3.7.4 (default, Aug 13 2019 15:17:50)
SparkSession ava
```
## How hide too much logging informations ?
Set log4jrootCategory-ERROR, console

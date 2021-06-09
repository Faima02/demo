 val df = spark.read
         .format("csv")
         .option("header", "true") //first line in file has headers
         .option("delimiter", "\t") //set delimiter to tab or comma
         .load("c/user/home/file1.csv")

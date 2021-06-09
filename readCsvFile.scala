 val df = spark.read
         .format("csv")
         .option("header", "true") //first line in file has headers
         .option("mode", "DROPMALFORMED")
         .load("hdfs:///csv/file/dir/file.csv")

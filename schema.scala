val schema = new StructType()
      .add("RecordNumber",IntegerType,true)
      .add("Zipcode",IntegerType,true)
      .add("Country",StringType,true)
      .add("City",StringType,true)
      .add("LocationType",StringType,true)

val df_with_schema = spark.read.format("csv")
      .option("header", "true")
      .schema(schema)
      .load("c/users/resources/zipcodes.csv")

df_with_schema.printSchema()
df_with_schema.show(false)

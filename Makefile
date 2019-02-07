build:
	kotlinc `find ./$(DIR) -name *.kt` -include-runtime -d ./$(DIR)/app.jar

run:
	java -jar ./&(DIR)/app.jar

clean:
	find . -name \*.jar | xargs rm
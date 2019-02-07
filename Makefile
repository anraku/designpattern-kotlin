.PHONY: build
.PHONY: run
.PHONY: clean
default: help

help:
	@echo "you can execute (build|run|clean). require environment 'DIR' for execution"

build:
	@kotlinc `find ./$(DIR) -name *.kt` -include-runtime -d ./$(DIR)/app.jar

run:
	@java -jar ./$(DIR)/app.jar

clean:
	@find . -name \*.jar | xargs rm
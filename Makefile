.DEFAULT=run
OUTPUT=Deneme.jar

run: build deploy
	java -jar $(OUTPUT)
	
build:
	javac *
	
deploy: build
  jar cfe $(OUTPUT) Deneme Deneme*.class


all:
	@find -name "*.java" > sources.txt
	@javac @sources.txt

path:
	@export JAVA_HOME="/usr/lib/jvm/java-7-openjdk"
	@export PATH=$JAVA_HOME/bin:$PATH

clean:
	@rm -fr sources.txt
	@rm -fr simulation.txt

fclean: clean
	@find -name "*.class" -exec rm -rf {} \;

re: fclean all

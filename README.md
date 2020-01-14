# WeByte
git clone https://github.com/xristoskolios/WeByte
cd WeByte/WeByte/src
javac *.java
echo Main-Class: WeByte >manifest.txt
jar -cvfm WeByte.jar manifest.txt Customer.class Manager.class Questionnaire.class User.class WeByte.class
java -jar WeByte.jar

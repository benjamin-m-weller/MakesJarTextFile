del *.class
del *.jar
del *.txt
javac %1\*
cd C:\Shortcuts\Required Dependencies
java MakesJarTextFile %1\trial.txt %2
cd %1
jar -cvmf %1\trial.txt trial.jar *.class
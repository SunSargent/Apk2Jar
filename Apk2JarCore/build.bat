cd src
javac -verbose -encoding UTF-8 com/android/apk2jar/Apk2JarFormat.java -d ../bin
cd ../bin
jar -cvfm ../Apk2JarFormat.jar ../MANIFEST.MF com/android/apk2jar/Apk2JarFormat.class com/android/apk2jar/Apk2JarFormat$1.class com/android/apk2jar/Apk2JarFormat$2.class com/android/apk2jar/Apk2JarFormat$3.class
::cd src 
::jar -uvf ../Apk2JarFormat.jar com/android/apk2jar/Apk2JarFormat.properties
pause
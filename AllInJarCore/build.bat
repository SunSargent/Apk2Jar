cd src
javac -verbose -encoding UTF-8 com/android/allinjar/AllInJarFormat.java -d ../bin
cd ../bin
jar -cvfm ../AllInJarFormat.jar ../MANIFEST.MF com/android/allinjar/AllInJarFormat.class com/android/allinjar/AllInJarFormat$1.class com/android/allinjar/AllInJarFormat$2.class com/android/allinjar/AllInJarFormat$3.class
::cd src 
::jar -uvf ../AllInJarFormat.jar com/android/allinjar/AllInJarFormat.properties
pause
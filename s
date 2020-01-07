[33mcommit 5e937695c101448400cd6c7633a5395be12ab800[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: Sebastian Śliwiński <ssliwinski@petrosoft.pl>
Date:   Tue Jan 7 13:30:19 2020 +0100

    Zadanie 8.2

[1mdiff --git a/kodilla-exception/build.gradle b/kodilla-exception/build.gradle[m
[1mnew file mode 100644[m
[1mindex 0000000..1016d48[m
[1m--- /dev/null[m
[1m+++ b/kodilla-exception/build.gradle[m
[36m@@ -0,0 +1,16 @@[m
[32m+[m[32mplugins {[m
[32m+[m[32m    id 'java'[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mgroup 'com.kodilla'[m
[32m+[m[32mversion '0.0.1-SNAPSHOT'[m
[32m+[m
[32m+[m[32msourceCompatibility = 1.8[m
[32m+[m
[32m+[m[32mrepositories {[m
[32m+[m[32m    mavenCentral()[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mdependencies {[m
[32m+[m[32m    testCompile group: 'junit', name: 'junit', version: '4.12'[m
[32m+[m[32m}[m
[1mdiff --git a/kodilla-exception/src/main/java/com/kodilla/exception/io/FileReader.java b/kodilla-exception/src/main/java/com/kodilla/exception/io/FileReader.java[m
[1mnew file mode 100644[m
[1mindex 0000000..b881c6a[m
[1m--- /dev/null[m
[1m+++ b/kodilla-exception/src/main/java/com/kodilla/exception/io/FileReader.java[m
[36m@@ -0,0 +1,31 @@[m
[32m+[m[32mpackage com.kodilla.exception.io;[m
[32m+[m
[32m+[m[32mimport java.io.File;[m
[32m+[m[32mimport java.io.IOException;[m
[32m+[m[32mimport java.nio.file.Files;[m
[32m+[m[32mimport java.nio.file.Paths;[m
[32m+[m[32mimport java.util.stream.Stream;[m
[32m+[m
[32m+[m[32mpublic class FileReader {[m
[32m+[m
[32m+[m[32m    public void readFile() {[m
[32m+[m[32m        ClassLoader classLoader = getClass().getClassLoader();[m
[32m+[m[32m        File file = new File(classLoader.getResource("file/names.txt").getFile());[m
[32m+[m
[32m+[m
[32m+[m[32m        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){[m
[32m+[m
[32m+[m[32m            fileLines.forEach(System.out::println);[m
[32m+[m
[32m+[m[32m        } catch (IOException e){[m
[32m+[m
[32m+[m[32m            System.out.println("Somenthing goes wrong" + e);[m
[32m+[m
[32m+[m[32m        } finally {[m
[32m+[m[32m            System.out.println("I am gonna be here always!");[m
[32m+[m[32m        }[m
[32m+[m
[32m+[m
[32m+[m[32m//        System.out.println(file.getPath());[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/kodilla-exception/src/main/java/com/kodilla/exception/main/ExceptionModuleRunner.java b/kodilla-exception/src/main/java/com/kodilla/exception/main/ExceptionModuleRunner.java[m
[1mnew file mode 100644[m
[1mindex 0000000..7658388[m
[1m--- /dev/null[m
[1m+++ b/kodilla-exception/src/main/java/com/kodilla/exception/main/ExceptionModuleRunner.java[m
[36m@@ -0,0 +1,11 @@[m
[32m+[m[32mpackage com.kodilla.exception.main;[m
[32m+[m
[32m+[m[32mimport com.kodilla.exception.io.FileReader;[m
[32m+[m
[32m+[m[32mpublic class ExceptionModuleRunner {[m
[32m+[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        FileReader fileReader = new FileReader();[m
[32m+[m[32m        fileReader.readFile();[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/kodilla-exception/src/main/java/com/kodilla/exception/test/FirstChallenge.java b/kodilla-exception/src/main/java/com/kodilla/exception/test/FirstChallenge.java[m
[1mnew file mode 100644[m
[1mindex 0000000..0b365ae[m
[1m--- /dev/null[m
[1m+++ b/kodilla-exception/src/main/java/com/kodilla/exception/test/FirstChallenge.java[m
[36m@@ -0,0 +1,23 @@[m
[32m+[m
[32m+[m[32mpackage com.kodilla.exception.test;[m
[32m+[m
[32m+[m[32mpublic class FirstChallenge {[m
[32m+[m
[32m+[m[32m    public double divide(double a, double b) throws ArithmeticException {[m
[32m+[m[32m        if (b == 0) {[m
[32m+[m[32m            throw new ArithmeticException();[m
[32m+[m[32m        }[m
[32m+[m[32m        return a / b;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public static void main(String[] args) {[m
[32m+[m[32m        FirstChallenge firstChallenge = new FirstChallenge();[m
[32m+[m[32m        try {[m
[32m+[m[32m            double result = firstChallenge.divide(3, 0);[m
[32m+[m[32m        } catch (ArithmeticException e) {[m
[32m+[m[32m            System.out.println("Something go wrong :( = " + e);[m
[32m+[m[32m        } finally {[m
[32m+[m[32m                System.out.println("Never divide by 0!!");[m
[32m+[m[32m            }[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
\ No newline at end of file[m
[1mdiff --git a/kodilla-exception/src/main/resources/file/names.txt b/kodilla-exception/src/main/resources/file/names.txt[m
[1mnew file mode 100644[m
[1mindex 0000000..e4c9519[m
[1m--- /dev/null[m
[1m+++ b/kodilla-exception/src/main/resources/file/names.txt[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mKurczak[m
[32m+[m[32mIndyk[m
[32m+[m[32mGes[m
[32m+[m[32mKaczka[m
\ No newline at end of file[m
[1mdiff --git a/settings.gradle b/settings.gradle[m
[1mindex e3e6c9a..07bccf6 100644[m
[1m--- a/settings.gradle[m
[1m+++ b/settings.gradle[m
[36m@@ -1,4 +1,5 @@[m
 rootProject.name = 'kodilla-course'[m
 include 'kodilla-testing'[m
 include 'kodilla-stream'[m
[32m+[m[32minclude 'kodilla-exception'[m
 [m

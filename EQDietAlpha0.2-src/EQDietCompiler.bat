@echo off
echo EQDiet Alpha 0.20 Compiler for Windows.
echo (C) 2020, Daniel Lopez Tena.
echo.

:choice
IF NOT "x%~5"=="x" GOTO help
IF /I "%~1"=="/Compile"    GOTO Compile
IF /I "%~1"=="-Compile"    GOTO Compile
IF /I "%~1"=="/Clean"      GOTO Clean
IF /I "%~1"=="-Clean"      GOTO Clean
IF /I "%~1"=="/Jar"        GOTO Jar
IF /I "%~1"=="-Jar"        GOTO Jar
IF /I "%~1"=="/Website"    GOTO Website
IF /I "%~1"=="-Website"    GOTO Website
IF /I "%~1"=="/?"          GOTO help
IF /I "%~1"=="-?"          GOTO help
IF    "%~1" EQU ""         GOTO help
IF /I "%~1"=="/h"          GOTO help
IF /I "%~1"=="-h"          GOTO help
IF /I "%~1"=="/Help"       GOTO help
IF /I "%~1"=="-Help"       GOTO help
echo Invalid switch: %~1
echo.
goto help

:Compile
echo Compiling EQDiet Alpha 0.20...
echo.
md Build >NUL 2>NUL
javac -verbose --release 8 src\EQDietAlpha02.java -d Build
echo.
IF EXIST Build\EQDietAlpha02.class (echo Compilation done! Check your Build folder.) else echo Error while compilating.
exit /b

:Clean
echo Cleaning files...
echo.
del /s /f /q Build
rd /s /q Build >NUL 2>NUL
echo.
echo Done!
exit /b

:Jar
echo Generating JAR file...
echo.
IF NOT EXIST Build\EQDietAlpha02.class (echo Compilation isn't done. Run "EQDietCompiler.bat /Compile" to compile && exit /b)
md Release >NUL 2>NUL
md Build\META-INF >NUL 2>NUL
cd Build
echo Manifest-Version: 1.0 >META-INF\MANIFEST.MF
echo Class-Path: . >>META-INF\MANIFEST.MF
echo Main-Class: EQDietAlpha02 >>META-INF\MANIFEST.MF
jar cvmf META-INF\MANIFEST.MF ..\Release\EQDietAlpha0.2.jar *.class
cd..
IF EXIST Release\EQDietAlpha0.2.jar (echo. && echo JAR file successfully generated at Release folder!) else echo. && echo Error generating JAR file
rd /s /q Build\META-INF
exit /b

:Website
echo | set /p website= "Redirecting to eqdiet.weebly.com... "
start https://eqdiet.weebly.com
echo | set /p website= "Done!"
echo.
exit /b

:Help
echo --------------------------------------------------------------------------------------------
echo Abstract: This batch file compiles EQDiet Alpha 0.20.
echo.
echo Usage: "EQDietCompiler.bat [/Compile | /Clean | /Jar | /Website | /Help]"
echo.
echo                /Compile   - Compiles EQDiet Alpha 0.2 source code
echo                /Clean     - Cleans the compiled source folder (release folder)
echo                /Jar       - Creates the jar file from compiled source code
echo                /Website   - Redirects to EQDiet's website
echo                /Help      - Shows this message screen
echo.
echo --------------------------------------------------------------------------------------------
exit /b

@echo off
REM Compile all Java files and output .class files to bin directory
echo Compiling Java files...
javac -d bin src/edu/iutcs/cr/*.java src/edu/iutcs/cr/persons/*.java src/edu/iutcs/cr/system/*.java src/edu/iutcs/cr/utils/*.java src/edu/iutcs/cr/vehicles/*.java

REM Check if compilation was successful
if errorlevel 1 (
    echo Compilation failed!
    exit /b 1
)

echo Compilation successful!
echo.
echo Running application...
echo.

REM Run the main application with bin directory in classpath
java -cp bin edu.iutcs.cr.Main

pause
@echo off

echo [ Compiling ...... ]
echo.

cd src && javac -d ../bin entry/Run.java && cd ../bin && cls && echo ----------[ Results ]---------- && echo. && java entry/Run

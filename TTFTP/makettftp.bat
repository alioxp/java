cd src
rem ###  Change to suit your TINI installation
set  TINI_HOME=c:\tini1.01\
rem ###
java -classpath %TINI_HOME\bin\tini.jar TINIConvertor -f com\wilko\ -o ..\bin\ttftp.tini -d %TINI_HOME\bin\tini.db
cd ..
rem $Log: makettftp.bat,v $
rem Revision 1.1  2001/02/03 00:30:27  wilko
rem Initial import
rem

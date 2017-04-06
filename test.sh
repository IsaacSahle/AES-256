rm -f AES.class inputFile.enc inputFile.enc.dec
javac *.java
java AES e keyFile inputFile
java AES d keyFile inputFile.enc
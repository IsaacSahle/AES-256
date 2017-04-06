# AES-256
Java Implementation of the AES-256 Encryption Algorithm

Electronic Code Book (ECB) mode of operation

To compile... javac *.java
To run... java AES <option> <keyFile> <inputFile>

	- option: choose encryption or decryption mode with "e" or "d" respectively
	- keyFile: the key file containing a single line of 64 hex characters (256 bits)
	- inputFile: plain text file to be en/decrypted. 32 hex characters per line

Testing:

	Run test.sh which encrypts then decrypts inputFile
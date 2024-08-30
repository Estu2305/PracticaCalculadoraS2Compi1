Write-Output "STARTING COMPILING"
java -jar jflex-full-1.9.1.jar AnalizadorLexer.jflex
java -jar java-cup-11b.jar -parser AnalizadorParser -symbols sym AnalizadorParser.cup

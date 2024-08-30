package com.example.practicakotli.Analizadores;
import java_cup.runtime.Symbol;

%%

%class AnalisisLexico
%public
%char
%cup
%unicode
%ignorecase
%init{
   yyline = 1;
   yychar = 1;
%init}

BLANCOS = [ \r\t]+
DIGITO = [0-9]+
DECIMALES = [0-9]+("."[ |0-9]+)?

%%


"(" {return new Symbol(sym.PAR1, yyline, (int)yychar, yytext());}
")" {return new Symbol(sym.PAR2, yyline, (int)yychar, yytext());}

"+" {return new Symbol(sym.MAS,yyline,(int)yychar,yytext());}
"-" {return new Symbol(sym.MENOS,yyline,(int)yychar,yytext());}
"*" {return new Symbol(sym.POR,yyline,(int)yychar,yytext());}
"/" {return new Symbol(sym.DIVISION,yyline,(int)yychar,yytext());}

\n {yychar=1;}

{BLANCOS} {}
{DIGITO} {return new Symbol(sym.ENTERO,yyline,(int)yychar, yytext());}
{DECIMALES} {return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext());}

. {
    System.out.println("Este es un error lexico: " + yytext() +
    ", en la linea: " + yyline + ", en la columan: " + yychar);
}
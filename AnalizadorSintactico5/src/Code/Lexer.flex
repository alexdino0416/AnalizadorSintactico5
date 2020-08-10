package Code;
import static Code.Tokens.*;
%%
%class Lexer
%type Tokens
N=[0-9]
L=[a-zA-Z]
V=[a-zA-Z_]
E=[ ,\t, \r, \n]+
%{
    public String lexeme;
%}
%%
"clase" {lexeme=yytext(); return Clase;}
"int" {lexeme=yytext(); return Int;}
"retorna" {lexeme=yytext(); return Retorna;}
"imprimir" {lexeme=yytext(); return Imprimir;}
"->" {lexeme=yytext(); return Access;}
if {lexeme=yytext(); return If;}
else {lexeme=yytext(); return Else;}
"sumar" {lexeme=yytext(); return Sumar;}
"restar" {lexeme=yytext(); return Restar;}
"multiplicar" {lexeme=yytext(); return Multiplicar;}
"dividir" {lexeme=yytext(); return Dividir;}
"elevar" {lexeme=yytext(); return Elevar;}
"{" {lexeme=yytext(); return AbreLlave;}
"}" {lexeme=yytext(); return CierraLlave;}
"(" {lexeme=yytext(); return AbrePar;}
")" {lexeme=yytext(); return CierraPar;}
"+" {lexeme=yytext(); return Suma;}
"-" {lexeme=yytext(); return Resta;}
"*" {lexeme=yytext(); return Multiplicacion;}
"/" {lexeme=yytext(); return Division;}
"^" {lexeme=yytext(); return Potencia;}
"=" {lexeme=yytext(); return Asignar;}
"==" {lexeme=yytext(); return Igual;}
"!=" {lexeme=yytext(); return Diferente;}
"<" {lexeme=yytext(); return Menor;}
"<=" {lexeme=yytext(); return MenorIgual;}
">" {lexeme=yytext(); return Mayor;}
">=" {lexeme=yytext(); return MayorIgual;}
("(-"{N}+")") | {N}+ {lexeme=yytext(); return Numero;}
{V}({V}|{N})+ {lexeme=yytext(); return Variable;}
{L} {lexeme=yytext(); return Identificador;}
";" {lexeme=yytext(); return PuntoComa;}
{E} {/*Ignore*/}
 . {return Error; }
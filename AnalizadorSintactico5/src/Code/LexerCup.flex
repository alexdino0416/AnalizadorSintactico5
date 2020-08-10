package Code;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
N=[0-9]
L=[a-zA-Z]
V=[a-zA-Z_]
E=[ ,\t, \r, \n]+
%{
    private Symbol symbol(int type, Object value){
    	return new Symbol(type, yyline, yycolumn, value);
    }    
    private Symbol symbol(int type){
    	return new Symbol(type, yyline, yycolumn);
    }
%}
%%
clase {return new Symbol(sym.Clase, yychar, yyline, yytext());}
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
retorna {return new Symbol(sym.Retorna, yychar, yyline, yytext());}
imprimir {return new Symbol(sym.Imprimir, yychar, yyline, yytext());}
"->" {return new Symbol(sym.Access, yychar, yyline, yytext());}
if {return new Symbol(sym.If, yychar, yyline, yytext());}
else {return new Symbol(sym.Else, yychar, yyline, yytext());}
sumar {return new Symbol(sym.Sumar, yychar, yyline, yytext());}
restar {return new Symbol(sym.Restar, yychar, yyline, yytext());}
multiplicar {return new Symbol(sym.Multiplicar, yychar, yyline, yytext());}
dividir {return new Symbol(sym.Dividir, yychar, yyline, yytext());}
elevar {return new Symbol(sym.Elevar, yychar, yyline, yytext());}
"(" {return new Symbol(sym.AbrePar, yychar, yyline, yytext());}
")" {return new Symbol(sym.CierraPar, yychar, yyline, yytext());}
"==" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.Diferente, yychar, yyline, yytext());}
"<" {return new Symbol(sym.Menor, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}
">" {return new Symbol(sym.Mayor, yychar, yyline, yytext());}
">=" {return new Symbol(sym.MayorIgual, yychar, yyline, yytext());}
"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
"^" {return new Symbol(sym.Potencia, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Asignar, yychar, yyline, yytext());}
("(-"{N}+")") | {N}+ {return new Symbol(sym.Numero, yychar, yyline, new Integer(yytext()));}
{V}({V}|{N})+ {return new Symbol(sym.Variable, yychar, yyline, yytext());}
{L}+ {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
";" {return new Symbol(sym.PuntoComa, yychar, yyline, yytext());}
{E} {/*Ignore*/}
 . {return new Symbol(sym.Error, yychar, yyline, yytext());}
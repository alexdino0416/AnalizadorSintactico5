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
/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

("(-"{N}+")") | {N}+ {lexeme=yytext(); return Numero;}
{V}({V}|{N})+ {lexeme=yytext(); return Variable;}
{L} {lexeme=yytext(); return Identificador;}
";" {lexeme=yytext(); return PuntoComa;}
{E} {/*Ignore*/}
 . {return Error; }
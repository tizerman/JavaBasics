grammar ArithmeticEquations;

input : equation* EOF;

equation
   : expression relop expression
   ;

expression
   :  expression  (MULT | DIV)  expression
   |  expression  (PLUS | MINUS) expression
   |  LPAREN expression RPAREN
   |  (MINUS)* atom
   ;

atom
   : scientific
   | variable
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

variable
   : VARIABLE
   ;

relop
   : EQ
   ;


VARIABLE
   : VALID_ID
   ;


fragment VALID_ID
   : 'x' | 'X'
   ;

SCIENTIFIC_NUMBER
   : NUMBER (SIGN? UNSIGNED_INTEGER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment UNSIGNED_INTEGER
   : ('0' .. '9')+
   ;

fragment SIGN
   : '-'
   ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

MULT
   : '*'
   ;

DIV
   : '/'
   ;

EQ
   : '='
   ;

POINT
   : '.'
   ;

WS
   : [ \r\n\t] + -> skip
   ;

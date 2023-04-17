grammar primerproyecto;


@header {
package primerproyecto;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC : ';'; 
PA : '(';
PC : ')';
LLA : '{';
LLC : '}';
ASING : '=';
EQ : '==';
INT : 'int';

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip; //salte saltos en blanco, salto de linea, etc



/* 
s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
  | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
  | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
  | EOF
  ;
*/
/* 
si : s
   | EOF
   ;

s : PA s PC s
  |
  ;
*/

programa : instrucciones EOF;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion;

asignacion : ID ASING NUMERO PYC;
declaracion : INT ID inicializacion PYC;

inicializacion : ASING NUMERO 
               |
               ;
grammar ejercicio;

/* Regla para capturar fechas correspondientes a los meses pares (formato DD/MM/YYYY) */
fecha_pares: DIGIT DIGIT '/' ( '02' | '04' | '06' | '08' | '10' | '12' ) '/' DIGIT DIGIT DIGIT DIGIT ;

/* Regla para capturar horas correspondientes a las horas entre las 08:00 y las 12:59 (formato HH:MM) */
hora_manana: '08' | '09' | '1' DIGIT ':' DIGIT DIGIT | '12' ':' ('0' DIGIT | '1' '0' | '1' '1' | '1' '2') ;

/* Regla para capturar horas correspondientes a las horas entre las 18:30 y las 21:30 (formato HH:MM) */
hora_noche: ('18' | '19' | '20' | '21') ':' ('3' '0' | '3' '1' | '0' DIGIT) ;
 
/* Reglas adicionales del proyecto base */

/* Definición de tokens */
DIGIT: [0-9] ;
WS: [ \t\n\r]+ -> skip ;

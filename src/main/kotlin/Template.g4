grammar Template;

script: OPENBLOCK TERM? sequence+=instruction* CLOSEBLOCK EOF;

instruction: (assign | print | if | foreach | COMMENT) TERM*;

assign: ID EQUAL expression;

print: PRINT expression;

if: IF OPEN guard=expression CLOSE THEN TERM+ sequence+=instruction* TERM*
    (ELSE TERM+ alternative+=instruction*)? ENDIF;

expression:
    OPEN inner=expression CLOSE
    | left=expression operator=OPERATORMUL right=expression
    | left=expression operator=(ADD|MINUS) right=expression
    | left=expression operator=OPERATORREL right=expression
    | id=ID
    | value=INT
    | b=BOOLEAN
    | s=STRING;

IF:     'if';
ENDIF:  'endif';
ELSE:   'else';
THEN:   'then';
PRINT:  'print';
BOOLEAN: 'true' | 'false';

foreach: FOREACH ID IN ID TERM+ sequence+=instruction* ENDFOREACH;

FOREACH:    'foreach';
ENDFOREACH: 'endforeach';
IN:         'in';

STRING: '"' (~["\r\n])* '"';
INT:    MINUS? [0-9]+;
ID:     [a-zA-Z]+;

OPEN:  '(';
CLOSE: ')';

OPERATORMUL: '*' | '/' | '%';
OPERATORREL: '<' | '<=' | '>' | '>=' | '==' | '<>';

ADD:   '+';
MINUS: '-';
EQUAL: '=';

TERM:       '\n'+;
OPENBLOCK:  '{{';
CLOSEBLOCK: '}}';
COMMENT:    '#' ~[\n]* -> skip;
SPACE:      [ \t]+ -> skip;
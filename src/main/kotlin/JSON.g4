grammar JSON;
file: value EOF;

value
    :STRING #StringVal
    |NUMBER #NumberVal
    |BOOLEAN #BoolVal
    |array  #ArrayVal
    |obj   #ObjVal;

array:'['(value(',' value)*)?']';
obj:'{'(par(','par)*)?'}';
par:STRING':'value;


STRING : '"' ~["]* '"' ;
BOOLEAN: 'true'|'false';
NUMBER: '-'?[0-9]+('.'[0-9]+)?;
WS: [ \t\r\n]+ -> skip;
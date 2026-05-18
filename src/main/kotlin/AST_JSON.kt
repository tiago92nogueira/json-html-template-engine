sealed interface JSONValue
data class JNumber(val num:Double):JSONValue;
data class JString(val string:String):JSONValue;
data class JBoolean(val boolean:Boolean):JSONValue;

data class JArray(val values:List<JSONValue>):JSONValue;
data class JObject(val pares:List<JPar>):JSONValue;

data class JPar(val key:String, val content:JSONValue);
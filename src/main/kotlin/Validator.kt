fun validate(ctx: JSONParser.FileContext): Boolean {
    fun validateObj(obj: JSONParser.ObjContext): Boolean {
        val keys = obj.par().map { it.STRING().text.removeSurrounding("\"") }
        if (keys.size != keys.distinct().size) return false
        return obj.par().all { par ->
            val value = par.value()
            if (value is JSONParser.ObjValContext) validateObj(value.obj()) else true
        }
    }

    val root = ctx.value()
    return if (root is JSONParser.ObjValContext) validateObj(root.obj()) else true
}
package raw

data class LayerX(
    val ao: Int,
    val bm: Int,
    val ddd: Int,
    val h: Int,
    val hasMask: Boolean,
    val ind: Int,
    val ip: Int,
    val ks: KsXX,
    val masksProperties: List<MasksProperty>,
    val nm: String,
    val op: Double,
    val parent: Int,
    val refId: String,
    val shapes: List<ShapeX>,
    val sr: Int,
    val st: Int,
    val ty: Int,
    val w: Int
)
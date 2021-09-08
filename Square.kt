class Square(_name: String) : Shape(_name) {
    private var length: Double = 0.0
    private var height: Double = 0.0


    fun setDimensions(length: Double, height: Double) {

        this.length = length
        this.height = height

    }
}
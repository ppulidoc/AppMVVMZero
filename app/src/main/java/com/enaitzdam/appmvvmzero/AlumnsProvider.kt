package com.enaitzdam.appmvvmzero

class AlumnsProvider {
    companion object {
        fun returnAlumns(): List<AlumnsModel> {
            return alumnes
        }

        private val alumnes = listOf(
            AlumnsModel(
                nom = "Raul",
                edat = 19
            ),
            AlumnsModel(
                nom = "Nadir",
                edat = 19
            ),
            AlumnsModel(
                nom = "Hector",
                edat = 20
            ),
            AlumnsModel(
                nom = "Roger",
                edat = 21
            ),
            AlumnsModel(
                nom = "Dani",
                edat = 21
            ),
            AlumnsModel(
                nom = "Pau",
                edat = 20
            ),
            AlumnsModel(
                nom = "Alex",
                edat = 21
            )
        )
    }
}
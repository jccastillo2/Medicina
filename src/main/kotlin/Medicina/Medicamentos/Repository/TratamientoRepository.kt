package Medicina.Medicamentos.Repository

import Medicina.Medicamentos.Model.Tratamiento
import org.springframework.data.jpa.repository.JpaRepository

interface TratamientoRepository: JpaRepository<Tratamiento, Long> {
    fun findById (id:Long?): Tratamiento?
}
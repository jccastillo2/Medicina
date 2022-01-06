package Medicina.Medicamentos.Repository

import Medicina.Medicamentos.Model.Paciente
import org.springframework.data.jpa.repository.JpaRepository

interface PacienteRepository: JpaRepository<Paciente, Long> {
    fun findById (id:Long?):Paciente?
}
package Medicina.Medicamentos.Repository

import Medicina.Medicamentos.Model.Doctor
import org.springframework.data.jpa.repository.JpaRepository

interface DoctorRepository: JpaRepository<Doctor, Long> {
    fun findById (id:Long?):Doctor?
}
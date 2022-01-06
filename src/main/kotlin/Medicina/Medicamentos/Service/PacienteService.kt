package Medicina.Medicamentos.Service

import Medicina.Medicamentos.Model.Paciente
import Medicina.Medicamentos.Repository.DoctorRepository
import Medicina.Medicamentos.Repository.PacienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class PacienteService {
    @Autowired
    lateinit var pacienteRepository: PacienteRepository
    @Autowired
    lateinit var doctorRepository: DoctorRepository


    fun list(): List<Paciente> {

        return pacienteRepository.findAll()
    }
    fun save (paciente: Paciente): Paciente {
        try{
            doctorRepository.findById(paciente.idDoctor)
              ?: throw Exception("Doctor no encotrado")

            if (paciente.nombre.equals("")){
                throw Exception("No se ha llenado el nombre")
            }else{
                return pacienteRepository.save(paciente)
            }
        }
        catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }
    }
}
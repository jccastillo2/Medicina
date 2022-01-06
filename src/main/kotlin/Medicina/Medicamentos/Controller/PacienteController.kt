package Medicina.Medicamentos.Controller

import Medicina.Medicamentos.Model.Paciente
import Medicina.Medicamentos.Service.PacienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/paciente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class PacienteController {
    @Autowired
    lateinit var pacienteService: PacienteService

    @GetMapping
    fun list(): List<Paciente>{
        return pacienteService.list()
    }
    @PostMapping
    fun  save (@RequestBody paciente: Paciente): Paciente {
        return pacienteService.save(paciente)
    }
}
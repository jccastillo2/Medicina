package Medicina.Medicamentos.Controller

import Medicina.Medicamentos.Model.Tratamiento
import Medicina.Medicamentos.Service.TratamientoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tratamiento")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])


class TratamientoController {
    @Autowired
    lateinit var tratamientoService: TratamientoService

    @GetMapping
    fun list(): List<Tratamiento>{
        return tratamientoService.list()
    }
    @PostMapping
    fun  save (@RequestBody tratamiento: Tratamiento): Tratamiento {
        return tratamientoService.save(tratamiento)
    }
}
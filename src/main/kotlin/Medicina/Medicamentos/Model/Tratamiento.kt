package Medicina.Medicamentos.Model

import javax.persistence.*

@Entity
@Table(name = "Tratamiento")

class Tratamiento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long?=null
    var descripcion:String?=null
    @Column(name="Paciente_id")
    var idPaciente:Long?=null
}
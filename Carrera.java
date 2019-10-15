import java.util.Date;

public class Carrera
{
    private Integer codigo,semestres; 
    static Integer creditos;
    private String nombre,titulo,director;
    private Date fechaInicio;
    
    public Carrera(){}
    
    public Carrera(Integer codigo,Integer semestres,Integer creditos,String nombre,String titulo,
    String director,Date fechaInicio){
    
        this.codigo=codigo;
        this.nombre=nombre;
        this.semestres=semestres;
        this.creditos=creditos;
        this.titulo=titulo;
        this.director=director;
        this.fechaInicio=fechaInicio;
    }
    
    public Integer getCodigo(){
    return codigo;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public Integer getSemestres(){
    return semestres;
    }
    
    public Integer getCreditos(){
    return creditos;
    }
    
    public String getTitulo(){
    return titulo;
    }
    
    public String getDirector(){
    return director;
    }
    
    public Date getFechaInicio(){
    return fechaInicio;
    }
    
    public void setCodigo(Integer codigo){
    this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setSemestres(Integer semestres){
    this.semestres=semestres;
    }
    
    public void setCreditos(Integer creditos){
    this.creditos=creditos;
    }
    
    public void getTitulo(String titulo){
    this.titulo=titulo;
    }
    
    public void setDirector(String director){
    this.director=director;
    }
    
    public void setFechaInicio(Date fechaInicio){
    this.fechaInicio=fechaInicio;
    }
}

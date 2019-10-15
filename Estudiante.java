
public class Estudiante
{
    private Integer codigo,creditosCursados,telefono,edad,documento,semestresCursados;
    private String nombre,email,direccion,tipoDocumento,estado;
    private Carrera carrera;
    
    public Estudiante(){
    
        Carrera carrera = new Carrera();
    }
    
    public Estudiante(Integer codigo,Integer creditosCursados,Integer telefono,Integer edad,Integer documento,
    Integer semestresCursados,String nombre,String email,String direccion,String tipoDocumento,String estado, Carrera carrera){
    
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipoDocumento=tipoDocumento;
        this.creditosCursados=creditosCursados;
        this.semestresCursados=semestresCursados;
        this.estado=estado;
        this.carrera=carrera;
    
    }
    
    public Integer getCodigo(){
    return codigo;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public Integer getTelefono(){
    return telefono;
    }
    
    public String getEmail(){
    return email;
    }
    
    public String getDireccion(){
    return direccion;
    }
    
    public Integer getEdad(){
    return edad;
    }
    
    public Integer getDocumento(){
    return documento;
    }
    
    public String getTipoDocumento(){
    return tipoDocumento;
    }
    
    public Integer getCreditosCursados(){
    return creditosCursados;
    }
    
    public Integer getSemestresCursados(){
    return semestresCursados;
    }
    
    public String getEstado(){
    return estado;
    }
    
    public Carrera getCarrera(){
    return carrera;
    }
    
     public void setCodigo( Integer codigo){
    this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public void setTelefono(Integer telefono){
    this.telefono=telefono;
    }
    
    public void setEmail(String email){
    this.email=email;
    }
    
    public void setDireccion(String direccion){
    this.direccion=direccion;
    }
    
    public void setEdad(Integer edad){
    this.edad=edad;
    }
    
    public void setDocumento(Integer documento){
    this.documento=documento;
    }
    
    public void setTipoDocumento(String tipoDocumento){
    this.tipoDocumento=tipoDocumento;
    }
    
    public void setCreditosCursados(Integer creditosCursados){
    this.creditosCursados=creditosCursados;
    }
    
    public void setSemestresCursados(Integer semestresCursados){
    this.semestresCursados=semestresCursados;
    }
    
    public void setEstado(String estado){
    this.estado=estado;
    }
    
    public void getCarrera(Carrera carrera){
    this.carrera=carrera;
    }
    
    public void MayorEdad(){
    
        if(edad==18 || tipoDocumento=="cc")
        System.out.println("El Estudiante"+nombre+ "es mayor de edad");
    }
    
    public void creditosExigidos(){
    
    if(creditosCursados==Carrera.creditos)
    System.out.println("Estas a un paso de ser"+carrera);
    }
    
    public void proyectoGrado(){
    
    if((((creditosCursados*70)/100)==((Carrera.creditos*70)/100))&&semestresCursados==7)
    System.out.println("puede matricular proyecto de grado");  
    }
}

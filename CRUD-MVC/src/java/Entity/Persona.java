package Entity;

public class Persona {
    private int codigo;
    private String nombre;
    private String documento;

    public Persona(int codigo, String nombre, String documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.documento = documento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
}

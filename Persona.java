package ExamenParcial;

public abstract class Persona {
    private String nombres;
    private String atributo1;
    private String atributo2;
    private String atributo3;
    private String atributo4;

    public Persona(String nombres, String atributo1, String atributo2, String atributo3, String atributo4) {
        this.nombres = getNombre();
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
        this.atributo4 = atributo4;
    }

    public String getNombre() {
        return nombres;
    }

    public String getAtributo1() {
        return atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public String getAtributo3() {
        return atributo3;
    }
    
    public String getAtributo4() {
    	return atributo4;
    }
}


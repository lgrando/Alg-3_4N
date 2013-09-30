
public class Imagem {
    
    private int largura;
    private int altura;
    private String colorida;
    private String nomeArquivo;
    private Integer[][] mat;
    
    
    
    
    public double getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public String getColorida() {
        return colorida;
    }

    public void setColorida(String colorida) {
        this.colorida = colorida;
    }  
        
    public void criaMatriz(){
        mat = new Integer[this.largura][this.altura];
    }
}
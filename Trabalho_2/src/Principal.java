import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cmd;
        Imagem img = new Imagem();
        
        
        do{
          
            cmd = scan.next();

            if(cmd.equalsIgnoreCase("imagem")){
                img.setLargura(scan.nextInt());
                img.setAltura(scan.nextInt());
                img.setColorida(scan.next());
                img.criaMatriz();
                System.out.println("O comando é: " + cmd + "\n A largura é: " + img.getLargura() + "\n A altura é: " + img.getAltura() + "\n cor ou cinza? " + img.getColorida());
            }else if(cmd.equalsIgnoreCase("salvar")){
                System.out.println("O comando é: " + cmd + "\n O nome do arquivo é: " + scan.next());
            }else if(cmd.equalsIgnoreCase("cor")){
                System.out.println("O comando é: " + cmd + "\n A escala de cor é: " + scan.nextInt() + " " + scan.nextInt() + " " +scan.nextInt() + " ");
            }else if(cmd.equalsIgnoreCase("circulo")){
                System.out.println("O comando é: " + cmd + "\n Cos: " + scan.nextInt() + "\n Sin: " + scan.nextInt() + "\nRaio: " + scan.nextInt());
            }else if(cmd.equalsIgnoreCase("reta")){
                System.out.println("O comando é: " + cmd + "\n X0: " + scan.nextInt() + "\n Y0" + scan.nextInt()+ "\n X1: " + scan.nextInt() + "\n Y1" + scan.nextInt());
            }else if(cmd.equalsIgnoreCase("retangulo")){
                System.out.println("O comando é: " + cmd + "\n X0: " + scan.nextInt() + "\n Y0" + scan.nextInt()+ "\n X1: " + scan.nextInt() + "\n Y1" + scan.nextInt());
            }else if(cmd.equalsIgnoreCase("triangulo")){
                System.out.println("O comando é: " + cmd + "\n X0: " + scan.nextInt() + "\n Y0" + scan.nextInt()+ "\n X1: " + scan.nextInt() + "\n Y1" + scan.nextInt()+ "\n X2: " + scan.nextInt() + "\n Y2" + scan.nextInt());
            }else{
                System.out.println("Comando não encontrado, tente novamente...");
            }
            
        }while(!cmd.equalsIgnoreCase("salvar"));
    }
}

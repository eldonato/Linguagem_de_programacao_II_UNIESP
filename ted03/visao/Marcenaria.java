package visao;
import javax.swing.JOptionPane;
import modelo.Moldura;

public class Marcenaria {
	
	public static void main(String[] args) {
		
		float a1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a altura da moldura"));
		float b1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a base da moldura"));
		float e1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a espessura da moldura"));
		
		Moldura m = new Moldura(b1,a1,e1);
		
		JOptionPane.showMessageDialog(null, "A área da moldura é: "+m.calcularArea());
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a altura da moldura: ");
		float a1 = scan.nextFloat();
		
		System.out.print("Digite a base da moldura: ");
		float b1 = scan.nextFloat();
		
		System.out.print("Digite a espessura da moldura: ");
		float e1 = scan.nextFloat();
		
		scan.close();
		
		Moldura m = new Moldura(b1,a1,e1);
		
		System.out.println("A área da moldura é: "+ m.calcularArea());
		*/			
	}

}

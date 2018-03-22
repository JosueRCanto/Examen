import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;



public class Examen extends JFrame {
//Elabora un programa que pida una cantidad y especifique el tipo de moneda origen para que permita al usuario 
//convertirla a un tipo de moneda destino. Los tipos de monedas pueden ser dólares, euros o pesos.
	
	//valor del dolar 18.51 pesos
	//valor del euro 22.79 pesos
	
	private JButton convertir;
	private JTextField cantidad;
	private JTextField conversion;
	
	private JRadioButton etiquetaPesos;
	private JRadioButton etiquetaDolares;
	private JRadioButton etiquetaEuros;
	private ButtonGroup tipoMoneda;
	private JRadioButton etiquetaPesos2;
	private JRadioButton etiquetaDolares2;
	private JRadioButton etiquetaEuros2;
	private ButtonGroup tipoMoneda2;
	
	
	
	public Examen(){
		//panel principal
		Container contenedorPrincipal=this.getContentPane();
		contenedorPrincipal.setLayout( new GridLayout( ) );
		
		//panel de entrada de moneda
		JPanel entrada= new JPanel();
		entrada.setLayout(new GridLayout());
		entrada.setBorder( new TitledBorder("Deme moneda de entrada y cantidad") );
		
		//crear radiobuttons
		etiquetaPesos = new JRadioButton( "Pesos");
		etiquetaDolares = new JRadioButton( "Dolares");
		etiquetaEuros = new JRadioButton( "Euros");
		//crear texfield
		cantidad= new JTextField();
		//crea buttongroup
		tipoMoneda= new ButtonGroup();
		//añadir al buttongroup
		tipoMoneda.add(etiquetaPesos);	
		tipoMoneda.add(etiquetaDolares);		
		tipoMoneda.add(etiquetaEuros);
		//panel para el buttongroup
		JPanel entradaGroup= new JPanel();
		entradaGroup.setLayout(new BorderLayout());
		JPanel text=new JPanel();
		text.setLayout(new GridLayout());
		text.add(cantidad);
		
		//añadir al panelgroup
		entradaGroup.add(etiquetaPesos,BorderLayout.NORTH);	
		entradaGroup.add(etiquetaDolares,BorderLayout.CENTER);		
		entradaGroup.add(etiquetaEuros,BorderLayout.SOUTH);
				//añadir al panel de entrada
		entrada.add(entradaGroup);
		entrada.add(text);
		
		//panel salida
		JPanel salida= new JPanel();
		salida.setLayout(new GridLayout());
		salida.setBorder( new TitledBorder("A que desea convertir") );
		//crear radiobuttons
				etiquetaPesos2 = new JRadioButton( "Pesos");
				etiquetaDolares2 = new JRadioButton( "Dolares");
			    etiquetaEuros2 = new JRadioButton( "Euros");
				//crear jbutton
				convertir=new JButton("convertir");
				//crear texfield
				conversion= new JTextField();
				//crea buttongroup
				tipoMoneda2= new ButtonGroup();
				//añadir al buttongroup
				tipoMoneda2.add(etiquetaPesos2);	
				tipoMoneda2.add(etiquetaDolares2);		
				tipoMoneda2.add(etiquetaEuros2);
				//panel para el buttongroup
				JPanel entradaGroup2= new JPanel();
				entradaGroup2.setLayout(new BorderLayout());
				JPanel text2=new JPanel();
				text2.setLayout(new GridLayout());
				text2.add(conversion);
				
				//añadir al panelgroup
				entradaGroup2.add(etiquetaPesos2,BorderLayout.NORTH);	
				entradaGroup2.add(etiquetaDolares2,BorderLayout.CENTER);		
				entradaGroup2.add(etiquetaEuros2,BorderLayout.SOUTH);
				JPanel salidad =new JPanel();
				salidad.setLayout(new BorderLayout());
				salidad.add(entradaGroup2,BorderLayout.NORTH);
				salidad.add(convertir,BorderLayout.SOUTH);
				
			//crear oyentes
				convertidor oyente=new convertidor();
				//agrgar al boton
				convertir.addActionListener(oyente);
				
		//añadir al panel de salida
		salida.add(salidad);
		salida.add(text2);
		
		//añadir a la ventana principal
		contenedorPrincipal.add(entrada);
		contenedorPrincipal.add(salida);
		
		
	}
	
	public static void main(String[] args) {
		Examen ventana=new Examen();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);	

	}
	
	class convertidor implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			double num = Double.parseDouble(cantidad.getText());
			if ((JButton) e.getSource() == convertir){
				if(etiquetaPesos.isSelected()==true&&etiquetaPesos2.isSelected()==true){
					num=num;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaPesos.isSelected()==true&&etiquetaDolares2.isSelected()==true){
					num=(num/18.51);
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaPesos.isSelected()==true&&etiquetaEuros2.isSelected()==true){
					num=(num/22.79);
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if(etiquetaDolares.isSelected()==true&&etiquetaPesos2.isSelected()==true){
					num=num*18.51;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaDolares.isSelected()==true&&etiquetaDolares2.isSelected()==true){
					num=num;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaDolares.isSelected()==true&&etiquetaEuros2.isSelected()==true){
					num=(num*18.51)/22.79;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if(etiquetaEuros.isSelected()==true&&etiquetaPesos2.isSelected()==true){
					num=num*22.79;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaEuros.isSelected()==true&&etiquetaDolares2.isSelected()==true){
					num=(num*22.79)/18.51;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
				else if (etiquetaEuros.isSelected()==true&&etiquetaEuros2.isSelected()==true){
					num=num;
					String x2= String.valueOf(num);
					conversion.setText(x2);
				}
			}
		}
		
	}

	
}

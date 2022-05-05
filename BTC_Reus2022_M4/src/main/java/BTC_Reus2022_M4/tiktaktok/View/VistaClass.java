package BTC_Reus2022_M4.tiktaktok.View;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 * @version 0.0.1
 * @date 05/05/2022
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class VistaClass {

	private JFrame frame;
	private JTextField txt_Nombre_Jugador_1;
	private JTextField txt_Nombre_Jugador_2;
	private final int WIDTH=100;
	private final int HEIGHT=100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaClass window = new VistaClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 
//Declaration	
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btn_1 = new JButton("");// Posición fila 1 columna 1
		JButton btn_2 = new JButton("");// Posición fila 1 columna 2
		JButton btn_3 = new JButton("");// Posición fila 1 columna 3
		JButton btn_4 = new JButton("");// Posición fila 2 columna 1
		JButton btn_5 = new JButton("");// Posición fila 2 columna 2
		JButton btn_6 = new JButton("");// Posición fila 2 columna 3
		JButton btn_7 = new JButton("");// Posición fila 3 columna 1
		JButton btn_8 = new JButton("");// Posición fila 3 columna 2
		JButton btn_9 = new JButton("");// Posición fila 3 columna 3
		JButton btn_Nueva_Partida = new JButton("Nueva Partida");
		JLabel lbl_Jugador_1 = new JLabel("Jugador 1");
		JLabel lbl_Nombre_Jugador_1 = new JLabel("Nombre");
		JLabel lbl_Jugador_2 = new JLabel("Jugador 2");
		txt_Nombre_Jugador_1 = new JTextField();
		JLabel lbl_Nombre_Jugador_2 = new JLabel("Nombre");
		JLabel lbl_Tipo_Jugador_1 = new JLabel("Tipo:");
		JLabel lbl_Tipo_Jugador_2 = new JLabel("Tipo:");
		// Se añaden los radioButton referentes al jugador 1 al grupo de botones.
		JRadioButton radio_Humano_Jugador_1 = new JRadioButton("Humano");
		JRadioButton radio_CPU_Jugador_1 = new JRadioButton("CPU");
		// Se añaden los radioButton referentes al jugador 2 al grupo de botones.
		JRadioButton radio_Humano_Jugador_2 = new JRadioButton("Humano");
		JRadioButton radio_CPU_Jugador_2 = new JRadioButton("CPU");
		ButtonGroup grupoRadioButtonJugador1 = new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 1.
		ButtonGroup grupoRadioButtonJugador2 = new ButtonGroup();// Se crea una instancia de la clase ButtonGroup para el jugador 2.
		txt_Nombre_Jugador_2 = new JTextField();
		JButton btn_Comenzar_Partida = new JButton("Comenzar Partida");
		
		
//Parameterizing		
		btn_1.setBounds(10, 10, WIDTH, HEIGHT);
		btn_2.setBounds(120, 10, WIDTH, HEIGHT);
		btn_3.setBounds(230, 10, WIDTH, HEIGHT);
		btn_4.setBounds(10, 120, WIDTH, HEIGHT);
		btn_5.setBounds(120, 120, WIDTH, HEIGHT);
		btn_6.setBounds(230, 120, WIDTH, HEIGHT);
		btn_7.setBounds(10, 230, WIDTH, HEIGHT);
		btn_8.setBounds(120, 230, WIDTH, HEIGHT);
		btn_9.setBounds(230, 230, WIDTH, HEIGHT);
		btn_Nueva_Partida.setBounds(420, 252, 137, 23);
		lbl_Jugador_1.setBounds(382, 38, 63, 14);
		lbl_Nombre_Jugador_1.setBounds(382, 63, 63, 14);
		txt_Nombre_Jugador_1.setBounds(455, 60, 128, 20);
		txt_Nombre_Jugador_1.setColumns(10);
		lbl_Jugador_2.setBounds(382, 149, 63, 14);
		lbl_Nombre_Jugador_2.setBounds(382, 174, 63, 14);
		txt_Nombre_Jugador_2.setColumns(10);
		txt_Nombre_Jugador_2.setBounds(455, 171, 128, 20);
		lbl_Tipo_Jugador_1.setBounds(382, 108, 46, 14);
		lbl_Tipo_Jugador_2.setBounds(382, 214, 46, 14);
		radio_Humano_Jugador_1.setBounds(455, 104, 75, 23);
		radio_CPU_Jugador_1.setBounds(532, 104, 74, 23);
		radio_Humano_Jugador_2.setBounds(455, 210, 75, 23);
		radio_CPU_Jugador_2.setBounds(532, 210, 74, 23);
		btn_Comenzar_Partida.setBounds(420, 286, 137, 23);
	
		
//Adding to content Panel the components
		grupoRadioButtonJugador1.add(radio_Humano_Jugador_1);
		grupoRadioButtonJugador1.add(radio_CPU_Jugador_1);
		grupoRadioButtonJugador2.add(radio_Humano_Jugador_2);
		grupoRadioButtonJugador2.add(radio_CPU_Jugador_2);
		frame.getContentPane().add(txt_Nombre_Jugador_1);
		frame.getContentPane().add(btn_Comenzar_Partida);
		frame.getContentPane().add(radio_CPU_Jugador_2);
		frame.getContentPane().add(radio_Humano_Jugador_2);
		frame.getContentPane().add(radio_CPU_Jugador_1);
		frame.getContentPane().add(radio_Humano_Jugador_1);
		frame.getContentPane().add(lbl_Tipo_Jugador_2);
		frame.getContentPane().add(lbl_Tipo_Jugador_1);
		frame.getContentPane().add(txt_Nombre_Jugador_2);
		frame.getContentPane().add(lbl_Nombre_Jugador_2);
		frame.getContentPane().add(lbl_Jugador_2);
		frame.getContentPane().add(lbl_Nombre_Jugador_1);
		frame.getContentPane().add(lbl_Jugador_1);
		frame.getContentPane().add(btn_Nueva_Partida);
		frame.getContentPane().add(btn_9);
		frame.getContentPane().add(btn_8);
		frame.getContentPane().add(btn_7);
		frame.getContentPane().add(btn_6);
		frame.getContentPane().add(btn_5);
		frame.getContentPane().add(btn_4);
		frame.getContentPane().add(btn_3);
		frame.getContentPane().add(btn_2);
		frame.getContentPane().add(btn_1);
		
	}
}
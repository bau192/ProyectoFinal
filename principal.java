import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import java.io.File;
import org.neo4j.cypher.internal.ExecutionEngine;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.logging.LogProvider;
import java.util.*;




public class principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textContrasena;
	private JTextField nuevoUsuario;
	private JTextField nuevaContrasena;
	public Datos info;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setTitle("Mr. Gamer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 11, 242, 179);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(23, 51, 46, 14);
		panel1.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(119, 48, 86, 20);
		panel1.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(23, 86, 72, 14);
		panel1.add(lblContrasea);
		
		textContrasena = new JTextField();
		textContrasena.setBounds(119, 79, 86, 20);
		panel1.add(textContrasena);
		textContrasena.setColumns(10);
		
		JButton botonEntrar = new JButton("Entrar");
		
		botonEntrar.setBounds(116, 110, 89, 23);
		panel1.add(botonEntrar);
		
		JLabel labelInfo = new JLabel("Bienvenido");
		labelInfo.setBounds(49, 11, 89, 14);
		panel1.add(labelInfo);
		
		JButton botonCrearUsuario = new JButton("Crear usuario");
		botonCrearUsuario.setBounds(49, 145, 156, 23);
		panel1.add(botonCrearUsuario);
		
		
		//PANEL 2
		JPanel panel2 = new JPanel();
		panel2.setBounds(262, 11, 292, 179);
		contentPane.add(panel2);
		panel2.setVisible(false);
		panel2.setLayout(null);
		
		JTextArea InfoUser1 = new JTextArea();
		InfoUser1.setBounds(10, 11, 105, 37);
		InfoUser1.setEditable(false);
		panel2.add(InfoUser1);
		
		JLabel juego1 = new JLabel("New label");
		juego1.setBounds(138, 11, 46, 37);
		panel2.add(juego1);
		
		JLabel juego2 = new JLabel("New label");
		juego2.setBounds(138, 59, 46, 37);
		panel2.add(juego2);
		
		JLabel juego3 = new JLabel("New label");
		juego3.setBounds(138, 118, 46, 37);
		panel2.add(juego3);
		
		JTextArea infoJuego1 = new JTextArea();
		infoJuego1.setBounds(194, 11, 88, 37);
		panel2.add(infoJuego1);
		
		JTextArea infoJuego2 = new JTextArea();
		infoJuego2.setBounds(194, 65, 88, 37);
		panel2.add(infoJuego2);
		
		JTextArea infoJuego3 = new JTextArea();
		infoJuego3.setBounds(194, 118, 88, 37);
		panel2.add(infoJuego3);
		
		JButton consola1 = new JButton("ps4");
		consola1.setBounds(20, 66, 36, 23);
		panel2.add(consola1);
		
		JButton consola2 = new JButton("ps3");
		consola2.setBounds(67, 66, 36, 23);
		panel2.add(consola2);
		
		JButton consola3 = new JButton("XBOX ONE");
		consola3.setBounds(20, 100, 36, 23);
		panel2.add(consola3);
		
		JButton consola4 = new JButton("XBOX 360");
		consola4.setBounds(67, 100, 36, 23);
		panel2.add(consola4);
		
		JButton consola5 = new JButton("WiiU");
		consola5.setBounds(20, 132, 36, 23);
		panel2.add(consola5);
		
		JButton consola6 = new JButton("Wii");
		consola6.setBounds(67, 132, 36, 23);
		panel2.add(consola6);
		
		JButton boonCerrarSesion = new JButton("Cerrar sesion");
		boonCerrarSesion.setBounds(10, 156, 113, 23);
		panel2.add(boonCerrarSesion);
		
		
		//PANEL 3
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 200, 242, 243);
		contentPane.add(panel3);
		panel3.setVisible(false);
		panel3.setLayout(null);
		
		JTextArea infoUser2 = new JTextArea();
		infoUser2.setEditable(false);
		infoUser2.setBounds(10, 11, 105, 37);
		panel3.add(infoUser2);
		
		JButton botonAplicar = new JButton("Aplicar");
		botonAplicar.setBounds(143, 177, 89, 23);
		panel3.add(botonAplicar);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(168, 16, 46, 14);
		panel3.add(lblFiltros);
		
		JCheckBox checkRPG = new JCheckBox("RPG");
		checkRPG.setBounds(135, 39, 97, 23);
		panel3.add(checkRPG);
		
		JCheckBox checkShooter = new JCheckBox("Shooter");
		checkShooter.setBounds(135, 62, 97, 23);
		panel3.add(checkShooter);
		
		JCheckBox chckbxAventura = new JCheckBox("Aventura");
		chckbxAventura.setBounds(135, 88, 97, 23);
		panel3.add(chckbxAventura);
		
		JCheckBox checkDeportes = new JCheckBox("Deportes");
		checkDeportes.setBounds(135, 110, 97, 23);
		panel3.add(checkDeportes);
		
		JCheckBox checkPeleas = new JCheckBox("Peleas");
		checkPeleas.setBounds(135, 136, 97, 23);
		panel3.add(checkPeleas);
		
		JButton botonAtras1 = new JButton("Atras");
		botonAtras1.setBounds(143, 211, 89, 23);
		panel3.add(botonAtras1);
		
		JButton botonJuego1 = new JButton("New button");
		botonJuego1.setBounds(10, 62, 46, 71);
		panel3.add(botonJuego1);
		
		JButton botonJuego2 = new JButton("New button");
		botonJuego2.setBounds(66, 62, 46, 71);
		panel3.add(botonJuego2);
		
		JButton botonJuego3 = new JButton("New button");
		botonJuego3.setBounds(10, 153, 46, 71);
		panel3.add(botonJuego3);
		
		JButton botonJuego4 = new JButton("New button");
		botonJuego4.setBounds(66, 153, 46, 71);
		panel3.add(botonJuego4);
		
		
		//PANEL 4
		JPanel panel4 = new JPanel();
		panel4.setBounds(261, 201, 293, 199);
		contentPane.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JLabel lblFoto = new JLabel("foto");
		lblFoto.setBounds(10, 52, 116, 136);
		panel4.add(lblFoto);
		
		JTextArea InfoUser3 = new JTextArea();
		InfoUser3.setEditable(false);
		InfoUser3.setBounds(10, 11, 105, 37);
		panel4.add(InfoUser3);
		
		JTextArea infoJuego = new JTextArea();
		infoJuego.setBounds(131, 11, 152, 136);
		panel4.add(infoJuego);
		
		JButton botonComprar = new JButton("Comprar");
		botonComprar.setBounds(210, 165, 73, 23);
		panel4.add(botonComprar);
		
		JButton botonCancelar2 = new JButton("Cancelar");
		botonCancelar2.setBounds(127, 165, 73, 23);
		panel4.add(botonCancelar2);
		
		JPanel panel0 = new JPanel();
		panel0.setBounds(558, 11, 242, 179);
		contentPane.add(panel0);
		panel0.setVisible(false);
		panel0.setLayout(null);
		
		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setBounds(20, 11, 62, 14);
		panel0.add(lblUsuario_1);
		
		JLabel lblContrasena = new JLabel("Contrasena:");
		lblContrasena.setBounds(20, 36, 80, 14);
		panel0.add(lblContrasena);
		
		JLabel lblPreferencias = new JLabel("Preferencias:");
		lblPreferencias.setBounds(20, 57, 90, 14);
		panel0.add(lblPreferencias);
		
		nuevoUsuario = new JTextField();
		nuevoUsuario.setBounds(92, 8, 129, 20);
		panel0.add(nuevoUsuario);
		nuevoUsuario.setColumns(10);
		
		nuevaContrasena = new JTextField();
		nuevaContrasena.setBounds(92, 33, 129, 20);
		panel0.add(nuevaContrasena);
		nuevaContrasena.setColumns(10);
		
		JCheckBox checkNuevoRPG = new JCheckBox("RPG");
		checkNuevoRPG.setBounds(3, 78, 97, 23);
		panel0.add(checkNuevoRPG);
		
		JCheckBox checkNuevoShooter = new JCheckBox("Shooter");
		checkNuevoShooter.setBounds(3, 100, 97, 23);
		panel0.add(checkNuevoShooter);
		
		JCheckBox checkNuevoDeportes = new JCheckBox("Deportes");
		checkNuevoDeportes.setBounds(102, 78, 97, 23);
		panel0.add(checkNuevoDeportes);
		
		JCheckBox checkNuevoPeleas = new JCheckBox("Peleas");
		checkNuevoPeleas.setBounds(102, 104, 97, 23);
		panel0.add(checkNuevoPeleas);
		
		JCheckBox checkNuevoAventura = new JCheckBox("Aventura");
		checkNuevoAventura.setBounds(3, 126, 97, 23);
		panel0.add(checkNuevoAventura);
		
		JButton botonAceptar1 = new JButton("Aceptar");
		botonAceptar1.setBounds(102, 126, 89, 23);
		panel0.add(botonAceptar1);
		
		JButton botonCancelar1 = new JButton("Cancelar");
		botonCancelar1.setBounds(102, 156, 89, 23);
		panel0.add(botonCancelar1);

		
		
	
	
	
	
	//LISTENER DE TODOS LOS BOTONES
		
////////////////////////////////////////////////////
//LISTERPANEL 0
////////////////////////////////////////////////////
	
		
		
		
		botonAceptar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel0.setVisible(false);
				panel1.setVisible(true);
			}
		});
		
		
		botonCancelar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel0.setVisible(false);
				panel1.setVisible(true);
			}
		});
		
		
		
		
		
		
		
		
////////////////////////////////////////////////////
//LISTERPANEL 1
////////////////////////////////////////////////////
	
	//Boton INICIAL	
	botonEntrar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
	
			//Cambiar condicion en un futuro
			if (textUsuario.getText().equals("user") && textContrasena.getText().equals("1234"))
			{
			panel2.setVisible(true);
			panel1.setVisible(false);
			textUsuario.setText("");
			textContrasena.setText("");
			info.crearBase();
			
			}
			else
			{
			labelInfo.setText("User/pass wrong..try again...");
			textUsuario.setText("");
			textContrasena.setText("");
			}
	
		
		}
	});
	
	
	
	botonCrearUsuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panel1.setVisible(false);
			panel0.setVisible(true);	
		}
	});
	
	
	
////////////////////////////////////////////////////
//LISTERPANEL 2
////////////////////////////////////////////////////
	//ListenerConsola1
	consola1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panel3.setVisible(true);
			panel2.setVisible(false);
		
		}
	});
	
	//ListenerConsola2
		consola2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
			
			}
		});
		

		
		//ListenerConsola3
		consola3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
			
			}
		});
		
		
		//ListenerConsola4
		consola4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
			
			}
		});
		
		
		
		//ListenerConsola5
		consola5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
			
			}
		});
		
		
		//ListenerConsola6
		consola6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
			}
		});
		
		
		boonCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				panel1.setVisible(true);
				panel2.setVisible(false);
			
			}
		});
		
		
////////////////////////////////////////////////////
//LISTERPANEL 3
////////////////////////////////////////////////////
		
		//Boton Aplicar
		botonAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		//ListenerBotonAtras1
		botonAtras1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel2.setVisible(true);
				panel3.setVisible(false);
			}
		});
	
		//JUEGO1
		botonJuego1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel3.setVisible(false);
			}
		});
		
		//JUEGO2
			botonJuego2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel4.setVisible(true);
					panel3.setVisible(false);
				}
		});
		
				
		//JUEGO3
		botonJuego3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel3.setVisible(false);
			}
		});
		
		//JUEGO4
			botonJuego1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel4.setVisible(true);
					panel3.setVisible(false);
				}
			});
		
		
		
////////////////////////////////////////////////////
//LISTERPANEL 4
////////////////////////////////////////////////////
		//Boton Comprar
		botonComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		//Listener BOtonAtras2
		botonCancelar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel3.setVisible(true);
				panel4.setVisible(false);
			}
		});

	

	}
}

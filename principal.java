
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
import javax.swing.ImageIcon;

import java.util.*;
import java.io.File;
import java.awt.Color;
import java.awt.Font;

//import org.neo4j.cypher.internal.ExecutionEngine;
//import org.neo4j.graphdb.Direction;
//import org.neo4j.graphdb.GraphDatabaseService;
//import org.neo4j.graphdb.Label;
//import org.neo4j.graphdb.Node;
//import org.neo4j.graphdb.Relationship;
//import org.neo4j.graphdb.RelationshipType;
//import org.neo4j.graphdb.Result;
//import org.neo4j.graphdb.Transaction;
//import org.neo4j.graphdb.factory.GraphDatabaseFactory;
//import org.neo4j.logging.LogProvider;





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
	int ranking=0;
	
	
	
	
	
	
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
		setResizable(false);
		
		ImageIcon fifa17=new ImageIcon("fifa17.jpg");
		ImageIcon skyrim=new ImageIcon("skyrim.jpg");
		ImageIcon massEffect=new ImageIcon("massEffect.jpg");
		ImageIcon fondo=new ImageIcon("fondo.jpg");
		ImageIcon fondo2=new ImageIcon("fondo.jpg");
		ImageIcon fondo3=new ImageIcon("fondo.jpg");
		ImageIcon fondo4=new ImageIcon("fondo.jpg");
		ImageIcon Doom=new ImageIcon("Doom.jpg");
		ImageIcon wow=new ImageIcon("wow.jpg");
		ImageIcon streetFighterV=new ImageIcon("streetFighterV.png");
		ImageIcon mortalKombatX=new ImageIcon("mortalKombatx.jpg");
		
		setTitle("Mr. Gamer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setForeground(Color.RED);
		panel1.setBounds(10, 10, 448, 351);
		
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		
		JLabel lblfondo1 = new JLabel("1");
		lblfondo1.setBounds(0, 0, 448, 351);
		JLabel lblfondo2 = new JLabel("2");
		lblfondo2.setBounds(0, 0, 448, 351);
		JLabel lblfondo3 = new JLabel("3");
		lblfondo3.setBounds(0, 0, 448, 351);
		JLabel lblfondo4 = new JLabel("4");
		lblfondo4.setBounds(0, 0, 448, 351);
		
		
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(54, 137, 72, 14);
		panel1.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		textUsuario.setForeground(new Color(0, 0, 255));
		textUsuario.setBounds(191, 134, 86, 20);
		panel1.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(43, 186, 72, 14);
		panel1.add(lblContrasea);
		
		textContrasena = new JTextField();
		textContrasena.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		textContrasena.setForeground(new Color(0, 0, 255));
		textContrasena.setBounds(191, 183, 86, 20);
		panel1.add(textContrasena);
		textContrasena.setColumns(10);
		
		JButton botonEntrar = new JButton("Entrar");
		
		botonEntrar.setBounds(188, 271, 89, 23);
		panel1.add(botonEntrar);
		
		JLabel labelInfo = new JLabel("Bienvenido");
		labelInfo.setBounds(49, 11, 268, 14);
		panel1.add(labelInfo);
		
		JButton botonCrearUsuario = new JButton("Crear usuario");
		botonCrearUsuario.setBounds(149, 305, 156, 23);
		panel1.add(botonCrearUsuario);
		
		
		//PANEL 2
		JPanel panel2 = new JPanel();
		panel2.setBounds(10, 10, 448, 351);
		contentPane.add(panel2);
		panel2.setVisible(false);
		panel2.setLayout(null);
		
		JTextArea InfoUser1 = new JTextArea();
		InfoUser1.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		InfoUser1.setForeground(new Color(0, 0, 255));
		InfoUser1.setBounds(10, 11, 105, 37);
		InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:0");
		InfoUser1.setEditable(false);
		panel2.add(InfoUser1);
		
		JButton juego1 = new JButton("New label");
		juego1.setBounds(180, 10, 105, 102);
		panel2.add(juego1);
		
		JButton juego2 = new JButton("New label");
		juego2.setBounds(180, 125, 105, 102);
		panel2.add(juego2);
		
		JButton juego3 = new JButton("New label");
		juego3.setBounds(180, 240, 105, 102);
		panel2.add(juego3);
		
		JTextArea infoJuego1 = new JTextArea();
		infoJuego1.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		infoJuego1.setForeground(new Color(0, 0, 255));
		infoJuego1.setEditable(false);
		infoJuego1.setBounds(350, 23, 88, 37);
		infoJuego1.setText("FIFA 17");
		panel2.add(infoJuego1);
		
		JTextArea infoJuego2 = new JTextArea();
		infoJuego2.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		infoJuego2.setForeground(new Color(0, 0, 255));
		infoJuego2.setEditable(false);
		infoJuego2.setBounds(350, 167, 88, 37);
		infoJuego2.setText("ES. Skyrym");
		panel2.add(infoJuego2);
		
		JTextArea infoJuego3 = new JTextArea();
		infoJuego3.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		infoJuego3.setForeground(new Color(0, 0, 255));
		infoJuego3.setEditable(false);
		infoJuego3.setBounds(350, 285, 88, 37);
		infoJuego3.setText("MASS EFFECT");
		panel2.add(infoJuego3);
		
		JButton consola1 = new JButton("ps4");
		consola1.setBounds(10, 113, 81, 23);
		panel2.add(consola1);
		
		JButton consola2 = new JButton("ps3");
		consola2.setBounds(101, 113, 75, 23);
		panel2.add(consola2);
		
		JButton consola3 = new JButton("XBOX ONE");
		consola3.setBounds(10, 152, 81, 23);
		panel2.add(consola3);
		
		JButton consola4 = new JButton("XBOX 360");
		consola4.setBounds(101, 152, 75, 23);
		panel2.add(consola4);
		
		JButton consola5 = new JButton("WiiU");
		consola5.setBounds(10, 181, 81, 23);
		panel2.add(consola5);
		
		JButton consola6 = new JButton("Wii");
		consola6.setBounds(101, 181, 75, 23);
		panel2.add(consola6);
		
		JButton boonCerrarSesion = new JButton("Cerrar sesion");
		boonCerrarSesion.setBounds(24, 289, 113, 23);
		panel2.add(boonCerrarSesion);
		
		
		
		//PANEL 3
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 10, 448, 351);
		contentPane.add(panel3);
		panel3.setVisible(false);
		panel3.setLayout(null);
		
		JTextArea infoUser2 = new JTextArea();
		infoUser2.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		infoUser2.setForeground(new Color(0, 0, 255));
		infoUser2.setEditable(false);
		infoUser2.setBounds(314, 64, 105, 37);
		panel3.add(infoUser2);
		
		JButton botonAplicar = new JButton("Aplicar");
		botonAplicar.setBounds(309, 271, 89, 23);
		panel3.add(botonAplicar);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(317, 112, 46, 14);
		panel3.add(lblFiltros);
		
		JCheckBox checkRPG = new JCheckBox("RPG");
		checkRPG.setBounds(309, 133, 97, 23);
		panel3.add(checkRPG);
		
		JCheckBox checkShooter = new JCheckBox("Shooter");
		checkShooter.setBounds(309, 159, 97, 23);
		panel3.add(checkShooter);
		
		JCheckBox chckbxAventura = new JCheckBox("Aventura");
		chckbxAventura.setBounds(309, 185, 97, 23);
		panel3.add(chckbxAventura);
		
		JCheckBox checkDeportes = new JCheckBox("Deportes");
		checkDeportes.setBounds(309, 211, 97, 23);
		panel3.add(checkDeportes);
		
		JCheckBox checkPeleas = new JCheckBox("Peleas");
		checkPeleas.setBounds(309, 237, 97, 23);
		panel3.add(checkPeleas);
		
		JButton botonAtras1 = new JButton("Atras");
		botonAtras1.setBounds(309, 305, 89, 23);
		panel3.add(botonAtras1);
		
		JButton botonJuego1 = new JButton("New button");
		botonJuego1.setBounds(66, 14, 97, 159);
		panel3.add(botonJuego1);
		
		JButton botonJuego2 = new JButton("New button");
		botonJuego2.setBounds(190, 11, 105, 164);
		panel3.add(botonJuego2);
		
		JButton botonJuego3 = new JButton("New button");
		botonJuego3.setBounds(66, 184, 100, 153);
		panel3.add(botonJuego3);
		
		JButton botonJuego4 = new JButton("New button");
		botonJuego4.setBounds(190, 181, 105, 159);
		panel3.add(botonJuego4);
		
		
		//PANEL 4
		JPanel panel4 = new JPanel();
		panel4.setBounds(10, 10, 448, 351);
		contentPane.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JLabel lblFoto = new JLabel("foto");
		lblFoto.setBounds(82, 96, 105, 149);
		panel4.add(lblFoto);
		
		JTextArea InfoUser3 = new JTextArea();
		InfoUser3.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		InfoUser3.setForeground(new Color(0, 0, 255));
		InfoUser3.setEditable(false);
		InfoUser3.setBounds(10, 11, 105, 37);
		InfoUser3.setText("USUARIO: USER\n JUEGOS RANK:0");
		panel4.add(InfoUser3);
		
		JTextArea infoJuego = new JTextArea();
		infoJuego.setFont(new Font("Comic Sans MS", Font.ITALIC, 11));
		infoJuego.setForeground(new Color(0, 0, 255));
		infoJuego.setBounds(226, 52, 196, 224);
		panel4.add(infoJuego);
		
		JButton botonComprar = new JButton("Comprar");
		botonComprar.setBounds(269, 295, 116, 23);
		panel4.add(botonComprar);
		
		JButton botonCancelar2 = new JButton("Cancelar");
		botonCancelar2.setBounds(37, 295, 116, 23);
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

		
		//Gráficos
				lblfondo1.setIcon(fondo);
				lblfondo2.setIcon(fondo2);
				lblfondo3.setIcon(fondo3);
				lblfondo4.setIcon(fondo4);
				juego1.setIcon(fifa17);
				juego2.setIcon(skyrim);;
				juego3.setIcon(massEffect);
				fifa17.setImageObserver(juego1);
				skyrim.setImageObserver(juego2);
				massEffect.setImageObserver(juego3);
				panel2.add(juego1);
				panel2.add(juego2);
				panel2.add(juego3);
				panel1.add(lblfondo1);
				panel2.add(lblfondo2);
				panel3.add(lblfondo3);
				panel4.add(lblfondo4);
				
				botonJuego1.setIcon(wow);
				botonJuego2.setIcon(streetFighterV);
				botonJuego3.setIcon(mortalKombatX);
				botonJuego4.setIcon(Doom);
	
			
	
	
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
			labelInfo.setText("Bienvenido");
			infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
			
			
			
			
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
			//panel1.setVisible(false);
			//panel0.setVisible(true);	
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
			infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
			InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
			InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
		
		}
	});
	
	//ListenerConsola2
		consola2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			
			}
		});
		

		
		//ListenerConsola3
		consola3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			
			}
		});
		
		
		//ListenerConsola4
		consola4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			
			}
		});
		
		
		
		//ListenerConsola5
		consola5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		
		//ListenerConsola6
		consola6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(true);
				panel2.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		juego1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel2.setVisible(false);
				lblFoto.setIcon(fifa17);
				infoJuego.setText("FIFA 17:\n Vuelve la franquicia que vende por excelencia, este nuevo lanzamiento\n cuenta  con un agregado que lo \n diferencia con el resto de lanzamientos \n ateriores y nos referimos al modo historia\n fuera de esta cualidad se utilizo un \n nuevo motor grafico lo cual mejora \nconsiderablemente su jugabilidad\n nuestros criticos le han dado\n una puntuacion de :\n 5 Estrellas...");
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		
		juego2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel2.setVisible(false);
				lblFoto.setIcon(skyrim);
				infoJuego.setText("The Elder Scroll SKYRIM:\n  Quinta entrega de  de esta saga y muestra un cambio radical en\n cuanto a jugabilidad, es un mundo\n abierto que proyecta muchas horas de\n juego lo cual le da una apreciación\n por su compra, nuestros criticos le han \n dado un punteo de:\n 5 Estrellas   ....");
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		juego3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel2.setVisible(false);
				lblFoto.setIcon(massEffect);
				infoJuego.setText("Mass Effect:\n Mass Effect es un juego RPG que promete gran satisfación\n de jugabilidad, cuenta con\n una historia exceletne\n y una ambientación que atrajo a muchos \n jugadores, cuenta con una combinación de \n caracteristicas lo cual le da un valor muy bueno \n por su compra\n nuestros criticos le han dado un punteo de \n 5 Estrellas... ");
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		
		
		
		
		
		boonCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				panel1.setVisible(true);
				panel2.setVisible(false);
				lblfondo1.setIcon(fondo);
				fondo.setImageObserver(lblfondo1);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			
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
				
				lblFoto.setIcon(wow);
				infoJuego.setText("World of Warcraft:\nWorld of Warcraft se a convertio en una sensación desde \n el momento de salir al mercado, cuenta con una jugabilidad \n online unica que muy pocos juegos han podido dar en estos \n en la ultima decada,\n nuestr criticos le han dado una\n calificación de:\n 5 Estrellas...  ");
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		//JUEGO2
			botonJuego2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel4.setVisible(true);
					panel3.setVisible(false);
					lblFoto.setIcon(streetFighterV);
					infoJuego.setText("street Fighter V:\n street Fighter V es el ultimo lanzamiento de la saga y se mira excelente, los graficos, historia y su nuevo concepto artistico\n muestra el trabajo que los desarrolladores\n invirtieron en el, mantiene su escencia aunque talvez \n creas que es un poco lento en comparación\n a su antecesor\n nuestros criticos le han dado una \n calificación de: \n 4 Estrellas...");
					infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
				}
		});
		
				
		//JUEGO3
		botonJuego3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel4.setVisible(true);
				panel3.setVisible(false);
				lblFoto.setIcon(mortalKombatX);
				infoJuego.setText("mortal Kombat X:\n Este es el juego considerado por muchos como el \n maximo expositor de juegos de pelea que\n existe, se muestra como el la versión X \n y intenta exponer los limites\n del equipo artistico, la jugabilidad\n muestra un cambio positivo en comparación a\n la versión anterior y su valor\n de comprar es muy bueno \n nuestros criticos le han dado una\n calificación  de:\n 5 Estrellas... ");
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});
		
		//JUEGO4
			botonJuego4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					panel4.setVisible(true);
					panel3.setVisible(false);
					lblFoto.setIcon(Doom);
					infoJuego.setText("Doom:\n El juego Clasico de Doom ofrece una de las primeras estructuras graficas\n en 3 dimensiónes, su fama\n supero a juego similares de \n la epoca ante todo por la\n cualidad de agregar mods lo cual \natrajo a muchos gamers de la epoca,\n nuestros criticos le han dado una \n calificación de:\n 3 Estrellas... ");
					infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
					}
			});
		
		
		
////////////////////////////////////////////////////
//LISTERPANEL 4
////////////////////////////////////////////////////
		//Boton Comprar
		botonComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 ranking=ranking+1;
				 	panel3.setVisible(true);
					panel4.setVisible(false);
					infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
					InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
				}
		});
		
		//Listener BOtonAtras2
		botonCancelar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel3.setVisible(true);
				panel4.setVisible(false);
				infoUser2.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser1.setText("USUARIO: USER\n JUEGOS RANK:"+ranking);
				InfoUser3.setText("SUARIO: USER\n JUEGOS RANK:"+ranking);
			}
		});

	

	}
}

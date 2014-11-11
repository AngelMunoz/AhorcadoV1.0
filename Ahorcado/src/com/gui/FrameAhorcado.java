package com.gui;

/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.datos.BancoPalabras;
import com.excepciones.TooMuchChars;
import com.excepciones.NotALetter;
import com.logica.Logica;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameAhorcado extends JFrame {

	private JPanel contentPane;
	private JTextField txtSecreto;
	private JTextField txtUsadas;
	private JTextField txtChar;
	private JMenuBar menuBar;
	private JLabel lblAhorcado;
	private JMenuItem mntmNuevoJuego;
	private JMenuItem mntmSalir;
	private JButton btnIntentar;
	private String palabra = "";
	
	private int errores = 6;
	private JTextField txtRestante;
	private BancoPalabras bp = null;
	private Logica ah = null;
	private ImageIcon img; 
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public FrameAhorcado() {
		setTitle("Ahorcado Tunafish Ver. 1.7c");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 300);
		
		 menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnOpciones = new JMenu("Menu!");
		menuBar.add(mnOpciones);
		
		mntmNuevoJuego = new JMenuItem("Nuevo Juego!");
		mntmNuevoJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoJuego();
			}
		});
		mnOpciones.add(mntmNuevoJuego);
		
		mntmSalir = new JMenuItem("Salir :(");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnOpciones.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIntentar = new JButton("Intentar!");
		btnIntentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarControles();
			}
		});
		
		btnIntentar.setBounds(10, 182, 100, 23);
		contentPane.add(btnIntentar);
		
		txtSecreto = new JTextField("Hola");
		txtSecreto.setEditable(false);
		txtSecreto.setToolTipText("Adiviname!");
		txtSecreto.setBounds(10, 43, 254, 20);
		contentPane.add(txtSecreto);
		txtSecreto.setColumns(10);
		
		lblAhorcado = new JLabel();
		lblAhorcado.setToolTipText("Me Estoy Formando :D");
		lblAhorcado.setBounds(new Rectangle(303, 11, 120, 194));
		ImageIcon img = new ImageIcon("imagenes/error0.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
		contentPane.add(lblAhorcado);
		
		txtUsadas = new JTextField();
		txtUsadas.setEditable(false);
		txtUsadas.setToolTipText("Letras Usadas!");
		txtUsadas.setText("Letrishi");
		txtUsadas.setBounds(10, 74, 86, 20);
		contentPane.add(txtUsadas);
		txtUsadas.setColumns(10);
		
		txtChar = new JTextField();
		txtChar.setText("Entrada");
		txtChar.setBounds(10, 151, 50, 20);
		contentPane.add(txtChar);
		txtChar.setColumns(1);
		
		txtRestante = new JTextField("Intentos Restantes: 0");
		txtRestante.setEditable(false);
		txtRestante.setBounds(10, 105, 176, 20);
		contentPane.add(txtRestante);
		txtRestante.setColumns(10);
		
		this.bp = new BancoPalabras();
		this.palabra = bp.getRetoRandom();
		this.ah = new Logica(this.palabra);
		ah.puntoComparacion();
	}

	public int getErrores() {
		return errores;
	}

	public void restarErrores() {
		this.errores--;
	}
	
	public static boolean validarCaracter(char c)
			throws NotALetter
			{
				if(c < 'A' || c > 'Z')
				{
					throw new NotALetter();
					
				}
				else
				{
					return true;
				}
			}
			
public static boolean validarCantidad(String s)
		throws TooMuchChars
	{
		if(s.length() > 1)
		{
			throw new TooMuchChars();
		}
		else
		{
			return true;
		}
	}
String charUsados = "";
String letra = "";

protected void nuevoJuego() {
	ah.puntoComparacion();
	errores = 6;
	txtRestante.setText("Intentos Restantes: " + errores);
	palabra = bp.getRetoRandom();
	ah = new Logica(palabra);
	ah.esconderPalabra();
	txtSecreto.setText(ah.getEscondida());
	charUsados = "";
	txtUsadas.setText("");
	txtChar.setText("");
	
	img = new ImageIcon("imagenes/error0.png");
	Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
	lblAhorcado.setIcon(icono);
	btnIntentar.setEnabled(true);
	
}

	protected void actualizarControles()
	{
		boolean victoria = false;
		boolean derrota = false;
		String letra = "";
		char buscar = '\u0000';
		if(!ah.validarVictoria(ah.getEscondida(),ah.getCompare()))
		{
			try
			{
			letra = txtChar.getText().toUpperCase();
			validarCantidad(letra);
			
			buscar = letra.charAt(0);
			validarCaracter(buscar);
			}
			catch(TooMuchChars e)
			{
				
				JOptionPane.showMessageDialog(null, "Demasiadoas Letras, Ingrese Solo Una!", "Ahorcado Tunafish Ver. 1.7c", JOptionPane.ERROR_MESSAGE);
			}
			catch(NotALetter e)
			{
				
				JOptionPane.showMessageDialog(null, "El Caracter Ingresado No es Una Letra", "Ahorcado Tunafish Ver. 1.7c", JOptionPane.ERROR_MESSAGE);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				
				JOptionPane.showMessageDialog(null, "Ingrese Datos!", "Ahorcado Tunafish Ver. 1.7c", JOptionPane.ERROR_MESSAGE);
			}
			
			for(int i = 0; i< letra.length();i++)
			{
				if(charUsados.indexOf(buscar) == -1)
				{
					charUsados += buscar;
					txtUsadas.setText(charUsados);
				}
				else if(charUsados.indexOf(buscar) >= 0)
				{
					
					charUsados += buscar;
					txtUsadas.setText(charUsados);
					JOptionPane.showMessageDialog(null, "Utilice Otra Letra!", "Ahorcado Tunafish Ver. 1.7c", JOptionPane.ERROR_MESSAGE);
				}
			}
			txtUsadas.setText(charUsados);
			if(ah.verifChar(buscar))
			{
				ah.buscarLetra(buscar);
			}
			else
			{
				
				errores--;
				txtRestante.setText("Errores Restantes: " + errores);
				actualizarImagen();
			}
			
			txtSecreto.setText(ah.getEscondida());
			
			
			if(ah.validarVictoria(ah.getEscondida(),ah.getCompare()))
			{
				victoria = true;
			}
			
			if(errores <= -1)
			{
				derrota = true;
			}
			
			if(victoria)
			{
				JOptionPane.showMessageDialog(null, "Felicidades has Ganado! :)", "Ahorcado Tunafish Ver. 1.7c", JOptionPane.INFORMATION_MESSAGE);
				nuevoJuego();
			}
			else if(derrota)
			{
				JOptionPane.showMessageDialog(null, "Lo Siento Has Perdido :( Esta era la Palabra: " + ah.getCompare(), "Ahorcado Tunafish Ver. 1.7c", JOptionPane.ERROR_MESSAGE);
				nuevoJuego();
			}
			txtChar.setText("");
	}
}

public void actualizarImagen()
{
	if(errores >= 6)
	{
		img = new ImageIcon("imagenes/error0.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if (errores == 5)
	{
		img = new ImageIcon("imagenes/error1.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if(errores == 4)
	{
		img = new ImageIcon("imagenes/error2.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if(errores == 3)
	{
		img = new ImageIcon("imagenes/error3.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if (errores == 2)
	{
		img = new ImageIcon("imagenes/error4.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if(errores == 1)
	{
		img = new ImageIcon("imagenes/error5.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
	else if (errores == 0)
	{
		img = new ImageIcon("imagenes/error6.png");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblAhorcado.getWidth(), lblAhorcado.getHeight(), Image.SCALE_DEFAULT));
		lblAhorcado.setIcon(icono);
	}
		
}

public static void main(String[] args) {
				FrameAhorcado frame = new FrameAhorcado();
				frame.nuevoJuego();
				frame.setVisible(true);
}
	
}

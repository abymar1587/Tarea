import javax.swing.JFrame;//proporciona características de una ventana
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;//muestra texto e imagene
import javax.swing.JTextField;//caja de texto
import javax.swing.JButton;//boton
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.GridLayout;//ordener los componentes

/**
  * Este es un ejemplo donde se muestran algunos de los controles
  * de Swing
  */
public class EjemploSwing extends JFrame
{
    private JMenuBar mb;
    private JMenu m1,m11,m2;
    private JMenuItem mi1,mi11;
    private JCheckBoxMenuItem mi2;
	private JLabel lblBoton;
	private JLabel lblCheck;
	private JLabel lblChoice;
	private JLabel lblText;

	private JButton btn;
	private JCheckBox chk;
	private JComboBox ch;
	private JTextField txt;
    
	/**
	  * Constructor
	  */
	public EjemploSwing()
	{
	    super("prueba de elementos graficos");
		setSize(400, 300);
		setLayout(new GridLayout(4, 2));

		// crear objetos de las clases
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu ("Menu 1");
		JMenu m11 = new JMenu ("Menu 1.1");
		JMenu m2 = new JMenu ("Menu 2");
		JMenuItem mi1 = new JMenuItem ("Item 1.1");
		JMenuItem mi11 = new JMenuItem ("Item 1.1.1");
		JCheckBoxMenuItem mi2 = new JCheckBoxMenuItem("Item 2.1");
		mb.add(m1);
		mb.add(m2);		
		m1.add(mi1);
		m1.add(m11);
		m11.add(mi11);
		m2.add(mi2);
		setJMenuBar(mb);
		
		// Componentes
		
		lblBoton = new JLabel("Boton:");
		add(lblBoton);
		btn = new JButton ("Boton");
		add(btn);
		lblCheck = new JLabel("Checkbox:");
		add(lblCheck);
		chk = new JCheckBox ("Checkbox", true);
		add(chk);
		lblChoice = new JLabel("Choice:");
		add(lblChoice);
		ch = new JComboBox();
		add(ch);
		    ch.addItem("Opcion 1");
		    ch.addItem("Opcion 2");
		lblText = new JLabel("TextField:");
        		add(lblText);
		txt = new JTextField("Texto");
		add(txt);
		
	}
	public static void main (String[] args)
	{
		EjemploSwing e = new EjemploSwing();
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//establece la operación de cerrar para el boton
	}
}

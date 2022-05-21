package kwing.builder

import java.awt.Component
import java.awt.GridBagConstraints
import javax.swing.*

/* -------------------- */

inline val JButton: JButton get() = JButton()
inline val JCheckBox: JCheckBox get() = JCheckBox()
inline val JCheckBoxMenuItem: JCheckBoxMenuItem get() = JCheckBoxMenuItem()
inline val JColorChooser: JColorChooser get() = JColorChooser()
inline val JDesktopPane: JDesktopPane get() = JDesktopPane()
inline val JDialog: JDialog get() = JDialog()
inline val JEditorPane: JEditorPane get() = JEditorPane()
inline val JFileChooser: JFileChooser get() = JFileChooser()
inline val JFormattedTextField: JFormattedTextField get() = JFormattedTextField()
inline val JFrame: JFrame get() = JFrame()
inline val JInternalFrame: JInternalFrame get() = JInternalFrame()
inline val JLabel: JLabel get() = JLabel()
inline val JLayeredPane: JLayeredPane get() = JLayeredPane()
inline val JMenu: JMenu get() = JMenu()
inline val JMenuBar: JMenuBar get() = JMenuBar()
inline val JMenuItem: JMenuItem get() = JMenuItem()
inline val JOptionPane: JOptionPane get() = JOptionPane()
inline val JPanel: JPanel get() = JPanel()
inline val JPasswordField: JPasswordField get() = JPasswordField()
inline val JPopupMenu: JPopupMenu get() = JPopupMenu()
inline val JProgressBar: JProgressBar get() = JProgressBar()
inline val JRadioButton: JRadioButton get() = JRadioButton()
inline val JRadioButtonMenuItem: JRadioButtonMenuItem get() = JRadioButtonMenuItem()
inline val JRootPane: JRootPane get() = JRootPane()
inline val JScrollBar: JScrollBar get() = JScrollBar()
inline val JScrollPane: JScrollPane get() = JScrollPane()
inline val JSeparator: JSeparator get() = JSeparator()
inline val JSlider: JSlider get() = JSlider()
inline val JSpinner: JSpinner get() = JSpinner()
inline val JSplitPane: JSplitPane get() = JSplitPane()
inline val JTabbedPane: JTabbedPane get() = JTabbedPane()
inline val JTable: JTable get() = JTable()
inline val JTextArea: JTextArea get() = JTextArea()
inline val JTextField: JTextField get() = JTextField()
inline val JTextPane: JTextPane get() = JTextPane()
inline val JToggleButton: JToggleButton get() = JToggleButton()
inline val JToolBar: JToolBar get() = JToolBar()
inline val JToolTip: JToolTip get() = JToolTip()
inline val JTree: JTree get() = JTree()
inline val JViewport: JViewport get() = JViewport()
inline val JWindow: JWindow get() = JWindow()

/* -------------------- */

inline fun <T> JComboBox(dsl: JComboBox<T>.() -> Unit) = JComboBox<T>().apply(dsl)
inline fun <T : Component> JLayer(dsl: JLayer<T>.() -> Unit) = JLayer<T>().apply(dsl)
inline fun <T> JList(dsl: JList<T>.() -> Unit) = JList<T>().apply(dsl)

/* -------------------- */

inline fun GridBagConstraints(dsl: GridBagConstraints.() -> Unit) = GridBagConstraints().apply(dsl)

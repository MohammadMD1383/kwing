package kwing.builder

import java.awt.Component
import javax.swing.*

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

inline fun JButton(dsl: JButton.() -> Unit) = JButton().apply(dsl)
inline fun JCheckBox(dsl: JCheckBox.() -> Unit) = JCheckBox().apply(dsl)
inline fun JCheckBoxMenuItem(dsl: JCheckBoxMenuItem.() -> Unit) = JCheckBoxMenuItem().apply(dsl)
inline fun JColorChooser(dsl: JColorChooser.() -> Unit) = JColorChooser().apply(dsl)
inline fun <T> JComboBox(dsl: JComboBox<T>.() -> Unit) = JComboBox<T>().apply(dsl)
inline fun JDesktopPane(dsl: JDesktopPane.() -> Unit) = JDesktopPane().apply(dsl)
inline fun JDialog(dsl: JDialog.() -> Unit) = JDialog().apply(dsl)
inline fun JEditorPane(dsl: JEditorPane.() -> Unit) = JEditorPane().apply(dsl)
inline fun JFileChooser(dsl: JFileChooser.() -> Unit) = JFileChooser().apply(dsl)
inline fun JFormattedTextField(dsl: JFormattedTextField.() -> Unit) = JFormattedTextField().apply(dsl)
inline fun JFrame(dsl: JFrame.() -> Unit) = JFrame().apply(dsl)
inline fun JInternalFrame(dsl: JInternalFrame.() -> Unit) = JInternalFrame().apply(dsl)
inline fun JLabel(dsl: JLabel.() -> Unit) = JLabel().apply(dsl)
inline fun <T : Component> JLayer(dsl: JLayer<T>.() -> Unit) = JLayer<T>().apply(dsl)
inline fun JLayeredPane(dsl: JLayeredPane.() -> Unit) = JLayeredPane().apply(dsl)
inline fun <T> JList(dsl: JList<T>.() -> Unit) = JList<T>().apply(dsl)
inline fun JMenu(dsl: JMenu.() -> Unit) = JMenu().apply(dsl)
inline fun JMenuBar(dsl: JMenuBar.() -> Unit) = JMenuBar().apply(dsl)
inline fun JMenuItem(dsl: JMenuItem.() -> Unit) = JMenuItem().apply(dsl)
inline fun JOptionPane(dsl: JOptionPane.() -> Unit) = JOptionPane().apply(dsl)
inline fun JPanel(dsl: JPanel.() -> Unit) = JPanel().apply(dsl)
inline fun JPasswordField(dsl: JPasswordField.() -> Unit) = JPasswordField().apply(dsl)
inline fun JPopupMenu(dsl: JPopupMenu.() -> Unit) = JPopupMenu().apply(dsl)
inline fun JProgressBar(dsl: JProgressBar.() -> Unit) = JProgressBar().apply(dsl)
inline fun JRadioButton(dsl: JRadioButton.() -> Unit) = JRadioButton().apply(dsl)
inline fun JRadioButtonMenuItem(dsl: JRadioButtonMenuItem.() -> Unit) = JRadioButtonMenuItem().apply(dsl)
inline fun JRootPane(dsl: JRootPane.() -> Unit) = JRootPane().apply(dsl)
inline fun JScrollBar(dsl: JScrollBar.() -> Unit) = JScrollBar().apply(dsl)
inline fun JScrollPane(dsl: JScrollPane.() -> Unit) = JScrollPane().apply(dsl)
inline fun JSeparator(dsl: JSeparator.() -> Unit) = JSeparator().apply(dsl)
inline fun JSlider(dsl: JSlider.() -> Unit) = JSlider().apply(dsl)
inline fun JSpinner(dsl: JSpinner.() -> Unit) = JSpinner().apply(dsl)
inline fun JSplitPane(dsl: JSplitPane.() -> Unit) = JSplitPane().apply(dsl)
inline fun JTabbedPane(dsl: JTabbedPane.() -> Unit) = JTabbedPane().apply(dsl)
inline fun JTable(dsl: JTable.() -> Unit) = JTable().apply(dsl)
inline fun JTextArea(dsl: JTextArea.() -> Unit) = JTextArea().apply(dsl)
inline fun JTextField(dsl: JTextField.() -> Unit) = JTextField().apply(dsl)
inline fun JTextPane(dsl: JTextPane.() -> Unit) = JTextPane().apply(dsl)
inline fun JToggleButton(dsl: JToggleButton.() -> Unit) = JToggleButton().apply(dsl)
inline fun JToolBar(dsl: JToolBar.() -> Unit) = JToolBar().apply(dsl)
inline fun JToolTip(dsl: JToolTip.() -> Unit) = JToolTip().apply(dsl)
inline fun JTree(dsl: JTree.() -> Unit) = JTree().apply(dsl)
inline fun JViewport(dsl: JViewport.() -> Unit) = JViewport().apply(dsl)
inline fun JWindow(dsl: JWindow.() -> Unit) = JWindow().apply(dsl)
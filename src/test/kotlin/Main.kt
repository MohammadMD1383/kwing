import kwing.builder.JButton
import kwing.builder.JFrame
import kwing.builder.JPanel
import kwing.ext.*
import java.awt.BorderLayout
import javax.swing.JFrame.EXIT_ON_CLOSE

fun main() = JFrame {
	defaultCloseOperation = EXIT_ON_CLOSE
	layout = null
	size = 500 by 500
	locationRelativeTo = null
	
	+JPanel {
		layout = BorderLayout(10, 10)
		size = 500 by 200
		background = 0x80FF50.color
		
		+JButton[BorderLayout.CENTER] {
			text = "Center"
			size = 50 by 50
		}
		
		+JButton[BorderLayout.WEST] {
			text = "Left"
			size = 50 by 50
		}
	}
}.visible

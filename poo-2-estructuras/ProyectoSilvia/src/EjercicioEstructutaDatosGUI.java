
import java.awt.*;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.io.File;
import java.net.URL;
import javax.swing.*;

public class EjercicioEstructutaDatosGUI extends JFrame {

    private final JTextField inputField = new JTextField(10);
    private final JTextArea outputArea = new JTextArea();

    public EjercicioEstructutaDatosGUI() {
        setTitle("Secuencia Fibonacci - ProyectoSilvia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(900, 600));
        setLocationRelativeTo(null);

        BackgroundPanel background = new BackgroundPanel("/assets/fondo.png");
        background.setLayout(new GridBagLayout());
        setContentPane(background);

        JPanel card = createCardPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.NONE;
        background.add(card, gbc);
    }

    private JPanel createCardPanel() {
        JPanel card = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(255, 255, 255, 235));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                g2.dispose();
                super.paintComponent(g);
            }
        };
        card.setOpaque(false);
        card.setPreferredSize(new Dimension(700, 460));
        card.setLayout(new BorderLayout(15, 15));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Secuencia Fibonacci", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(new Color(24, 33, 77));

        JLabel subtitle = new JLabel("Ingrese un numero para realizar la formula fibonacci:", SwingConstants.CENTER);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitle.setForeground(new Color(50, 50, 50));

        JPanel top = new JPanel(new BorderLayout(8, 8));
        top.setOpaque(false);
        top.add(title, BorderLayout.NORTH);
        top.add(subtitle, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controls.setOpaque(false);

        inputField.setFont(new Font("Consolas", Font.PLAIN, 18));
        inputField.setHorizontalAlignment(JTextField.CENTER);

        JButton calculateBtn = new JButton("Calcular");
        calculateBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        calculateBtn.setFocusPainted(false);
        calculateBtn.setBackground(new Color(30, 85, 186));
        calculateBtn.setForeground(Color.WHITE);

        JButton clearBtn = new JButton("Limpiar");
        clearBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        clearBtn.setFocusPainted(false);
        clearBtn.setBackground(new Color(240, 240, 240));

        ActionListener run = e -> runFibonacci();
        calculateBtn.addActionListener(run);
        inputField.addActionListener(run);
        clearBtn.addActionListener(e -> {
            inputField.setText("");
            outputArea.setText("");
        });

        controls.add(inputField);
        controls.add(calculateBtn);
        controls.add(clearBtn);

        outputArea.setEditable(false);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 16));
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(210, 210, 210), 1));

        scrollPane.setPreferredSize(new Dimension(640, 300));

        JPanel content = new JPanel(new BorderLayout(10, 10));
        content.setOpaque(false);
        content.add(controls, BorderLayout.NORTH);
        content.add(scrollPane, BorderLayout.CENTER);

        card.add(top, BorderLayout.NORTH);
        card.add(content, BorderLayout.CENTER);

        return card;
    }

    private void runFibonacci() {
        outputArea.setText("");

        String text = inputField.getText().trim();
        int num;

        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            outputArea.setText("Ingrese un numero valido.");
            return;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger suma;

        if (num < 0) {
            outputArea.setText("Ingrese un numero mayor o igual a 0.");
            return;
        }

        if (num == 0) {
            outputArea.setText("No hay sumas para mostrar cuando el numero es 0.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            suma = a.add(b);
            sb.append("La suma de ").append(a)
              .append(" y de ").append(b)
              .append(" es: ").append(suma)
              .append('\n');
            a = b;
            b = suma;
        }

        outputArea.setText(sb.toString());
        outputArea.setCaretPosition(0);
    }

    private static class BackgroundPanel extends JPanel {
        private final Image backgroundImage;

        BackgroundPanel(String resourcePath) {
            Image img = null;
            URL resource = getClass().getResource(resourcePath);
            if (resource != null) {
                img = new ImageIcon(resource).getImage();
            } else {
                File file = new File("assets/fondo.png");
                if (file.exists()) {
                    img = new ImageIcon(file.getAbsolutePath()).getImage();
                }
            }
            backgroundImage = img;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

            if (backgroundImage != null) {
                g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                GradientPaint gp = new GradientPaint(0, 0, new Color(20, 40, 90), getWidth(), getHeight(), new Color(55, 120, 200));
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }

            g2.setColor(new Color(0, 0, 0, 60));
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjercicioEstructutaDatosGUI app = new EjercicioEstructutaDatosGUI();
            app.setVisible(true);
        });
    }
}

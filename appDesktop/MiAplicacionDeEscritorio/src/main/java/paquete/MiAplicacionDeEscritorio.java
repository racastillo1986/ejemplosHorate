package paquete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class MiAplicacionDeEscritorio {
    public static void main(String[] args) {
        // Crear el JFrame (la ventana principal)
        JFrame frame = new JFrame("Aplicación con Tabla y Formularios");

        // Configurar el comportamiento de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer un Layout adecuado para organizar los componentes
        frame.setLayout(new BorderLayout());

        // Crear un panel para los campos de texto y botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // Configuramos un GridLayout de 3 filas y 2 columnas

        // Etiquetas (Labels)
        JLabel labelId = new JLabel("ID:");
        JLabel labelName = new JLabel("Nombre:");

        // Campos de texto (Text Fields)
        JTextField textFieldId = new JTextField();
        JTextField textFieldName = new JTextField();

        // Agregar los componentes al panel
        panel.add(labelId);
        panel.add(textFieldId);
        panel.add(labelName);
        panel.add(textFieldName);

        // Crear botones
        JButton buttonAdd = new JButton("Agregar");
        JButton buttonDelete = new JButton("Eliminar");
        JButton buttonUpdate = new JButton("Actualizar");
        JButton buttonClear = new JButton("Limpiar");

        // Crear el modelo de la tabla con datos "quemados"
        String[] columnNames = {"ID", "Nombre"};
        Object[][] data = {
                {1, "Juan"},
                {2, "Ana"},
                {3, "Carlos"},
                {4, "Marta"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Crear la tabla con el modelo de datos
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table); // Colocar la tabla dentro de un JScrollPane para que sea desplazable

        // Acción para agregar un registro a la tabla
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos de los text fields
                String idText = textFieldId.getText();
                String nameText = textFieldName.getText();

                if (!idText.isEmpty() && !nameText.isEmpty()) {
                    try {
                        // Convertir ID a número
                        int id = Integer.parseInt(idText);

                        // Verificar si el ID ya existe en la tabla
                        boolean idExists = false;
                        for (int i = 0; i < model.getRowCount(); i++) {
                            if (model.getValueAt(i, 0).equals(id)) {
                                idExists = true;
                                break;
                            }
                        }

                        if (idExists) {
                            // Mostrar mensaje de error si el ID ya existe
                            JOptionPane.showMessageDialog(frame, "El ID ya existe. Por favor, ingrese un ID único.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            // Agregar fila a la tabla si el ID no está repetido
                            model.addRow(new Object[]{id, nameText});
                            // Limpiar los campos de texto
                            textFieldId.setText("");
                            textFieldName.setText("");
                        }

                    } catch (NumberFormatException ex) {
                        // Si el ID no es un número válido, mostrar mensaje de error
                        JOptionPane.showMessageDialog(frame, "Por favor, ingrese un ID válido (número).", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, complete ambos campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Acción para eliminar el registro seleccionado
        buttonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la fila seleccionada
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    model.removeRow(selectedRow); // Eliminar la fila seleccionada
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, seleccione una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Acción para actualizar un registro en la tabla
        buttonUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la fila seleccionada
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String idText = textFieldId.getText();
                    String nameText = textFieldName.getText();
                    if (!idText.isEmpty() && !nameText.isEmpty()) {
                        int id = Integer.parseInt(idText);
                        // Actualizar la fila seleccionada con los nuevos datos
                        model.setValueAt(id, selectedRow, 0); // Actualizar ID
                        model.setValueAt(nameText, selectedRow, 1); // Actualizar Nombre
                        // Limpiar los campos de texto
                        textFieldId.setText("");
                        textFieldName.setText("");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Por favor, complete ambos campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Por favor, seleccione una fila para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Acción para limpiar los campos de texto
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar los campos de texto
                textFieldId.setText("");
                textFieldName.setText("");
            }
        });

        // Agregar un ListSelectionListener a la tabla para detectar la selección de una fila
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Obtener la fila seleccionada
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Obtener los valores de la fila seleccionada y asignarlos a los campos de texto
                    textFieldId.setText(table.getValueAt(selectedRow, 0).toString());
                    textFieldName.setText(table.getValueAt(selectedRow, 1).toString());
                }
            }
        });

        // Crear un panel para los botones y agregarlos
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Para que los botones estén alineados horizontalmente
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonDelete);
        buttonPanel.add(buttonUpdate);
        buttonPanel.add(buttonClear); // Agregar el botón Limpiar

        // Agregar el panel de entrada y los botones al JFrame
        frame.add(panel, BorderLayout.NORTH); // Los campos de texto y labels van en la parte superior
        frame.add(scrollPane, BorderLayout.CENTER); // La tabla va en el centro
        frame.add(buttonPanel, BorderLayout.SOUTH); // Los botones van en la parte inferior

        // Configurar el tamaño de la ventana
        frame.setSize(500, 400);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

}

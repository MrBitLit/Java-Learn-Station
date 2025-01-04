package GUIStuff.TheDebugGarage.view;

import GUIStuff.TheDebugGarage.enums.Brand;
import GUIStuff.TheDebugGarage.enums.FuelType;
import GUIStuff.TheDebugGarage.enums.GearType;
import GUIStuff.TheDebugGarage.model.Car;
import GUIStuff.TheDebugGarage.model.Customer;
import GUIStuff.TheDebugGarage.model.Customers;
import GUIStuff.TheDebugGarage.model.Vehicles;
import GUIStuff.TheDebugGarage.model.abstracts.Vehicle;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author besic
 */
public class MainFrame extends javax.swing.JFrame {

    private Vehicles vehicles = null;
    private Customers customers = null;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setTitle("The Debug Garage");
        setLocationRelativeTo(null);
        /* Center the JFrame window horizontally 
        and vertically */
        setExtendedState(MAXIMIZED_BOTH); // Maximize the JFrame window
        // Window will never close, only if user says Yes in option
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                        MainFrame.this,
                        "Are you sure you want to close the application?",
                        "Close Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        vehicles = new Vehicles();
        customers = new Customers();

        initCustomers();
        initVehicles();

        updateView();
    }

    private void initCustomers() {
        customers.addCustomer(new Customer(
                "Omar",
                "Besic",
                "2003021435955",
                LocalDate.of(2003, Month.FEBRUARY, 14),
                null,
                null
        ));

        customers.addCustomer(new Customer(
                "John",
                "Doe",
                "1987050323111",
                LocalDate.of(1987, Month.MAY, 3),
                null,
                null
        ));
        customers.addCustomer(new Customer(
                "Alice",
                "Smith",
                "1994121212345",
                LocalDate.of(1994, Month.DECEMBER, 12),
                null,
                null
        ));
        customers.addCustomer(new Customer(
                "Robert",
                "Johnson",
                "1980051823456",
                LocalDate.of(1980, Month.MAY, 18),
                null,
                null
        ));
        customers.addCustomer(new Customer(
                "Emily",
                "Davis",
                "1990113023456",
                LocalDate.of(1990, Month.NOVEMBER, 30),
                null,
                null
        ));
    }

    private void initVehicles() {
        vehicles.addVehicle(new Car("CA 1234", Color.BLACK,
                Brand.AUDI, Brand.AUDI.getModels()[0], 54000.99,
                43200,
                LocalDate.of(2017, Month.AUGUST, 5),
                GearType.AUTOMATIC,
                customers.getCustomer(0), FuelType.PETROL));

        vehicles.addVehicle(new Car("NY 4321", Color.BLUE,
                Brand.TESLA, Brand.TESLA.getModels()[1], 49999.50,
                45000,
                LocalDate.of(2020, Month.JULY, 22),
                GearType.AUTOMATIC,
                customers.getCustomer(1), FuelType.ELECTRIC));

        vehicles.addVehicle(new Car("SF 9876", Color.RED,
                Brand.HONDA, Brand.HONDA.getModels()[2], 55000.75,
                32000,
                LocalDate.of(2019, Month.FEBRUARY, 18),
                GearType.MANUAL,
                customers.getCustomer(2), FuelType.PETROL));

        vehicles.addVehicle(new Car("LA 6543", Color.WHITE,
                Brand.MERCEDES, Brand.MERCEDES.getModels()[1],
                43000.10, 28000,
                LocalDate.of(2021, Month.JUNE, 10),
                GearType.AUTOMATIC, null, FuelType.DIESEL));
    }

    private void updateView() {

        customersList.setListData(customers.toArray());

        vehiclesList.setListData(vehicles.toArray());

        customerComboBox.setModel(new DefaultComboBoxModel(
                customers.getAllMatricules()));

        gearTypeComboBox.setModel(new DefaultComboBoxModel(GearType.
                values()));

        fuelTypeComboBox.setModel(new DefaultComboBoxModel(FuelType.
                values()));

        brandComboBox.setModel(new DefaultComboBoxModel(Brand.
                values()));
        Brand selectedBrand = (Brand) brandComboBox.getSelectedItem();
        carModelComboBox.setModel(new DefaultComboBoxModel(
                selectedBrand.getModels()));
    }

    // Convert string value to LocalDate format "2024-02-14"
    private LocalDate stringToLocalDate(String dateStringValue) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd");

        try {
            return LocalDate.parse(dateStringValue,
                    formatter);

        } catch (DateTimeParseException e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehiclesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vehiclesList = new javax.swing.JList();
        vehicleFormPanel = new javax.swing.JPanel();
        licensePlateTextField = new javax.swing.JTextField();
        licensePlateLabel = new javax.swing.JLabel();
        chooseColorButton = new javax.swing.JButton();
        brandComboBox = new javax.swing.JComboBox();
        brandLabel = new javax.swing.JLabel();
        carModelLabel = new javax.swing.JLabel();
        carModelComboBox = new javax.swing.JComboBox();
        carPriceLabel1 = new javax.swing.JLabel();
        carPriceTextField = new javax.swing.JTextField();
        carRangeKmLabel1 = new javax.swing.JLabel();
        carKmRangeTextField = new javax.swing.JTextField();
        carRangeKmLabel2 = new javax.swing.JLabel();
        carBuildDateLabel = new javax.swing.JLabel();
        carBuildDateTextField = new javax.swing.JTextField();
        gearTypeLabel = new javax.swing.JLabel();
        gearTypeComboBox = new javax.swing.JComboBox();
        customerLabel = new javax.swing.JLabel();
        customerComboBox = new javax.swing.JComboBox();
        addCarButton = new javax.swing.JButton();
        carPriceLabel2 = new javax.swing.JLabel();
        removeCarButton = new javax.swing.JButton();
        modifyCarButton = new javax.swing.JButton();
        fuelTypeLabel = new javax.swing.JLabel();
        fuelTypeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        customersPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customersList = new javax.swing.JList();
        vehicleFormPanel1 = new javax.swing.JPanel();
        firstNameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        matriculeLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        birthDateLabel = new javax.swing.JLabel();
        matriculeTextField = new javax.swing.JTextField();
        birthDateTextField = new javax.swing.JTextField();
        addCustomerButton = new javax.swing.JButton();
        removeCustomerButton = new javax.swing.JButton();
        modifyCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        vehiclesPanel.setBackground(new java.awt.Color(51, 51, 255));
        vehiclesPanel.setPreferredSize(new java.awt.Dimension(672, 629));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicles");

        vehiclesList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        vehiclesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        vehiclesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                vehiclesListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(vehiclesList);

        vehicleFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        licensePlateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensePlateTextFieldActionPerformed(evt);
            }
        });

        licensePlateLabel.setText("License plate:");

        chooseColorButton.setText("Choose color");
        chooseColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorButtonActionPerformed(evt);
            }
        });

        brandComboBox.setEditable(true);
        brandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandComboBoxActionPerformed(evt);
            }
        });

        brandLabel.setText("Brand:");

        carModelLabel.setText("Model:");

        carModelComboBox.setEditable(true);
        carModelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carModelComboBoxActionPerformed(evt);
            }
        });

        carPriceLabel1.setText("Price: ");

        carPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carPriceTextFieldActionPerformed(evt);
            }
        });

        carRangeKmLabel1.setText("Range:");

        carKmRangeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carKmRangeTextFieldActionPerformed(evt);
            }
        });

        carRangeKmLabel2.setText("km");

        carBuildDateLabel.setText("Car build date:");

        carBuildDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBuildDateTextFieldActionPerformed(evt);
            }
        });

        gearTypeLabel.setText("Gear type: ");

        gearTypeComboBox.setEditable(true);
        gearTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gearTypeComboBoxActionPerformed(evt);
            }
        });

        customerLabel.setText("Owner:");

        customerComboBox.setEditable(true);
        customerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerComboBoxActionPerformed(evt);
            }
        });

        addCarButton.setText("Add car");
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });

        carPriceLabel2.setText("€");

        removeCarButton.setText("Remove car");
        removeCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCarButtonActionPerformed(evt);
            }
        });

        modifyCarButton.setText("Modify car");
        modifyCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCarButtonActionPerformed(evt);
            }
        });

        fuelTypeLabel.setText("Fuel type: ");

        fuelTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelTypeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vehicleFormPanelLayout = new javax.swing.GroupLayout(vehicleFormPanel);
        vehicleFormPanel.setLayout(vehicleFormPanelLayout);
        vehicleFormPanelLayout.setHorizontalGroup(
            vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(carModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                            .addComponent(licensePlateLabel)
                            .addGap(18, 18, 18)
                            .addComponent(licensePlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                        .addComponent(carBuildDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carBuildDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carModelLabel))
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                        .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gearTypeLabel)
                            .addComponent(carPriceLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                                .addComponent(carPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(carPriceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gearTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerLabel)
                                    .addComponent(fuelTypeLabel))
                                .addGap(18, 18, 18)
                                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(customerComboBox, 0, 150, Short.MAX_VALUE)
                                    .addComponent(fuelTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(addCarButton)
                                .addGap(18, 18, 18)
                                .addComponent(modifyCarButton)
                                .addGap(18, 18, 18)
                                .addComponent(removeCarButton))))
                    .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                        .addComponent(chooseColorButton)
                        .addGap(18, 18, 18)
                        .addComponent(carRangeKmLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(carKmRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(carRangeKmLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(brandLabel)
                        .addGap(18, 18, 18)
                        .addComponent(brandComboBox, 0, 130, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        vehicleFormPanelLayout.setVerticalGroup(
            vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleFormPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licensePlateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licensePlateLabel)
                    .addComponent(chooseColorButton)
                    .addComponent(carRangeKmLabel1)
                    .addComponent(carKmRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carRangeKmLabel2)
                    .addComponent(brandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLabel))
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carModelLabel)
                    .addComponent(carModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPriceLabel1)
                    .addComponent(carPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPriceLabel2)
                    .addComponent(customerLabel)
                    .addComponent(customerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carBuildDateLabel)
                    .addComponent(carBuildDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gearTypeLabel)
                    .addComponent(gearTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelTypeLabel)
                    .addComponent(fuelTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(vehicleFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCarButton)
                    .addComponent(modifyCarButton)
                    .addComponent(removeCarButton))
                .addGap(19, 19, 19))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIStuff/TheDebugGarage/The_Debug_Garage.png"))); // NOI18N
        jLabel3.setDoubleBuffered(true);
        jLabel3.setName(""); // NOI18N

        javax.swing.GroupLayout vehiclesPanelLayout = new javax.swing.GroupLayout(vehiclesPanel);
        vehiclesPanel.setLayout(vehiclesPanelLayout);
        vehiclesPanelLayout.setHorizontalGroup(
            vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehiclesPanelLayout.createSequentialGroup()
                        .addGroup(vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(vehiclesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addGap(30, 30, 30))
                    .addGroup(vehiclesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        vehiclesPanelLayout.setVerticalGroup(
            vehiclesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehiclesPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vehicleFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        customersPanel.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customers");

        customersList.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        customersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                customersListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(customersList);

        vehicleFormPanel1.setBackground(new java.awt.Color(255, 153, 153));

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First name:");

        matriculeLabel.setText("Matricule:");

        lastNameLabel.setText("Last name:");

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        birthDateLabel.setText("Birth date:");

        matriculeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculeTextFieldActionPerformed(evt);
            }
        });

        birthDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthDateTextFieldActionPerformed(evt);
            }
        });

        addCustomerButton.setText("Add customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        removeCustomerButton.setText("Remove customer");
        removeCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerButtonActionPerformed(evt);
            }
        });

        modifyCustomerButton.setText("Modify customer");
        modifyCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vehicleFormPanel1Layout = new javax.swing.GroupLayout(vehicleFormPanel1);
        vehicleFormPanel1.setLayout(vehicleFormPanel1Layout);
        vehicleFormPanel1Layout.setHorizontalGroup(
            vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleFormPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehicleFormPanel1Layout.createSequentialGroup()
                        .addComponent(addCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modifyCustomerButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeCustomerButton))
                    .addGroup(vehicleFormPanel1Layout.createSequentialGroup()
                        .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(vehicleFormPanel1Layout.createSequentialGroup()
                                .addComponent(matriculeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5)))
                        .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matriculeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(birthDateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(birthDateTextField))))
                .addGap(30, 30, 30))
        );
        vehicleFormPanel1Layout.setVerticalGroup(
            vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleFormPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculeLabel)
                    .addComponent(matriculeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthDateLabel)
                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehicleFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerButton)
                    .addComponent(removeCustomerButton)
                    .addComponent(modifyCustomerButton))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(30, 30, 30))))
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vehicleFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vehiclesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vehiclesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addComponent(customersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void licensePlateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensePlateTextFieldActionPerformed

    }//GEN-LAST:event_licensePlateTextFieldActionPerformed

    private void chooseColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorButtonActionPerformed

    }//GEN-LAST:event_chooseColorButtonActionPerformed

    private void carKmRangeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carKmRangeTextFieldActionPerformed

    }//GEN-LAST:event_carKmRangeTextFieldActionPerformed

    private void brandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandComboBoxActionPerformed
        Brand selectedBrand = (Brand) brandComboBox.getSelectedItem();

        if (selectedBrand == null) {
            return;
        }

        carModelComboBox.setModel(new DefaultComboBoxModel(
                selectedBrand.getModels()));
    }//GEN-LAST:event_brandComboBoxActionPerformed

    private void carModelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carModelComboBoxActionPerformed

    }//GEN-LAST:event_carModelComboBoxActionPerformed

    private void carPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carPriceTextFieldActionPerformed

    }//GEN-LAST:event_carPriceTextFieldActionPerformed

    private void carBuildDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBuildDateTextFieldActionPerformed

    }//GEN-LAST:event_carBuildDateTextFieldActionPerformed

    private void gearTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gearTypeComboBoxActionPerformed

    }//GEN-LAST:event_gearTypeComboBoxActionPerformed

    private void customerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerComboBoxActionPerformed

    }//GEN-LAST:event_customerComboBoxActionPerformed

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        try {
            String licensePlateValue = licensePlateTextField.getText();
            Integer carKmRangeValue = Integer.valueOf(
                    carKmRangeTextField.getText());
            Brand brandValue = (Brand) brandComboBox.getSelectedItem();
            String carModelValue = (String) carModelComboBox.getSelectedItem();
            Double carPriceValue = Double.valueOf(carPriceTextField.getText());
            String carBuildDateValue = (String) carBuildDateTextField.getText();
            GearType gearTypeValue = (GearType) gearTypeComboBox.
                    getSelectedItem();
            Customer ownerValue = (Customer) customers.getCustomerByMatricule(
                    (String) customerComboBox.getSelectedItem());

            if (licensePlateValue.isBlank()
                    || brandValue == null || carModelValue.isBlank()
                    || carBuildDateValue.isBlank() || gearTypeValue
                    == null || ownerValue == null) {
                JOptionPane.showMessageDialog(this,
                        "Please fill out the car details!",
                        "Car input validation failed",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Vehicle newVehicle = new Car(licensePlateValue,
                    Color.yellow, brandValue, carModelValue,
                    carPriceValue, carKmRangeValue,
                    stringToLocalDate(carBuildDateValue),
                    gearTypeValue, ownerValue,
                    FuelType.PETROL);

            vehicles.addVehicle(newVehicle);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Only numeric values are allowed for km range and "
                    + "price!",
                    "Car input validation failed",
                    JOptionPane.ERROR_MESSAGE);
        }

        updateView();
    }//GEN-LAST:event_addCarButtonActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        String firstNameValue = firstNameTextField.getText();
        String lastNameValue = lastNameTextField.getText();
        String matriculeValue = matriculeTextField.getText();
        String birthDateValue = birthDateTextField.getText();

        Customer newCustomer = new Customer(firstNameValue,
                lastNameValue, matriculeValue,
                stringToLocalDate(birthDateValue),
                null, null);

        customers.addCustomer(newCustomer);
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed

    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void matriculeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculeTextFieldActionPerformed

    }//GEN-LAST:event_matriculeTextFieldActionPerformed

    private void birthDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthDateTextFieldActionPerformed

    }//GEN-LAST:event_birthDateTextFieldActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        try {
            String firstNameValue = firstNameTextField.getText();
            String lastNameValue = lastNameTextField.getText();
            String matriculeValue = matriculeTextField.getText();
            String birthDateValue = birthDateTextField.getText();

            if (firstNameValue.isBlank() || lastNameValue.isBlank()
                    || matriculeValue.isBlank() || birthDateValue.isBlank()) {
                JOptionPane.showMessageDialog(this,
                        "Please fill out the customer details!",
                        "Customer input validation failed",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Customer newCustomer = new Customer(firstNameValue,
                    lastNameValue, matriculeValue,
                    stringToLocalDate(birthDateValue),
                    null, null);

            customers.addCustomer(newCustomer);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        updateView();
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void vehiclesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_vehiclesListValueChanged
        int selectedIndex = vehiclesList.getSelectedIndex();

        if (selectedIndex != -1) {
            Vehicle selectedVehicle = vehicles.getVehicle(
                    selectedIndex);
            Customer selectedCustomer = selectedVehicle.getOwner();

            licensePlateTextField.setText(String.valueOf(
                    selectedVehicle.getLicensePlate()));
            carKmRangeTextField.setText(String.valueOf(
                    selectedVehicle.getKmRange()));
            brandComboBox.setSelectedItem(
                    selectedVehicle.getBrand());
            carModelComboBox.setSelectedItem(
                    selectedVehicle.getModel());
            carPriceTextField.setText(String.valueOf(
                    selectedVehicle.getPrice()));
            carBuildDateTextField.setText(String.valueOf(
                    selectedVehicle.getCarBuildDate()));
            gearTypeComboBox.setSelectedItem(
                    selectedVehicle.getGearType());
            customerComboBox.setSelectedItem(selectedCustomer != null
                    ? selectedCustomer.getMatriculeNumber() : null
            );
        } else {
            licensePlateTextField.setText("");
            carKmRangeTextField.setText("0");
            brandComboBox.setSelectedItem(null);
            carModelComboBox.setSelectedItem(null);
            carPriceTextField.setText("0.0");
            carBuildDateTextField.setText("");
            gearTypeComboBox.setSelectedItem(null);
            customerComboBox.setSelectedItem(null);
        }
    }//GEN-LAST:event_vehiclesListValueChanged

    private void customersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_customersListValueChanged
        int selectedIndex = customersList.getSelectedIndex();

        if (selectedIndex != -1) {
            Customer selectedCustomer = customers.getCustomer(
                    selectedIndex);
            firstNameTextField.setText(String.valueOf(
                    selectedCustomer.getFirstName()));
            lastNameTextField.setText(String.valueOf(
                    selectedCustomer.getLastName()));
            matriculeTextField.setText(String.valueOf(
                    selectedCustomer.getMatriculeNumber()));
            birthDateTextField.setText(String.valueOf(
                    selectedCustomer.getBirthDate()));

        } else {
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            matriculeTextField.setText("");
            birthDateTextField.setText("");
        }
    }//GEN-LAST:event_customersListValueChanged

    private void removeCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCarButtonActionPerformed
        int selectedIndex = vehiclesList.getSelectedIndex();

        if (selectedIndex != -1) {
            vehicles.removeVehicle(selectedIndex);
            updateView();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a vehicle!",
                    "No selected vehicle",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeCarButtonActionPerformed

    private void modifyCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCarButtonActionPerformed
        int selectedIndex = vehiclesList.getSelectedIndex();

        // update if a vehicle is already set
        if (selectedIndex != -1) {
            Vehicle selectedVehicle = vehicles.getVehicle(selectedIndex);

            selectedVehicle.setBrand((Brand) brandComboBox.getSelectedItem());
            selectedVehicle.setCarBuildDate(stringToLocalDate(
                    carBuildDateTextField.getText()));
//            selectedVehicle.setColor(newVehicle.getColor());
            selectedVehicle.setFuelType((FuelType) fuelTypeComboBox.
                    getSelectedItem());
            selectedVehicle.setGearType((GearType) gearTypeComboBox.
                    getSelectedItem());
            selectedVehicle.setKmRange(Integer.valueOf(
                    carKmRangeTextField.
                            getText()));
            selectedVehicle.setLicensePlate(licensePlateTextField.
                    getText());
            selectedVehicle.setModel((String) carModelComboBox.
                    getSelectedItem());
            selectedVehicle.setOwner(customers.getCustomerByMatricule(
                    (String) customerComboBox.getSelectedItem()));
            selectedVehicle.setPrice(Double.valueOf(carPriceTextField.
                    getText()));

            updateView();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a vehicle!",
                    "No selected vehicle",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifyCarButtonActionPerformed

    private void fuelTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelTypeComboBoxActionPerformed

    }//GEN-LAST:event_fuelTypeComboBoxActionPerformed

    private void modifyCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCustomerButtonActionPerformed
        int selectedIndex = customersList.getSelectedIndex();

        // update if a customer is already set
        if (selectedIndex != -1) {
            Customer selectedCustomer = customers.getCustomer(
                    selectedIndex);

            selectedCustomer.setFirstName(firstNameTextField.
                    getText());
            selectedCustomer.setLastName(lastNameTextField.getText());
            selectedCustomer.setMatriculeNumber(
                    matriculeTextField.getText());
            selectedCustomer.setBirthDate(
                    stringToLocalDate(
                            birthDateTextField.getText()));

            updateView();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a customer!",
                    "No selected customer",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modifyCustomerButtonActionPerformed

    private void removeCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerButtonActionPerformed
        int selectedIndex = customersList.getSelectedIndex();

        if (selectedIndex != -1) {
            customers.removeCustomer(selectedIndex);
            updateView();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a customer!",
                    "No selected customer",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeCustomerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(
                            info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.
                    getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarButton;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthDateTextField;
    private javax.swing.JComboBox brandComboBox;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JLabel carBuildDateLabel;
    private javax.swing.JTextField carBuildDateTextField;
    private javax.swing.JTextField carKmRangeTextField;
    private javax.swing.JComboBox carModelComboBox;
    private javax.swing.JLabel carModelLabel;
    private javax.swing.JLabel carPriceLabel1;
    private javax.swing.JLabel carPriceLabel2;
    private javax.swing.JTextField carPriceTextField;
    private javax.swing.JLabel carRangeKmLabel1;
    private javax.swing.JLabel carRangeKmLabel2;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JComboBox customerComboBox;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JList customersList;
    private javax.swing.JPanel customersPanel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox fuelTypeComboBox;
    private javax.swing.JLabel fuelTypeLabel;
    private javax.swing.JComboBox gearTypeComboBox;
    private javax.swing.JLabel gearTypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel licensePlateLabel;
    private javax.swing.JTextField licensePlateTextField;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JTextField matriculeTextField;
    private javax.swing.JButton modifyCarButton;
    private javax.swing.JButton modifyCustomerButton;
    private javax.swing.JButton removeCarButton;
    private javax.swing.JButton removeCustomerButton;
    private javax.swing.JPanel vehicleFormPanel;
    private javax.swing.JPanel vehicleFormPanel1;
    private javax.swing.JList vehiclesList;
    private javax.swing.JPanel vehiclesPanel;
    // End of variables declaration//GEN-END:variables
}

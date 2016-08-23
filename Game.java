import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.FlowLayout;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;


public class Game {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Text text_15;
	private Text text_16;
	private Text text_17;
	private Text text_18;
	private Text text_19;
	private Text text_20;
	private Text text_21;
	private Text text_22;
	private Text text_23;
	private Text text_24;
	private Text text_25;
	private Text text_26;
	private Text text_27;
	private Text text_28;
	private Text text_29;
	private Text text_30;
	private Text text_31;
	private Text text_32;
	private Text text_33;
	private Text text_34;
	private Text text_35;
	private Text text_36;
	private Text text_37;
	private Text text_38;
	private Text text_39;
	private Text text_40;
	private Text text_41;
	private Text text_42;
	private Text text_43;
	private Text text_44;
	private Text text_45;
	private Text text_46;
	private Text text_47;
	private Text text_48;
	private Button btnNewButton;
	private Button btnEnd;
	private Label lblThenPressStart;
	private Label label;
	private Label label_1;
	private Label label_2;
	private Label label_3;
	private Label label_4;
	private Label label_5;
	private Label label_6;
	private Label label_7;
	private Label label_8;
	private Label label_9;
	private Label label_10;
	private Label label_11;
	private Label label_12;
	private Label label_13;
	private Text text_49;
	private Text text_50;
	private Text text_51;
	private Text text_52;
	private Text text_53;
	private Text text_54;
	private Text text_55;
	private Text text_56;
	private Text text_57;
	private Text text_58;
	private Text text_59;
	private Text text_60;
	private Text text_61;
	private Text text_62;
	private Text text_63;
	private Text text_64;
	private Text text_65;
	private Text text_66;
	private Text text_67;
	private Text text_68;
	private Text text_69;
	private Text text_70;
	private Text text_71;
	private Text text_72;
	private Text text_73;
	private Text text_74;
	private Text text_75;
	private Text text_76;
	private Label label_14;
	private Label label_15;
	private Label label_16;
	private Label label_17;
	private Text text_84;
	private Text text_85;
	private Text text_86;
	private Text text_87;
	private Text text_88;
	private Text text_89;
	private Text text_90;
	private Text text_91;
	private Text text_92;
	private Text text_93;
	private Text text_94;
	private Text text_96;
	private Text text_97;
	private Text text_98;
	private Text text_99;
	private Text text_100;
	private Text text_101;
	private Text text_102;
	private Text text_103;
	private Text text_104;
	private Text text_105;
	private Text text_106;
	private Text text_108;
	private Text text_109;
	private Text text_110;
	private Text text_111;
	private Text text_112;
	private Text text_113;
	private Text text_114;
	private Text text_115;
	private Text text_116;
	private Text text_117;
	private Text text_118;
	private Text text_120;
	private Text text_121;
	private Text text_122;
	private Text text_123;
	private Text text_124;
	private Text text_125;
	private Text text_126;
	private Text text_127;
	private Text text_128;
	private Text text_129;
	private Text text_130;
	private Label label_18;
	private Label label_19;
	private Label label_20;
	private Label label_21;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Game window = new Game();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1036, 1135);
		
		text = new Text(shell, SWT.BORDER | SWT.CENTER);
		text.setBackground(SWTResourceManager.getColor(255, 255, 255));
		text.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text.setBounds(41, 168, 81, 81);
		
		text_1 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_1.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_1.setBounds(118, 168, 81, 81);
		
		text_2 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_2.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_2.setBounds(195, 168, 81, 81);
		
		text_3 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_3.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_3.setBounds(273, 168, 81, 81);
		
		text_4 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_4.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_4.setBounds(505, 168, 81, 81);
		
		text_5 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_5.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_5.setBounds(430, 168, 81, 81);
		
		text_6 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_6.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_6.setBounds(352, 168, 81, 81);
		
		text_7 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_7.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_7.setBounds(41, 243, 81, 81);
		
		text_8 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_8.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_8.setBounds(118, 243, 81, 81);
		
		text_9 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_9.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_9.setBounds(195, 243, 81, 81);
		
		text_10 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_10.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_10.setBounds(273, 243, 81, 81);
		
		text_11 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_11.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_11.setBounds(352, 243, 81, 81);
		
		text_12 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_12.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_12.setBounds(505, 243, 81, 81);
		
		text_13 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_13.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_13.setBounds(430, 243, 81, 81);
		
		text_14 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_14.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_14.setBounds(41, 315, 81, 81);
		
		text_15 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_15.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_15.setBounds(41, 390, 81, 81);
		
		text_16 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_16.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_16.setBounds(118, 315, 81, 81);
		
		text_17 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_17.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_17.setBounds(118, 390, 81, 81);
		
		text_18 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_18.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_18.setBounds(195, 315, 81, 81);
		
		text_19 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_19.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_19.setBounds(195, 390, 81, 81);
		
		text_20 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_20.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_20.setBounds(273, 315, 81, 81);
		
		text_21 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_21.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_21.setBounds(273, 390, 81, 81);
		
		text_22 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_22.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_22.setBounds(352, 315, 81, 81);
		
		text_23 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_23.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_23.setBounds(352, 390, 81, 81);
		
		text_24 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_24.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_24.setBounds(505, 315, 81, 81);
		
		text_25 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_25.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_25.setBounds(430, 315, 81, 81);
		
		text_26 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_26.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_26.setBounds(505, 390, 81, 81);
		
		text_27 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_27.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_27.setBounds(430, 390, 81, 81);
		
		text_28 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_28.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_28.setBounds(41, 468, 81, 81);
		
		text_29 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_29.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_29.setBounds(41, 540, 81, 81);
		
		text_30 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_30.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_30.setBounds(41, 615, 81, 81);
		
		text_31 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_31.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_31.setBounds(118, 468, 81, 81);
		
		text_32 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_32.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_32.setBounds(118, 540, 81, 81);
		
		text_33 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_33.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_33.setBounds(118, 615, 81, 81);
		
		text_34 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_34.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_34.setBounds(195, 468, 81, 81);
		
		text_35 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_35.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_35.setBounds(195, 540, 81, 81);
		
		text_36 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_36.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_36.setBounds(195, 615, 81, 81);
		
		text_37 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_37.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_37.setBounds(273, 468, 81, 81);
		
		text_38 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_38.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_38.setBounds(273, 540, 81, 81);
		
		text_39 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_39.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_39.setBounds(273, 615, 81, 81);
		
		text_40 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_40.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_40.setBounds(352, 468, 81, 81);
		
		text_41 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_41.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_41.setBounds(505, 468, 81, 81);
		
		text_42 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_42.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_42.setBounds(430, 468, 81, 81);
		
		text_43 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_43.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_43.setBounds(505, 540, 81, 81);
		
		text_44 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_44.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_44.setBounds(505, 615, 81, 81);
		
		text_45 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_45.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_45.setBounds(352, 540, 81, 81);
		
		text_46 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_46.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_46.setBounds(352, 615, 81, 81);
		
		text_47 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_47.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_47.setBounds(430, 540, 81, 81);
		
		text_48 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_48.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_48.setBounds(430, 615, 81, 81);
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNewButton.setBounds(405, 56, 75, 25);
		btnNewButton.setText("Start");
		
		btnEnd = new Button(shell, SWT.NONE);
		btnEnd.setBounds(491, 56, 75, 25);
		btnEnd.setText("End");
		
		Label lblWelcomeToBattleship = new Label(shell, SWT.NONE);
		lblWelcomeToBattleship.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblWelcomeToBattleship.setBounds(10, 0, 223, 30);
		lblWelcomeToBattleship.setText("Welcome to Battleships!");
		
		Button btnPlayer = new Button(shell, SWT.RADIO);
		btnPlayer.setBounds(32, 75, 65, 16);
		btnPlayer.setText("1 Player ");
		
		Button btnPlayers = new Button(shell, SWT.RADIO);
		btnPlayers.setBounds(104, 75, 90, 16);
		btnPlayers.setText("2 Players");
		
		Label lblPleaseSelectNumber = new Label(shell, SWT.NONE);
		lblPleaseSelectNumber.setBounds(20, 35, 184, 15);
		lblPleaseSelectNumber.setText("Please select number of Players!");
		
		lblThenPressStart = new Label(shell, SWT.NONE);
		lblThenPressStart.setBounds(30, 54, 98, 15);
		lblThenPressStart.setText("Then press Start");
		
		label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label.setBounds(13, 195, 22, 30);
		label.setText("1");
		
		label_1 = new Label(shell, SWT.NONE);
		label_1.setText("2");
		label_1.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_1.setBounds(13, 265, 22, 30);
		
		label_2 = new Label(shell, SWT.NONE);
		label_2.setText("3");
		label_2.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_2.setBounds(13, 337, 22, 30);
		
		label_3 = new Label(shell, SWT.NONE);
		label_3.setText("4");
		label_3.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_3.setBounds(13, 419, 22, 30);
		
		label_4 = new Label(shell, SWT.NONE);
		label_4.setText("5");
		label_4.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_4.setBounds(13, 486, 22, 30);
		
		label_5 = new Label(shell, SWT.NONE);
		label_5.setText("6");
		label_5.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_5.setBounds(13, 562, 22, 30);
		
		label_6 = new Label(shell, SWT.NONE);
		label_6.setText("7");
		label_6.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_6.setBounds(13, 635, 22, 30);
		
		label_7 = new Label(shell, SWT.NONE);
		label_7.setText("1");
		label_7.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_7.setBounds(75, 134, 22, 30);
		
		label_8 = new Label(shell, SWT.NONE);
		label_8.setText("2");
		label_8.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_8.setBounds(146, 132, 22, 30);
		
		label_9 = new Label(shell, SWT.NONE);
		label_9.setText("3");
		label_9.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_9.setBounds(221, 132, 22, 30);
		
		label_10 = new Label(shell, SWT.NONE);
		label_10.setText("4");
		label_10.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_10.setBounds(300, 132, 22, 30);
		
		label_11 = new Label(shell, SWT.NONE);
		label_11.setText("5");
		label_11.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_11.setBounds(383, 132, 22, 30);
		
		label_12 = new Label(shell, SWT.NONE);
		label_12.setText("6");
		label_12.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_12.setBounds(458, 132, 22, 30);
		
		label_13 = new Label(shell, SWT.NONE);
		label_13.setText("7");
		label_13.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_13.setBounds(532, 134, 22, 30);
		
		text_49 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_49.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_49.setBounds(586, 168, 81, 81);
		
		text_50 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_50.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_50.setBounds(586, 243, 81, 81);
		
		text_51 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_51.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_51.setBounds(586, 315, 81, 81);
		
		text_52 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_52.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_52.setBounds(586, 390, 81, 81);
		
		text_53 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_53.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_53.setBounds(586, 468, 81, 81);
		
		text_54 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_54.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_54.setBounds(586, 540, 81, 81);
		
		text_55 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_55.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_55.setBounds(586, 615, 81, 81);
		
		text_56 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_56.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_56.setBounds(666, 168, 81, 81);
		
		text_57 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_57.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_57.setBounds(666, 243, 81, 81);
		
		text_58 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_58.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_58.setBounds(666, 315, 81, 81);
		
		text_59 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_59.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_59.setBounds(666, 390, 81, 81);
		
		text_60 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_60.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_60.setBounds(666, 468, 81, 81);
		
		text_61 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_61.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_61.setBounds(666, 540, 81, 81);
		
		text_62 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_62.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_62.setBounds(666, 615, 81, 81);
		
		text_63 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_63.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_63.setBounds(742, 168, 81, 81);
		
		text_64 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_64.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_64.setBounds(742, 243, 81, 81);
		
		text_65 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_65.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_65.setBounds(742, 315, 81, 81);
		
		text_66 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_66.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_66.setBounds(742, 390, 81, 81);
		
		text_67 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_67.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_67.setBounds(742, 468, 81, 81);
		
		text_68 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_68.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_68.setBounds(742, 540, 81, 81);
		
		text_69 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_69.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_69.setBounds(742, 615, 81, 81);
		
		text_70 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_70.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_70.setBounds(816, 168, 81, 81);
		
		text_71 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_71.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_71.setBounds(816, 243, 81, 81);
		
		text_72 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_72.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_72.setBounds(816, 315, 81, 81);
		
		text_73 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_73.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_73.setBounds(816, 390, 81, 81);
		
		text_74 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_74.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_74.setBounds(816, 468, 81, 81);
		
		text_75 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_75.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_75.setBounds(816, 540, 81, 81);
		
		text_76 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_76.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_76.setBounds(816, 615, 81, 81);
		
		label_14 = new Label(shell, SWT.NONE);
		label_14.setText("8");
		label_14.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_14.setBounds(615, 134, 22, 30);
		
		label_15 = new Label(shell, SWT.NONE);
		label_15.setText("9");
		label_15.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_15.setBounds(692, 134, 22, 30);
		
		label_16 = new Label(shell, SWT.NONE);
		label_16.setText("10");
		label_16.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_16.setBounds(766, 134, 28, 30);
		
		label_17 = new Label(shell, SWT.NONE);
		label_17.setText("11");
		label_17.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_17.setBounds(841, 134, 28, 30);
		
		text_84 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_84.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_84.setBounds(41, 691, 81, 81);
		
		text_85 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_85.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_85.setBounds(118, 691, 81, 81);
		
		text_86 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_86.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_86.setBounds(195, 691, 81, 81);
		
		text_87 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_87.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_87.setBounds(273, 691, 81, 81);
		
		text_88 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_88.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_88.setBounds(352, 691, 81, 81);
		
		text_89 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_89.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_89.setBounds(430, 691, 81, 81);
		
		text_90 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_90.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_90.setBounds(505, 691, 81, 81);
		
		text_91 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_91.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_91.setBounds(586, 691, 81, 81);
		
		text_92 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_92.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_92.setBounds(666, 691, 81, 81);
		
		text_93 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_93.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_93.setBounds(742, 691, 81, 81);
		
		text_94 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_94.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_94.setBounds(816, 691, 81, 81);
		
		text_96 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_96.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_96.setBounds(41, 770, 81, 81);
		
		text_97 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_97.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_97.setBounds(118, 770, 81, 81);
		
		text_98 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_98.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_98.setBounds(195, 770, 81, 81);
		
		text_99 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_99.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_99.setBounds(273, 770, 81, 81);
		
		text_100 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_100.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_100.setBounds(352, 770, 81, 81);
		
		text_101 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_101.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_101.setBounds(430, 770, 81, 81);
		
		text_102 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_102.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_102.setBounds(505, 770, 81, 81);
		
		text_103 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_103.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_103.setBounds(586, 770, 81, 81);
		
		text_104 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_104.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_104.setBounds(666, 770, 81, 81);
		
		text_105 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_105.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_105.setBounds(742, 770, 81, 81);
		
		text_106 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_106.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_106.setBounds(816, 770, 81, 81);
		
		text_108 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_108.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_108.setBounds(41, 845, 81, 81);
		
		text_109 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_109.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_109.setBounds(118, 845, 81, 81);
		
		text_110 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_110.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_110.setBounds(195, 845, 81, 81);
		
		text_111 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_111.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_111.setBounds(273, 845, 81, 81);
		
		text_112 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_112.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_112.setBounds(352, 845, 81, 81);
		
		text_113 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_113.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_113.setBounds(430, 845, 81, 81);
		
		text_114 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_114.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_114.setBounds(505, 845, 81, 81);
		
		text_115 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_115.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_115.setBounds(586, 845, 81, 81);
		
		text_116 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_116.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_116.setBounds(666, 845, 81, 81);
		
		text_117 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_117.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_117.setBounds(742, 845, 81, 81);
		
		text_118 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_118.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_118.setBounds(816, 845, 81, 81);
		
		text_120 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_120.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_120.setBounds(41, 921, 81, 81);
		
		text_121 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_121.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_121.setBounds(118, 921, 81, 81);
		
		text_122 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_122.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_122.setBounds(195, 921, 81, 81);
		
		text_123 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_123.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_123.setBounds(273, 921, 81, 81);
		
		text_124 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_124.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_124.setBounds(352, 921, 81, 81);
		
		text_125 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_125.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_125.setBounds(430, 921, 81, 81);
		
		text_126 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_126.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_126.setBounds(505, 921, 81, 81);
		
		text_127 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_127.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_127.setBounds(586, 921, 81, 81);
		
		text_128 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_128.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_128.setBounds(666, 921, 81, 81);
		
		text_129 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_129.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_129.setBounds(742, 921, 81, 81);
		
		text_130 = new Text(shell, SWT.BORDER | SWT.CENTER);
		text_130.setFont(SWTResourceManager.getFont("Segoe UI", 40, SWT.BOLD));
		text_130.setBounds(816, 921, 81, 81);
		
		label_18 = new Label(shell, SWT.NONE);
		label_18.setText("8");
		label_18.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_18.setBounds(13, 717, 22, 30);
		
		label_19 = new Label(shell, SWT.NONE);
		label_19.setText("9");
		label_19.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_19.setBounds(13, 792, 22, 30);
		
		label_20 = new Label(shell, SWT.NONE);
		label_20.setText("10");
		label_20.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_20.setBounds(7, 867, 28, 30);
		
		label_21 = new Label(shell, SWT.NONE);
		label_21.setText("11");
		label_21.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.BOLD));
		label_21.setBounds(7, 945, 28, 30);

	}
}

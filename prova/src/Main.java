import java.util.Objects;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;



public class Main extends Application {
	
	Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnEq,btnFloat,btnPlus,btnMinus,btnMult,btnDiv,btnCanc,btnPow2,btnSqrt,btnSgn,btnInv,btnFact,btnBack,btnInfo,btnAns;
	TextField text;
	String op1 = "";
	String op2 = "";
	double x,y;
	String operator;
	int flag = 0;
	String result = "";
	String ans = "";
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		
		stage.setTitle("Calcolatrice");
		
		Controller ctrl = new Controller();
		
		VBox root = new VBox();
		HBox child1 = new HBox();
		HBox child2 = new HBox();
		HBox child3 = new HBox();
		HBox child4 = new HBox();
		HBox child5 = new HBox();
		
		Scene scene = new Scene(root, 590, 540);
		stage.setScene(scene);
		stage.setResizable(false);
		
		text = new TextField();
		
		text.setMinWidth(600);
		text.setMinHeight(40);
		text.setStyle("-fx-font-size:30");
		
		
		btn0 = new Button("0");
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		
		btnEq = new Button("=");
		btnFloat = new Button(".");
		btnPlus = new Button("+");
		btnMinus = new Button("-");
		btnMult = new Button("x");
		btnDiv = new Button("÷");
		btnCanc = new Button("C");
		btnPow2 = new Button("x²");
		btnSqrt = new Button("sq");
		btnSgn = new Button ("±");
		btnInv = new Button("1/x");
		btnFact = new Button("x!");
		btnBack = new Button("<-");
		btnInfo = new Button("Info");
		btnAns = new Button("Ans");
		
		btn0.setStyle("-fx-font-size:40");
		btn1.setStyle("-fx-font-size:40");
		btn2.setStyle("-fx-font-size:40");
		btn3.setStyle("-fx-font-size:40");
		btn4.setStyle("-fx-font-size:40");
		btn5.setStyle("-fx-font-size:40");
		btn6.setStyle("-fx-font-size:40");
		btn7.setStyle("-fx-font-size:40");
		btn8.setStyle("-fx-font-size:40");
		btn9.setStyle("-fx-font-size:40");
		btnPlus.setStyle("-fx-font-size:40");
		btnMinus.setStyle("-fx-font-size:40");
		btnMult.setStyle("-fx-font-size:40");
		btnDiv.setStyle("-fx-font-size:40");
		btnBack.setStyle("-fx-font-size:30");
		btnEq.setStyle("-fx-font-size:50");
		btnFloat.setStyle("-fx-font-size:40");
		btnCanc.setStyle("-fx-font-size:50");
		btnSgn.setStyle("-fx-font-size:30");
		btnInfo.setStyle("-fx-font-size:20");
		btnFact.setStyle("-fx-font-size:20");
		btnInv.setStyle("-fx-font-size:20");
		btnAns.setStyle("-fx-font-size:20");
		btnPow2.setStyle("-fx-font-size:20");
		btnSqrt.setStyle("-fx-font-size:20");
		
		
		btn0.setMinSize(100, 100);
		btn1.setMinSize(100, 100);
		btn2.setMinSize(100, 100);
		btn3.setMinSize(100, 100);
		btn4.setMinSize(100, 100);
		btn5.setMinSize(100, 100);
		btn6.setMinSize(100, 100);
		btn7.setMinSize(100, 100);
		btn8.setMinSize(100, 100);
		btn9.setMinSize(100, 100);
		btnInv.setMinSize(100, 100);
		btnFact.setMinSize(100, 100);
		btnPow2.setMinSize(100, 100);
		btnSqrt.setMinSize(100, 100);
		btnPlus.setMinSize(100, 100);
		btnMinus.setMinSize(100, 100);
		btnMult.setMinSize(100, 100);
		btnDiv.setMinSize(100, 100);
		btnEq.setMinSize(600, 80);
		btnFloat.setMinSize(100, 100);
		btnInfo.setMinSize(100, 100);
		btnBack.setMinSize(100, 100);
		btnSgn.setMinSize(100, 100);
		btnCanc.setMinSize(100, 100);
		btnAns.setMinSize(100, 100);
		
	
		text.setText("0");
		text.setEditable(false);
		text.setAlignment(Pos.BASELINE_RIGHT);
		
		btn0.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					
					if(!Objects.equals(op1, "0")) {
						op1 = op1 + "0";
						text.setText(op1);
					}
					
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "0";
						text.setText(op2);
					}
				}
			}
		});
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "1";
						text.setText(op1);
					}
					
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "1";
						text.setText(op2);
					}
				}
			}
		});
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "2";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "2";
						text.setText(op2);
					}
				}
			}
		});
		
		btn3.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "3";
						text.setText(op1);
					}
				}	
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "3";
						text.setText(op2);
					}
				}
			}
		});
		
		btn4.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "4";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "4";
						text.setText(op2);
					}
				}
			}
		});
		
		btn5.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "5";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "5";
						text.setText(op2);
					}
				}
			}
		});
		
		btn6.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "6";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
				
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "6";
						text.setText(op2);
					}
				}
				
			}
		});
		
		btn7.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "7";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "7";
						text.setText(op2);
					}
				}
				
			}
		});
		
		btn8.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "8";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "8";
						text.setText(op2);
					}
				}
			}
		});
		
		btn9.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					if(!Objects.equals(op1,"0")) {
						op1 = op1 + "9";
						text.setText(op1);
					}
				}
				
				if (flag == 1) {
					if(!Objects.equals(op2,"0")) {
						op2 = op2 + "9";
						text.setText(op2);
					}
				}
			}
		});
		
		btnEq.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(flag == 1) {
					
					if(op2 != "") {
						
						y = Double.parseDouble(op2);
						String result = ctrl.operation(x, y, operator);
						text.setText(result);
						op1 = "";
						op2 = "";
						flag = 0;
						
					}
				}
			}
		});
		
		btnFloat.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if (flag == 0) {
					
					if(op1.length() == 0) {
						
						op1 = "0.";
					}
					else {

						op1 = op1 + ".";
					}
					
					text.setText(op1);
				}
				
				if (flag == 1) {
					
					if(op2.length() == 0) {
						
						op2 = "0.";
					}
					else {
						
						op2 = op2 + ".";

					}
					text.setText(op2);
				}
			}
		});
		
		btnPlus.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0 && op2 == "") {
				
					x = Double.parseDouble(op1);
					text.setText("+");
					operator = "+";
					flag = 1;
				}
			}
		});
		
		btnMinus.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0 && op2 == "") {
					
					x = Double.parseDouble(op1);
					text.setText("-");
					operator = "-";
					flag = 1;
				}
			}
		});
		
		btnMult.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0 && op2 == "") {
					
					x = Double.parseDouble(op1);
					text.setText("x");
					operator = "x";
					flag = 1;
				}
			}
		});
		
		btnDiv.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0 && op2 == "") {
				
					x = Double.parseDouble(op1);
					text.setText("÷");
					operator = "÷";
					flag = 1;
				}
			}
		});
		
		btnCanc.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				op1 = "";
				op2 = "";
				ctrl.result = "";
				flag = 0;
				text.setText("0");
			}
			
		});
		
		btnPow2.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0) {
				
					x = Double.parseDouble(op1);
					operator = "x²";
					result = ctrl.operation(x, y, operator);
					text.setText(result);
					op1="";
					op2="";
					flag = 0;
				}
			}
				
		});
		
		btnSqrt.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0) {
				
					x = Double.parseDouble(op1);
					operator = "sq";
					result = ctrl.operation(x,y,operator);
					text.setText(result);
					op1="";
					op2="";
					flag = 0;
				}
			}
			
		});
		
		btnSgn.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0 && flag == 0) {
					
					x = Double.parseDouble(op1);
					x = x*-1;
					
					if( x == (int)x ) {
						
						op1 = Integer.toString((int) x);
					}
					
					else {
						
						op1 = Double.toString(x);
					}
					text.setText(op1);
				}
				
				if(flag == 1 && op2.length()>0) {
					
					y = Double.parseDouble(op2);
					y = y*-1;
					
					if( y == (int)y ) {
						
						op2 = Integer.toString((int) y);
					}
					
					else {
						
						op2 = Double.toString(y);
					}
					text.setText(op2);
					
				}
			}
			
		});
		
		btnInv.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0) {
					
					x = Double.parseDouble(op1);
					operator = "1/x";
					result = ctrl.operation(x, y, operator);
					text.setText(result);
					op1 = "";
					op2 = "";
					flag = 0;
				}
			}
		});
		
		btnBack.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(flag == 0 && op1 != "") {
						
					if(op1.length() > 0) {
						
						op1 = op1.substring(0, op1.length() - 1);
						text.setText(op1);
						
					}
					
				}
				
				if(flag == 1 && op2 != "") {
					
					if(op2.length() > 0) {
						
						op2 = op2.substring(0, op2.length() - 1);
						text.setText(op2);
					}
				}
			}
		});
		
		btnFact.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				if(op1.length()>0) {
					
					x = Double.parseDouble(op1);
					operator = "x!";
					result = ctrl.operation(x,y,operator);
					text.setText(result);
					op1="";
					op2="";
					flag = 0;
				}
			}
		});
		
		btnAns.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
									
				if(ctrl.result!="" && ctrl.result != "Error") {
					op1 = ctrl.result;
					text.setText("Ans");
					op2 = "";				
					flag = 1 ;
				}
			}
		});
		
		btnInfo.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				Stage stage = new Stage();
				
				stage.setTitle("Info");
				
				StackPane pane = new StackPane();
				VBox box = new VBox();
				
				Scene scene = new Scene(pane,600,200);
				
				stage.setScene(scene);
				stage.setResizable(false);
				
				Button btn = new Button("Close");
				
				btn.setOnAction(new EventHandler<ActionEvent>() {
					
					public void handle(ActionEvent event) {
						
						stage.close();
					}
				});
				Text text = new Text("Questa Calcolatrice è stata progettata e sviluppata interamente da Vincenzo Visconti.\n"
						+ "Le operazioni possibili sono la somma, la sottrazione, la moltipicazione, la divisione,\n"
						+ "il tasto reset, cancellare l'ultima cifra, cambiare segno all'operando,\n"
						+ "fare l'inverso di un operando (diverso da 0), fare il quadrato di un operando,\n"
						+ "fare la radice di un operando (maggiore o uguale a 0), fare il fattoriale di un operando "
						+ "\n(intero). Fare una operazione alla volta cliccando l'uguale e cliccare sul tasto\n"
						+ "ANS per utilizzare l'ultimo risultato ottenuto come 1° operando.");
				
				box.getChildren().addAll(text,btn);
				box.setAlignment(Pos.CENTER);
				pane.getChildren().addAll(box);
				
				stage.show();
				
			}
		});
		
		child1.getChildren().addAll(btnInv,btn7,btn8,btn9,btnPlus,btnCanc);
		child2.getChildren().addAll(btnPow2,btn4,btn5,btn6,btnMinus,btnBack);
		child3.getChildren().addAll(btnSqrt,btn1,btn2,btn3,btnMult,btnSgn);
		child4.getChildren().addAll(btnFact,btnAns,btn0,btnFloat,btnDiv,btnInfo);
		child5.getChildren().addAll(btnEq);
		
		root.getChildren().addAll(text,child1,child2,child3,child4,child5);

		
		stage.show();
		
	}

}

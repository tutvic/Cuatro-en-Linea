package cuatro_en_linea;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Cuatro_en_linea extends JFrame implements MouseListener {
 
    public static int juga1 = 1;
    public static int juga2 = 0;
    public static int aux = 0;
    public static int veri = 0;
    public static int opc= 0;
    
    public static int clic1=0;
    public static int clic2=0;
    public static int clic3=0;
    public static int clic4=0;
    public static int clic5=0;
    public static int clic6=0;
    public static int clic7=0;
    
    public static ImageIcon sola;
    public static ImageIcon roja;
    public static ImageIcon azul;
    public static ImageIcon btnro;
    
    public static JFrame ventana;
    
    public static int [] tiror = new int [43] ;
    public static int [] tiroa = new int [43] ;
    
    public static JLabel [] boton = new JLabel[7];
    
    public static JLabel [] label = new JLabel[10];
    public static JLabel [] labe2 = new JLabel[10];
    public static JLabel [] labe3 = new JLabel[10];
    public static JLabel [] labe4 = new JLabel[10];
    public static JLabel [] labe5 = new JLabel[10];
    public static JLabel [] labe6 = new JLabel[10];
    public static JLabel [] labe7 = new JLabel[10];
    
    public static JLabel  qgana ;
    
    public static int quien() {
        if (juga1 > juga2) {
            aux = 1;
        } else {
            aux = 2;
        }
        return aux;
    }
        
    public static void column1() {
    clic1 += 1;
        veri = quien();
        switch (clic1) {
            case 1:
                if (veri == 1) {
                    tiror[1]=1;
                    label[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                       tiroa[1]=1;
                       label[1].setIcon(azul);
                       juga1++;
                       ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[2]=2;                   
                    label[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[2]=2;
                        label[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[3]=3;
                    label[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                       tiroa[3]=3;
                       label[3].setIcon(azul);
                       juga1++;
                       ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[4]=4;
                    label[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[4]=4;
                        label[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[5]=5;
                    label[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[5]=5;
                        label[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[6]=6;
                    label[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[6]=6;
                        label[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    public static void column2() {
        clic2 += 1;
        veri = quien();
        switch (clic2) {
            case 1:
                if (veri == 1) {
                    tiror[7] = 7;
                    labe2[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[7] = 7;
                        labe2[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[8] = 8;
                    labe2[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[8] = 8;
                        labe2[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[9] = 9;
                    labe2[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[9] = 9;
                        labe2[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[10] = 10;
                    labe2[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[10] = 10;
                        labe2[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[11] = 11;
                    labe2[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[11] = 11;
                        labe2[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[12] = 12;
                    labe2[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[12] = 12;
                        labe2[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    public static void column3() {
        clic3 += 1;
        veri = quien();
        switch (clic3) {
            case 1:
                if (veri == 1) {
                    tiror[13] = 13;
                    labe3[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[13] = 13;
                        labe3[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[14] = 14;
                    labe3[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[14] = 14;
                        labe3[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[15] = 15;
                    labe3[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[15] = 15;
                        labe3[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[16] = 16;
                    labe3[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[16] = 16;
                        labe3[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[17] = 17;
                    labe3[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[17] = 17;
                        labe3[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[18] = 18;
                    labe3[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[18] = 18;
                        labe3[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        } 
    }
    public static void column4() {
        clic4 += 1;
        veri = quien();
        switch (clic4) {
            case 1:
                if (veri == 1) {
                    tiror[19] = 19;
                    labe4[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[19] = 19;
                        labe4[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[20] = 20;
                    labe4[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[20] = 20;
                        labe4[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[21] = 21;
                    labe4[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[21] = 21;
                        labe4[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[22] = 22;
                    labe4[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[22] = 22;
                        labe4[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[23] = 23;
                    labe4[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[23] = 23;
                        labe4[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[24] = 24;
                    labe4[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[24] = 24;
                        labe4[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    public static void column5() {
        clic5 += 1;
        veri = quien();
        switch (clic5) {
            case 1:
                if (veri == 1) {
                    tiror[25] = 25;
                    labe5[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[25] = 25;
                        labe5[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[26] = 26;
                    labe5[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[26] = 26;
                        labe5[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[27] = 27;
                    labe5[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[27] = 27;
                        labe5[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[28] = 28;
                    labe5[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[28] = 28;
                        labe5[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[29] = 29;
                    labe5[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[29] = 29;
                        labe5[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[30] = 30;
                    labe5[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[30] = 30;
                        labe5[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    public static void column6() {
        clic6 += 1;
        veri = quien();
        switch (clic6) {
            case 1:
                if (veri == 1) {
                    tiror[31] = 31;
                    labe6[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[31] = 31;
                        labe6[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[32] = 32;
                    labe6[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[32] = 32;
                        labe6[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[33] = 33;
                    labe6[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[33] = 33;
                        labe6[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[34] = 34;
                    labe6[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[34] = 34;
                        labe6[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[35] = 35;
                    labe6[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[35] = 35;
                        labe6[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[36] = 36;
                    labe6[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[36] = 36;
                        labe6[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    public static void column7() {
        clic7 += 1;
        veri = quien();
        switch (clic7) {
            case 1:
                if (veri == 1) {
                    tiror[37] = 37;
                    labe7[1].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[37] = 37;
                        labe7[1].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 2:
                if (veri == 1) {
                    tiror[38] = 38;
                    labe7[2].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[38] = 38;
                        labe7[2].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 3:
                if (veri == 1) {
                    tiror[39] = 39;
                    labe7[3].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[39] = 39;
                        labe7[3].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 4:
                if (veri == 1) {
                    tiror[40] = 40;
                    labe7[4].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[40] = 40;
                        labe7[4].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 5:
                if (veri == 1) {
                    tiror[41] = 41;
                    labe7[5].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[41] = 41;
                        labe7[5].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
            case 6:
                if (veri == 1) {
                    tiror[42] = 42;
                    labe7[6].setIcon(roja);
                    juga2++;
                    ganar();
                } else {
                    if (veri == 2) {
                        tiroa[42] = 42;
                        labe7[6].setIcon(azul);
                        juga1++;
                        ganaa();
                    }
                }
                break;
        }
    }
    
    public static void ganar(){
        if ((tiror[1]==1)&&(tiror[7]==7)&&(tiror[13]==13)&&(tiror[19]==19)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[7]==7)&&(tiror[13]==13)&&(tiror[19]==19)&&(tiror[25]==25)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[13]==13)&&(tiror[19]==19)&&(tiror[25]==25)&&(tiror[31]==31)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[19]==19)&&(tiror[25]==25)&&(tiror[31]==31)&&(tiror[37]==37)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //*****
        if ((tiror[2]==2)&&(tiror[8]==8)&&(tiror[14]==14)&&(tiror[20]==20)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[8]==8)&&(tiror[14]==14)&&(tiror[20]==20)&&(tiror[26]==26)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[14]==14)&&(tiror[20]==20)&&(tiror[26]==26)&&(tiror[32]==32)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[20]==20)&&(tiror[26]==26)&&(tiror[32]==32)&&(tiror[38]==38)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //*****
        if ((tiror[3]==3)&&(tiror[9]==9)&&(tiror[15]==15)&&(tiror[21]==21)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[9]==9)&&(tiror[15]==15)&&(tiror[21]==21)&&(tiror[27]==27)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[15]==15)&&(tiror[21]==21)&&(tiror[27]==27)&&(tiror[33]==33)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[21]==21)&&(tiror[27]==27)&&(tiror[33]==33)&&(tiror[39]==39)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //*****
        if ((tiror[4]==4)&&(tiror[10]==10)&&(tiror[16]==16)&&(tiror[22]==22)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[10]==10)&&(tiror[16]==16)&&(tiror[22]==22)&&(tiror[28]==28)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[16]==16)&&(tiror[22]==22)&&(tiror[28]==28)&&(tiror[34]==34)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[22]==22)&&(tiror[28]==28)&&(tiror[34]==34)&&(tiror[40]==40)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //******
        if ((tiror[5]==5)&&(tiror[11]==11)&&(tiror[17]==17)&&(tiror[23]==23)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[11]==11)&&(tiror[17]==17)&&(tiror[23]==23)&&(tiror[29]==29)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[17]==17)&&(tiror[23]==23)&&(tiror[29]==29)&&(tiror[35]==35)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[23]==23)&&(tiror[29]==29)&&(tiror[35]==35)&&(tiror[41]==41)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //****
        if ((tiror[6]==6)&&(tiror[12]==12)&&(tiror[18]==18)&&(tiror[24]==24)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[12]==12)&&(tiror[18]==18)&&(tiror[24]==24)&&(tiror[30]==30)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[18]==18)&&(tiror[24]==24)&&(tiror[30]==30)&&(tiror[36]==36)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[24]==24)&&(tiror[30]==30)&&(tiror[36]==36)&&(tiror[42]==42)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //*****
        if ((tiror[1]==1)&&(tiror[2]==2)&&(tiror[3]==3)&&(tiror[4]==4)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[2]==2)&&(tiror[3]==3)&&(tiror[4]==4)&&(tiror[5]==5)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[3]==3)&&(tiror[4]==4)&&(tiror[5]==5)&&(tiror[6]==6)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*****
        if ((tiror[7]==7)&&(tiror[8]==8)&&(tiror[9]==9)&&(tiror[10]==10)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[8]==8)&&(tiror[9]==9)&&(tiror[10]==10)&&(tiror[11]==11)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[9]==9)&&(tiror[10]==10)&&(tiror[11]==11)&&(tiror[12]==12)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*****
        if ((tiror[13]==13)&&(tiror[14]==14)&&(tiror[15]==15)&&(tiror[16]==16)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[14]==14)&&(tiror[15]==15)&&(tiror[16]==16)&&(tiror[17]==17)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[15]==15)&&(tiror[16]==16)&&(tiror[17]==17)&&(tiror[18]==18)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*****
        if ((tiror[19]==19)&&(tiror[20]==20)&&(tiror[21]==21)&&(tiror[22]==22)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[20]==20)&&(tiror[21]==21)&&(tiror[22]==22)&&(tiror[23]==23)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[21]==21)&&(tiror[22]==22)&&(tiror[23]==23)&&(tiror[24]==24)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*****
        if ((tiror[25]==25)&&(tiror[26]==26)&&(tiror[27]==27)&&(tiror[28]==28)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[26]==26)&&(tiror[27]==27)&&(tiror[28]==28)&&(tiror[29]==29)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[27]==27)&&(tiror[28]==28)&&(tiror[29]==29)&&(tiror[30]==30)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //******
        if ((tiror[31]==31)&&(tiror[32]==32)&&(tiror[33]==33)&&(tiror[34]==34)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[32]==32)&&(tiror[33]==33)&&(tiror[34]==34)&&(tiror[35]==35)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[33]==33)&&(tiror[34]==34)&&(tiror[35]==35)&&(tiror[36]==36)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //******
        if ((tiror[37]==37)&&(tiror[38]==38)&&(tiror[39]==39)&&(tiror[40]==40)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[38]==38)&&(tiror[39]==39)&&(tiror[40]==40)&&(tiror[41]==41)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        if ((tiror[39]==39)&&(tiror[40]==40)&&(tiror[41]==41)&&(tiror[42]==42)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[4]==4)&&(tiror[9]==9)&&(tiror[14]==14)&&(tiror[19]==19)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[5]==5)&&(tiror[10]==10)&&(tiror[15]==15)&&(tiror[20]==20)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[10]==10)&&(tiror[15]==15)&&(tiror[20]==20)&&(tiror[25]==25)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[6]==6)&&(tiror[11]==11)&&(tiror[16]==16)&&(tiror[21]==21)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[11]==11)&&(tiror[16]==16)&&(tiror[21]==21)&&(tiror[26]==26)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[16]==16)&&(tiror[21]==21)&&(tiror[26]==26)&&(tiror[31]==31)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }
        //*******
        if ((tiror[12]==12)&&(tiror[17]==17)&&(tiror[22]==22)&&(tiror[27]==27)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[17]==17)&&(tiror[22]==22)&&(tiror[27]==27)&&(tiror[32]==32)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[22]==22)&&(tiror[27]==27)&&(tiror[32]==32)&&(tiror[37]==37)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[18]==18)&&(tiror[23]==23)&&(tiror[28]==28)&&(tiror[33]==33)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[23]==23)&&(tiror[28]==28)&&(tiror[33]==33)&&(tiror[38]==38)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //******
        if ((tiror[24]==24)&&(tiror[29]==29)&&(tiror[34]==34)&&(tiror[39]==39)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //******
        if ((tiror[3]==3)&&(tiror[10]==10)&&(tiror[17]==17)&&(tiror[24]==24)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[2]==2)&&(tiror[9]==9)&&(tiror[16]==16)&&(tiror[23]==23)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[9]==9)&&(tiror[16]==16)&&(tiror[23]==23)&&(tiror[30]==30)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[1]==1)&&(tiror[8]==8)&&(tiror[15]==15)&&(tiror[22]==22)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[8]==8)&&(tiror[15]==15)&&(tiror[22]==22)&&(tiror[29]==29)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[15]==15)&&(tiror[22]==22)&&(tiror[29]==29)&&(tiror[36]==36)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[7]==7)&&(tiror[14]==14)&&(tiror[21]==21)&&(tiror[28]==28)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[14]==14)&&(tiror[21]==21)&&(tiror[28]==28)&&(tiror[35]==35)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[21]==21)&&(tiror[28]==28)&&(tiror[35]==35)&&(tiror[42]==42)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        //*******
        if ((tiror[13]==13)&&(tiror[20]==20)&&(tiror[27]==27)&&(tiror[34]==34)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        } 
        if ((tiror[20]==20)&&(tiror[27]==27)&&(tiror[34]==34)&&(tiror[41]==41)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }   
        //*******
        if ((tiror[19]==19)&&(tiror[26]==26)&&(tiror[33]==33)&&(tiror[40]==40)){
           qgana.setText("¡¡¡JUGADOR ROJO GANA!!!");
        }         
    }

    public static void ganaa(){
        if ((tiroa[1]==1)&&(tiroa[7]==7)&&(tiroa[13]==13)&&(tiroa[19]==19)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[7]==7)&&(tiroa[13]==13)&&(tiroa[19]==19)&&(tiroa[25]==25)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[13]==13)&&(tiroa[19]==19)&&(tiroa[25]==25)&&(tiroa[31]==31)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[19]==19)&&(tiroa[25]==25)&&(tiroa[31]==31)&&(tiroa[37]==37)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //*****
        if ((tiroa[2]==2)&&(tiroa[8]==8)&&(tiroa[14]==14)&&(tiroa[20]==20)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[8]==8)&&(tiroa[14]==14)&&(tiroa[20]==20)&&(tiroa[26]==26)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[14]==14)&&(tiroa[20]==20)&&(tiroa[26]==26)&&(tiroa[32]==32)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[20]==20)&&(tiroa[26]==26)&&(tiroa[32]==32)&&(tiroa[38]==38)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //*****
        if ((tiroa[3]==3)&&(tiroa[9]==9)&&(tiroa[15]==15)&&(tiroa[21]==21)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[9]==9)&&(tiroa[15]==15)&&(tiroa[21]==21)&&(tiroa[27]==27)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[15]==15)&&(tiroa[21]==21)&&(tiroa[27]==27)&&(tiroa[33]==33)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[21]==21)&&(tiroa[27]==27)&&(tiroa[33]==33)&&(tiroa[39]==39)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //*****
        if ((tiroa[4]==4)&&(tiroa[10]==10)&&(tiroa[16]==16)&&(tiroa[22]==22)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[10]==10)&&(tiroa[16]==16)&&(tiroa[22]==22)&&(tiroa[28]==28)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[16]==16)&&(tiroa[22]==22)&&(tiroa[28]==28)&&(tiroa[34]==34)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[22]==22)&&(tiroa[28]==28)&&(tiroa[34]==34)&&(tiroa[40]==40)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //******
        if ((tiroa[5]==5)&&(tiroa[11]==11)&&(tiroa[17]==17)&&(tiroa[23]==23)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[11]==11)&&(tiroa[17]==17)&&(tiroa[23]==23)&&(tiroa[29]==29)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[17]==17)&&(tiroa[23]==23)&&(tiroa[29]==29)&&(tiroa[35]==35)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[23]==23)&&(tiroa[29]==29)&&(tiroa[35]==35)&&(tiroa[41]==41)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //****
        if ((tiroa[6]==6)&&(tiroa[12]==12)&&(tiroa[18]==18)&&(tiroa[24]==24)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[12]==12)&&(tiroa[18]==18)&&(tiroa[24]==24)&&(tiroa[30]==30)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[18]==18)&&(tiroa[24]==24)&&(tiroa[30]==30)&&(tiroa[36]==36)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[24]==24)&&(tiroa[30]==30)&&(tiroa[36]==36)&&(tiroa[42]==42)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //*****
        if ((tiroa[1]==1)&&(tiroa[2]==2)&&(tiroa[3]==3)&&(tiroa[4]==4)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[2]==2)&&(tiroa[3]==3)&&(tiroa[4]==4)&&(tiroa[5]==5)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[3]==3)&&(tiroa[4]==4)&&(tiroa[5]==5)&&(tiroa[6]==6)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*****
        if ((tiroa[7]==7)&&(tiroa[8]==8)&&(tiroa[9]==9)&&(tiroa[10]==10)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[8]==8)&&(tiroa[9]==9)&&(tiroa[10]==10)&&(tiroa[11]==11)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[9]==9)&&(tiroa[10]==10)&&(tiroa[11]==11)&&(tiroa[12]==12)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*****
        if ((tiroa[13]==13)&&(tiroa[14]==14)&&(tiroa[15]==15)&&(tiroa[16]==16)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[14]==14)&&(tiroa[15]==15)&&(tiroa[16]==16)&&(tiroa[17]==17)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[15]==15)&&(tiroa[16]==16)&&(tiroa[17]==17)&&(tiroa[18]==18)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*****
        if ((tiroa[19]==19)&&(tiroa[20]==20)&&(tiroa[21]==21)&&(tiroa[22]==22)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[20]==20)&&(tiroa[21]==21)&&(tiroa[22]==22)&&(tiroa[23]==23)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[21]==21)&&(tiroa[22]==22)&&(tiroa[23]==23)&&(tiroa[24]==24)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*****
        if ((tiroa[25]==25)&&(tiroa[26]==26)&&(tiroa[27]==27)&&(tiroa[28]==28)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[26]==26)&&(tiroa[27]==27)&&(tiroa[28]==28)&&(tiroa[29]==29)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[27]==27)&&(tiroa[28]==28)&&(tiroa[29]==29)&&(tiroa[30]==30)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //******
        if ((tiroa[31]==31)&&(tiroa[32]==32)&&(tiroa[33]==33)&&(tiroa[34]==34)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[32]==32)&&(tiroa[33]==33)&&(tiroa[34]==34)&&(tiroa[35]==35)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[33]==33)&&(tiroa[34]==34)&&(tiroa[35]==35)&&(tiroa[36]==36)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //******
        if ((tiroa[37]==37)&&(tiroa[38]==38)&&(tiroa[39]==39)&&(tiroa[40]==40)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[38]==38)&&(tiroa[39]==39)&&(tiroa[40]==40)&&(tiroa[41]==41)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        if ((tiroa[39]==39)&&(tiroa[40]==40)&&(tiroa[41]==41)&&(tiroa[42]==42)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[4]==4)&&(tiroa[9]==9)&&(tiroa[14]==14)&&(tiroa[19]==19)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[5]==5)&&(tiroa[10]==10)&&(tiroa[15]==15)&&(tiroa[20]==20)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[10]==10)&&(tiroa[15]==15)&&(tiroa[20]==20)&&(tiroa[25]==25)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[6]==6)&&(tiroa[11]==11)&&(tiroa[16]==16)&&(tiroa[21]==21)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[11]==11)&&(tiroa[16]==16)&&(tiroa[21]==21)&&(tiroa[26]==26)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[16]==16)&&(tiroa[21]==21)&&(tiroa[26]==26)&&(tiroa[31]==31)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }
        //*******
        if ((tiroa[12]==12)&&(tiroa[17]==17)&&(tiroa[22]==22)&&(tiroa[27]==27)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[17]==17)&&(tiroa[22]==22)&&(tiroa[27]==27)&&(tiroa[32]==32)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[22]==22)&&(tiroa[27]==27)&&(tiroa[32]==32)&&(tiroa[37]==37)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[18]==18)&&(tiroa[23]==23)&&(tiroa[28]==28)&&(tiroa[33]==33)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[23]==23)&&(tiroa[28]==28)&&(tiroa[33]==33)&&(tiroa[38]==38)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //******
        if ((tiroa[24]==24)&&(tiroa[29]==29)&&(tiroa[34]==34)&&(tiroa[39]==39)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //******
        if ((tiroa[3]==3)&&(tiroa[10]==10)&&(tiroa[17]==17)&&(tiroa[24]==24)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[2]==2)&&(tiroa[9]==9)&&(tiroa[16]==16)&&(tiroa[23]==23)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[9]==9)&&(tiroa[16]==16)&&(tiroa[23]==23)&&(tiroa[30]==30)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[1]==1)&&(tiroa[8]==8)&&(tiroa[15]==15)&&(tiroa[22]==22)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[8]==8)&&(tiroa[15]==15)&&(tiroa[22]==22)&&(tiroa[29]==29)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[15]==15)&&(tiroa[22]==22)&&(tiroa[29]==29)&&(tiroa[36]==36)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[7]==7)&&(tiroa[14]==14)&&(tiroa[21]==21)&&(tiroa[28]==28)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[14]==14)&&(tiroa[21]==21)&&(tiroa[28]==28)&&(tiroa[35]==35)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[21]==21)&&(tiroa[28]==28)&&(tiroa[35]==35)&&(tiroa[42]==42)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        //*******
        if ((tiroa[13]==13)&&(tiroa[20]==20)&&(tiroa[27]==27)&&(tiroa[34]==34)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        } 
        if ((tiroa[20]==20)&&(tiroa[27]==27)&&(tiroa[34]==34)&&(tiroa[41]==41)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }   
        //*******
        if ((tiroa[19]==19)&&(tiroa[26]==26)&&(tiroa[33]==33)&&(tiroa[40]==40)){
           qgana.setText("¡¡¡JUGADOR AZUL GANA!!!");
        }         
    }
    
    public Cuatro_en_linea(){
        ventana = new JFrame("CUATRO EN LINEA");
        ventana.setLayout(null);
        ventana.setSize(600, 700); //tamaño de mi ventana 
        ventana.setLocationRelativeTo(null); //centrar ventana 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se cierra con x
        ventana.setVisible(true);
        
        sola = new ImageIcon("C:/Java/cuatro_en_linea/src/cuatro_en_linea/imagen/sola.jpg");
        roja = new ImageIcon("C:/Java/cuatro_en_linea/src/cuatro_en_linea/imagen/rojita.jpg");
        azul = new ImageIcon("C:/Java/cuatro_en_linea/src/cuatro_en_linea/imagen/azulita.jpg");
        btnro = new ImageIcon("C:/Java/cuatro_en_linea/src/cuatro_en_linea/imagen/boton-rojo.jpg");

        for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            label[i]= new JLabel();
            label[i].setBounds(30, 30+j, 74, 70);
            label[i].setIcon(sola);
            ventana.add(label[i]);
        }
        
         for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe2[i]= new JLabel();
            labe2[i].setBounds(104, 30+j, 74, 70);
            labe2[i].setIcon(sola);
            ventana.add(labe2[i]);
        }

        for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe3[i]= new JLabel();
            labe3[i].setBounds(178, 30+j, 74, 70);
            labe3[i].setIcon(sola);
            ventana.add(labe3[i]);
        }
        
        for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe4[i]= new JLabel();
            labe4[i].setBounds(252, 30+j, 74, 70);
            labe4[i].setIcon(sola);
            ventana.add(labe4[i]);
        }
        
       for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe5[i]= new JLabel();
            labe5[i].setBounds(326, 30+j, 74, 70);
            labe5[i].setIcon(sola);
            ventana.add(labe5[i]);
        }
       
         for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe6[i]= new JLabel();
            labe6[i].setBounds(400, 30+j, 74, 70);
            labe6[i].setIcon(sola);
            ventana.add(labe6[i]);
        }
         
         for (int i=6; i>0; i--){
            int j=0;
            j+=((70*i)-(420))*-1;  
            labe7[i]= new JLabel();
            labe7[i].setBounds(474, 30+j, 74, 70);
            labe7[i].setIcon(sola);
            ventana.add(labe7[i]);
        }
        
        boton[0]= new JLabel();
        boton[0].setBounds(40, 450, 49, 55);
        boton[0].setIcon(btnro);
        boton[0].addMouseListener(this);
        boton[1]= new JLabel();
        boton[1].setBounds(120, 450, 49, 55);
        boton[1].setIcon(btnro);
        boton[1].addMouseListener(this);
        boton[2]= new JLabel();
        boton[2].setBounds(190, 450, 49, 55);
        boton[2].setIcon(btnro);
        boton[2].addMouseListener(this);
        boton[3]= new JLabel();
        boton[3].setBounds(260, 450, 49, 55);
        boton[3].setIcon(btnro);
        boton[3].addMouseListener(this);
        boton[4]= new JLabel();
        boton[4].setBounds(330, 450, 49, 55);
        boton[4].setIcon(btnro);
        boton[4].addMouseListener(this);
        boton[5]= new JLabel();
        boton[5].setBounds(400, 450, 49, 55);
        boton[5].setIcon(btnro);
        boton[5].addMouseListener(this);
        boton[6]= new JLabel();
        boton[6].setBounds(480, 450, 49, 55);
        boton[6].setIcon(btnro);
        boton[6].addMouseListener(this);
        
        qgana = new JLabel();
        qgana.setFont(new Font ("Arial",2,36));
        qgana.setBounds(60, 480, 500, 100);
        
        ventana.add(boton[0]);
        ventana.add(boton[1]);
        ventana.add(boton[2]);
        ventana.add(boton[3]);
        ventana.add(boton[4]);
        ventana.add(boton[5]);
        ventana.add(boton[6]);
        ventana.add(qgana);

    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == boton[0]) {
            column1();
        }
        if (me.getSource() == boton[1]) {
            column2();
        }
        if (me.getSource() == boton[2]) {
            column3();
        }
        if (me.getSource() == boton[3]) {
            column4();
        }
        if (me.getSource() == boton[4]) {
            column5();
        }
        if (me.getSource() == boton[5]) {
            column6();
        }
        if (me.getSource() == boton[6]) {
            column7();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    public static void main(String[] args) {
        Cuatro_en_linea vtana = new Cuatro_en_linea();
    }
}
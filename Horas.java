import java.util.Scanner; 

public class Horas {
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        System.out.println("Introduzca el numero de horas: ");
        int horas = S.nextInt();
        int año, mes, semana, dia;
        if (horas > 0){
            if (horas >=8760){  // Determina Año
                año = horas/8760;
                horas = horas - (8760*año);
                if (horas >= 720){ // Determina Mes
                    mes = horas/720;
                    horas = horas - (720*mes);
                    if (horas >= 168){ // Determina Semana
                        semana = horas/168;
                        horas = horas - (168*semana);
                        if (horas >= 24){ // Determina Dia
                            dia = horas/24;
                            horas = horas - (24*dia);
                            if (horas <=23) {  // Determina Hora
                            System.out.println (+año+ " Año");
                            System.out.println (+mes+ " Mes");
                            System.out.println (+semana+ " Semana");
                            System.out.println (+dia+ " Dia");
                            if (horas>0){
                            System.out.println (+horas+ " Hora");
                            }
                            }
                            else {
                            System.out.println (+año+ " Año");
                            System.out.println (+mes+ " Mes");
                            System.out.println (+semana+ " Semana");
                            System.out.println (+dia+ " Dia");                            
                            }                            
                        }
                        else {
                            if (horas <=23){  // Determina Hora
                            System.out.println (+año+ " Año");
                            System.out.println (+mes+ " Mes");
                            System.out.println (+semana+ " Semana");
                            if (horas>0){
                            System.out.println (+horas+ " Hora");
                            }
                            } 
                        }
                    }
                    else {
                        if (horas >= 24){ // Determina Dia
                           dia = horas/24;
                           if (horas <=23){  // Determina Hora
                           System.out.println (+año+ " Año");
                           System.out.println (+mes+ " Mes");
                           System.out.println (+dia+ " Dia");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                           }
                           else {
                           System.out.println (+año+ " Año");
                           System.out.println (+mes+ " Mes");
                           System.out.println (+dia+ " Dia");                            
                           }                            
                        }
                        else {
                           if (horas <=23){  // Determina Hora
                           System.out.println (+año+ " Año");
                           System.out.println (+mes+ " Mes");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                           } 
                        }
                    }
                }
                else {
                    if (horas >= 168){ // Determina Semana
                        semana = horas/168;
                        horas = horas - (168*semana);
                        if (horas >= 24){ // Determina Dia
                            dia = horas/24;
                            horas = horas - (24*dia);
                            if (horas <=23){  // Determina Hora
                            System.out.println (+año+ " Año");
                            System.out.println (+semana+ " Semana");
                            System.out.println (+dia+ " Dia");
                            if (horas>0){
                            System.out.println (+horas+ " Hora");
                            }
                            }
                            else {
                            System.out.println (+año+ " Año");
                            System.out.println (+semana+ " Semana");
                            System.out.println (+dia+ " Dia");                            
                            }                            
                        }
                        else {
                            if (horas <=23){  // Determina Hora
                            System.out.println (+año+ " Año");
                            System.out.println (+semana+ " Semana");
                            if (horas>0){
                            System.out.println (+horas+ " Hora");
                            }
                            } 
                        }
                    }
                    else {
                        if (horas >= 24){ // Determina Dia
                           dia = horas/24;
                           if (horas <=23){  // Determina Hora
                           System.out.println (+año+ " Año");
                           System.out.println (+dia+ " Dia");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                           }
                           else {
                           System.out.println (+año+ " Año");
                           System.out.println (+dia+ " Dia");                            
                           }                            
                        }
                        else {
                           if (horas <=23){  // Determina Hora
                           System.out.println (+año+ " Año");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                           } 
                        }
                    }
                }
            }
            else if (horas >= 720){ // Determina Mes
                mes = horas/720;
                horas = horas - (720*mes);
                if (horas >= 168){ // Determina Semana
                    semana = horas/168;
                    horas = horas - (168*semana);
                    if (horas >= 24){ // Determina Dia
                        dia = horas/24;
                        horas = horas - (24*dia);
                        if (horas <=23){  // Determina Hora
                           System.out.println (+mes+ " Mes");
                           System.out.println (+semana+ " Semana");
                           System.out.println (+dia+ " Dia");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                        }
                        else {
                           System.out.println (+mes+ " Mes");
                           System.out.println (+semana+ " Semana");
                           System.out.println (+dia+ " Dia");                            
                        }                            
                    }
                    else {
                        if (horas <=23){  // Determina Hora
                            System.out.println (+mes+ " Mes");
                            System.out.println (+semana+ " Semana");
                            if (horas>0){
                            System.out.println (+horas+ " Hora");
                            }
                        } 
                    }
                }
                else {
                    if (horas >= 24){ // Determina Dia
                        dia = horas/24;
                        if (horas <=23){  // Determina Hora
                           System.out.println (+mes+ " Mes");
                           System.out.println (+dia+ " Dia");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                        }
                        else {
                           System.out.println (+mes+ " Mes");
                           System.out.println (+dia+ " Dia");                            
                        }                            
                    }
                    else {
                        if (horas <=23){  // Determina Hora
                           System.out.println (+mes+ " Mes");
                           if (horas>0){
                           System.out.println (+horas+ " Hora");
                           }
                        } 
                    }
                }
            }
            else if (horas >= 168){ // Determina Semana
                semana = horas/168;
                horas = horas - (168*semana);
                if (horas >= 24){ // Determina Dia
                    dia = horas/24;
                    horas = horas - (24*dia);
                    if (horas <=23){  // Determina Hora
                        System.out.println (+semana+ " Semana");
                        System.out.println (+dia+ " Dia");
                        if (horas>0){
                        System.out.println (+horas+ " Hora");
                        }
                    }
                    else {
                        System.out.println (+semana+ " Semana");
                        System.out.println (+dia+ " Dia");                            
                    }                            
                }
                else {
                    if (horas <=23){  // Determina Hora
                        System.out.println (+semana+ " Semana");
                        if (horas>0){
                        System.out.println (+horas+ " Hora");
                        }
                    } 
                }
            }
            else if (horas >= 24){ // Determina Dia
                    dia = horas/24;
                    horas = horas - (24*dia);
                    if (horas <=23){  // Determina Hora
                        System.out.println (+dia+ " Dia");
                        if (horas>0){
                        System.out.println (+horas+ " Hora");
                        }
                    }
                    else {
                    System.out.println (+dia+ " Dia");                            
                    }                            
            }
            else {
                if (horas <=23){  // Determina Hora
                    System.out.println (+horas+ " Hora");
                } 
            }
        }
    }
}
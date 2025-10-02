    package main;
    
    public class main {

        public static void main(String[] args) {


            Estudiante estudiante2 = new Estudiante("Juan", 20, "Matemáticas", 'M');
           estudiante2.presentarse();
            estudiante2.despedirse();



            Estudiante estudiante3 = new Estudiante("Ana", 22, "Historia", 'F');
            estudiante3.presentarse();
            estudiante3.despedirse();

            Estudiante estudiante5 = new Estudiante("Paloma Rodriguez", 19, "Biología", 'F');
            estudiante5.presentarse();
            estudiante5.despedirse();



            estudiante3.setNombre("Virginia");
            estudiante3.presentarse();
            estudiante3.despedirse();


    


        }





    }
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int seleccion = 0;
    Scanner sc = new Scanner(System.in);
    Cuidador []cuidadores = new Cuidador[20];
    int cantCuidadores = 0;
    do{
        System.out.println("===== Menu Z00 =====");
        System.out.println("1. INGRESAR NUEVO CUIDADOR");
        System.out.println("2. MOSTRAR CUIDADORES");
        System.out.println("3. INGRESAR NUEVO ANIMAL");
        System.out.println("4. MOSTRAR ANIMALES");
        System.out.println("5. ALIMENTAR ANIMAL.");
        System.out.println("6. BAÑAR ANIMAL");
        System.out.println("7. CURAR ANIMAL");
        System.out.println("8. CERRAR PROGRAMA");

        switch (seleccion){
            case 1 ->{

                System.out.println("Ingrese su nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su dni");
                String dni = sc.nextLine();
                System.out.println("Ingrese su salario");
                double salario = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese cuidador de que tipo de animal es");
                System.out.println("1. Mañana | 2. Tarde");
                int opTurno = sc.nextInt();
                sc.nextLine();
                Turno turno = Turno.values()[opTurno - 1];
                System.out.println("Ingrese area del ZOO");
                System.out.println("1. SABANA | 2. ACUARIO | 3. AVIARIO | 4. REPTILIANOS");
                int opArea = sc.nextInt();
                sc.nextLine();
                Area_del_Zoo areaDelZoo = Area_del_Zoo.values()[opArea - 1];
                System.out.println("Ingrese tipo de animal del cuidador");
                System.out.println("1. MAMIFERO| 2. REPTIL | 3. AVE");
                int opTipo = sc.nextInt();
                sc.nextLine();
                Tipo_Animal tipoAnimal = Tipo_Animal.values()[opTipo - 1];

                Cuidador c = new Cuidador(nombre, dni,salario, tipoAnimal,areaDelZoo,turno);
                cuidadores[cantCuidadores] = c;
                cantCuidadores ++;
            }
        }
    } while (seleccion != 8);

}

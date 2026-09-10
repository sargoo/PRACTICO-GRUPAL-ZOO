//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int seleccion = 0;
    Scanner sc = new Scanner(System.in);
    Cuidador []cuidadores = new Cuidador[20];
    Animal []animales = new Animal[20];
    int cantCuidadores = 0;
    int cantAnimales = 0;
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
        seleccion = sc.nextInt();
        sc.nextLine();

        switch (seleccion){
            case 1 ->{

                System.out.println("Ingrese su nombre");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su dni");
                String dni = sc.nextLine();
                System.out.println("Ingrese su salario");
                double salario = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese turno");
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

                boolean yaExiste = false;

                for (int i = 0; i < cantCuidadores; i++) {
                    if (cuidadores[i].equals(c)) {
                        yaExiste = true;
                        break;
                    }
                }
                if (yaExiste) {
                    System.out.println("Error: Ya existe un cuidador con estos datos registrados.");
                } else {
                    cuidadores[cantCuidadores] = c;
                    cantCuidadores++;
                    System.out.println("Cuidador registrado correctamente.");
                }
            }
            case 2 -> {
                System.out.println("===== LISTADO DE CUIDADORES =====");
                for (int i = 0; i < cantCuidadores; i ++){
                    System.out.println(cuidadores[i].toString());
                }
            }
            case 3 ->{
                System.out.println("Ingrese tipo de animal que va a ingresar");
                System.out.println("1. MAMIFERO| 2. REPTIL | 3. AVE");
                int tipAn = sc.nextInt();
                sc.nextLine();
                Tipo_Animal tipoAnimal = Tipo_Animal.values()[tipAn - 1];
                switch (tipAn){
                    case 1 ->{
                        System.out.println("Ingrese nombre del mamifero");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese hambre del mamifero");
                        System.out.println("1. NO alimentado | 2. alimentado");
                        int checkHambre = sc.nextInt();
                        sc.nextLine();
                        boolean hambre = (checkHambre == 1);
                        System.out.println("Ingrese higiene del mamifero");
                        System.out.println("1. sucio | 2. Limpio");
                        int checkHigiene = sc.nextInt();
                        sc.nextLine();
                        boolean higiene = (checkHigiene == 1);
                        System.out.println("Ingrese salud del mamifero");
                        System.out.println("1. enfermo | 2. saludable");
                        int checkSalud = sc.nextInt();
                        sc.nextLine();
                        boolean salud = (checkSalud == 1);
                        System.out.println("Ingrese tipo de pelaje");
                        System.out.println("1. Pelos de guardia| 2. Subpelo | 3. Vibrisas");
                        int checkPelaje = sc.nextInt();
                        sc.nextLine();
                        Tipo_Pelaje tipoPelaje = Tipo_Pelaje.values()[checkPelaje - 1];

                        Mamifero m = new Mamifero(nombre, hambre, higiene, salud,Tipo_Animal.MAMIFERO, tipoPelaje);

                        boolean yaExiste = false;

                        for (int i = 0; i < cantAnimales; i++) {
                            if (animales[i].equals(m)) {
                                yaExiste = true;
                                break;
                            }
                        }
                        if (yaExiste) {
                            System.out.println("Error: Ya existe un animal con estos datos registrados.");
                        } else {
                            animales[cantAnimales] = m;
                            cantAnimales++;
                            System.out.println("Animal registrado correctamente.");
                        }
                    }
                    case 2 ->{
                        System.out.println("Ingrese nombre del reptil");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese hambre del reptil");
                        System.out.println("1. NO alimentado | 2. alimentado");
                        int checkHambre = sc.nextInt();
                        sc.nextLine();
                        boolean hambre = (checkHambre == 1);
                        System.out.println("Ingrese higiene del reptil");
                        System.out.println("1. Sucio | 2. Limpio");
                        int checkHigiene = sc.nextInt();
                        sc.nextLine();
                        boolean higiene = (checkHigiene == 1);
                        System.out.println("Ingrese salud del reptil");
                        System.out.println("1. Enfermo | 2. Saludable");
                        int checkSalud = sc.nextInt();
                        sc.nextLine();
                        boolean salud = (checkSalud == 1);
                        System.out.println("Ingrese si es venenoso");
                        System.out.println("1. Es venenoso| 2. NO es venenoso");
                        int checkVeneno = sc.nextInt();
                        sc.nextLine();
                        boolean venenoso = (checkVeneno == 1 );
                        System.out.println("Ingrese si camina o no");
                        System.out.println("1. Si camina | 2. No camina");
                        int checkCamina = sc.nextInt();
                        sc.nextLine();
                        boolean camina = (checkCamina == 1);
                        Reptil r = new Reptil(nombre, hambre, higiene, salud,Tipo_Animal.REPTIL ,venenoso, camina);

                        boolean yaExiste = false;

                        for (int i = 0; i < cantAnimales; i++) {
                            if (animales[i].equals(r)){
                                yaExiste = true;
                                break;
                            }
                        }
                        if (yaExiste) {
                            System.out.println("Error: Ya existe un animal con estos datos registrados.");
                        } else {
                            animales[cantAnimales] = r;
                            cantAnimales++;
                            System.out.println("Animal registrado correctamente.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese nombre del ave");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese hambre del ave");
                        System.out.println("1. NO alimentado | 2. alimentado");
                        int checkHambre = sc.nextInt();
                        sc.nextLine();
                        boolean hambre = (checkHambre == 1);
                        System.out.println("Ingrese higiene del ave");
                        System.out.println("1. Sucio | 2. Limpio");
                        int checkHigiene = sc.nextInt();
                        sc.nextLine();
                        boolean higiene = (checkHigiene == 1);
                        System.out.println("Ingrese salud del ave");
                        System.out.println("1. Enfermo | 2. Saludable");
                        int checkSalud = sc.nextInt();
                        sc.nextLine();
                        boolean salud = (checkSalud == 1);
                        System.out.println("Ingrese capacidad de vuelo");
                        System.out.println("1. VUELOS LARAGA DISTANCIA | 2. PLANEO | 3. INCAPAZ");
                        int checkVuelo = sc.nextInt();
                        sc.nextLine();
                        Capacidad_Vuelo capacidadVuelo = Capacidad_Vuelo.values()[checkVuelo - 1];
                        Ave a = new Ave(nombre, hambre, higiene, salud, Tipo_Animal.AVE, capacidadVuelo);

                        boolean yaExiste = false;

                        for (int i = 0; i < cantAnimales; i++) {
                            if (animales[i].equals(a)){
                                yaExiste = true;
                                break;
                            }
                        }
                        if (yaExiste) {
                            System.out.println("Error: Ya existe un animal con estos datos registrados.");
                        } else {
                            animales[cantAnimales] = a;
                            cantAnimales++;
                            System.out.println("Animal registrado correctamente.");
                        }
                    }
                }
            }

            case 4 ->{
                System.out.println("===== LISTADO DE ANIMALES =====");
                for (int i = 0; i < cantAnimales; i ++){
                    System.out.println(animales[i].toString());
                }
            }

            case 5 ->{
                System.out.println("Ingrese nombre del animal que quiere alimentar:");
                String busquedaAnimal = sc.nextLine();
                for (int i = 0; i < cantAnimales; i ++){
                    if (busquedaAnimal.equalsIgnoreCase(animales[i].getNombre())){
                        if (animales[i].getHambre() == false){
                            System.out.println("El aninal ya comio");
                        }
                        else{
                            System.out.println("Ingrese nombre del cuidador que realice la tarea:");
                            String busquedaCuidador = sc.nextLine();
                            for (int cont = 0; cont < cantCuidadores; cont ++ ){
                                if (busquedaCuidador.equalsIgnoreCase(cuidadores[cont].getNombre())){
                                    if (animales[i].getTipoAnimal().equals(cuidadores[cont].getEspecialidad())) {
                                        System.out.println(cuidadores[cont].alimentar());
                                        animales[i].setHambre(false);
                                    }
                                    else {
                                        System.out.println("Ese cuidador no es apto para alimentar ese animal");
                                    }
                                }
                            }

                        }
                    }
                }
            }
            case 6 -> {
                System.out.println("Ingrese nombre del animal que quiere bañar:");
                String busquedaAnimal = sc.nextLine();
                for (int i = 0; i < cantAnimales; i ++){
                    if (busquedaAnimal.equalsIgnoreCase(animales[i].getNombre())){
                        if (animales[i].getHambre() == false){
                            System.out.println("El aninal ya esta limpio");
                        }
                        else{
                            System.out.println("Ingrese nombre del cuidador que realice la tarea:");
                            String busquedaCuidador = sc.nextLine();
                            for (int cont = 0; cont < cantCuidadores; cont ++ ){
                                if (busquedaCuidador.equalsIgnoreCase(cuidadores[cont].getNombre())){
                                    if (animales[i].getTipoAnimal().equals(cuidadores[cont].getEspecialidad())) {
                                        System.out.println(cuidadores[cont].alimentar());
                                        animales[i].setHambre(false);
                                    }
                                    else {
                                        System.out.println("Ese cuidador no es apto para bañar ese animal");
                                    }
                                }
                            }

                        }
                    }
                }
            }
            case 7 -> {
                System.out.println("Ingrese nombre del animal que quiere curar:");
                String busquedaAnimal = sc.nextLine();
                for (int i = 0; i < cantAnimales; i ++){
                    if (busquedaAnimal.equalsIgnoreCase(animales[i].getNombre())){
                        if (animales[i].getHambre() == false){
                            System.out.println("El aninal ya esta saludable");
                        }
                        else{
                            System.out.println("Ingrese nombre del cuidador que realice la tarea:");
                            String busquedaCuidador = sc.nextLine();
                            for (int cont = 0; cont < cantCuidadores; cont ++ ){
                                if (busquedaCuidador.equalsIgnoreCase(cuidadores[cont].getNombre())){
                                    if (animales[i].getTipoAnimal().equals(cuidadores[cont].getEspecialidad())) {
                                        System.out.println(cuidadores[cont].alimentar());
                                        animales[i].setHambre(false);
                                    }
                                    else {
                                        System.out.println("Ese cuidador no es apto para curar ese animal");
                                    }
                                }
                            }

                        }
                    }
                }
            }

        }
    } while (seleccion != 8);

}

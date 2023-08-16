public class Main2 {
    public static void main(String[] args) {

        int num0 , num1 = 0, num2 = 0;

        boolean existencia = false;

        for (int i = 1; i < args.length; i++) {
            for (int j = 1; j < args.length; j++) {
                num0 = Integer.parseInt(args[0]);
                num1 = Integer.parseInt(args[i]);
                num2 = Integer.parseInt(args[j]);
                if (i != j) {
                    if (num0 == num1 + num2) {
                        existencia = true;
                        break;
                    }
                }
            }
            if (existencia)
                break;
        }
        if (existencia){
            System.out.println("Si existe, los valores sumados que dan " +args[0]+" son: " +num1 + " y " + num2);
        } else {
            System.out.println("No existe");
        }

    }
}

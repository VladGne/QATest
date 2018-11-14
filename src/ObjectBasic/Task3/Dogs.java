package ObjectBasic.Task3;

import java.util.Random;

public class Dogs {
    private String name;
    private Integer age;
    private Size size;
    public enum Size{
        big,
        small,
        medium;

        public static Size parseSize(String size){
            if(size.equals(Size.small.toString()))
                return Size.small;

            else if (size.equals(Size.big.toString()))
                return Size.big;
            else
                return Size.medium;
        }
    }

    public Dogs(String  args[]){

        int argsNumber = countArgs(args);

        if(argsNumber == 3){
            this.name = args[0];
            this.size = Size.parseSize(args[1]);
            this.age = Integer.parseInt(args[2]);

        }
        else if(argsNumber == 2) {
            checkArg(args[0]);
            checkArg(args[1]);

            if(this.name == null)
                this.name = generateName();
            else if (this.age == null)
                this.age = generateAge();
            else
                this.size = generateSize();
        }
        else if(argsNumber == 1){
            checkArg(args[0]);

            if(this.name == null)
                this.name = generateName();
            if (this.age == null)
                this.age = generateAge();
            if (this.size == null)
                this.size = generateSize();
        }
        else{
            this.name = generateName();
            this.age = generateAge();
            this.size = generateSize();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Size getSize() {
        return size;
    }

    public Size generateSize(){

        int maxSize = 3;
        int minSize = 1;
        Random random = new Random();
        int sizeId =  random.nextInt(maxSize - minSize + 1) + minSize;

        switch (sizeId){
            case 1:
              return Size.big;
            case 2:
                return Size.medium;
            case 3:
                return Size.small;
            default:
                return size.medium;
        }
    }

    private int generateAge(){
        int maxAge = 20;
        int minAge = 1;
        Random random = new Random();
        return  random.nextInt(maxAge - minAge + 1) + minAge;
    }


    public String generateName() {
        String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru","Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
                    "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro","Mar", "Luk" };
        String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo","red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer","marac", "zoir", "slamar", "salmar", "urak" };
        String[] End = { "d", "ed", "ark", "arc", "es", "er", "der","tron", "med", "ure", "zur", "cred", "mur" };

        Random rand = new Random();

        return Beginning[rand.nextInt(Beginning.length)] + Middle[rand.nextInt(Middle.length)]+ End[rand.nextInt(End.length)];
        }

    private void checkArg(String arg){


        if(arg.matches("-?\\d+")){          // if arg - age
            this.age = Integer.parseInt(arg);
        }
        else if(arg.equals(Size.small.toString()) || arg.equals(Size.big.toString())
                || arg.equals(Size.medium.toString())){                                     // if arg - size
            this.size = Size.parseSize(arg);
        }
        else{
            this.name = arg;
        }
    }

    private int countArgs(String [] args) {
        int numberOfArgs = 0;
        for(String arg: args) {
            if(arg != null)
                numberOfArgs++;
        }
        return numberOfArgs;
    }

}
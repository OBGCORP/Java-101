public class Main {
    public static void main(String[] args) {

        String[] names = {"Lena Figueroa",
                "Ida Velez",
                "Natasha England",
                "Anita Robinson",
                "Judy Flynn Bishop",
                "Conor Mark Nicholson",
                "Lawson Mcneil",
                "Sami Goodman",
                "Bessie Jullian Hale",
                "Bruce Lynch",
                "Lachlan Campos",
                "Zackary Pitts",
                "Cameron Allan Brown",
                "Humaira Mitchell",
                "Fabian O'Neill",
                "Hafsah Guerra",
                "Lisa Rose Lloyd",
                "Tahlia Calderon",
                "Tess Gardner",
                "Zuzanna Atkins",
                "Keeley Day",
                "Andrea Mercado",
                "Sophia Turner",
                "Rhodri Frost",
                "Zarah Prince",
                "Saskia Ray",
                "Jaden Dan Cobb",
                "Brooke Bentley",
                "Emma Lynn",
                "Jerry Franco"};

        nameEndsWithAn(names);
    }

    public static void nameEndsWithAn(String[] names){
        for(int i = 0; i < names.length; i++){
            for(int j = 0; j < names[i].split(" ").length - 1; j++){
                if(names[i].split(" ")[j].endsWith("an")){
                    System.out.println(names[i]);
                }
            }
        }
    }
}
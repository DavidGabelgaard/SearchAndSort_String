package FilEksempler;

class WordCount {

    public static void wordCount(String[] list) {

        for (int i = 0; i < list.length; i++) {
            if (!list[i].equalsIgnoreCase("")) {
               int count = 0;

                for (int j = i; j < list.length; j++) {
                    if (list[i].equalsIgnoreCase(list[j])) {
                        count++;
                        if (j != i) {
                            list[j] = "";
                        }
                    }
                }



                System.out.println(list[i] + ": " + count);

                list[i] = "";

            }

        }



    }

}

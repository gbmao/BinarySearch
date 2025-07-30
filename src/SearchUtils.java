public class SearchUtils {

    public static String search(int[] array, int target){

        //encontre o meio
            String found = "found";
            String notFound = "Not found";
            String result = "";
            int middleIndex = array.length / 2;
            int middleValue = array[middleIndex];

            //pergunte se  o numero certo
            if( middleValue == target) {
                result = found;
            } else if (array.length == 1 ) {
                result = notFound;

            }

            //pergunte se  maior ou menor
        if (result.equals("")) {
            if( middleValue > target){

                int[] newArray = new int[middleIndex ];
                System.arraycopy(array, 0, newArray, 0, middleIndex);
                result = search(newArray, target);
            }
            if( middleValue < target){

                int[] newArray = new int[(array.length - middleIndex)];
                int j = 0;
                for (int i = middleIndex  ; i < array.length; i++ ){

                    newArray[j] = array[i];
                    j++;
                }
                result = search(newArray, target);
            }
        }
        //separe a parte certa
            //repita o processo

        return result;
    }

}

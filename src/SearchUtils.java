public class SearchUtils {

    public static int search(int[] array, int target){

        //encontre o meio

            int middleIndex = array.length / 2;
            int middleValue = array[middleIndex];

            //pergunte se  o numero certo
            if( middleValue == target){
                return middleIndex;
                // find a way to return a value if not found
            }
            //pergunte se  maior ou menor
            if( middleValue > target){

                int[] newArray = new int[middleIndex - 1];
                System.arraycopy(array, 0, newArray, 0, middleIndex);
                search(newArray, target);
            }
            if( middleValue < target){

                int[] newArray = new int[(array.length - middleIndex)];
                int j = 0;
                for (int i = middleIndex  ; i < array.length; i++ ){

                    newArray[j] = array[i];
                    j++;
                }
                search(newArray, target);
            }
            //separe a parte certa
            //repita o processo

        return middleIndex;
    }

}

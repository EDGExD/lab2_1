/**
 *
 */
package edu.iis.mto.bsearch;

/**
 * Klasa implementująca wyszukiwanie binarne
 *
 */
public class BinarySearch {

    private BinarySearch() {}

    /**
     * Metoda realizujaca wyszukiwanie binarne
     *
     * @param key
     *            - szukany obiekt
     * @param seq
     *            - rosnaco uporzadkowana niepusta sekwencja
     * @return obiekt rezultatu o polach: - found (true jezeli znaleziony) - position (jezeli znaleziony - pozycja w
     *         sekwencji, jezeli nie znaleziony -1)
     */
    public static SearchResult search(int key, int[] seq) {
        int start = 0;
        int end = seq.length - 1;
        int center;
        
        if(seq.length==0){
            throw new IllegalArgumentException("seq.length == 0");
        }
        SearchResult result = new SearchResult();

        while (start <= end) {
            center = (start + end) / 2;
            if (seq[center] == key) {
                result.setPosition(center + 1);
                break;
            } else {
                if (seq[center] < key) {
                    start = center + 1;
                } else {
                    end = center - 1;
                }
            }
        }
        return result;
    }

}

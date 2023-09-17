public class FilmRepository {
    private int currentFilms;
    private String nameFilm;
    private String[] items = new String[0];

    public FilmRepository(int currentFilms) {//изменение кол-ва фильмов
        this.currentFilms = currentFilms;
    }
    public FilmRepository() {
        currentFilms = 5;           // по умолчинию кол-во фильмов
    }

    //добавление нового фильма
    public void add(String name) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = name;
        items = tmp;
    }
    //массив всех фильмов
    public String[] findAll() {
        return items;
    }
    //    массив фильмов с конца

    public String[] getItems() {
        int resultLength;
        if (currentFilms > items.length) {
            resultLength = items.length;
        } else {
            resultLength = currentFilms;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[items.length -1-i];
        }
        return tmp;
    }
}





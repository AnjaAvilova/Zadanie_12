import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmRepositoryTest {

    String item1 = new String("Бладшот");
    String item2 = new String("Вперед");
    String item3 = new String("Отель Белград");
    String item4 = new String("Джентельмены");
    String item5 = new String("Человек невидимка");
    String item6 = new String("Тролли. Живой тур");
    String item7 = new String("Номер один");



// добавление фильма
    @Test
    public void test(){
        FilmRepository film = new FilmRepository();

       film.add(item1);
       film.add(item2);
       film.add(item3);


       String[] expected = {item1, item2, item3};
       String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }



    //вывод всех фильмов
    @Test
    public void shouldallFilmsTest(){
        FilmRepository film = new FilmRepository();

        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);
        film.add(item5);
        film.add(item6);
        film.add(item7);


        String[] expected = {item1, item2, item3, item4, item5, item6, item7};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }

//    вывод в обратном порядке
    @Test
    public void shouldFindLast(){
        FilmRepository film = new FilmRepository();
        film.add(item1);
        film.add(item2);
        film.add(item3);
        film.add(item4);
        film.add(item5);
        film.add(item6);
        film.add(item7);

        String[] expected = {item7, item6, item5, item4, item3, item2, item1};
        String[] actual = film.findAll();

        Assertions.assertEquals(expected,actual);
    }
}

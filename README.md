Задача А: 
 
Симулировать футбольный матч. Играют 2 команды (2 потока). Оба: 

Забивают мячи (от 0 до 15 за матч, Random) 

Зарабатывают жёлтые карты (от 0 до 15 за матч, Random). 

Попадают в офсайд (от 0 до 15 за матч, Random). 

Подсчитать правильную статистику.  

Возможная идея структуры классов: 

class Game { 
    private int ballCount = 0; 
    private int yellowCards = 0; 
    private int offsideCount = 0; 

    // Getters, Setters, Constructors 

} 

class Team extends Thread {  

// You can choose any method to create thread, 

// by extending, or by implementing 
    private String name; 
    private Game game; 
 
    public Team(String name, Game game) { 
        this.name = name; 
        this.game = game; 
    } 
    // Getters, Setters, Constructors  

    // Override necessary method 

} 

---------------------------------------------- 
Задача B Вопросы 

Ответьте на вопросы своими словами, 1-2 предложения 

Разница между потоком и процессом? 

Какие есть состояния потока?  

Зачем isAlive()? 

Зачем join()? 

Что будет если вызвать new MyThread().run() напрямую без вызова start()? 

Можно ли запустить один поток дважды? 

Что такое блок синхронизации? 
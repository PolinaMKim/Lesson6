package com.mirea.kimpm.employeedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppDatabase database = App.getInstance().getDatabase();
        final EmployeeDao employeeDao = database.employeeDao();

        employeeDao.insert(new Employee(1,"Ледибаг", "Супер-шанс"));
        employeeDao.insert(new Employee(2,"Супер-Кот", "Катаклизм"));
        employeeDao.insert(new Employee(3,"Карапас", "Панцирь"));
        employeeDao.insert(new Employee(4,"Пигелла", "Подарок"));
        employeeDao.insert(new Employee(5,"Король-Обезьян", "Кавардак"));
        employeeDao.insert(new Employee(6,"Висперия", "Веном"));
        employeeDao.insert(new Employee(7,"Виперион", "Второй-шанс"));
        employeeDao.insert(new Employee(8,"Рена-Руж", "Мираж"));
        employeeDao.insert(new Employee(9,"Банникс", "Нора"));
        employeeDao.insert(new Employee(10,"Пегас", "Телепорт"));
        employeeDao.insert(new Employee(11,"Полимышь", "Разделение"));
        employeeDao.insert(new Employee(12,"Рюко", "Сила-Дракона"));
        employeeDao.insert(new Employee(13,"Минотаврикс", "Сопротивление"));
        employeeDao.insert(new Employee(14,"Петух", "Сублимация"));
        employeeDao.insert(new Employee(15,"Тигрица", "Разлом"));
        employeeDao.insert(new Employee(16,"Тракмуазель", "Апорт"));
        employeeDao.insert(new Employee(17,"Каприкид", "Генезис"));

    }
}
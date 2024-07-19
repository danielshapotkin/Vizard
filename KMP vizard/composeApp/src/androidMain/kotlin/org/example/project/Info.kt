package org.example.project

import android.widget.Switch

class Info (){
    fun getInfo(index: Int): String {
        return when (index) {
            1 -> "Имя: Зейн Кроуфорд\n" +
                    "Возраст: 34 года\n" +
                    "Образование: Окончил Королевскую академию драматического искусства в Лондоне.\n" +
                    "Известные работы: \"Рыцарь из тени\" (2020), \"Пропавший на острове\" (2018).\n" +
                    "Биография: Зейн Кроуфорд начал свою карьеру в театре и быстро завоевал популярность благодаря своим выдающимся актерским способностям. Его глубокий голос и интенсивная игра сделали его одним из самых востребованных актеров в современном кино."
            2 -> "Имя: Ливия Блэйк\n" +
                    "Возраст: 29 лет\n" +
                    "Образование: Выпускница Нью-Йоркской академии драмы.\n" +
                    "Известные работы: \"Летучая мышь\" (2022), \"Магия города\" (2021).\n" +
                    "Биография: Ливия Блэйк начала карьеру в независимом кино и вскоре привлекла внимание крупных студий своими эмоциональными ролями и впечатляющим сценическим присутствием. Она известна своей работой в драматических и комедийных фильмах.\n" +
                    "Изображение: "
            3 -> "Имя: Александр Рейн\n" +
                    "Возраст: 42 года\n" +
                    "Образование: Окончил Американскую академию драматического искусства в Лос-Анджелесе.\n" +
                    "Известные работы: \"Герои небес\" (2019), \"Вечный след\" (2017).\n" +
                    "Биография: Александр Рейн - актер с многолетним опытом, который приобрел популярность благодаря своим ролям в экшен-фильмах и триллерах. Его харизматичное исполнение и умение передавать сложные эмоции делают его незаменимым в киноиндустрии.\n"
            4 -> "Имя: Эмилия Смит\n" +
                    "Возраст: 31 год\n" +
                    "Образование: Выпускница Тишской школы искусств в Нью-Йорке.\n" +
                    "Известные работы: \"Время для чудес\" (2021), \"Секреты старого замка\" (2020).\n" +
                    "Биография: Эмилия Смит известна своими многогранными ролями в исторических драмах и романтических фильмах. Её способность погружаться в персонажей и создавать живые образы привлекает зрителей и критиков.\n"
            else -> "Error"
        }
    }
}
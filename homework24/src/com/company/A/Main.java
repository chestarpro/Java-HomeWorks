package com.company.A;

public class Main {

    public static void main(String[] args) {
		Village ortoSai = new Village("Орто-Сай", "Оскомбаев Мелис");
		Village someVillage = new Village("someVillage", "someLeader");

	    District pervomaisk = new District("Первомайский", "Биримкулов Алибек");
	    District sverdlovsk = new District("Свердловский", "Осмонов Мурат");
	    District october = new District("Октябрьский", "Арпачиев Данияр");
	    District leninsk = new District("Ленинский", "Оскомбаев Мелис", ortoSai);

		District city1district1 = new District("city1District1", "city1district1Leader");
		District city1district2 = new District("city1District2", "city1district2Leader");
		District city1district3 = new District("city1District3", "city1district3Leader");

		District city2district1 = new District("city2District1", "city2District1Leader");
		District city2district2 = new District("city2District2", "city2District2Leader", someVillage);

	    City bishkek = new City("Бишкек", "Кудайбергенов Бактыбек", new District[]{pervomaisk, sverdlovsk, october, leninsk});
	    City city1 = new City("City1", "city1Leader", new District[]{city1district1, city1district2, city1district3});
	    City city2 = new City("City2", "city2Leader", new District[]{city2district1, city2district2});

		Reference reference = new Reference(new Village[]{ortoSai, someVillage},
				new District[]{pervomaisk, sverdlovsk, october, leninsk, city1district1,
						city1district2, city1district3, city2district1, city2district2},
				new City[]{bishkek, city1, city2});

		reference.searchByLeaderName();
    }
}

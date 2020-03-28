package рпра;

public class HomeWork {

    public static void main(String[] args) {
        Cat grandfather = new Cat("дедушка Вася");
        Cat grandMother = new Cat("бабушка Мурка");
        Cat father = new Cat("папа Котофей ", grandfather, true);
        Cat mother = new Cat("мама Василиса", grandMother, false);
        Cat son = new Cat("сын Мурчик", father, mother);
        Cat daughter = new Cat("дочька Пушинка", father, mother);

        grandfather.printCat();
        grandMother.printCat();
        father.printCat();
        mother.printCat();
        son.printCat();
        daughter.printCat();

    }
    static class Cat{
        private String name;
        private  Cat mother;
        private Cat father;

        public Cat(String name){
            this.name = name;
        }
        public Cat (String name,Cat father,Cat mother ){
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        public Cat(String name, Cat cat, boolean haveFather) {
            this.name = name;
            if (haveFather) father = cat;
            else mother = cat;
        }
        public void printCat() {
            if (mother != null && father != null) {
                System.out.println("Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name);
            } else if (father != null && mother == null) {
                System.out.println("Cat name is " + name + ", no mother, father is " + father.name);
            } else if (mother != null && father == null) {
                System.out.println("Cat name is " + name + ", mother is " + mother.name + ", no father");
            } else {
                System.out.println("Cat name is " + name + ", no mother, no father");
            }
        }
    }
}

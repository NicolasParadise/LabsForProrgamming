package by.bsu.blue_ray_disc.data;

import java.util.Arrays;

public class BlueRayDisc {
    private String name;
    private Catalog catalog;
    public static class Catalog{
        private String name_catalog ;
        private int numberFolder;
        private String[] nameFolder;
        private int numberRecords;

        public Catalog(){
            super();
        }
        public Catalog(String name_cat, int numberFol, String[] nameFol, int numberRc){
            this.name_catalog = name_cat;
            this.numberFolder = numberFol;
            this.numberRecords = numberRc;
            this.nameFolder = new String[numberFol];
            for(int i=0 ; i < numberFol; i++){
                this.nameFolder[i] = nameFol[i];
            }
        }

        public String getName_catalog() {
            return name_catalog;
        }

        public void setName_catalog(String name_catalog) {
            this.name_catalog = name_catalog;
        }

        public int getNumberFolder() {
            return numberFolder;
        }

        public void setNumberFolder(int numberFolder) {
            this.numberFolder = numberFolder;
        }

        public String[] getNameFolder() {
            return nameFolder;
        }

        public void setNameFolder(String[] nameFolder) {
            this.nameFolder = nameFolder;
        }

        public int getNumberRecords() {
            return numberRecords;
        }

        public void setNumberRecords(int numberRecords) {
            this.numberRecords = numberRecords;
        }

        @Override
        public String toString() {
            return "Catalog{" +
                    "name_catalog='" + name_catalog + '\'' +
                    ", numberFolder=" + numberFolder +
                    ", nameFolder=" + Arrays.toString(nameFolder) +
                    ", numberRecords=" + numberRecords +
                    '}';
        }
    }

    public BlueRayDisc(){
        super();
    }

    public BlueRayDisc(String nameDisc, String name_cat, int numberFol, String[] nameFol, int numberRc) {
        this.name = nameDisc;
        this.catalog = new Catalog(name_cat,numberFol,nameFol,numberRc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void show(){
        System.out.println("Диск с именем "+ name + " содержит в себе : " + catalog.toString());
    }

}

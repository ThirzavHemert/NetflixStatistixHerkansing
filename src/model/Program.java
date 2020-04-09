package model;

public abstract class Program {
        private int id;
        private String duration;
        private String title;

        public Program(int id, String title, String duration){
            this.id = id;
            this.title = title;
            this.duration = duration;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
}

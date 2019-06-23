package by.htp.alibaba.entity;

public class BadGuy {
    private String title;
    private int value;

    public BadGuy(String title, int value){
        this.title = title;
        this.value = value;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BadGuy other = (BadGuy) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (value != other.value)
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "BadGuy [title=" + this.title + ", value=" + this.value + "]";
    }

}
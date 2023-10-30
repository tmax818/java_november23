package co.tylermaxwell.sessionformdemo;

public class Survey {

    private String name;
    private String language;



    public Survey() {
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", language='" + getLanguage() + "'" +
            "}";
    }




    
}

public class Books {
    private Integer id;
    private String title;
    private Integer pages;
    private String style;
    

    public Books(Integer id, String title, Integer pages, String style) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.style = style;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

  public String exibirLivro(){
        return "Código: " + id + "\n" +
                "Nome: " + title + "\n" +
                "Nº de páginas: " + pages + "\n" +
                "Gênero: " + style + "\n";
  }
}

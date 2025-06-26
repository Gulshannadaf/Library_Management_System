import java.time.LocalDate;

public class Book {
    private String id;
    private String title;
    private String author;
    private String genre;
    private boolean isIssued;
    private String issuedTo;
    private LocalDate issuedDate;

    public Book(String id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isIssued = false;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isIssued() { return isIssued; }
    public void setIssued(boolean issued) { isIssued = issued; }
    public String getIssuedTo() { return issuedTo; }
    public void setIssuedTo(String issuedTo) { this.issuedTo = issuedTo; }
    public LocalDate getIssuedDate() { return issuedDate; }
    public void setIssuedDate(LocalDate issuedDate) { this.issuedDate = issuedDate; }

    public void display() {
        System.out.println("[" + id + "] " + title + " by " + author + " (" + genre + ") - " + (isIssued ? "Issued" : "Available"));
    }
}


public class NotMyPatient extends Exception {
    public NotMyPatient() {
        super("Pas possible de visiter ce patient - pas dans ma liste des patients");
    }
}

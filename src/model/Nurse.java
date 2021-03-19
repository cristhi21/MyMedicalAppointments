package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Este metodo es abstracto y es de implementacion obligatoria
     */
    @Override
    public void showDataUser() {
        System.out.println("Enfermera del Hospital: Cruz verde");
        System.out.println("Depto: nutriologia y pediatria");
    }

}

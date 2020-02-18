package domain;

import javax.persistence.*;

@Entity
@Table(name = "destination")
public class Destination implements BaseEntity {

    @Override
    public Long getId() {
        return null;
    }

    @Id()
    @GeneratedValue (generator = "destination_seq", strategy = GenerationType.AUTO)
    @Column(name = "id_destination")
    private Long id;

    @Column(name = "name")
    private String name;


    public Destination() {

    }

    public Destination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
